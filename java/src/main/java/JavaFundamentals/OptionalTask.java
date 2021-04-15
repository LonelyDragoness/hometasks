package JavaFundamentals;

import java.util.Scanner;
import java.util.Arrays;

public class OptionalTask {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите числа: ");
        String inputNumbers = scan.nextLine();
        String [] splitNumbers = inputNumbers.split(" ");
        if (inputNumbers.trim().isEmpty()) {
            System.err.println("Не введено ни одного числа.");
            System.exit(1);
        }
        // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        // В моей реализации при наличии чисел одинаковой длины будет выведено первое найденное, т.к. в условии это
        // не оговорено.
        String shortest = inputNumbers;
        String longest = " ";
        if (splitNumbers.length == 1) {
            System.out.println("Самое короткое число: " + inputNumbers + ". Его длина составляет: " + shortest.length() +
                    ".\nВведено всего одно число, следственно, оно так же является и самым длинным.");
        } else {
            for (String i : splitNumbers) {
                if (i.length() < shortest.length()) { shortest = i; }
                if (i.length() > longest.length()) { longest = i; }
            }
            System.out.println("Самое короткое число: " + shortest + ". Его длина составляет: " + shortest.length());
            System.out.println("Самое длинное число: " + longest + ". Его длина составляет: " + longest.length());
        }
        // 2. Вывести числа в порядке возрастания (убывания) значений их длины.
        int [] sortedArr = new int [splitNumbers.length];
        for (int j = 0; j < splitNumbers.length; j++) {
            sortedArr[j] = Integer.parseInt(splitNumbers[j]);
        }
        Arrays.sort(sortedArr);
        System.out.print("\nЧисла в порядке возрастания длины: ");
        for (int x : sortedArr) { System.out.print(x + " "); }
        System.out.print("\nЧисла в порядке убывания длины: ");
        for (int z = sortedArr.length; z >0; z--) {
            System.out.print(sortedArr[z-1] + " ");
        }
        // 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        float avgLength = 0;
        for (String f : splitNumbers) {
            avgLength += f.length();
        }
        avgLength = avgLength/splitNumbers.length;
        System.out.print("\n\nСредняя длина введенных чисел: " + avgLength + "\nЧисла, длина которых меньше средней: ");
        for (String e : splitNumbers) {
            if (e.length() < avgLength) {
                System.out.print(e + " ");
            }
        }
        System.out.print("\nЧисла, длина которых больше средней: ");
        for (String e : splitNumbers) {
            if (e.length() > avgLength) {
                System.out.print(e + " ");
            }
        }
        // 4.Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое
        // из них.
        cycle: for (String elem : splitNumbers) {
            String [] splitElem = elem.split("");
            for (int i = 0; i < elem.length() - 1; i++) {
                if (!(Integer.parseInt(splitElem[i + 1]) == Integer.parseInt(splitElem[i]) + 1)) {
                    continue cycle;
                }
            }
            System.out.println("\n\nЧисло, цифры в котором идут в строгом порядке возрастания: " + elem);
            break;
        }
    }
}
