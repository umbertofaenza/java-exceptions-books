package org.learning.javaexceptionsbooks;

import java.io.*;
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
                    System.out.println("Invalid number entered.");
                }

                try {
                    Book b = new Book(title, author, publisher, numOfPages);
                    books[i] = b;
                    bookIsValid = true;
                    scan.close();
                } catch(IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while(!bookIsValid);
        }

        File data = new File("./resources/data.txt");
        for(Book book : books) {
            try {
                FileWriter fileWriter = new FileWriter(data);
                fileWriter.write(book.toString());
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Unable to write file.");
            }
        }

        try {
            Scanner fileReader = new Scanner(data);
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file.");
        }
    }
}
