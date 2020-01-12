package ch17;
/*
* 两种实现方式： 1.继承Thread类, 2.实现Runnable接口
*
* Thread类： 在java.lang包中定义的，继承Thread类必须重写run()方法
*           class className extends Thread{    run();}
*
*
*
*
* */

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name = name;
    }

    // 重写run方法
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println(name+": "+i);
        }
        super.run();
    }
}


class MyRunable implements Runnable{
    private String name;
    public MyRunable(String name){
        this.name = name;
    }

    // 重写run方法
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println(name+": "+i);
        }
//        super.run();
    }
}



public class 线程的实现 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
//        t1.run();
//        t2.run();
        // 线程的启动通过start()方法
        t1.start();
        t2.start();   // 是并发执行的


        MyRunable m1 = new MyRunable("C");
        MyRunable m2 = new MyRunable("D");
        //还是需要创建一个Thread类对象的
        Thread t3 = new Thread(m1);
        Thread t4 = new Thread(m2);
        t3.start();
        t4.start();



    }
}

























