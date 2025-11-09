public class practic4 {
    public static void main(String[] args) {

        int n =5 ;
        int result=1;
        
        if (n == 1 || n == 0) {
            System.out.println("1");

        }
        else{
        for (int i = 1; i <= n; i++) {
           result= result * i;

        }
        System.out.println(result);
    }
    
    }
}
