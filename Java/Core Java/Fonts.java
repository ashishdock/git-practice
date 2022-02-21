// Knowing the vailable fonts

import java.awt.*;

class Fonts
{
	public static void main(String args[])
	{
		//get the local graphics environment information into GraphicsEnvironment object
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//From ge, get available font family names into fonts[]
		String fonts[] = ge.getAvailableFontFamilyNames();
		
		System.out.println("Available fonts on this system: ");
		
		//retreive one by one the font names from fonts[] and display
		for(int i=0; i<fonts.length; i++)
			System.out.println(fonts[i]);
	}
}