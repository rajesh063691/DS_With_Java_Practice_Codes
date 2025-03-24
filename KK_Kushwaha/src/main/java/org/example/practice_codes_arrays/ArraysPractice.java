package org.example.practice_codes_arrays;


import java.util.*;
import java.util.stream.Collectors;

public class ArraysPractice {

    // remove duplicate from sorted arrays
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int curr_ind = 0;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] != nums[curr_ind]) {
                curr_ind += 1;
                nums[curr_ind] = nums[index];
            }
            index += 1;
        }

        return curr_ind + 1;
    }

    public int removeElement(int[] nums, int val) {
        int curr_ind = 0;
        int next = 0;
        while (next < nums.length) {
            if (nums[next] != val) {
                //swap the value
                int temp = nums[curr_ind];
                nums[curr_ind] = nums[next];
                nums[next] = temp;

                curr_ind += 1;
            }
            next += 1;
        }
        return curr_ind;
    }


    public static int findSecondLargest(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // check for largest and second largest
            if (arr[i] > largest) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static int findSecondMinimum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // check for largest and second largest
            if (arr[i] > largest) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void rotateArrayByOne(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }

        int temp = arr[0];
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            arr[i] = arr[j];
            i++;
        }

        // finally , replace last element with temp
        arr[i] = temp;
    }


    public static void rotateArrayByDPlaces(int[] arr, int d) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }

        if (d == 0) {
            return;
        }

        for (int k = 0; k < d % arr.length; k++) {

            int temp = arr[0];
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                arr[i] = arr[j];
                i++;
            }
            // finally , replace last element with temp
            arr[i] = temp;
        }

    }

    public static void rotateArrayByDPlacesOptimal(int[] arr, int d) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }

        if (d == 0) {
            return;
        }
        // reverse 1st d elements
        int start = 0;
        int end = d - 1;
        reverse(arr, start, end);
        // reverse array from d to n-1
        reverse(arr, d, arr.length - 1);

        // reverse whole array
        reverse(arr, 0, arr.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    // shift all zeros to the end of array
    public static void shiftZerosToEnd(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int k = i;
                while (k < n - 1) {
                    // swap only if next element is not zero
                    if (arr[k + 1] != 0) {
                        int temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                    }
                    k++;
                }
            }
        }
    }

    public static List<Integer> findUnionOfSortedArray(int[] a1, int[] a2) {
        int len1 = a1.length;
        int len2 = a2.length;
        List<Integer> list = new ArrayList<>();
        if (len1 == 0 && len2 == 0) {
            return list;
        }

        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            // check if first array value is less and does not contain in list
            if (a1[i] <= a2[j]) {
                if (!list.contains(a1[i])) {
                    list.add(a1[i]);
                }
                i++;
            } else { //  // check if first array value is less and does not contain in list
                if (!list.contains(a2[j])) {
                    list.add(a2[j]);
                }
                j++;
            }
        }

        // now iterate over remaining array elements and add to the list
        while (i < len1) {
            if (!list.contains(a1[i])) {
                list.add(a1[i]);
            }
            i++;
        }

        while (j < len2) {
            if (!list.contains(a2[j])) {
                list.add(a2[j]);
            }
            j++;
        }

        return list;

    }

    public static List<Integer> findIntersectionOfSortedArray(int[] a1, int[] a2) {
        int len1 = a1.length;
        int len2 = a2.length;

        List<Integer> list = new ArrayList<>();
        if (len1 == 0 && len2 == 0) {
            return list;
        }

        // create visited array with size len2
        int[] visited = new int[len2];
        System.out.println(Arrays.toString(visited));
        // iterate over 1st array and match with 2nd array
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (a1[i] == a2[j] && visited[j] == 0) {
                    list.add(a1[i]);
                    visited[j] = 1;
                    break;
                }
                // no need to check if a2[j] > a1[i] as its sorted array
                if (a2[j] > a1[i]) {
                    break;
                }
            }
        }

        return list;
    }

    public static List<Integer> findIntersectionOfSortedArrayOptimal(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;

        List<Integer> list = new ArrayList<>();
        if (len1 == 0 && len2 == 0) {
            return list;
        }

        // use 2 pointer approach
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2) {
            // if first array element is smaller then no need to check further
            if (A[i] < B[j]) {
                i++;
            } else if (B[j] < A[i]) {
                j++;
            } else {
                // both matched so move i and j both for next match
                list.add(A[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static int maxCountOfOnes(int[] A) {
        int len = A.length;
        if (len == 0) {
            return 0;
        }

        int maxCount = 0;
        int tempCount = 0;
        int i = 0;
        while (i < len) {
            if (A[i] == 1) {
                tempCount++;
                maxCount = Math.max(tempCount, maxCount);
            } else {
                tempCount = 0;
            }
            i++;
        }

        return maxCount;
    }

    public static void printPyramid(int size) {
        if (size == 0) {
            return;
        }


        for (int i = 1; i <= size; i++) {
            int k = size;
            int j = 1;
            // this will print 1st pyramid
            while (k >= 1) {
                if (k <= i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                k--;
            }
            // print 2nd pyramid
            while (j < i) {
                System.out.print("X");
                j++;
            }

            System.out.println();
        }
    }


    public static int findSingleElement(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }

    public static int longestSubArrayWithGivenSum(int[] arr, int k) {
        int len = arr.length;
        if (len == 0) {
            return k;
        }
        int longest = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }

        return longest;
    }

    public static int longestSubArrayWithGivenSumOptimal(int[] arr, int k) {
        int len = arr.length;
        if (len == 0) {
            return k;
        }
        int longest = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            while (sum > k) {
                sum -= arr[j];
                j++;
            }

            if (sum == k) {
                longest = Math.max(longest, i - j + 1);
            }
        }

        return longest;
    }

    public static int longestSubArrayWithGivenSumOptimalNegative(int[] arr, int k) {
        int len = arr.length;
        if (len == 0) {
            return k;
        }
        int longest = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            j = i;
            sum = 0;
            while (j < len) {
                sum += arr[j];
                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
                j++;
            }
        }

        return longest;
    }

    public static boolean TwoSumProblemBetter(int[] arr, int target) {
        int len = arr.length;
        if (len == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        int neededMore = 0;

        for (int i = 0; i < len; i++) {
            temp = arr[i];
            neededMore = target - temp;

            if (map.containsKey(neededMore)) {
                return true;
            } else {
                map.put(temp, i);
            }
        }

        return false;
    }

    public static boolean TwoSumProblemOptimal(int[] arr, int target) {
        int len = arr.length;
        if (len == 0) {
            return false;
        }

        int start = 0;
        int end = len - 1;

        Arrays.sort(arr);

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum > target) {
                end = end - 1;
            } else if (sum < target) {
                start = start + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    // moore's voting algorithm
    public static int appearsMoreThanNBy2(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return len;
        }

//        int threshold = len / 2;
        int i = 1;
        int element = arr[0];
        int count = 1;

        while (i < len) {
            if (arr[i] == element) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                if (i + 1 < len) {
                    element = arr[i + 1];
                    count = 1;
                }
            }

            i++;
        }
        return count > 0 ? element : -1;
    }


    public static int maxSubArraySum(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return len;
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int start = 0;
        for (int i = 0; i < len; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];


            if (sum > maxSum) {
                maxSum = sum;
                startIndex = start;
                endIndex = i;
            }
            // no need to carry forward -ve sum as it will eventually reduce the overall sum
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("start index :: " + startIndex + " End index ::" + endIndex);
        return maxSum;
    }

    public static int BuyAndSellStocks(int[] arr) {
        int len = arr.length;
        if (len == 0) {
            return len;
        }

        int min = arr[0];
        int profit = 0;
        int cost = 0;
        for (int i = 1; i < len; i++) {
            cost = arr[i] - min;
            profit = Math.max(profit, cost);
            // now reset the minimum between min and ith dat stock
            min = Math.min(min, arr[i]);
        }

        return profit;
    }

    public static int[] rearrangeArray(int[] arr) {

        int len = arr.length;
        int[] ans = new int[len];
        if (len == 0) {
            return ans;
        }

        int nextPosIndex = 0;
        int nextNegIndex = 1;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                ans[nextPosIndex] = arr[i];
                nextPosIndex += 2;
            } else {
                ans[nextNegIndex] = arr[i];
                nextNegIndex += 2;
            }
        }


        return ans;
    }


    public static void frequencyIntArray(int[] arr) {
        int[] hash = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("<==============>");
        System.out.println(Arrays.toString(hash));
    }


    public static void frequencyCharArray(String str) {
        // imagine is all small characters - hash array take size only 26, else 256
        int[] hash = new int[26];
        //char[] tempArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a'] += 1;
        }

        System.out.println(str);
        System.out.println("<==============>");
        System.out.println(Arrays.toString(hash));
//        for (int i = 0; i < hash.length; i++) {
//            System.out.println(hash[i] - 'a');
//        }
    }

    public static void selectionSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int j = 0;
        // int lastIndex = arr.length - 1;

        while (j < arr.length) {
            int minIndex = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            // swap j with i index
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;

            j++;
        }
    }


    // start 21-Jan-2025
    // https://www.youtube.com/watch?v=oO5uLE7EUlM&list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=29
    public static int longestConsecutiveSequence(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return len;
        }

        int longest = 1;

        for (int i = 0; i < len; i++) {
            int x = arr[i];
            int count = 1;

            while (LinearSearch(arr, x + 1)) {
                x = x + 1;
                count += 1;
            }

            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }

    public static boolean LinearSearch(int[] arr, int x) {
        for (int j : arr) {
            if (j == x) {
                return true;
            }
        }
        return false;
    }


    public static int longestConsecutiveSequenceOptimal(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return len;
        }

        int longest = 1;
        int count = 1;
        int lastMinimum = Integer.MIN_VALUE;
        // sort the array
        Arrays.sort(arr);

        for (int i = 0; i < len; i++) {
            // check if item can be picked up in sequence
            if (arr[i] - 1 == lastMinimum) {
                count++;
                lastMinimum = arr[i];
            }

            if (arr[i] != lastMinimum) {
                // new item found which is not in sequence, so reset the counter
                count = 1;
                lastMinimum = arr[i];
            }

            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }







    public static void main(String[] args) {
        int[] a1 = {101, 102, 100, 1, 1, 1, 2, 2, 3, 3, 4, 4};

        System.out.println(longestConsecutiveSequenceOptimal(a1));

    }
}
