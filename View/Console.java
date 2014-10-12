package View;

public abstract class Console {
	
	public int GetInputChar() {
		
		try {
			int c = System.in.read();
			while (c == '\r' || c == '\n') {
				c = System.in.read();
			}
			return c;
		} catch (java.io.IOException e) {
			System.out.println("" + e);
			return 0;
		}
	}
	
	public boolean pressEnterToContinue() {
		try {
		int c = System.in.read();
		if (c == '\r' || c == '\n') {
		return true;
		}

		} catch (java.io.IOException e) {
		System.out.println("" + e);

		}
		return false;
		}
	
	public void confirmPrompt(){
		System.out.println("DONE!\n");
	}

}
