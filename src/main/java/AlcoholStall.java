public class AlcoholStall extends Stall implements ISecurity, IReviewed{

    private int rating;

    public AlcoholStall(String name, String owner, int parkingSpot, int rating){
        super(name, owner, parkingSpot);
        this.rating = rating;
    }

    public double defaultPrice(){
        return 6.60;
    }

    public double priceForVisitor(){
        return defaultPrice();
    }


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 18) {
            return true;
        } else {
            return false;
        }
    }

    public int getRating(){
        return rating;
    }

}
