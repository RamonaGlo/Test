public class ClockLightStatus {

    public static Boolean getClockLightStatus() {
        Boolean light = false;
        if (Clock.seconds % 2 == 0) {
            light = true;
        }
        System.out.println("Clock light: " + light);

        return light;
    }




}
