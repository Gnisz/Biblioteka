import model.Book;
import model.Library;

import java.util.Scanner;

public class Main {

    private static Scanner SCANNER;

    public static void main(String[] args) {

        Library library = createLibraryWithBooks();

        SCANNER = new Scanner(System.in);

        System.out.println("Witaj w Bibliotece! Co mogę dla ciebie zrobić?");



        while(true){

            System.out.println("1) Wyświetl wszystkie książki\n" +
                    "2) Dodaj książkę\n" +
                    "3) usuń książkę\n" +
                    "Wybieram");

            int wpisywanie = SCANNER.nextInt();

            switch (wpisywanie){
                case 1:
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.println(" [Dodaj ksiązkę] jeszcze nie zaimplementowana");
                    break;
                case 3:
                    System.out.println(" [Usuń ksiązkę] jeszcze nie zaimplementowana");
                    break;
                default:
                    System.out.println("bledne dane");
                    break;
            }
        }


    }

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }

}
