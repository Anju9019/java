public class TV {
public class TV {
    static int minVolume = 0;
    static int currentVolume = 3; 
    static boolean isConnected = false;
    static int maxVolume = 7;
    public static void onOrOff() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("TV is turned On");
        } else {
            isConnected = false;
            System.out.println("TV is turned Off");
        }
    }
    public static void increaseVolume() {
        System.out.println("Trying to increase volume");

        if (isConnected) {
            if (currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Current volume is: " + currentVolume);
            } else {
                System.out.println("Max volume reached");
            }
        } else {
            System.out.println("TV is OFF! Please turn it ON first");
        }
    }
    public static void decreaseVolume() {
        System.out.println("Trying to decrease volume");

        if (isConnected) {
            if (currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Current volume is: " + currentVolume);
            } else {
                System.out.println("Min volume reached");
            }
        } else {
            System.out.println("TV is Off Please turn it On first");
        }
    }
}
