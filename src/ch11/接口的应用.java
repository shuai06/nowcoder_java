package ch11;
/*
*接口中只允许存在抽象方法
*
* */

interface USB{   // 这就是一个标准
    void start();
    void stop();
}


class Computer{
    public static void work(USB u){
        u.start();
        System.out.println("工作中...");
        u.stop();
    }
}

// 扩展自USB， 来实现借口
class USBDisk implements USB{
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘stop工作");
    }
}



// 打印机
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机stop工作");
    }
}


public class 接口的应用 {
    public static void main(String[] args) {
    Computer.work(new USBDisk());
    Computer.work(new Printer());
    }
}
