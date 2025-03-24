package org.example.session6;

// if n <1 return false
// start while loop i=2 ,
//  i*i<=givenNumber - check if i%2==0 return true
// else return false


public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(36));
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > n;
    }
}
