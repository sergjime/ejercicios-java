package es.plexus.dojo.nanakyu.sumtriangularnumber;

import org.junit.Test;
import es.plexus.dojo.nanakyu.sumtriangularnumber.SumTriangularNumber;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

@Ignore
public class SumTriangularNumberTest {
  @Test
  public void basicTests() {
    assertEquals(20, SumTriangularNumber.sumTriangularNumbers(4));
    assertEquals(56, SumTriangularNumber.sumTriangularNumbers(6));
    assertEquals(7140, SumTriangularNumber.sumTriangularNumbers(34));
    assertEquals(0, SumTriangularNumber.sumTriangularNumbers(-291));
    assertEquals(140205240, SumTriangularNumber.sumTriangularNumbers(943));
    assertEquals(0, SumTriangularNumber.sumTriangularNumbers(-971));
  }
}
