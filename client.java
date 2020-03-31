import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main (String [] args) throws IOException {

        int number;
        int temp;
        Scanner sc = new Scanner(System.in); //Så vi kan acceptere nummer fra user
        Socket s = new Socket("127.0.0.1", 1342); // Socket  har to parametre port og ip
        Scanner sc1 = new Scanner(s.getInputStream()); //endnu en scanner så vi kan bruge socket
        System.out.println("Enter any number");
        number = sc.nextInt(); // her accepterer vi nummer fra bruger
        PrintStream p = new PrintStream(s.getOutputStream()); // printstream bruges til at parse nummeret til serveren
        p.println(number);
        temp=sc1.nextInt(); // for at kunne acceptere svaret fra serveren og displaye det i klient
        System.out.println(temp);

    }
}
