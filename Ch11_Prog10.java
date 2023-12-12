package com.company;

class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for(String book: this.books){
            if(book == null){
                break;
            }
            System.out.println("* "+book);
        }
    }
}
public class Ch11_Prog10 {
    public static void main(String[] args) {
        // You have to implement a library using Java "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to Store availableBooks
        // Array to store issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich Book");
        centralLibrary.addBook("Java Book");
        centralLibrary.addBook("Algorithms Book");
        centralLibrary.showAvailableBooks();
    }
}
