package oop.encapsulation.pojo;

/**
 * Created by Sergey
 */
public class Library {
    public static void main(String[] args) {

        Book jungleBook = new Book("Jungle Book", 122);
        Book alphabet = new Book("Alphabet", 50);
        Book harryPotter = new Book("Clean code", 300);
        Book cleanCode = new Book("Clean code", 200);

        Book[] books = new Book[4];
        books[0] = jungleBook;
        books[1] = alphabet;
        books[2] = harryPotter;
        books[3] = cleanCode;


        for (int i = 0; i < books.length; i++) {
            Book bookTemp = books[0];
            books[0] = books[3];

            Book bk = books[i];
            books[3] = bookTemp;
            System.out.println(bk.getName() + " - " + bk.getCountOfPage());
        }
        System.out.println("------------");
        for (int j = 0; j < books.length; j++) {
            if (books[j].getName().equals("Clean code")) {
                Book bks = books[j];

                System.out.println(bks.getName() + " - " + bks.getCountOfPage());
            }

        }
    }

}

