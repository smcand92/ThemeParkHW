public class CandyFlossStall extends Stall implements ITicketed, IReviewed {

    private int rating;

    public CandyFlossStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot);
        this.rating = rating;
    }

    public double defaultPrice(){
        return 4.20;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }

    public int getRating(){
        return rating;
    }
}
