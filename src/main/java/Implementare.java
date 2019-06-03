public class Implementare{

    public static void main(String[] args) {
        Clock clock = new Clock("19:34:23");
        ClockLightStatus clockLightStatus = new ClockLightStatus();
        clockLightStatus.getClockLightStatus();
        ClockHours clockHours = new ClockHours();
        clockHours.drawHours();
        ClockMinutes clockMinutes = new ClockMinutes();
        clockMinutes.drawMinutes();
    }
}
