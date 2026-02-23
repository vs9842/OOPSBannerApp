/**
* OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
* 
* This class displays a simple java application that displays the Object 
* Oriented Programming System OOPS acronym to the console
*
* @vs9842 Developer
* @version 3.0
*/

public class UC3_OOPSBannerApp{
	public static void main(String[] args){
		System.out.println("   ***       ***    *******       *****  ");
		System.out.println(" **   **   **   **  **     **  	** 	     ");
		System.out.println("**     ** **     ** **      ** **        ");
		System.out.println("**     ** **     ** **     **   **       ");
		System.out.println("**     ** **     ** *******       ***    ");
		System.out.println("**     ** **     ** **               **  "); 
		System.out.println("**     ** **     ** **                ** ");
		System.out.println(" **   **   **   **  **               **  ");
		System.out.println("   ***       ***    **          *****  ");
		System.out.println(String.join(" ","   ***   ","   ***   ",	"*******   ", "   *****  "));
		System.out.println(String.join(" "," **   ** "," **   ** ", "**     ** ", "	** 	     "));
		System.out.println(String.join(" ","**     **","**     **", "**      **", "**        "));
		System.out.println(String.join(" ","**     **","**     **", "**     ** ", " **       "));
		System.out.println(String.join(" ","**     **","**     **", "*******   ", "   ***    "));
		System.out.println(String.join(" ","**     **","**     **", "**        ", "      **  "));
		System.out.println(String.join(" ","**     **","**     **", "**        ", "       ** "));
		System.out.println(String.join(" "," **   ** "," **   ** ", "**        ", "       ** "));
		System.out.println(String.join(" ","   ***   ","   ***   ", "**        ", "  *****  "));
	}
}