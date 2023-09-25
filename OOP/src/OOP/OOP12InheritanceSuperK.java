package OOP;
class Animal{
    String color = "white";

}

// To INVOKE THE PARENT CLASS VARIABLE USING SUPER KEYWORD


class Kutta extends Animal{
    String color = "black";

    void printColor(){
        System.out.println(color);//will print the var of Kutta class
        System.out.println(super.color);//will print the  parent/Animal class constructor


    }
}
public class OOP12InheritanceSuperK {

    public static void main(String[] args){
Kutta kt = new Kutta();
kt.printColor();
    }
}
