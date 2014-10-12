package View;

public class SearchScreen extends Console{
	
	public void searchPrompt(){
		System.out.print("Enter personal number of member: ");
	}
	
	public void searchError(){
		System.out.println("No match.");
	}
	
	public void pressEnterPrompt(){
		System.out.println("Press 'Enter' to go back to the Main Menu");
		}
	

}
