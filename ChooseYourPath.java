import java.util.Scanner;

public class Adventure1 
    
{public static void main(String[] args) 
    {Scanner keyboard = new Scanner(System.in);
    String firstOption, secondOption, thirdOption;
    System.out.println("WELCOME TO MY CHOOSE YOUR PATH!");
    System.out.println();
    System.out.println("You are in a space ship! Would you like to \"explore\" or ");
    System.out.println("\"look at your phone\"?");
    System.out.print("> ");
    firstOption = keyboard.next();
    System.out.println();
    if (firstOption.equalsIgnoreCase("explore")) 
    
    {System.out.println("There is a room titled 'NAVIGATION'");
        System.out.println("there another room titled 'STORAGE'. You may enter \"NAVIGATION\"");
        System.out.println("or \"STORAGE\".");
        System.out.print("> ");
        secondOption = keyboard.next();
        System.out.println();
        if (secondOption.equalsIgnoreCase("NAVIGATION")) 
        
        {System.out.println("Inside NAVIGATION you see a big window and a control panel. It looks really cool.");
            System.out.println("Would you like to press all the bottoms? (\"yes\" or \"no\")");
            System.out.print("> ");
            thirdOption = keyboard.next();
            System.out.println();
            if (thirdOption.equalsIgnoreCase("yes")) 
            System.out.println("You activate a bomb and thee whole ship explodes killing you.");
        }
    }
    else 
    {System.out.println("Inside the STORAGEE there is a big box. You can");
        System.out.println("\"open it\". or \"walk out\" What would you like");
        System.out.println("to do?");
        System.out.print("> ");
        secondOption = keyboard.next();
        System.out.println();
        if (secondOption.equalsIgnoreCase("opeeen it")) 
       
        {System.out.println("the box is empty, you survive");
            System.out.println("CONGRATULATIONS YOU WON!");   
        }
    }
}}
