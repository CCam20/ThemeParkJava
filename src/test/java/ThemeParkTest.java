import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5);
        themePark = new ThemePark();
    }
    @Test
    public void checkThemeparkHasList(){
        themePark.addStallOrAttraction(rollerCoaster);
        themePark.addStallOrAttraction(candyflossStall);
        assertEquals(2, themePark.getListSize());
    }
    @Test
    public void listOfStallsAndAttractions(){
        themePark.addStallOrAttraction(rollerCoaster);
        themePark.addStallOrAttraction(candyflossStall);
        System.out.println(themePark.getAllReviewed());
    }


}
