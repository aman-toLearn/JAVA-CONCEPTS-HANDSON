package OOP;


class Employee{
     void salary(){
         System.out.println("Salary = 70000");
     }
}


class Hr extends Employee{

    void bonus(){
        System.out.println("Bonus = 20000");
    }

}







public class OOP7SingleInheritance {
    public static void main(String[] args) {
Hr hr1 = new Hr();
hr1.salary();
        System.out.println();
hr1.bonus();
    }

}
