package com.company;

public class Runner extends Thread{
    private Runner next;
    private Runner before;

    public Runner(String name) {
        super(name);
    }

    public void setRuns(Runner before, Runner next) {
        this.before = before;
        this.next = next;
    }

    public synchronized void run(){
        try {
            System.out.println(this.getName() + " берет палочку");
            if (this.getName().equals("Runner5")){
                System.out.println(this.getName() + " бежит к финишу");
                System.out.println(this.getName() + " бежит к " + before.getName());
                sleep(5000);
            } else {
                System.out.println(this.getName() + " бежит к " + next.getName());
                sleep(5000);
                next.start();
                next.join();
            }

            System.out.println(this.getName() + " берет палочку");
            if (!this.getName().equals("Runner1")) {
                System.out.println(this.getName() + " бежит к " + before.getName());
                sleep(5000);
            } else {
                System.out.println(this.getName() + " бежит к финишу");
            }

        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }

    }
}
