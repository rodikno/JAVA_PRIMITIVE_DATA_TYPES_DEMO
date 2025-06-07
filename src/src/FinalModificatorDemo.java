public class FinalModificatorDemo {
    public static void main(String[] args) {

        final double GRAVITY = 9.8; // Acceleration due to gravity
        final int SPEED_OF_LIGHT = 299792458; // Speed of light in m/s
        final double PI = 3.14159; // Value of Pi

        System.out.println("Gravity: " + GRAVITY);
        System.out.println("Speed of light: " + SPEED_OF_LIGHT + " m/s");
        System.out.println("Pi: " + PI);

//        GRAVITY = 10; -> can't be done while GRAVITY is finalized


    }
}
