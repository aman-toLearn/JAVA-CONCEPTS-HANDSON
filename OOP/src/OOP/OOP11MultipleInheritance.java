package OOP;

interface A{
    public void run();
}

interface B {

    public void run();
}

class C1 implements A,B{

    public void run(){
        System.out.println("C class's run method");
    }
}

public class OOP11MultipleInheritance {

    public static void main(String[] args){

C1 obj  = new C1();

obj.run();

    }
}
