// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st no. : ");
        int a = sc.nextInt();
        
        System.out.println("Enter 2nd no. : ");
        int b = sc.nextInt();
        
        while (true){
        System.out.println("""
                              Select 1 for Sum.
                              Select 2 for Sub.
                              Select 3 for Multi.
                              Select 4 for Div.
                              Select 5 for Mod.
                              Select 6 for Exit.
                              """);
                        
        int x = sc.nextInt();
        
        switch(x){
            case 1 : System.out.println(a+b);
                     break;
            case 2 : System.out.println(a-b);
                     break;
            case 3 : System.out.println(a*b);
                     break;
            case 4 : System.out.println(a/b);
                     break;
            case 5 : System.out.println(a%b);
                     break;
            case 6 : return;
                     
            default : System.out.println("Wrong Input");
        }
    }
}
}