package extends1;

public class Movie extends Product{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("director: " + director);
        System.out.println("actor: " + actor);
    }
}
