package ch17;


/*
* 1-MIN_PRIORITY
* 10-MAX_PRIORITY
* 5-NORM_PRIORITY
* 如果什么都不设置默认值为5
*
*
*
* */



class ThRun implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            try{
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() +":"+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class 线程优先级 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThRun(), "A");   // 通过匿名对象的方式来创建
        Thread t2 = new Thread(new ThRun(), "B");
        Thread t3 = new Thread(new ThRun(), "C");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
