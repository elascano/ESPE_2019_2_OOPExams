
package ec.edu.espe.createbook.mode;

public class Book {
    private String title; 
    private String author;
    private String editorial;
    private int publicationYear;

    public Book(String title, String author, String editorial, int publicationYear) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.publicationYear = publicationYear;
    }
    
    public void print(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Editorial: "+this.editorial);
        System.out.println("Publication year: "+this.publicationYear);
        System.out.println("\n");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    String getpublicationYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}