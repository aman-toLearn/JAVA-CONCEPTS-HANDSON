package OOP;



class Annnimal{
    Annnimal(){
        System.out.println("Animal is created");
    }
}

class Tutu extends Annnimal{
    Tutu(){
        super();
//        System.out.println("Tutu is created");
    }
}










public class OOP14InheritanceSuperInkConstrtr {

    public static  void main(String[] args){
        Tutu t = new Tutu();

    }
}
