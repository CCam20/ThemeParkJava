package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String getName(Visitor visitor) {
        return null;
    }
}
