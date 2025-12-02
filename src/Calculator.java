package First.src;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        String op = sc.next();

        int result = 0;
        if(op.equals("+")) result = a + b;
        else if(op.equals("-")) result = a - b;
        else if(op.equals("*")) result = a * b;
        else if(op.equals("/")) result = a / b;

        System.out.println("결과" + result);
        sc.close(); //생략 가능

        
    }
}
