import org.junit.Before;

public class ABTestGen extends ATestGen<AB> {

    @Before
    public void setUp() {
        a = new AB();
        t = new AB();
    }
}
