import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {


    public static void main(String[]args)throws IOException {

        int number;
        int temp;
        ServerSocket s1 = new ServerSocket(1342);  // Serversocket for at specificere portnummer
        Socket ss = s1.accept();  //simple socket acceptere den request clienten sender
        Scanner sc = new Scanner(ss.getInputStream()); //For at kunne se og manipulere det nummer clienten sender os
        number = sc.nextInt();

        temp = number*2;

        PrintStream p = new PrintStream(ss.getOutputStream());//for at kunne parse ovenstående temp variable til client
        p.println(temp);



    }


}
