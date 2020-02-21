package es.plexus.dojo.nanakyu.fizzbuzz;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.fizzbuzz.FizzBuzz;

@Ignore
public class FizzBuzzTest {
  FizzBuzz fz = new FizzBuzz();
  @Test
  public void validaUno() {
    Assert.assertEquals("1", fz.di(1));
  }  
  @Test
  public void validaTres() {
    Assert.assertEquals("Fizz", fz.di(3));
  }
  @Test
  public void validaCinco() {
    Assert.assertEquals("Buzz", fz.di(5));
  }
  @Test
  public void validaQuince() {
    Assert.assertEquals("FizzBuzz", fz.di(15));
  }
  @Test
  public void validaCien() {
    
  }
}
