package es.plexus.dojo.nanakyu.evenorodd;

import org.junit.Test;
import es.plexus.dojo.nanakyu.evenorodd.EvenOrOdd;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

@Ignore
public class EvenOrOddTest {
  @Test
  public void exampleTest() {
    assertEquals("even", EvenOrOdd.oddOrEven(new int[] {0}));
    assertEquals("odd", EvenOrOdd.oddOrEven(new int[] {0,1,4}));
    assertEquals("even", EvenOrOdd.oddOrEven(new int[] {0,-1,-5}));
    assertEquals("odd", EvenOrOdd.oddOrEven(new int[] {2, 5, 34, 6}));
  }
}
