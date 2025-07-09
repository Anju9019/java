class AC {

    static int minTemperature = 16;
    static int currentTemperature = 24;
    static boolean isOn = false;
    static int maxTemperature = 30;

    public static void onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("AC is turned on");
        } else {
            isOn = false;
            System.out.println("AC is turned Of");
        }
    }

    
    public static void increaseTemperature() {
        System.out.println("Increasing temperature");
        if (isOn) {
            if (currentTemperature < maxTemperature) {
                currentTemperature++;
                System.out.println("Current temperature is: " + currentTemperature + "°C");
            } else {
                System.out.println("Maximum temperature reached.");
            }
        } else {
            System.out.println("AC is OFF! Please turn it ON first");
        }
    }

    
    public static void decreaseTemperature() {
        System.out.println("Decreasing temperature");
        if (isOn) {
            if (currentTemperature > minTemperature) {
                currentTemperature--;
                System.out.println("Current temperature is: " + currentTemperature + "°C");
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("AC is OFF! Please turn it ON first");
        }
    }
}
