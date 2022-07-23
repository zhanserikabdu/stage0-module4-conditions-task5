package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year){
            case (2000):
            case (2004):
            System.out.println("leap");
            break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
