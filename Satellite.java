class Satellite {
    static int satelliteId ;
    static String name ;
    static String country ;
    static int launchYear ;
    static String agency ;
    static boolean isOperational ;
    static float weight ;
    static double orbitHeight ;
    static char category ;
    static long serialNumber ;
    static String purpose ;
    static boolean communicationEnabled ;
    static short transponders ;
    static byte solarPanels ;
    static String launchVehicle ;
    static boolean hasCamera ;
    static String orbitType ;
    static boolean remoteSensing ;
    static String powerSource ;
    static String status ;

    public static void main(String[] args) {
        System.out.println("satellite id: " + satelliteId);
        System.out.println("name: " + name);
        System.out.println("country: " + country);
        System.out.println("launch year: " + launchYear);
        System.out.println("agency: " + agency);
        System.out.println("is operational: " + isOperational);
        System.out.println("weight: " + weight);
        System.out.println("orbit height: " + orbitHeight);
        System.out.println("category: " + category);
        System.out.println("serial number: " + serialNumber);
        System.out.println("purpose: " + purpose);
        System.out.println("communication enabled: " + communicationEnabled);
        System.out.println("transponders: " + transponders);
        System.out.println("solar panels: " + solarPanels);
        System.out.println("launch vehicle: " + launchVehicle);
        System.out.println("has camera: " + hasCamera);
        System.out.println("orbit type: " + orbitType);
        System.out.println("remote sensing: " + remoteSensing);
        System.out.println("power source: " + powerSource);
        System.out.println("status: " + status);
		
		
		 satelliteId = 13;
    name = "INSAT-3DR";
     country = "India";
     launchYear = 2016;
    agency = "ISRO";
     isOperational = true;
  weight = 2211.0f;
    orbitHeight = 35786.0;
    category = 'W';
    serialNumber = 5678901234L;
     purpose = "Weather Monitoring";
    communicationEnabled = true;
     transponders = 10;
  solarPanels = 2;
    launchVehicle = "GSLV-F05";
    hasCamera = true;
    orbitType = "Geostationary";
    remoteSensing = true;
    powerSource = "Solar";
    status = "Active";
	
        System.out.println("satellite id: " + satelliteId);
        System.out.println("name: " + name);
        System.out.println("country: " + country);
        System.out.println("launch year: " + launchYear);
        System.out.println("agency: " + agency);
        System.out.println("is operational: " + isOperational);
        System.out.println("weight: " + weight);
        System.out.println("orbit height: " + orbitHeight);
        System.out.println("category: " + category);
        System.out.println("serial number: " + serialNumber);
        System.out.println("purpose: " + purpose);
        System.out.println("communication enabled: " + communicationEnabled);
        System.out.println("transponders: " + transponders);
        System.out.println("solar panels: " + solarPanels);
        System.out.println("launch vehicle: " + launchVehicle);
        System.out.println("has camera: " + hasCamera);
        System.out.println("orbit type: " + orbitType);
        System.out.println("remote sensing: " + remoteSensing);
        System.out.println("power source: " + powerSource);
        System.out.println("status: " + status);
    }
}