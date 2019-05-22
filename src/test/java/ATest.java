import org.junit.Test;

import static org.junit.Assert.*;

public abstract class ATest {

    protected A a;
    protected String expectedName;

    @Test
    public void doSmth() {
        assertEquals(expectedName, a.doSmth());
        System.out.println("class " + a.doSmth());
    }
}