package first.selection.program;

import java.util.Scanner;

/**
 * @author anzha2250
 */
public class FirstSelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyinput = new Scanner(System.in);
        //variables needed in program
        double price; 
        double number1,number2,number3,number4,number5,number6;
        
        
        System.out.println("Please enter the amount spent: ");
        price = keyinput.nextDouble();
        
        if(price >= 0.01 & price <= 40)
        {
            number1 = price * 0.1;//Tax is....
            number2 = price - number1;// Here is total
            number2 = number2 * 100;
            number2 = Math.round (number2);
            number2 = number2 / 100;
            
            System.out.println("You spent: ");
            System.out.println("You are saving: 10.0% ");
            System.out.println("You are saving: " + number1);
            System.out.println("Tour tatal is : " + number2);
            
        }
        else if(price >= 40.01 & price <= 80)
        {
            number1 = price * 0.2;//Tax is......
            number2 = price - number1;//here is total
            number2 = number2 * 100;
            number2 = Math.round (number2);
            number2 = number2 / 100;
            
            
            System.out.println("You spent: ");
            System.out.println("You are saving: 20.0% ");
            System.out.println("You are saving: " + number1);
            System.out.println("Tour tatal is : " + number2);
            
        }
        else if(price >= 80.01 & price <= 120)
        {
            number1 = price * 0.3;
            number2 = price - number1;
            number2 = number2 * 100;
            number2 = Math.round (number2);
            number2 = number2 / 100;
            
            System.out.println("You spent: ");
            System.out.println("You are saving: 30.0% ");
            System.out.println("You are saving: " + number1);
            System.out.println("Tour tatal is : " + number2);
            
        }
        else if(price >= 120)
        {
            number1 = price * 0.4;
            number2 = price - number1;
            number2 = number2 * 100;
            number2 = Math.round (number2);
            number2 = number2 / 100;
            
            System.out.println("You spent: ");
            System.out.println("You are saving: 40.0% ");
            System.out.println("You are saving: " + number1);
            System.out.println("Tour tatal is : " + number2);
            
    }
    
}
}