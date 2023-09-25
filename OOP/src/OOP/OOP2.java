package OOP;

//Topic  -->>> Attributes and methods
class Student{

   final String name = "Aman";
    int roll_no;
    String address;
}

class Dog{

    int License_ID ;
    String name;
    public void eat(){
        System.out.println(name + "eats!");
    }
}

public class OOP2 {

    public static void main(String[] args) {
        Student st1 = new Student();
//        st1.name = "Aman";
//        System.out.println(st1.name);
//        st1.name = "Bhojak";
//        System.out.println(st1.name);
//
//        Student st2 = new Student();
//        st2.name = "Harsha";
//        System.out.println(st2.name);

//        System.out.println(st1.name);
//        st1.name = "Bhojak";

        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.eat();



    }
}
