public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.0.3";

        Book book1 = new Book("W pustyni i w puszczy", "Sienkiewicz", 2010,203, "Iska", "9282189");
        Book book2 = new Book("Przeminęło z wiatrem", "Mitchell", 1924,560,"English", "627812");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
    }
}
