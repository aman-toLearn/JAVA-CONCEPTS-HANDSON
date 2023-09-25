package OOP;

interface Car1{

    public  void start();
}

class ElectricCar implements Car1{

    public void start(){
        System.out.println("Electric Car Starts");
    }
  }

  class DieselCar implements Car1{
    public void start(){
        System.out.println("Diesel car start");
    }
  }


public class OOP10INTERFACE {

    public static  void main(String[] args){

        //object bna ne ke liye interface jo hai uske naam
        // phle aana chaiye  means we can say
        //interface type object

        Car1 nano = new ElectricCar();
        Car1 altroz = new DieselCar();

        nano.start();
        altroz.start();



    }


}
