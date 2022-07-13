public class NextDay {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day;
        if (dayTest==31){
            day=1;
            monthTest = monthTest+1;
        }
        else {
            day = dayTest+1;
        }
        String result = day+ CONCATENATION + monthTest+ CONCATENATION + yearTest;
        return  result;
    }
}
