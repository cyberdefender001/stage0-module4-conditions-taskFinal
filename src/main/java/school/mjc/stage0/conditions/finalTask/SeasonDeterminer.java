package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch(monhNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
            default:
                System.out.println("Wrong month number");
        }
    }
}
