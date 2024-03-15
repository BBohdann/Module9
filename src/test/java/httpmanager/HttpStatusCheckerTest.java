package httpmanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.*;

class HttpStatusCheckerTest {


    @Test
    public void testStatusImageValidInput(){
        Map<Integer, String> testCase = new HashMap<>();;
        testCase.put(200, "https://http.cat/200.jpg");
        testCase.put(300, "https://http.cat/300.jpg");
        testCase.put(201, "https://http.cat/201.jpg");
        testCase.forEach((actual,expected)->
                Assertions.assertEquals(expected, new HttpStatusChecker().getStatusImage(actual)));
    }
    @Test
    public void testStatusImageInvalidInput() {
        List<Integer> testCase = Arrays.asList(9,99, 999);
        testCase.forEach(value ->
                Assertions.assertThrows(RuntimeException.class, () -> new HttpStatusChecker().getStatusImage(value)));
    }
}