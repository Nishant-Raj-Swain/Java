import java.util.Scanner;
class Ascii{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a char : ");
        char ch = sc.next().charAt(0);

        //int a = ch;     that also true

        System.out.println("Ascii value = "+ (int)ch);
    }
}