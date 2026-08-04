import java.util.Scanner;
class vowel{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char : ");

        char ch = sc.next().charAt(0);

        if ((ch=='a') ||  (ch=='e') ||  (ch=='i') || (ch=='o') || (ch=='u')){
            System.out.print(ch+" is a vowel");
        }
        else{
        System.out.print(ch+" is a consonant");
        }

    }
}