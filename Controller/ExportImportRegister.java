package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;



import Model.Member;
import Model.Boat.Type;
import View.ExportImportScreen;

public class ExportImportRegister {

	public void writeCSVFile(Model.List list, ExportImportScreen eis) {
		Scanner scan = new Scanner(System.in);
		eis.filenamePrompt();
		String filepath = scan.nextLine();
		filepath = scan.nextLine();
		// List<String> list2 = new ArrayList<>();
		// linked list with members and boats
		try {
			FileWriter fstream = new FileWriter(filepath);
			BufferedWriter writer = new BufferedWriter(fstream);

			for (Member o : list.getList()) {
				writer.write(o.getMemberNumber() + ",");
				writer.write(o.getName() + ",");
				writer.write(o.getPersonalNumber() + ",");
				writer.write(o.printBoats());
				writer.newLine();
			}
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		eis.confirmPrompt();
	}
	
	public void readCSVFile(Model.List list,ExportImportScreen eis){
		Scanner scan = new Scanner(System.in);
		eis.filenamePrompt();
		String filepath = scan.nextLine();
		filepath = scan.nextLine();
		
		
	//	List listTemp = new ArrayList<>();
		try {

			BufferedReader buff = new BufferedReader(new FileReader(filepath));
			String line = buff.readLine();

			while (line != null && line.length() != 0) {
				String[] itemArray = line.split(",");
				Member a_member = new Member(itemArray[1], itemArray[2],list);
				a_member.setMemberNumber(Integer.valueOf(itemArray[0]));
				
				for(int i=3;i<itemArray.length;i=i+2){
					if(itemArray[i].equals("Sailboat"))
						a_member.addBoat(Type.Sailboat, Double.valueOf(itemArray[i+1]));
					else if(itemArray[i].equals("Kayak"))
						a_member.addBoat(Type.Kayak, Double.valueOf(itemArray[i+1]));
					else if(itemArray[i].equals("Motorsailer"))
						a_member.addBoat(Type.Motorsailer, Double.valueOf(itemArray[i+1]));
					else if(itemArray[i].equals("Other"))
						a_member.addBoat(Type.Other, Double.valueOf(itemArray[i+1]));
				}
				list.add(a_member);
				line = buff.readLine();
			}
			buff.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		eis.confirmPrompt();
		
	}

}

