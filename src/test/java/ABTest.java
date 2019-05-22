import org.junit.Before;

public class ABTest extends ATest {

    @Before
    public void setUp() {
        a = new AB();
        expectedName = "AB";
    }
}
