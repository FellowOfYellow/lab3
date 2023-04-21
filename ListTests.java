import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;


class containsA implements StringChecker{
    public boolean checkString(String s){
        if (s.contains("a")){
            return true;
        }
        return false;
    }
}

@Test
public void testFilter() {
    List<String> testArray = new ArrayList<String>();
    testArray.add("bro");
    testArray.add("rot");
    testArray.add("yo");
    List<String> answerArray = testArray;
    StringChecker checker = new containsA();
    ListExamples.filter(testArray, checker);
    assertEquals(answerArray, testArray);
}
