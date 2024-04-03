package org.learning.javaexceptionsbooks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many books would you like to add? ");
        int size = Integer.parseInt(scan.nextLine());

        Book[] books = new Book[size];

        for (int i = 0; i < size; i++) {

            boolean bookIsValid = false;

            do {
                System.out.println("Book " + (i+1));

                System.out.print("Insert title: ");
                String title = scan.nextLine();

                System.out.print("Insert author: ");
                String author = scan.nextLine();

                System.out.print("Insert publisher: ");
                String publisher = scan.nextLine();

                System.out.print("Insert number of pages: ");
                int numOfPages = 0;
                try {
                    numOfPages = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number entered.");;
                }

                try {
                    Book b = new Book(title, author, publisher, numOfPages);
                    books[i] = b;
                    bookIsValid = true;
                } catch(IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while(!bookIsValid);
        }

        for (Book book : books) {
            System.out.println(book.toString());
        }

        scan.close();
    }
}
