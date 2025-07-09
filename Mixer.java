class Mixer {

    static int minSpeed = 0;
    static int currentSpeed = 0;
    static boolean isRunning = false;
    static int maxSpeed = 5;
   public static void onOrOff(){
 
	if(isRunning == false ){
		isRunning	= true; 
	 System.out.println("speaker is turned on");
	}
		else {
		isRunning = false;
		System.out.println("speaker is turned off");
		}

	}

    public static void increaseSpeed() {
        System.out.println("Increasing speed");
        if (isRunning) {
            if (currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Mixer is off  turn it on first.");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("Decreasing speed");
        if (isRunning) {
            if (currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Current speed is: " + currentSpeed);
            } else {
                System.out.println("Speed is already at minimum");
            }
        } else {
            System.out.println("Mixer is off Please turn it ON first.");
        }
    }
}
