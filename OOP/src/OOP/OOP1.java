package OOP;

public class OOP1 {

    String name;
    int rolln;

    public void printdata(){

        System.out.println(name);
        System.out.println(rolln);
    }

    public static void main(String[] args){

        OOP1 obj = new OOP1();
        obj.name = "Aman";
        obj.rolln = 12;
        System.out.println(obj.rolln);
        obj.printdata();

OOP1 obj2 = new OOP1();
obj2.name = "Bhojak";
obj2.rolln = 23;

obj2.printdata();





    }
}
