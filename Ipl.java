public class Ipl {
      static   String[] teamNames = {"Team Alpha", "Team Bravo", "Team Charlie", "Team Delta", "Team Echo",  "Team Foxtrot", "Team Golf", "Team Hotel", "Team India", "Team Juliet" };
        public static void main(String[]teamnames) {
		System.out.println("The number of teams are: " + teamNames.length);
       // System.out.println("The team names are: "  + teamNames[0] + ", " + teamNames[1] + ", " + teamNames[2] + ", "+ teamNames[3] + ", " + teamNames[4] + ", " + teamNames[5] + ", " + teamNames[6] + ", " + teamNames[7] + ", " + teamNames[8] + ", " + teamNames[9]);//
    
	  for (String teamNames : teamNames) {
         System.out.println(teamNames);
        }
}

}
