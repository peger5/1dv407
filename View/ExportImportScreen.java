package View;

public class ExportImportScreen extends Console{
	
	public void filenamePrompt(){
		System.out.print("Enter file destination: ");
	}
	
	public void exportOrImportPrompt(){
		System.out.println("Press 'e' for exporting the register to a .txt file");
		System.out.println("Press 'i' to import a register from a .txt file");
	}

}
