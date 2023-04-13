package homework.thisIsJava.ExemplumOperator;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1 // 컴파일 에러 이유는 자바에서 리터럴 간의 문자가 더하고 뺄려면 타입이 같아야하는데 말그대로 위코드는 char에다가 1을 더한다 라는 뜻이된다 기존에는 유니코드로 되서 가능하지만 그럴 경우 선언과 동시에 해야한다
        //char c3 = (char) (c2 + 1); // 강제 타입변환으로 해주면된다
    }
}
