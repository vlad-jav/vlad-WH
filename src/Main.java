public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {

        System.out.println("Привет мир !");


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

        Power.setYear(2020);
        System.out.println("Год издания Power " + Power.getYear());


        Author a1 = new Author(" Alexander  ", " Griboyedov ");
        Author a2 = new Author(" Alexander  ", " Griboyedov ");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String name = " Hi ";
        Author a3 = new Author( "  Nikolay ", " Starikov ");

        int hashA1=a1.hashCode();
        int hashA2=a2.hashCode();
        int hashA3=a3.hashCode();

        System.out.println(a1.equals(a1)+ " hascodes " +  hashA1 + " "+ hashA1 );
        System.out.println(a1.equals(a2)+ " hascodes " +  hashA1 + " "+ hashA2 );
        System.out.println(a1.equals(a3)+ " hascodes " +  hashA1 + " "+ hashA3 );


    }
}





