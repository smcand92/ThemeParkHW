import java.util.ArrayList;

public class ThemePark {

    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviews;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls, ArrayList<IReviewed> reviews) {
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviews = reviews;
    }


}
