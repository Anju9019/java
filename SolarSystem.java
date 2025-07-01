class SolarSystem {
    static int systemId ;
    static String name ;
    static int totalPlanets ;
    static int dwarfPlanets;
    static boolean hasSun ;
    static String largestPlanet ;
    static String smallestPlanet ;
    static float avgPlanetDistance ;
    static double diameter ;
    static char category;
    static long discoveredYear ;
    static String galaxy ;
    static boolean hasAsteroidBelt ;
    static short moonsInSystem;
    static byte knownStars;
    static String orbitShape ;
    static boolean containsComets ;
    static String primaryStar ;
    static String region ;
    static boolean habitableZone ;

    public static void main(String[] args) {
        System.out.println("system id: " + systemId);
        System.out.println("name: " + name);
        System.out.println("total planets: " + totalPlanets);
        System.out.println("dwarf planets: " + dwarfPlanets);
        System.out.println("has sun: " + hasSun);
        System.out.println("largest planet: " + largestPlanet);
        System.out.println("smallest planet: " + smallestPlanet);
        System.out.println("average planet distance: " + avgPlanetDistance);
        System.out.println("diameter: " + diameter);
        System.out.println("category: " + category);
        System.out.println("discovered year: " + discoveredYear);
        System.out.println("galaxy: " + galaxy);
        System.out.println("has asteroid belt: " + hasAsteroidBelt);
        System.out.println("moons in system: " + moonsInSystem);
        System.out.println("known stars: " + knownStars);
        System.out.println("orbit shape: " + orbitShape);
        System.out.println("contains comets: " + containsComets);
        System.out.println("primary star: " + primaryStar);
        System.out.println("region: " + region);
        System.out.println("habitable zone: " + habitableZone);
		
		
	 systemId = 16;
    name = "Solar System";
  totalPlanets = 8;
  dwarfPlanets = 5;
  hasSun = true;
   largestPlanet = "Jupiter";
    smallestPlanet = "Mercury";
   avgPlanetDistance = 5906.4f;
    diameter = 28746000000.0;
    category = 'S';
    discoveredYear = 1543L;
    galaxy = "Milky Way";
    hasAsteroidBelt = true;
    moonsInSystem = 214;
    knownStars = 1;
    orbitShape = "Elliptical";
   containsComets = true;
    primaryStar = "Sun";
    region = "Local Bubble";
  habitableZone = true;

        System.out.println("system id: " + systemId);
        System.out.println("name: " + name);
        System.out.println("total planets: " + totalPlanets);
        System.out.println("dwarf planets: " + dwarfPlanets);
        System.out.println("has sun: " + hasSun);
        System.out.println("largest planet: " + largestPlanet);
        System.out.println("smallest planet: " + smallestPlanet);
        System.out.println("average planet distance: " + avgPlanetDistance);
        System.out.println("diameter: " + diameter);
        System.out.println("category: " + category);
        System.out.println("discovered year: " + discoveredYear);
        System.out.println("galaxy: " + galaxy);
        System.out.println("has asteroid belt: " + hasAsteroidBelt);
        System.out.println("moons in system: " + moonsInSystem);
        System.out.println("known stars: " + knownStars);
        System.out.println("orbit shape: " + orbitShape);
        System.out.println("contains comets: " + containsComets);
        System.out.println("primary star: " + primaryStar);
        System.out.println("region: " + region);
        System.out.println("habitable zone: " + habitableZone);
    }
}