package d;

public class Sam extends Human{
    @Override
    public int add(int a, int b) {

        int result = a+b;


        int sum = 0;
        for (int i =1; i<=result; i++) {
            sum += i;
        }

        return sum;
    }
}
