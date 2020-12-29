package Assignment;

public class Solutions28 {
    public static void main(String[] args) {

        Solutions28 ob = new Solutions28();
        ob.isPrimeNumber(10);
        ob.allPrimebetween(1,100);

    }

    public void isPrimeNumber(int num){
        int temp;

        for(int i = 2; i<=num; i++){
            temp = num%i;
            if(temp==0){
                System.out.println("It is not a prime number");
                break;
            }
            else{
                System.out.println("It is a prime number");
                break;
            }
        }

    }

    public void allPrimebetween(int start , int  end){
        int num;
        for(int i = start; i<=end;i++){
            int counter = 0;

            for(num = i; num>=1; num-- ){
                if(i%num ==0){
                    counter = counter+1;
                }
                if(counter==2){
                    System.out.println("" +i);
                }
            }
        }
    }
}
