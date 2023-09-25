package OOP;
//TOPIC--->>> Constructors in java

class Students{

    int id ;
    int age;

    Students(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Hello  parameterized constructor");

    }

    Students(int id ,String name,int age){
        System.out.println("Parameterized constructor 2");

    }

Students(){

    System.out.println("Default constructor");
}


}



public class OOP4Constructor {

    public static void main(String[] args) {

        Students st = new Students(1,"aman",12);

    }
}
