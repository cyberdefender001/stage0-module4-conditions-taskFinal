package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
