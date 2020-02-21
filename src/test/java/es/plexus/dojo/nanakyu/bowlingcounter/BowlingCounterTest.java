package es.plexus.dojo.nanakyu.bowlingcounter;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.bowlingcounter.BowlingGame;
import es.plexus.dojo.nanakyu.bowlingcounter.GameEndedException;

@Ignore
public class BowlingCounterTest {

  @Test
  public void juegoPerfecto() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    j.addTurno(10, 0);
    Assert.assertEquals(300, j.puntuacion());
  }
  
  @Test
  public void juegoNormalito() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    j.addTurno(9, 0);
    Assert.assertEquals(90, j.puntuacion());
  }
  
  @Test
  public void juegoBueno() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    j.addTurno(5, 5);
    Assert.assertEquals(90, j.puntuacion());
  }

  @Test
  public void finalNormal() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertTrue(j.haTerminado());
    try {
      j.addTurno(5, 2);
      Assert.fail("No se puede hacer esta tirada");
    } catch(GameEndedException jte) {
    }
  }

  @Test
  public void finalSpare() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 5);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertTrue(j.haTerminado());
    try {
      j.addTurno(5, 5);
      Assert.fail("No se puede hacer esta tirada");
    } catch(GameEndedException jte) {
    }
  }

  @Test
  public void finalStrike() throws GameEndedException {
    BowlingGame j = new BowlingGame();
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(5, 2);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(10, 0);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(10, 0);
    Assert.assertFalse(j.haTerminado());
    j.addTurno(10, 0);
    Assert.assertTrue(j.haTerminado());
    try {
      j.addTurno(5, 5);
      Assert.fail("No se puede hacer esta tirada");
    } catch(GameEndedException jte) {
    }
  }
}