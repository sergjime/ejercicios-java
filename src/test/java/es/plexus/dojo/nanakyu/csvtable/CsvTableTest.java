package es.plexus.dojo.nanakyu.csvtable;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import es.plexus.dojo.nanakyu.csvtable.CsvTable;

@Ignore
public class CsvTableTest {
  CsvTable csv = new CsvTable();
  @Test
  public void ejemplo() {
    List<String> list = Arrays.asList(
        "Name;Street;City;Age", 
        "Peter Pan;Am Hang 5;12345 Einsam;42", 
        "Maria Schmitz;Kölner Strase 45;50123 Köln;43", 
        "Paul Meier;Münchener Weg 1;87654 München;65");
    String table = 
        "Name         |Street          |City         |Age|\r\n" + 
        "-------------+----------------+-------------+---+\r\n" + 
        "Peter Pan    |Am Hang 5       |12345 Einsam |42 |\r\n" + 
        "Maria Schmitz|Kölner Straße 45|50123 Köln   |43 |\r\n" + 
        "Paul Meier   |Münchener Weg 1 |87654 München|65 |";
    Assert.assertEquals(table, csv.toTable(list.iterator()));
  }
}
