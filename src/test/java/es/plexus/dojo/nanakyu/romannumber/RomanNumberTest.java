package es.plexus.dojo.nanakyu.romannumber;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.romanumber.RomanNumber;

@Ignore
public class RomanNumberTest {
  RomanNumber nr = new RomanNumber();

  @Test
  public void validaEmeplos() {
    Assert.assertEquals(1, nr.decimal("I"));
    Assert.assertEquals(2, nr.decimal("II"));
    Assert.assertEquals(4, nr.decimal("IV"));
    Assert.assertEquals(5, nr.decimal("V"));
    Assert.assertEquals(9, nr.decimal("IX"));
    Assert.assertEquals(42, nr.decimal("XLII"));
    Assert.assertEquals(99, nr.decimal("XCIX"));
    Assert.assertEquals(2013, nr.decimal("MMXIII"));
  }
}
