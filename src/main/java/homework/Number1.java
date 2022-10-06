package homework;

public class Number1 {
    public static void main(String[] args) {
        Face happyFace = new Face();
        BadFace badFace = new BadFace();

        happyFace.basic();
        badFace.bad();
        badFace.basic();

    }

    static class Face {
        void basic() {
            System.out.println("😀");
        }
    }

    static class BadFace extends Face {

        void basic() {
            System.out.println("🤬");
        }

        void bad() {
            System.out.println("🥵");
        }
    }
}