/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = name.nextLine();

        if(userName.equalsIgnoreCase("Alice")){
            System.out.println("Hi Alice!");
        } else if(userName.equalsIgnoreCase("Bob")){
            System.out.println("Hi Bob");
        }
    }
}
