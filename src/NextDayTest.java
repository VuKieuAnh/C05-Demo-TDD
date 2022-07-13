import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Month1Year2018(){
//        A: arrange Chuan bi du lieu
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;

        String expect = "2/1/2018";
//   ex   A: action Chay phuong thuc
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
//        A: Assert So sanh
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("case 31/1/2018")
    void testDay31Month1Year2018(){
//        A: arrange Chuan bi du lieu
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;

        String expect = "1/2/2018";
//   ex   A: action Chay phuong thuc
        String result = NextDay.getNextDay(dayTest, monthTest, yearTest);
//        A: Assert So sanh
        assertEquals(expect, result);
    }

}