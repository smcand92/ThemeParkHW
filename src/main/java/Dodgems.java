public class Dodgems extends Attraction implements ITicketed, IReviewed {

    private int rating;

    public Dodgems(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }

    public int getRating(){
        return rating;
    }
}
