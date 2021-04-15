package JavaFundamentals;

import java.util.Scanner;

public class MonthsDetector {
    public static void main(String[] args){
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter an integer between 1 and 12:");
        if (scan.hasNextInt()) {
            int monthNum = scan.nextInt();
            if (1 <= monthNum && monthNum <= 12) {
                System.out.println(months[monthNum - 1]);
            } else {
                System.err.println("No month exists with such number");
            }
        } else {
            System.err.println("Input is not an integer");
        }
    }
}
