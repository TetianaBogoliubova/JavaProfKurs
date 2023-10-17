package homework_27_09_23;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryManagerStream {
    Generator generator = new Generator();
    LibraryUser libraryUser;
    Book book = new Book();

    List<Book> libraryCatalog = new ArrayList<>();
    List<LibraryUser> libraryUsers = new ArrayList<>();

    List<Book> borrowedBooks = new ArrayList<>();
    List<Book> reservedBooks = new ArrayList<>();

//    public void LibraryManager() {
//        libraryUser = new LibraryUser(generator.getUserId(), generator.getUserName(), generator.getUserEmail(), generator.getUserPhone(), borrowedBooks.toString(), reservedBooks.toString());
//    }

//    public List<Book> setUpBooks() {
//
//        while (libraryCatalog.size() < 70) {
//            Book book = new Book(
//                    generator.getBookId(),
//                    generator.getBookTitle(),
//                    generator.getBookAuthor(),
//                    generator.getBookGenre(),
//                    generator.getBookYear(),
//                    generator.getBookAvailable()
//            );
//            libraryCatalog.add(book);
//        }
//        return libraryCatalog;
//    }

    public List<Book> setListBorrowedBook2() {
        while (borrowedBooks.size() < 5) {
            Book book = generator.getUserBooksBorrowed();
            borrowedBooks.add(book);
        }
        return borrowedBooks;
    }

    public List<Book> setListReservedBook2() {
        while (reservedBooks.size() < 10) {
            Book book = generator.getUserBooksReserved();
            reservedBooks.add(book);
        }
        return reservedBooks;
    }

//    public List<LibraryUser> setUpUsers() {
//        while (libraryUsers.size() < 30) {
//            LibraryUser libraryUser = new LibraryUser(
//                    generator.getUserId(),
//                    generator.getUserName(),
//                    generator.getUserEmail(),
//                    generator.getUserPhone(),
//                    borrowedBooks.toString(),
//                    reservedBooks.toString()
//            );
//            libraryUsers.add(libraryUser);
//        }
//        return libraryUsers;
//    }

    // 1. Метод, который возвращает список доступных книг заданного жанра.
    public List<Book> listAvailableBooksByGenre2(Genre genre) {
        return libraryCatalog.stream()
                .filter(book -> book.getBookGenre().equals(genre) && book.isBookAvailable())
                .toList();
    }

    // 2. Метод,который возвращает множество адресов электронной почты пользователей, зарезервировавших книги.
    public Set<String> listUserEmailsWithReservedBooks2() {
        return libraryUsers.stream()
                .filter(us -> us.getUserBooksReserved() != null)
                .map(libraryUser1 -> libraryUser1.getUserName())
                .collect(Collectors.toSet());

        // 3. Метод, который добавляет новую книгу в библиотеку.

//        public void addBookToLibrary2(int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
//            Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
//            libraryCatalog.add(book);
//            System.out.println("В библиотеку добавлена новая книга: " + book);
//        }
//    }
//
//    // 4. Метод, который удаляет книгу из библиотеки.
//    public void removeBookFromLibrary2(boolean bookAvailable) {
//        libraryCatalog.removeIf(book -> book.isBookAvailable() == bookAvailable);
//        System.out.println("Удаление книги из каталога по категории 'Доступность': " + libraryCatalog); //удаление возможно и по всем остальным характеристикам.
//    }
//
//    // 5. Метод, который позволяет пользователю взять книгу в аренду.
//    public void borrowBook2(int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
//        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
//        libraryUsers.stream()
//                .filter(us -> us.getUserName().equals(userName))
//                .forEach(us -> {
//                    Book foundBook = libraryCatalog.stream()
//                            .filter(b -> b.getBookTitle().equals(bookTitle))
//                            .findFirst()
//                            .orElse(null);
//                    if (foundBook != null) {
//                        us.getUserBooksReserved().add(foundBook);
//                    } else {
//                        System.out.println("Эта книга сейчас недоступна");
//                    }
//                });
//        System.out.println("Пользователь " + userName + "взял книгу: " + book + " в аренду");
//    }
//
//    // 6 .Метод, который позволяет пользователю зарезервировать книгу.
//    public void reserveBook2(String userName, int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
//        Book book = new Book(bookId, bookTitle, bookAuthor, bookGenre, bookYear, bookAvailable);
//        libraryUsers.stream()
//                .filter(us -> us.getUserName().equals(userName))
//                .forEach(us -> {
//                    Book foundBook = libraryCatalog.stream()
//                            .filter(b -> b.getBookTitle().equals(bookTitle))
//                            .findFirst()
//                            .orElse(null);
//                    if (foundBook != null) {
//                        us.getUserBooksReserved().add(foundBook);
//                    }
//                });
//        System.out.println("Пользователь " + userName + "поставил книгу: " + book + " в резерв");
//    }
//    public LibraryUser getLibraryUser() {
//        return libraryUser;
//    }
//
//    public void setLibraryUser(LibraryUser libraryUser) {
//        this.libraryUser = libraryUser;
//    }
    }

}

