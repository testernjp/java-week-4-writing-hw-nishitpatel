package printprogramme_writting_week04.programme_23_method_overriding;
/**
 * Creating a child class
 */
public class Bike2 extends Vehicle{
    // defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj  =new Bike2(); // Creating Object
        obj.run(); // calling method
    }
}
