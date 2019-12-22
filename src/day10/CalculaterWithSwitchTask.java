package day10;

public class CalculaterWithSwitchTask {
    public static void main(String[] args) {

        char operator = '+';


        switch (operator) {
            case '+':
                System.out.println("About to add numbers");
                break;
            case '-':
                System.out.println("About to subtract numbers");
                break;
            case '*':
                System.out.println("About to multiply numbers");
                break;
            case '/':
                System.out.println("About to divide number");
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

    }
}
