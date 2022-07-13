public class NextDay {

    public static final String CONCATENATION = "/";
    public static final int STARTOFMONTH = 1;

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day;
        int lastOfMonth = 31;
        if (dayTest== lastOfMonth){
            day= STARTOFMONTH;
            monthTest++;
        }
        else {
            day = dayTest+1;
        }
        String result = day+ CONCATENATION + monthTest+ CONCATENATION + yearTest;
        return  result;
    }
}
