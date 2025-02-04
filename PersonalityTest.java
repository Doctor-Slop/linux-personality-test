import java.util.Scanner;
import java.util.Arrays;


    
public class PersonalityTest {
    private int[] privResults = new int[8];
    /*
     results[0] = mint
     results[1] = ubuntu
     results[2] = debian
     results[3] = arch
     results[4] = LFS / Gentoo
     results[5] = Fedora
     results[6] = Pop_os!
     results[7] = Bazzite
    */
    public void personalityTest() {
	int[] results = {0, 0, 0, 0, 0, 0, 0, 0};
	Scanner s = new Scanner(System.in);
	System.out.println("What do you want to use your linux machine for?");
	System.out.println("1. For my job (Systems manager, IT, anything technical)");
	System.out.println("2. For my job (Something non-technical on the computer, typing in spreadsheets or anything like that)");
	System.out.println("3. For something non-professional but technical");
	System.out.println("4. Hardcore gaming baybee!!!!!");
	System.out.println("5. Regular computer usage; internet use, some gaming, etc.");
	System.out.println("6. To learn more about linux! I already know a lot and want to learn more");
	int input = s.nextInt();
	if (input == 1) {
	    results[2]++;
	    results[5]++;
	    results[1]++;
	    results[3]++;
	}
	else if (input == 2) {
	    results[0]++;
	    results[1]++;
	    results[6]++;
	    results[2]++;
	}
	else if (input == 3) {
	    results[2]++;
	    results[3]++;
	    results[4]++;
	}
	else if (input == 4) {
	    results[7]++;
	    results[0]++;
	}
	else if (input == 5) {
	    results[0]++;
	    results[1]++;
	    results[2]++;
	}
	else if (input == 6) {
	    results[3]++;
	    results[4]++;
	}
	System.out.println("How technologically advanced would you say that you are?");
	System.out.println("1. Not advanced at all, I hardly know how to use a keyboard");
	System.out.println("2. I know how to use a file explorer, as well as how to run applications");
	System.out.println("3. I know how to manage file permissions, as well as some basic command line usage");
	System.out.println("4. I'm comfortable using software from CLI's, as well as reading documentation");
	System.out.println("5. I'm comfortable with compling software from source, as well as using docker and other in-depth programs");
	input = s.nextInt();
	if (input == 1 || input == 2) {
	    results[0]++;
	}
        else if (input == 3) {
	    results[0]++;
	    results[1]++;
	    results[2]++;
	}
	else if (input == 4) {
	    results[0]++;
	    results[1]++;
	    results[2]++;
	    results[6]++;
	}
        else if (input == 5) {
	    results[3]++;
	    results[2]++;
	}
	System.out.println("Do you want your operating system to work out of box, or would you like to manage everything on your software so that it's designed to your taste?");
	System.out.println("1. I want an operating system that just works");
	System.out.println("2. I want to manage my operating system's software maticulously to suit my needs");
	input = s.nextInt();
	if (input == 1) {
	    results[0]++;
	    results[1]++;
	    results[2]++;
	    results[6]++;
	}
	else if (input == 2) {
	    results[3]++;
	    results[4]++;
	}
	System.out.println("Do you want software that's just on your computer for fun, but doesn't serve any practical purpose (like games & such)");
	System.out.println("1. Yes, I wan't my computer to be fun.");
	System.out.println("2. No, I want to minimize bloatware.");
	System.out.println("3. I do not care about bloatware.");
	input = s.nextInt();
	if (input == 1) {
	    results[1]++;
	    results[2]++;
	}
	else if (input == 2) {
	    results[0]++;
	    results[3]++;
	    results[4]++;
	}
	else if (input == 3) {
	    results[0]++;
	    results[1]++;
	    results[2]++;
	    results[6]++;
	    results[5]++;
	}
	System.out.println("Would you rather have an operating system developed by a for profit company, who may have alterior motives, or by a team of enthusiasts?");
	System.out.println("1. I would rather have my operating system be developed by a company");
	System.out.println("2. I would rather have my operating system be developed by a group of enthusiasts");
	System.out.println("3. I do not care who develops my operating system");
	input = s.nextInt();
	if (input == 1) {
	    results[1]++;
	    results[5]++;
	    results[6]++;
	    results[7]++;
	}
	else if (input == 2) {
	    results[0]++;
	    results[2]++;
	    results[3]++;
	    results[4]++;
	}
	calculate(results);
	//Doesn't do anything if input == 3
	
    }
    public void calculate(int[] results) {
	int highest = 0;
	int secondHighest = 0;
	for (int i = 0; i < 7; i++) {
	    if (results[i] > results[highest]) {
		secondHighest = highest;
		highest = i;
	    }
	    else if (results[i] > results[secondHighest]) {
		secondHighest = i;	
	    }

	}

	System.out.println("Calculating... Please stand by");
        String numberOne = getResult(results, highest);
	String numberTwo = getResult(results, secondHighest);
	if (highest != secondHighest) {
	    System.out.println("Results are in! #1: most suggested distro is " + numberOne + ", with #2 being " + numberTwo);
	    
	}
	else {
	    System.out.println("Results are in! A tie between " + numberOne + " and " + numberTwo + ". Please ask a VTLUUG representative which distro is right for you");
	}
	System.out.println("If your desired install medium is not on standby, Please notify a VTLUUG member, they will prepare an install medium on site");

    }
    public String getResult(int[] results, int highest) {
	if (highest == 0) {
	    return "Linux Mint";
	}
	else if (highest == 1) {
	    return "Ubuntu";
	}
	else if (highest == 2) {
	    return "Debian";
	}
	else if (highest == 3) {
	    return "Arch";
	}
	else if (highest == 4) {
	    return "LFS";
	}
	else if (highest == 5) {
	    return "Fedora";
	}
	else if (highest == 6) {
	    return "Pop!_Os";
	}
	else if (highest == 7) {
	    return "Bazzite";
	}
	else {
	    return "INDEX ERROR; PLEASE SPEAK TO VTLUUG REPRESENTATIVE";
	}
    }
    public static void main(String[] args) {
	PersonalityTest a = new PersonalityTest();
	a.personalityTest();
    }
}
