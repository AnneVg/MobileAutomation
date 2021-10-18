package lesson7_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookMenu {
    private static ArrayList<Book> books = new ArrayList<Book>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue =true;
        while (isContinue){
            System.out.println("===========MENU==========");
            System.out.println("Input 1 to add book: ");
            System.out.println("Input 2 to retrieve book: ");
            System.out.println("Input 0 to Exit! ");
            System.out.println("Please input the number: ");
            int userOption = scanner.nextInt();
            switch (userOption){
                case 0:
                {
                    isContinue = false;
                    System.out.println("Thank you!");
                    break;
                }
                case 1:
                    addBook();
                    break;

                case 2:
                {
                    Book book = retrieveBook();
                    if(book == null)
                        System.out.println("Can not find this book!");
                    else
                    {
                        System.out.println("The ISBN is: " + book.getISBN());
                        System.out.println("The title is: " + book.getTitle());
                        System.out.println("The author is: " + book.getAuthor());

                    }
                }


                    break;
                default:
                    System.out.println("Wrong option, please try again!");
                    break;

            }


        }
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("please input title: ");
        String title = scanner.nextLine();
        System.out.println("please input author: ");
        String author = scanner.nextLine();
        Book book = new Book();
        book.setISBN(isbn);
        book.setTitle(title);
        book.setAuthor(author);
        books.add(book);

    }
    private static Book retrieveBook(){
        System.out.println("please input isbn: ");
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.nextLine();
        for (Book book:books) {
            if(book.getISBN().equals(isbn))
            return book;
        }
        return null;

    }
}
