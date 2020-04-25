import java.util.Scanner;

public class Main {

    private static Scanner SCANNER;

    public static void main(String[] args) {

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
                    System.out.println(" [Wyświetl wszystkie ksiązki] jeszcze nie zaimplementowana");
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

}
