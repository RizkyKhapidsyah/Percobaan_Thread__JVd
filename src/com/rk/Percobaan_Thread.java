package com.rk;

public class Percobaan_Thread implements Runnable {

    private Thread th;
    private boolean running;
    private long endTime;

    public Percobaan_Thread() {
        running = true;
        th = new Thread(this);
        endTime = System.currentTimeMillis() + 10000;
    }

    @Override
    public void run() {
        int i = 0;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }

            System.out.println("Run " + i);

            if (System.currentTimeMillis() > endTime) {
                running = false;
            }

            i++;
        }
    }

    public void start() {
        th.start();
    }

    public static void main(String[] args) {
        new Percobaan_Thread().start();
    }
}
