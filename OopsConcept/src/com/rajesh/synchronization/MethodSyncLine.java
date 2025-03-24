package com.rajesh.synchronization;


class Line {
    public synchronized void getLine() {
        System.out.println(Thread.currentThread().getName() + " acquired the line.");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " released the line.");
        System.out.println("<====================>");

    }
}

class Train extends Thread {
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}

public class MethodSyncLine {
    public static void main(String[] args) {
        Line line = new Line();
        Train t1 = new Train(line);
        Train t2 = new Train(line);
        Train t3 = new Train(line);
        Train t4 = new Train(line);
        Train t5 = new Train(line);
        t1.setName("Duranto");
        t2.setName("Satabdi");
        t3.setName("Gareeb Rath");
        t4.setName("Rajdhani");
        t5.setName("Intercity");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }


}
