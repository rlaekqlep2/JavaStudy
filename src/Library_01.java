package First.src;
import java.util.*;
public class Library_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> books = new HashMap<>();

        while (true) {
            System.out.println("1. 도서 추가 | 2. 목록 출력 | 3. 검색 | 0. 종료");
            int sel = sc.nextInt();
            sc.nextLine();
            
            if (sel == 1){
                System.out.println("책 제목: ");
                String title = sc.nextLine();
                System.out.println("저자: ");
                String author = sc.nextLine();
                books.put(title, author);
                System.out.println("도서가 추가되었습니다.");
            } else if(sel == 2){
                for(String t: books.keySet()){  //세미콜론 없다
                    System.out.println(t + " - "+books.get(t));
                }
            }
        }
    }
}
