public class Playground extends Attraction implements ISecurity, IReviewed{

    private int rating;

    public Playground(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() <= 15) {
            return true;
        } else {
            return false;
        }
    }

    public void allowEntry(Visitor visitor){
        if (isAllowedTo(visitor)){
            return;
        }
    }

    public int getRating(){
        return rating;
    }
}
