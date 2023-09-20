package Balance;

public class Balance {
    String Acc_no;
    String name;
    double bal;

    public Balance(String a, String n, double b) {
        Acc_no = a;
        name = n;
        bal = b;
    }

    public void display() {
        if (bal > 0)
            System.out.println("\nAccount Number : " + Acc_no + "\nName : " + name + "\nBalance : " + bal);
        else
            System.out.println("\nAccount Number : " + Acc_no + "\nName : " + name + "\nBalance is empty!!!");
    }

}
