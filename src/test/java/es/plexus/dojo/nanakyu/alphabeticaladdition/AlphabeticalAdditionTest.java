package es.plexus.dojo.nanakyu.alphabeticaladdition;

import org.junit.Test;
import es.plexus.dojo.nanakyu.alphabeticaladdition.AlphabeticalAddition;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;

@Ignore
public class AlphabeticalAdditionTest {
  @Test
  public void fixedTests() {
    assertEquals("f", AlphabeticalAddition.addLetters("a", "b", "c"));
    assertEquals("z", AlphabeticalAddition.addLetters("z"));
    assertEquals("c", AlphabeticalAddition.addLetters("a", "b"));
    assertEquals("c", AlphabeticalAddition.addLetters("c"));
    assertEquals("a", AlphabeticalAddition.addLetters("z", "a"));
    assertEquals("d", AlphabeticalAddition.addLetters("y", "c", "b"));
    assertEquals("z", AlphabeticalAddition.addLetters());
  }
}

