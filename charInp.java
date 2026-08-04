import java.util.Scanner;
class charInp{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char : ");

        char ch = sc.next().charAt(2);

        System.out.println(ch);
    }
}