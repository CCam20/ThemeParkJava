package stalls;

import behaviours.IReviewed;
import people.Visitor;

public class IceCreamStall extends Stall{

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String getName(Visitor visitor) {
        return null;
    }
}
