import java.util.Scanner;

class Collide extends Exception {
    Collide(String s) {
        super(s);
    }
}

public class CarException {
    public static void main(String[] args) {
        String t1 = null, t2 = null;
        try {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the Direction of 1st Truck: ");
            t1 = ob.next();
            System.out.println("Enter the Direction of 2nd Truck: ");
            t2 = ob.next();

            if (!t1.equals(t2))
                throw new Collide("Truck t2 must change Direction to " + t1 + " Direction.");
            else
                System.out.println("No collision will occur.");
        } catch (Collide e) {
            System.out.println(e);
            t2 = t1;
            System.out.println("The possible Collision is avoided.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No collison will occur.");
        }
        System.out.println("Truck 1 Direction: " + t1 + "\nTruck 2 Direction: " + t2);
    }
}
