package org.learning.javaexceptionsbooks;

public class Book {
    private String title, author, publisher;
    private int numOfPages;

    public Book(String title, String author, String publisher, int numOfPages) throws IllegalArgumentException {
        if(title.trim().isEmpty() || author.trim().isEmpty() || publisher.trim().isEmpty() || numOfPages <= 0) {
            throw new IllegalArgumentException("Invalid data entered. Book was not created.");
        }

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if(title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title can't empty");
        }

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if(author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author can't be empty");
        }

        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if(publisher.trim().isEmpty()) {
            throw new IllegalArgumentException("Publisher can't be empty");
        }

        this.publisher = publisher;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) throws IllegalArgumentException {
        if(numOfPages <= 0) {
            throw new IllegalArgumentException("Number of pages can't be <= 0");
        }

        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
