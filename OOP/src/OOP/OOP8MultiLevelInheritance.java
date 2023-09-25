package OOP;

class AZ{

    void a(){
        System.out.println("Method of A class");
    }

}

class BZ extends AZ{
    void b(){
        System.out.println("Method of B class");
    }
}
class C extends  BZ{
    void c(){
        System.out.println("Method of C class");
    }
}


public class OOP8MultiLevelInheritance {

    public static void main(String[] args){

        C obj = new C();
        obj.c();
        obj.b();
        obj.a();
    }

}
