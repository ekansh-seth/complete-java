public class MethodExample {/// this is a ststic method 

    //*esme hm ststic to bahar se call kr skte hai easity jesa ki c = logic (a,b)me kiye hai  */

    // method (function)
     int logic(int x, int y) {
        int z; // local variable
        if (x > y) {
            z = x + y; // मान लो कुछ calculation कर रहे हैं
        } else {
            z = (x + y) + 1;
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        MethodExmple object = new object(system.in);


        int c = MethodExamplelogic(a, b); // method call
        System.out.println("Result: " + c);
    }
}
// bina ststic ke bhi kr skte hai eska a 
//because object bna kr 