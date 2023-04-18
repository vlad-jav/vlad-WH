public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");


        Author Griboyedov = new Author(" Alexander  ", " Griboyedov ");
        Author Starikov = new Author("Nikolay", " Starikov ");

        Book WoeFromWit = new Book(" Woe From Wit ", Griboyedov, 1824);
        Book Power = new Book("Power", Starikov, 2015);

        System.out.println(" WoeFromWit:");
        System.out.println(WoeFromWit.getName());
        System.out.println(WoeFromWit.getAuthor().getName() + "  " + WoeFromWit.getAuthor().getSurname());
        System.out.println(WoeFromWit.getYear());

        System.out.println();

        System.out.println(" Power:");
        System.out.println(Power.getName());
        System.out.println(Power.getAuthor().getName() + " " + Power.getAuthor().getSurname());
        System.out.println(Power.getYear());

        Power.setYear( 2020);
        System.out.println("Год издания Power " + Power.getYear() );
    }
}
