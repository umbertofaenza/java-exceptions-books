package org.learning.javaexceptionsbooks;

public class Book {
    private String title, author, publisher;
    private int numOfPages;

    public Book(String title, String author, String publisher, int numOfPages) throws IllegalArgumentException {
        if(title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()
                || publisher == null || publisher.trim().isEmpty() || numOfPages <= 0) {
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
        if(title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid title.");
        }

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if(author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid author.");
        }

        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if(publisher == null || publisher.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid publisher.");
        }

        this.publisher = publisher;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) throws IllegalArgumentException {
        if(numOfPages <= 0) {
            throw new IllegalArgumentException("Invalid number.");
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
