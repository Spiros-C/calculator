package calulator;      // Works for integers

import java.util.Scanner;


public class Calulator {
    
    public static void Print(String PR) {System.out.print(""+PR);}              //Used extensively in debugging (shift alt f)!
    public static void PrintN(String PR) {System.out.println(""+PR);}

    public static char consoleChar() {
        Scanner scan = new Scanner(System.in);
        Print("[(+)(-) (*)(/)] ");
        return scan.next().charAt(0); 
        }
    

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner num1Check = new Scanner(System.in);

        Print("BASIC CALCULATOR with memory" + System.lineSeparator() + 
              "< press 'c'  to  restart   >" + System.lineSeparator() +         //Situationally true not strictly implemented i.e restart occurs if scanner_input != integer
              "< press 'c' again to close >" + System.lineSeparator() +         //Situationally true not strictly implemented
                                               System.lineSeparator() +             
              "[ N U M B E R ] ");

        while (num1Check.hasNextInt()) {                                        //Scan input && Check if scanner input is integer ifnot exit(while) "immitating < press 'c' to close >"

            num1 = num1Check.nextInt();                                         //if integer true then num1 = already scanned input

            boolean alive = true;                                               //Needed to return inner while(condition)->true 

            while (alive) {
                Scanner num2Check = new Scanner(System.in);                     //Important declare.scanner needed inside while loop

                switch (consoleChar()) {                                        //switch condition is method

                    case '+':
                        Print("[ N U M B E R ] ");

                        if (num2Check.hasNextInt() == true) {                   //If (Scan input && Check if scanner input is integer)<--
                                                                                //                                                      ^
                            num2 = num2Check.nextInt();                         //Num2 is declared ->>---------------->>--------------->>
                            num1 = num1 + num2;
                            PrintN("[ CALCULATING ] " + num1);
                            break;
                        } else {
                            Print("[ N U M B E R ] ");                          //Header for outer while(scanNumber)
                            alive = false;                                      //Exit inner while if scanner input not integer "immitating <  press  'c' to  restart  >"
                            break;
                        }
                    case '-':
                        Print("[ N U M B E R ] ");

                        if (num2Check.hasNextInt() == true) {

                            num2 = num2Check.nextInt();
                            num1 = num1 - num2;
                            PrintN("[ CALCULATING ] " + num1);
                            break;
                        } else {
                            Print("[ N U M B E R ] ");
                            alive = false;
                            break;
                        }
                    case '*':
                        Print("[ N U M B E R ] ");

                        if (num2Check.hasNextInt() == true) {

                            num2 = num2Check.nextInt();
                            num1 = num1 * num2;
                            PrintN("[ CALCULATING ] " + num1);
                            break;
                        } else {
                            Print("[ N U M B E R ] ");
                            alive = false;
                            break;
                        }

                    case '/':
                        Print("[ N U M B E R ] ");

                        if (num2Check.hasNextInt() == true) {

                            num2 = num2Check.nextInt();
                            num1 = num1 / num2;
                            PrintN("[ CALCULATING ] " + num1);
                            break;
                        } else {
                            Print("[ N U M B E R ] ");
                            alive = false;
                            break;
                        }

                    case 'c':
                        Print("[ N U M B E R ] ");                              //Exit while() with unique scanner input 'c'
                        alive = false;
                        break;

                    default:
                        PrintN("Illogical operator.. Try Again");
                }
            }
        }
    }
}
