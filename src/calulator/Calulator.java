package calulator;

import java.util.Scanner;


public class Calulator {
    
    public static void Print(String PR) {System.out.print(""+PR);}
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

Print("CALCULATOR press 'c' to restart"+System.lineSeparator()+"[ N U M B E R ] ");

    while (num1Check.hasNextInt()) {
    
            num1=num1Check.nextInt();

                boolean alive = true;
              
                while (alive) {
                    Scanner num2Check = new Scanner(System.in);
                    
                    switch(consoleChar()){
                        
                        case '+' : Print("[ N U M B E R ] ");
                    
                                if(num2Check.hasNextInt()==true){
                            
                                    num2=num2Check.nextInt();
                                    num1 = num1+num2;
                                    PrintN("[ CALCULATING ] "+num1);
                                    break;
                                }
                                else {
                                    Print("[ N U M B E R ] ");
                                    alive =false;
                                    break;
                                }
                        case '-' : Print("[ N U M B E R ] ");
                    
                                if(num2Check.hasNextInt()==true){
                            
                                    num2=num2Check.nextInt();
                                    num1 = num1-num2;
                                    PrintN("[ CALCULATING ] "+num1);
                                    break;
                                }
                                else {
                                    Print("[ N U M B E R ] ");
                                    alive =false;
                                    break;
                                }
                        case '*' : Print("[ N U M B E R ] ");
                    
                                if(num2Check.hasNextInt()==true){
                            
                                    num2=num2Check.nextInt();
                                    num1 = num1*num2;
                                    PrintN("[ CALCULATING ] "+num1);
                                    break;
                                }
                                else {
                                    Print("[ N U M B E R ] ");
                                    alive =false;
                                    break;
                                }
                                
                        case '/' : Print("[ N U M B E R ] ");
                    
                                if(num2Check.hasNextInt()==true){
                            
                                    num2=num2Check.nextInt();
                                    num1 = num1/num2;
                                    PrintN("[ CALCULATING ] "+num1);
                                    break;
                                }
                                else {
                                    Print("[ N U M B E R ] ");
                                    alive =false;
                                    break;
                                }
                                
                    case 'c' : Print("[ N U M B E R ] ");
                               alive =false;
                               break; 
                    default:
                    PrintN("Illogical operator.. Try Again");
                    }      
                }
    //num1Check.next(); 
    
    }  
        
        
    }   
}
