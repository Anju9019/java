public class Cooler {

    static int minSpeed = 0;
    static int currentSpeed = 2; 
    static int maxSpeed = 5;
    static boolean isConnected = false;

    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Cooler is turned on");
        } else {
            isConnected = false;
            System.out.println("Cooler is turned Off");
        }
    }

    public static void increaseSpeed() {
        System.out.println("Trying to increase speed");

        if (isConnected) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Cooler is OFF Please turn it On first.");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Trying to decrease speed");

        if (isConnected) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Min speed reached");
            }
        } else {
            System.out.println("Cooler is OFF Please turn it On first");
        }
    }
}
