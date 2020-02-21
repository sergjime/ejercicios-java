package es.plexus.dojo.nanakyu.happynumber;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.happynumber.HappyNumber;

@Ignore
public class HappyNumberTest {
  HappyNumber nf = new HappyNumber();
  @Test
  public void validaEjemplos() {
    Assert.assertEquals(true, nf.esFeliz(1));
    Assert.assertEquals(false, nf.esFeliz(2));
    Assert.assertEquals(true, nf.esFeliz(7));
    Assert.assertEquals(false, nf.esFeliz(8));
    Assert.assertEquals(true, nf.esFeliz(19));
    Assert.assertEquals(false, nf.esFeliz(20));
    Assert.assertEquals(true, nf.esFeliz(44));
    Assert.assertEquals(false, nf.esFeliz(45));
    Assert.assertEquals(true, nf.esFeliz(91));
    Assert.assertEquals(false, nf.esFeliz(92));
  }
}
