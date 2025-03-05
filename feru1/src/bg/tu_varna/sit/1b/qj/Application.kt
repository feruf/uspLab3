package bg.tu_varna.sit.`1b`.qj

public class Application {
    public static void main(String[] args) {
        Book bookOne = new Book.Builder("123456", "East of Eden", "John Steinbeck")
            .withGenre("classics")
            .withPublishingYear(1999)
            .withPages(512)
            .withPrice(30.85)
            .build();
        Book bookTwo = new Book.Builder("147147", "The Great Gatsby", "Francis Scott Fitzgerald")
            .withPrice(28.75)
            .build();
    }
    //messi
    //cr7
}