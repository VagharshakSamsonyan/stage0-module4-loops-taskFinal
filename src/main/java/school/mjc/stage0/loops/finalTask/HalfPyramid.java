package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }
}
