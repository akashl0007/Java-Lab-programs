import java.io.*;
import java.net.Socket;

public class CircleClient {
    public static void main (String[] args) throws Exception{
        Socket sock = new Socket("127.0.0.1", 4000);
        System.out.println("Enter the Radius: ");
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        String radius = keyRead.readLine();

        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream, true);
        pwrite.print(radius);

        InputStream istream = sock.getInputStream();
        BufferedReader sockRead = new BufferedReader(new InputStreamReader(istream));
        String result = sockRead.readLine();

        System.out.println(result);

        keyRead.close();
        sock.close();
        pwrite.close();
        sockRead.close();

    }
}
