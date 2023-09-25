package OOP;
//TO INVOKE PARENT CLASS METHOD
class Animaal {
    void eat() {
        System.out.println("eating ...");
    }
}

    class Doggy extends Animaal{
        void eat(){
            System.out.println("Eating bread...");

        }
        void bark(){
            System.out.println("barking...");
        }

        void work(){
            super.eat();
            bark();
        }
    }








public class OOP13InheritanceSuperInkMethod {

    public  static void main(String[] args){
        Doggy d = new Doggy();
        d.work();


    }
}
