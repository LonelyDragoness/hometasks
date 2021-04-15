package JavaFundamentals;

import java.util.Scanner;

public class UsernameGreeting {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        System.out.println("Hello, " + name.nextLine() + "!\n");
    }
}
