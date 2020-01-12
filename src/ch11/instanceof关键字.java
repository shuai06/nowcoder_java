package ch11;
// instanceof 判断一个对象是不是一个类的实例

class AA{
    public void tell1(){
        System.out.println("AA---tell1");
    }
    public void tell2(){
        System.out.println("AA---tell2");
    }
}


class BB extends AA{
    public void tell1(){
        System.out.println("BB---tell1");
    }

    public void tell3(){
        System.out.println("BB---tell3");
    }
}



public class instanceof关键字 {
    public static void main(String[] args) {
        AA a  = new AA();
        System.out.println(a instanceof AA);
        System.out.println(a instanceof BB);

        System.out.println("****************");
        AA a1 = new BB();  // 向上转型
        System.out.println(a1 instanceof AA);
        System.out.println(a1 instanceof BB);

    }
}
