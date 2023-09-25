package OOP;

class AM {

    public void print() {
        System.out.println("class A method:");
    }
}

class BM extends AM{
    public void printB() {
        System.out.println("class B method:");
    }

}

class CM extends AM{
    public void printC() {
        System.out.println("class C method:");
    }

}
















public class OOP15HierarchicalInheritance {

    public static void main(String[] args){

        BM b = new BM();
        b.print();

        CM c = new CM();
        c.print();

    }
}
