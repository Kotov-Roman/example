import org.junit.Before;

public class ACTest extends ATest {
    @Before
    public void setUp() {
        a = new AC();
        expectedName = "AC";
    }
}
