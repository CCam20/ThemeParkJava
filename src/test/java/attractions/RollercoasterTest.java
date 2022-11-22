package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10, 100, 10 );
        visitor2 = new Visitor(23, 180, 100);
        visitor3 = new Visitor(34, 220, 90);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void visitorIsAllowedOnRollercoster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }
    @Test
    public void visitorIsNotAllowedOnRollercoster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
    @Test
    public void checkPriceForVisitorLessThan200(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor2),0);
    }
    @Test
    public void checkPriceForVisitorMoreThan200(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3),0);
    }
}
