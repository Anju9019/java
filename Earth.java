public class Earth {
      static  String[] continents = { "Asia", "Africa", "North America", "South America", "Antarctica","Europe", "Australia" };
          public static void main(String[]earth) {
		  System.out.println("The number of continents are: " + continents.length);
        //System.out.println("The continents are: "  + continents[0] + ", " + continents[1] + ", " + continents[2] + ",  + continents[3] + ", " + continents[4] + ", " + continents[5] + ", " + continents[6]);//    }
        for (String continents :continents) {
         System.out.println(continents);
        }
    }
}