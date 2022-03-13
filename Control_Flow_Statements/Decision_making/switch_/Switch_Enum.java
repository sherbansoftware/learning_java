package Control_Flow_Statements.Decision_making.switch_;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public enum Switch_Enum {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public static void main(String[] args) {
        // getNews();
        getWeekDay();
    }

    public static Switch_Enum from(String day) {

        switch (day) {
            case "Sunday":
                return SUNDAY;

            case "Monday":
                return MONDAY;

            default:

        }
        return null;
    }

    static int dayNumber = 0;
    static int thisDayNumber = Calendar.DAY_OF_WEEK;

    public static String getWeekDay() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tuesday");
        map.put(2, "Wednesday");
        map.put(3, "Thursday");
        map.put(4, "Friday");
        map.put(5, "Saturday");
        map.put(6, "Sunday");
        map.put(7, "Monday");

        String thisDay = map.get(thisDayNumber);
        System.out.println(thisDayNumber);
        System.out.println(thisDay);
        return thisDay;
    }

}


