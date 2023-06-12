package org.example.basics;

class Runnner1 implements Runnable{

    @Override
    public void run() {
        for(int i =0; i<20;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnner1 "+ i);
        }
    }
}
class Runnner2 implements Runnable{

    @Override
    public void run() {
        for(int i =0; i<20;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runnner2 "+ i);
        }
    }
}
public class RunnableInterface {


    public static void main(String[] args) {
        Runnner1 runnner1 = new Runnner1();
        Runnner2 runnner2 = new Runnner2();
        Thread t1 = new Thread(runnner1);
        Thread t2 = new Thread(runnner2);

        t1.start();
        t2.start();
    }
}
