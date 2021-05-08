import static org.junit.Assert.*;

public class KaartCollectieTest {

    private KaartCollectie Collectie = new KaartCollectie ();
    @org.junit.Test
    public void initTest () {

        assertEquals (0.0, Collectie.computeTotal(), 0.0001);
        assertEquals (0, Collectie.getCount());
    }
    @org.junit.Test
    public void eersteKaartToegevoegd () {
        Collectie.addItem( 10);
        assertEquals(10, Collectie.computeTotal(), 0.0001);
        assertEquals(1, Collectie.getCount());

    }
}