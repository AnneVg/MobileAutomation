package lesson9_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private static String path = System.getProperty("user.dir") + "/data/book.csv";
    private static List<Book> bookList = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        bookList = DataFactory.readBookList(path);
        int wrongOptionCounter = 0;
        while (isContinue) {
            if (wrongOptionCounter == 3) {
                System.out.println("You input wrong option 3 times! Try it after 15 mins");
                break;
            }
            System.out.println("===========MENU==========");
            System.out.println("Input 1 to add book: ");
            System.out.println("Input 2 to retrieve book: ");
            System.out.println("Input 3 to update book: ");
            System.out.println("Input 4 to delete book: ");
            System.out.println("Input 0 to Exit! ");
            System.out.println("Please input the number: ");
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 0:
                    wrongOptionCounter = 0;
                    isContinue = false;
                    //saveBookList();
                    System.out.println("Thank you!");
                    break;
                case 1:
                    wrongOptionCounter = 0;
                    addBook();
                    saveBookList();
                    break;
                case 2:
                    wrongOptionCounter = 0;
                    retrieveBook();
                    break;
                case 3:
                    wrongOptionCounter = 0;
                    updateBook();
                    break;

                case 4:
                    deleteBook();
                    saveBookList();
                    break;

                default:
                    wrongOptionCounter++;
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
        bookList.add(book);

    }

    private static void saveBookList() {
        boolean isSavingSuccess = DataFactory.saveBookList(bookList, path);
        if (isSavingSuccess) {
            System.out.println("[INFO] Book saved into: " + path);
        } else {
            System.out.println("[ERROR] Saved book Failed!");
        }

    }

    private static void updateBook() {
        System.out.println("please input isbn: ");
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.nextLine();
        if (!isbn.isEmpty()) {
            for (Book book : bookList) {
                if (book.getISBN().equals(isbn)) {
                    System.out.println("please input new ISBN: ");
                    String newISBN = scanner.nextLine();
                    book.setISBN(newISBN);
                    System.out.println("please input new title: ");
                    String newTitle = scanner.nextLine();
                    book.setTitle(newTitle);
                    System.out.println("please input new author: ");
                    String newAuthor = scanner.nextLine();
                    book.setAuthor(newAuthor);
                    saveBookList();
                }
            }
            System.out.println("Can not find this book!");
        } else {
            System.out.println("You should input ISBN!");
        }

    }

    private static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input ISBN: ");
        String isbn = scanner.nextLine();
        boolean isRemoved = false;
        if (!isbn.isEmpty()) {
            for (int bookIndex = bookList.size() - 1; bookIndex >= 0; bookIndex--) {
                Book book = bookList.get(bookIndex);
                if (book.getISBN().equals(isbn)) {
                    bookList.remove(bookIndex);
                    System.out.println("The " + book.getTitle() + " book is removed successfully");
                    // break; - chỉ break khi ISBN la gia tri duy nhat or remove  1 gia tri  khi gặp
                    isRemoved = true;
                }
            }
        } else {
            System.out.println("You should input an ISBN");
        }
        if (!isRemoved) {
            System.out.println("Can not find any book to remove! Please check ISBN again");
        }


    }

    private static void retrieveBook() {
        System.out.println("please input isbn: ");
        Scanner scanner = new Scanner(System.in);
        String isbn = scanner.nextLine();
        Book returnedBook = null;
        if (!isbn.isEmpty()) {
            for (Book book : bookList) {
                if (book.getISBN().equals(isbn)) {
                    returnedBook = book;
                    break;
                }
            }
        } else {
            System.out.println("You should input an ISBN");

        }
        if (returnedBook != null) {
            System.out.println(returnedBook);
        } else {
            System.out.println("Book not found");
        }
    }


}
