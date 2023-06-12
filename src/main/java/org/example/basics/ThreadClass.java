package org.example.basics;

class Runner1 extends Thread{
    @Override
    public void run (){
        for(int i =0; i<20;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner1 "+ i);
        }
    }
}
class Runner2 extends Thread{
    @Override
    public void run (){
        for(int i =0; i<20;i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Runner2 "+ i);
        }
    }
}
public class ThreadClass{
    public static void main(String[] args) {
        Thread runner1 = new Runner1();
        Thread runner2 = new Runner2();
        runner1.start();
        runner2.start();
    }
}
