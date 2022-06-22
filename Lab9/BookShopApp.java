
public class BookShopApp{
    public static void main(String [] args) {
        
        Book book1 = new Book("The Carpathians", "Janet Frame", 18.0); 
        Book.setMarkUp(0.8); // this is like e fixed method that applies to all instances of books that are made available
        book1.displayBook();
        Book book2 = new Book("Black Boots and Buttonhooks", "Phyllis Johnston", 16.5);
        book2.displayBook();
        System.out.println(book1);
        
    }
}