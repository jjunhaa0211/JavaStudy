package homework.ThisIsJava.ExemplumOperator;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z = x/y;
        double k = x%y;
        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));
        System.out.println(z+2);
        System.out.println(Double.isInfinite(k));
        System.out.println(Double.isNaN(k));
        System.out.println(k+2);
    }
}
