public class NumberProcessor {

    public static int process(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {   
            if (i % 2 == 0) {           
                sum += i;               
            } else {
                sum -= i;             
            }
        }

        return sum;
    }
}