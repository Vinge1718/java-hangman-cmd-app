import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class HangmanTest{
    @Test
    public void hang_displayRandomWord_String(){
        Hangman testHangman = new Hangman();
        String[] expectedOutput = {"weather", "program", "computer", "animals", "beverage", "entertaiment" };
        assertEquals(expectedOutput, testHangman.getWords());
    }
}
