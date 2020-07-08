import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class ProcessorTest {
  @Test
  public void testMax() {
    Processor m = new Processor();
    assertEquals(0, m.max(0,2,4));
  }
}