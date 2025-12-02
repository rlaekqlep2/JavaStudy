package First.src;
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 국어 점수는? :");
        int Korean = sc.nextInt();
        System.out.print("당신의 수학 점수는? :");
        int math = sc.nextInt();
        System.out.print("당신의 영어 점수는? :");
        int english = sc.nextInt();

        int avg = (Korean + math + english) / 3;

        System.out.print("평균은 : " + avg);
        
    }
}
