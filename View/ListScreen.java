package View;

public class ListScreen extends Console{
	
	public void showListOptions(){
		System.out.println("1. Compact / Verbose view");
		System.out.println("press 'Enter' to go back to main menu");
	}
	
	public void compactViewHeaders(){
		System.out.println("Compact View");
		addFooter();
		System.out.print("|     #|");
		System.out.print(" \tName\t |");
		System.out.println(" Number of boats\t |");
	}
	
	public void addFooter(){
		System.out.println("------------------------------------");
	}
	
	public void verboseViewHeaders(){
		System.out.println("Verbose View");
		System.out.print("|     #|");
		System.out.print(" Name\t |");
		System.out.print(" Personal number\t |");
		System.out.print(" Number of boats | ");
		System.out.println(" Boat information");
	}

}
