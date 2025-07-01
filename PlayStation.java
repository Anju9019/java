public class PlayStation {
       static String[] games = { "God of War", "Spider-Man", "The Last of Us", "Uncharted 4", "Ghost of Tsushima", "Horizon Zero Dawn", "Gran Turismo", "Bloodborne", "Ratchet & Clank", "Days Gone" };
    public static void main(String[]PlayStation ) {
        System.out.println("The number of games are: " + games.length);
       // System.out.println("The games are: " + games[0] + ", " + games[1] + ", " + games[2] + ", "+ games[3] + ", " + games[4] + ", " + games[5] + ", "+ games[6] + ", " + games[7] + ", " + games[8] + ", " + games[9]);//
     for(String game : games ){
    System.out.println(game);
    }
}
}