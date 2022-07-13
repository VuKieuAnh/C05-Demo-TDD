public class NextDay {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day = dayTest+1;
        String result = day+ CONCATENATION + monthTest+ CONCATENATION + yearTest;
        return  result;
    }
}
