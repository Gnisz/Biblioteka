package model;

public class Library {


    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void printAllBooks() {

        for (Book book :books) {

            System.out.println(book);

        }
    }

    public void deleteBookById(Long id) throws LibraryException{

        if (isBookPresent(id)){

            Book[] newBookTable = new Book[books.length - 1];

            int przesuniecie = 0;

            for (int i = 0; i < books.length; i++) {

                if ( !id.equals(books[i].getId())) {
                    newBookTable[i - przesuniecie] = books[i];
                }
                else {
                    przesuniecie++;
                }
            }
            books = newBookTable;

        }
        else {
            throw new LibraryException("Podana książka nie widnieje w bibliotece, wiec nie można jej usunąć");

        }


    }

    private boolean isBookPresent( Long id){

        for (Book book : books) {

            if(book.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}
