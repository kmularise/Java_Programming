package bookpackext;
import bookpack.*;
public class UseBook {
    public static void main(String[] args) {
        Book bk = new Book("html5","Alice",2012);
        bk.pubDate = 2013;
        bk.show();
    }
}
