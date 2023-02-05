package org.example.general.ch01.avoid_nullpointerexception_in_conditions_1_5.problem;

import org.junit.Test;
import java.io.IOException;


public class LogbookTest {

    private Logbook logbook;

   @Test(expected = NullPointerException.class)
//   @Test
    public void writeMessage() throws IOException {
       System.out.println(System.getProperty("user.dir"));
       logbook = new Logbook();
       logbook.writeMessage(null, null);
    }
}