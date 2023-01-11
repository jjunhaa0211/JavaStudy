package homework;

public class FirstTask {
    public static void main(String[] args) {
        //같은 값을 가진 String 객체를 각각 s, s2로 만들었다. 아래 코드를 실행했을때 출력 결과는 무엇일까?

        String s = new String("안녕하세요");
        String s2 = new String("안녕하세요");

        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        //false
        //true

        String a = "dsfsdf";

        printClass(a);
    }

    //2번 문제
    public static void printClass(String a) {
        //어떤 객체를 파라미터로 넣든, 해당 객체의 클래스 이름과 객체의 내용을 출력하는 메서드를 만들어야 합니다. 아래의 함수를 조건에 맞게 완전히 구현해주세요.
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass());
    }

    //3번째
//    public static void main(String[] args) {
//        function(12345);
//    }
//
//    public static void function(Object value) {
//        System.out.println(value.getClass().getName());
//
//    //java,lang,int
//
////     if value.getClass = class java.lang.int
////     if value.str.getClass().getName() = java.lang.int
////    if value.getClass().getSimpleName() = int
////    if value.getClass().getPackage().getName() = java.lang
//    }

    //4번째
//    public static void main(String[] args) {
//        function(510);
//    }
//
//    public static void function(Object value) {
//        System.out.println("That is " + value);
//    }
//
//    public static void function(Integer value) {
//        System.out.println("This is " + value);
//    }
//
//    public static void function(int value) {
//        System.out.println("It is " + value);
//    }

//    It is 510
}

