class OddEven{

    OddEven(int x){
        if (x%2==0){
            System.out.println("Even");
        }

        else {
            System.out.println( "Odd");
        }
    }

class Main{
    public static void main(String args[]){

        OddEven obj = new OddEven(8);

    }
}
}