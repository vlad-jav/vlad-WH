import java.util.Objects;

public class Book {

    private String name;

    private Author author;



    public Book (String name, Author author, int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.getYear() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getYear());
    }
}


