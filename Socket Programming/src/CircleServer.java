import java.net.*;
import java.io.*;

public class CircleServer {
    static final double myPI= 3.14;
    public static void main(String[] args) throws Exception{
        ServerSocket sersock= new ServerSocket(4000);
        System.out.println("Server is created and ready for connection.");
        Socket sock = sersock.accept();
        System.out.println("Connection is successfull and ready for interaction.");

        InputStream istream = sock.getInputStream();
        BufferedReader strRead= new BufferedReader(new InputStreamReader(istream));
        String rad = strRead.readLine();
        int iRadius = Integer.parseInt(rad);
        double area = myPI* iRadius * iRadius;
        String result ="Area of radius "+rad+" is "+ area;

        OutputStream ostream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(ostream,true);
        pwrite.println(result);

        pwrite.close();
        strRead.close();
        sersock.close();
        sock.close();
    }
    
}
