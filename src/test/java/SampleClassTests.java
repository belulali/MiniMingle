import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleClassTests {

    @Test
    public void shouldPass() {
        SampleClass sampleClass = new SampleClass();
        assertTrue(sampleClass.getTrue());
    }
}
