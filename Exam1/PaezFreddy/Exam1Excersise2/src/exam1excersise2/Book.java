package exam1excersise2;

public class Book {
    String title, author, editorial;
    int year;

    public Book(String title, String author, String editorial, int year) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getYear() {
        return year;
    }
    
    public void printBook(){
        System.out.println(title + " " + author + " " + editorial + " " + year);
    }
}
