class Fan {

    static int minSpeed = 0;
    static int currentSpeed = 0;
    static boolean isOn = false;
    static int maxSpeed = 5;

    public static void onOrOff() {
        if (!isOn) {
            isOn = true;
            System.out.println("Fan is turned on");
        } else {
            isOn = false;
            System.out.println("Fan is turned off");
        }
    }

    public static void increaseSpeed() {
        System.out.println("Increasing speed");
        if (isOn) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("Fan is OFF! Please turn it ON first");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Decreasing speed");
        if (isOn) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Speed is already at minimum");
            }
        } else {
            System.out.println("Fan is OFF! Please turn it on first");
        }
    }
}
