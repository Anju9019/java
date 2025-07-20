class SpotifyRunner {
     public static void main(String music[]){
  String fullName=Spotify.getfullName();
  System.out.println("The FullName of the spotify is "+fullName);
  
long phoneNumber = Spotify.getphoneNumber();
System.out.println("The phoneNumber of the spotify is "+phoneNumber);

byte rating = Spotify.getRating();
System.out.println("The rating of this Spotify is "+rating);

short trackId = Spotify.gettrackId();
System.out.println("The trackId of this Spotify is "+trackId);

int age = Spotify.getAge();
System.out.println("The Age of the Spotify is "+age);

float audioQuality = Spotify.getadioQuality();
System.out.println("The audioQuality for the Spotify is "+audioQuality);

double filesizeMB=Spotify.getfilesizeMB();
System.out.println("The filesizeMB for the Spotify is "+filesizeMB);

char gender = Spotify.getGender();
System.out.println("The gender of the Spotify is "+gender);

boolean isBest = Spotify.getisBest();
System.out.println("isBest "+isBest);

	 }
}