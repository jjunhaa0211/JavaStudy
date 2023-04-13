package homework.firstHomework;

public class Number1 {
    public static void main(String[] args) {
        Face happyFace = new Face();
        BadFace badFace = new BadFace();

        happyFace.basic();
        badFace.bad();
        badFace.basic();

    }

    interface HelloFace {
        void basic();
    }

    static class Face implements HelloFace {
        public void basic() {
            System.out.println("😀");
        }
    }

    static class BadFace extends Face {

        public void basic() {
            System.out.println("🤬");
        }

        void bad() {
            System.out.println("🥵");
        }
    }
}