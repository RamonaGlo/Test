public class ClockHours {
    public static Integer drawHours() {

        int firstLine = Clock.hours / 5;
        int secondLine = Clock.hours % 5;

        System.out.println("Hours:" + Clock.hours);
        System.out.println("First Line:" + Clock.drawHours(firstLine));
        System.out.println("Second Line:" + Clock.drawHours(secondLine));

        return Clock.hours;
    }
}
