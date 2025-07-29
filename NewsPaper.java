class NewsPaper {
	//special type of the method   
	NewsPaper(){
		System.out.println("Newspaper is Invoked");
	}
	NewsPaper(int newsPaperId, int newsPaperPages, String companyName){
		System.out.println("Newspaper Parameterised cons is invoked");
		this.newsPaperId = newsPaperId;
		this.newsPaperPages = newsPaperPages;
		this.companyName = companyName;
	}
//static//single copy//instance.

int newsPaperId;
int newsPaperPages;
String companyName;
String day;
String NewsPaperdate;

public void NewsPaperGetInfo(){
	System.out.println("The id of newspaper is "+ newsPaperId);
	System.out.println("The id of newspaper is "+ newsPaperPages);
	System.out.println("The id of newspaper is "+ companyName);

}
}