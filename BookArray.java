package PROJECT220928;

import java.util.Scanner;
class Book7 {
    String title, author;
    public Book7(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class BookArray {
    public static void main(String[] args) {
        Book7 [] book7 = new Book7[2]; // Book 배열 선언
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<book7.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book7[i] = new Book7(title, author); // 배열 원소 객체 생성
        }
        for(int i=0; i<book7.length; i++)
            System.out.print("(" + book7[i].title + ", " + book7[i].author + ")");
        scanner.close();
    }
}