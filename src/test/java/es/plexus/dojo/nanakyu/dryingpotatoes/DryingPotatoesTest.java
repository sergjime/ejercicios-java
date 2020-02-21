package es.plexus.dojo.nanakyu.dryingpotatoes;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.dryingpotatoes.DryingPotatoes;

@Ignore
public class DryingPotatoesTest {
  private static void dotest(int p0, int w0, int p1, int expected) {
    assertEquals(expected, DryingPotatoes.potatoes(p0, w0, p1));
  }

  @Test
  public void test() {
    dotest(82, 127, 80, 114);
    dotest(93, 129, 91, 100);
  }
}
