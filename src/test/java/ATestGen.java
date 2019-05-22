import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class ATestGen<T extends A> {

    protected A a;
    protected T t;

    @Test
    public void test() {
        assertTrue(a.getClass().isInstance(t));
        System.out.println("generic class: " + t.getClass().getSimpleName());
    }

}
