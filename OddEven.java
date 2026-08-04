import java.util.Scanner;
class OddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        int n = sc.nextInt();

        int Even_sum =0;
        int Odd_sum = 0;

        for(int i=0;i<n;i++){
            if(i%2 == 0){
                Even_sum +=i; 
            }
            else{
                Odd_sum+=i;
            }
     
        }
        System.out.println("Even no. sum ="+Even_sum);
        System.out.print("Odd no. sum  ="+Odd_sum);
    }
}