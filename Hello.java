public class Hello {
    public static void main(String[] args) {
        System.err.println("Hello");
        System.out.print(false);    //boolean 참,거짓

        int birthYear = 2008;
        int age = 2025 - birthYear;
        System.out.println("Your age " + age + "years old!");
        System.out.println();

        int score = 85;
        if(score >= 90){
            System.out.println("A grade");
        }
        else if(score >=80){
            System.out.println("B grade");
        }
        else if(score >=70){
            System.out.println("C grade");
        }
        else if(score >=60){
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }

        for(int i = 1; i<=3; i++){
            System.out.println(i + "print!");
        }
    }
}
