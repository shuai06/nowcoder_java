package ch17;
/*
* 同步与死锁
*
* 同步代码块： 在代码块上加上"syschronized"关键字，则此代码块就称为同步代码块
*
* 同步代码块格式： synchronized(同步对象){  需要同步的代码块  }
*
* 同步方法： 除了代码块可以同步，方法也是可以同步的    synchronized void 方法名称(){}
*
*
*
*
* */

class MyThreadDemo implements Runnable{
    private int ticket = 5;

    public void run(){
        for(int i=0; i<10; i++){
            synchronized (this){   // 资源共享的时候使用同步
//                tell();
                if(ticket>0){
                    try{
                        Thread.sleep(500);
                        System.out.println("车票："+ticket--);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }

        }

    }



    //同步方法
    public synchronized void tell(){
        //
//        if(ticket>0){
//            try{
//                Thread.sleep(500);
//                System.out.println("车票："+ticket--);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
    }
}


public class 线程同步 {
    public static void main(String[] args) {
        MyThreadDemo m = new MyThreadDemo();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        t1.start();
        t2.start();
        t3.start();




    }
}

/*
 * 死锁:
 * 解决死锁：
 *
 */










