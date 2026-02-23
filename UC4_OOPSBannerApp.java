/**
* OOPSBannerApp UC3 - OOPS Banner Application (Use Case 4)
* 
* This class displays a simple java application that displays the Object 
* Oriented Programming System OOPS acronym to the console
*
* @vs9842 Developer
* @version 4.0
*/

public class UC4_OOPSBannerApp{
	public static void main(String[] args){
		String[] lines = new String[9];
		lines[0] = String.join(" ","   ***   ","   ***   ",	"*******   ", "   *****  ");
		lines[1] = String.join(" "," **   ** "," **   ** ", "**     ** ", "	** 	     ");
		lines[2] = String.join(" ","**     **","**     **", "**      **", "**        ");
		lines[3] = String.join(" ","**     **","**     **", "**     ** ", " **       ");
		lines[4] = String.join(" ","**     **","**     **", "*******   ", "   ***    ");
		lines[5] = String.join(" ","**     **","**     **", "**        ", "      **  ");
		lines[6] = String.join(" ","**     **","**     **", "**        ", "       ** ");
		lines[7] = String.join(" "," **   ** "," **   ** ", "**        ", "       ** ");
		lines[8] = String.join(" ","   ***   ","   ***   ", "**        ", "  *****   ");
		for(String line : lines){
			System.out.println(line);
		}
	}
}