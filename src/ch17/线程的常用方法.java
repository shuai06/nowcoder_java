package ch17;


/*
* 1. 取得线程name   ： getName()       // 需要先获得当前线程对象
* 2.取得当前线程对象：  currentThread()
* 3.判断线程是否启动： isAlive()
* 4.线程的强行运行： join()
* 5.线程的休眠： sleep()
* 6. 线程的礼让 yield()
*
*
*
* */


class RunnableDemo implements Runnable{
    private String name;
    public  RunnableDemo(String name){
        this.name = name;
    }

    public void run(){
//        super.run();
        for(int i=0; i<100; i++){
            System.out.println("当前线程对象： "+ Thread.currentThread().getName() + ": "+this.name +": "+ i);
        }
    }
}



public class 线程的常用方法 {
    public static void main(String[] args) {


        RunnableDemo r1 = new RunnableDemo("A");
        RunnableDemo r2 = new RunnableDemo("B");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        System.out.println(t2.isAlive());



        for(int i=0; i<50; i++){
            if(i>10){  // 当主线程到10的时候，就强行让自己的线程执行到完毕

                try{
                    Thread.sleep(2000);
                    t1.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                if(i==30){
                    System.out.println("礼让：");
                    Thread.yield();
                }
            }

            System.out.println("主线程："+i);
        }

    }
}
