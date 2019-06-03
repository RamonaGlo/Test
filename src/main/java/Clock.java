
public class Clock {

    static Integer hours;
    static Integer minutes;
    static Integer seconds;

    public Clock(String time) {

        String[] arrTime = time.split(":");

        int hours = Integer.parseInt(arrTime[0]);
        this.setHours(hours);


        int minutes = Integer.parseInt(arrTime[1]);
        this.setMinutes(minutes);

        int seconds = Integer.parseInt(arrTime[2]);
        this.setSeconds(seconds);

    }

    public static void setHours(Integer hours) {
        Clock.hours = hours;
        System.out.println(Clock.hours);
    }

    public static void setMinutes(Integer minutes) {
        Clock.minutes = minutes;
        System.out.println(Clock.minutes);
    }

    public static void setSeconds(Integer seconds) {
        Clock.seconds = seconds;
        System.out.println(Clock.seconds);
    }


    public static String drawHours(Integer noOfHours) {
        String line = "";
        for (int i = 0; i < noOfHours; i++) {
            line += "h";
        }

        return line;
    }

    public static String drawMinutes(Integer noOfMinutes) {
        String line = "";
        for (int i = 0; i < noOfMinutes; i++) {
            line += "m";
        }

        return line;
    }

}



