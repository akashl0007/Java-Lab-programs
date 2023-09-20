import Balance.*;

public class Account {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("UNION1233", "Akash", 0);
        current[1] = new Balance("UNION1245", "Netra", 50000);
        current[2] = new Balance("UNION1544", "Nachi", 100000);

        for (int i = 0; i < 3; i++) {
            current[i].display();
        }
    }
}
