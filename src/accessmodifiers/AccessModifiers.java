package accessmodifiers;

class A{
    private A(){}
    private int data=40;
    private void msg(){
        System.out.println("Hello java");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
//        A obj=new A();
//        System.out.println(obj.data);
//        obj.msg();
    }
}
