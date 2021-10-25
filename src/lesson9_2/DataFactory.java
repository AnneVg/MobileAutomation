package lesson9_2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static boolean saveBookList(List<Book> books, String path) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter))
        // dùng try block trong trường hợp này để dù có lỗi gì xảy ra vẫn close dc resource
        {
            for (Book book : books) {
                String dataLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }
    public static List<Book> readBookList(String path) {
        List<Book> books = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String bookDataLine = bufferedReader.readLine();
            while (bookDataLine != null) {
                String[] bookData = bookDataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                books.add(new Book(ISBN, title, authorName));
                bookDataLine  = bufferedReader.readLine(); // To next line
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}

