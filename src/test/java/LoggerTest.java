import com.ConsoleOutputter;
import com.ELoggerSource;
import com.Loggerr;
import com.Outputer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class LoggerTest {

    private Loggerr objectUnderTest = new Loggerr();
    @Test
    public void addOutputerTest(){
        //given
        List<Outputer> expectedResult = new ArrayList<Outputer>();
        expectedResult.add(new ConsoleOutputter());
        //when
        objectUnderTest.addOutputter(ELoggerSource.CONSOLE);
        List<Outputer> actualResult = objectUnderTest.getOutputerList();
        //then
        Assert.assertTrue(expectedResult.equals(actualResult));
    }
}
