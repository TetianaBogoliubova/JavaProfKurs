package homework_27_09_23;

import java.util.*;

public class LibraryManager {
    Generator generator = new Generator();
    LibraryUser libraryUser;

    List<Book> libraryCatalog = new ArrayList<>();
    List<LibraryUser> libraryUsers = new ArrayList<>();

    List<Book> borrowedBooks = new ArrayList<>();
    List<Book> reservedBooks = new ArrayList<>();

    public LibraryManager() {
        libraryUser = new LibraryUser(generator.getUserId(), generator.getUserName(), generator.getUserEmail(), generator.getUserPhone(), borrowedBooks.toString(), reservedBooks.toString());
    }

    public List<Book> setUpBooks() {

        while (libraryCatalog.size() < 70) {
            Book book = new Book(
                    generator.getBookId(),
                    generator.getBookTitle(),
                    generator.getBookAuthor(),
                    generator.getBookGenre(),
                    generator.getBookYear(),
                    generator.getBookAvailable()
            );
            libraryCatalog.add(book);
        }
        return libraryCatalog;
    }

    public List<Book> setListBorrowedBook() {
        while (borrowedBooks.size() < 5) {
            Book book = generator.getUserBooksBorrowed();
            borrowedBooks.add(book);
        }
        return borrowedBooks;
    }

    public List<Book> setListReservedBook() {
        while (reservedBooks.size() < 10) {
            Book book = generator.getUserBooksReserved();
            reservedBooks.add(book);
        }
        return reservedBooks;
    }

    public List<LibraryUser> setUpUsers() {
        while (libraryUsers.size() < 30) {
            LibraryUser libraryUser = new LibraryUser(
                    generator.getUserId(),
                    generator.getUserName(),
                    generator.getUserEmail(),
                    generator.getUserPhone(),
                    borrowedBooks.toString(),
                    reservedBooks.toString()
            );
            libraryUsers.add(libraryUser);
        }
        return libraryUsers;
    }

    //Метод, который возвращает список доступных книг заданного жанра.
    public List<Book> listAvailableBooksByGenre(Genre genre) {
        List<Book> newList = new ArrayList<>();
        for (Book i : libraryCatalog) {
            if (i.getBookGenre().equals(genre) && i.isBookAvailable() == true) {
                newList.add(i);
            }
        }
        return newList;
    }

    //Метод,который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks() {
        Set<String> setWithEmail = new HashSet<>();
        for (LibraryUser i : libraryUsers) {
            if (i.getUserBooksReserved() != null) {
                setWithEmail.add(i.getUserEmail());
            }
        }
        return setWithEmail;
    }

    //Метод, который добавляет новую книгу в библиотеку.
    public void addBookToLibrary(int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
        libraryCatalog.add(book);
        System.out.println("В библиотеку добавлена новая книга: " + book);
    }

    //Метод, который удаляет книгу из библиотеки.
    public void removeBookFromLibrary(boolean bookAvailable) {
        Iterator<Book> iterator = libraryCatalog.iterator();
        while (iterator.hasNext()) {
            Book i = iterator.next();
            if (i.isBookAvailable() == bookAvailable) {
                iterator.remove();
            }
        }
        System.out.println("Удаление книги из каталога по категории 'Доступность': " + libraryCatalog); //удаление возможно и по всем остальным характеристикам.
    }

    //Метод, который позволяет пользователю взять книгу в аренду.
    public void borrowBook(String userName, int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
        for (LibraryUser i : libraryUsers) {
            if (i.getUserName().equals(userName)) {
                for (Book j : libraryCatalog) {
                    if (j.getBookTitle().equals(bookTitle)) {
                        borrowedBooks.add(book);
                    } else System.out.println("Эта книга сейчас недоступна");
                }
            }
        }
        System.out.println("Пользователь " + userName + "взял книгу: " + book + " в аренду");
    }

    //Метод, который позволяет пользователю зарезервировать книгу.
    public void reserveBook(String userName, int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
        for (LibraryUser i : libraryUsers) {
            if (i.getUserName().equals(userName)) {
                for (Book j : libraryCatalog) {
                    if (j.getBookTitle().equals(bookTitle)) {
                        reservedBooks.add(book);
                    }
                }
            }
        }
        System.out.println("Пользователь " + userName + "поставил книгу: " + book + " в резерв");
    }
}