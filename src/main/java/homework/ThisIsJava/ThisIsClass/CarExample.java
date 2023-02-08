package homework.ThisIsJava.ThisIsClass;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("a" + myCar.company);
        System.out.println("b" + myCar.model);
        System.out.println("c" + myCar.color);
        System.out.println("d" + myCar.maxSpeed);
        System.out.println("e" + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
