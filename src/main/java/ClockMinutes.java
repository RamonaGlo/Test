public class ClockMinutes {
    public static Integer drawMinutes() {
        int firstLine = Clock.minutes / 5;
        int secondLine = Clock.minutes % 5;

        System.out.println("Minutes:" + Clock.minutes);
        System.out.println("First Line:" + Clock.drawMinutes(firstLine));
        System.out.println("Second Line:" + Clock.drawMinutes(secondLine));

        return Clock.minutes;
    }
}
