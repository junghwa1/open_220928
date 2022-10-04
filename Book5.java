package PROJECT220928;

public class Book5 {
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }
    public Book5() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book5(String title) {
        this(title, "작자미상");
    }
    public Book5(String title, String author) {
        this.title = title; this.author = author;
    }
    public static void main(String [] args) {
        Book5 littlePrince = new Book5("어린왕자", "생텍쥐페리");
        Book5 loveStory = new Book5("춘향전");
        Book5 emptyBook = new Book5();
        loveStory.show();
    }
}