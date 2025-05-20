import java.util.Scanner;
interface Calculator{
    int add(int a, int b);

    default int multiply(int a, int b){
        return a*b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
}

class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Put the first number:");
        int num1 = stdin.nextInt();
        System.out.print("Put the last number:");
        int num2 = stdin.nextInt();
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.multiply(num1, num2));
        System.out.println(Calculator.subtract(num1, num2));
    }
}
