public class Rollercoaster extends Attraction implements ISecurity, IReviewed{

    private int rating;

    public Rollercoaster(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceForVisitor(){
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
    }

    public int getRating(){
        return rating;
    }
}
