package JavaFundamentals;

public class ArgsCounter {
    public static void main(String[] args){
        int additionResult = 0;
        int multiplyResult = 1;
        for (String arg : args) {
            additionResult += Integer.parseInt(arg);
            multiplyResult *= Integer.parseInt(arg);
        }
        System.out.println("Addition result: " + additionResult + "\nMultiplying result: " + multiplyResult);
    }
}
