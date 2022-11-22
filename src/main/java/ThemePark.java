import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> stallsAndAttractions;

    public ThemePark(){
        this.stallsAndAttractions= new ArrayList<IReviewed>();
    }
    public void addStallOrAttraction(IReviewed iReviewed){
        stallsAndAttractions.add(iReviewed);
    }
    public int getListSize(){
        return stallsAndAttractions.size();
    }
    public ArrayList<IReviewed> getAllReviewed(){
        return stallsAndAttractions;
    }
}
