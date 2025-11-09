import java.util.Scanner;

public class fibonacci {


    public static int fibRecursive(int n){
      if(n<=1) return n;
      return fibRecursive(n-1)+fibRecursive(n-2);
    }

      public static void main(String[]args){

      
      Scanner sc = new Scanner(System.in);

      
System.out.println("enter the no of n ");
int n = sc.nextInt();

System.out.println( "fibnocacci (Recursive)");
for (int i = 0;i<n;i++){
    System.out.print(fibRecursive(i)+ "");
}
}




      

    }

    
    

