import java.io.IOException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Rafael on 05.09.2016.
 */
public class MainTest {

    @org.junit.Test
    public void testmMTask() throws IOException {

        String input_string1 = "mM";
        String output_string1 ="Mm";
        assertEquals(output_string1, Main.mMTask(input_string1) );

        String input_string2 = "abcdefghijklmABCDEFGHIJKLM";
        String output_string2 = "abcdefghijklMABCDEFGHIJKLm";
        assertEquals(output_string2, Main.mMTask(input_string2) );

        assertEquals(input_string2, Main.mMTask(Main.mMTask(input_string2)));

        String input_string3 = "This text shall be used to replace the requested letters. There is no single M in here! God damn it!";
        String output_string3 = "This text shall be used to replace the requested letters. There is no single m in here! God daMn it!";
        assertEquals(output_string3, Main.mMTask(input_string3));

    }


}