package CollectionsTask.AdditionalUnit;

import java.io.*;
import java.util.*;

public class AdditionalUnit {

    public static void main(String[] args) throws FileNotFoundException {
        // 1.Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только
        // регистром букв, считать одинаковыми. Использовать класс HashSet.
        File textFile = new File("text.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(textFile));
        String textString;
        Set<String> set = new HashSet<>();

        try {
            while ((textString = buffer.readLine()) != null)   {
                String [] splitString = textString.replaceAll("[.,\\n]+", "").split(" ");

                for (String elem : splitString){
                    set.add(elem.toLowerCase());
                }
                System.out.println(set);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2.Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        Stack<String> numbers = new Stack<>();
        StringBuilder reversedNumber = new StringBuilder();

        System.out.println("\nПожалуйста, введите число:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            String [] scannedNumber = (scan.nextLine().split(""));
            for (String elem : scannedNumber){
                numbers.push(elem);
            }
            for (int i = numbers.size(); i > 0; i--) {
                reversedNumber.append(numbers.pop());
            }
            System.out.print(Integer.parseInt(reversedNumber.toString()));
        } else {
            System.err.println("Целое число не было введено.");
        }
    }
}
