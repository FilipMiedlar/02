public class Books {
    String bookTitle;
    String bookAuthor;
    int bookReleaseDate;
    String bookGenre;

    public Books(String Title, String Author, int ReleaseDate, String Genre) {
        bookTitle = Title;
        bookAuthor = Author;
        bookReleaseDate = ReleaseDate;
        bookGenre = Genre;

    }

    public void displayBookData() {
        System.out.println("Title:" + " " + bookTitle + "\n" + "Author:" + " " + bookAuthor + "\n" + "Release Date:"
                + " " + bookReleaseDate + "\n" + "Genre:" + " " + bookGenre);
    }

    public static void main(String[] args){
        Books book1 = new Books("1984","George Orwell",1949,"Dystopian Fiction");
        Books book2 = new Books("The Great Gatsby","F.Scott Fitzgerald",1925,"Tragedy");
        book1.displayBookData();
        book2.displayBookData();
    }

}
