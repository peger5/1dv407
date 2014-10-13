package View;

public class StartScreen extends Console{

//	public int GetInputChar() {
//		
//		try {
//			int c = System.in.read();
//			while (c == '\r' || c == '\n') {
//				c = System.in.read();
//			}
//			return c;
//		} catch (java.io.IOException e) {
//			System.out.println("" + e);
//			return 0;
//		}
//	}
//	
//	public boolean WantToQuit(){
//		return GetInputChar() == 'q';
//	}

	
	public void ShowWelcomeMessage(){
		System.out.println("Welcome to the members register.");
	}
	
	public void ShowStartInstructions(){
		System.out.println("1. List members");
		System.out.println("2. Add member");
		System.out.println("3. Search a member");
		System.out.println("4. Export/Import");
		System.out.println("Press Q to quit.");
	}

}
