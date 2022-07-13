public class NextDay {

    public static final String CONCATENATION = "/";
    public static final int STARTOFMONTH = 1;

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        int day;
        int lastOfMonth = getLastOfMonth(monthTest);
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

    private static int getLastOfMonth(int monthTest) {
        int lastOfMonth;
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth=31;
                break;
             case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth=30;
                break;
            default:
                lastOfMonth=31;

        }
        return lastOfMonth;
    }
}
