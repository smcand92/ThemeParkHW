public class IceCreamStall extends Stall implements IReviewed{

    private int rating;

    public IceCreamStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot);
        this.rating = rating;
    }

    public double defaultPrice(){
        return 2.80;
    }

    public double priceForVisitor(){
        return defaultPrice();
    }

    public int getRating(){
        return rating;
    }
}
