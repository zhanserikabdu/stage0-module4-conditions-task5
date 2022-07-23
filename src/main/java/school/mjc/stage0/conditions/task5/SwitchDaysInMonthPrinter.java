package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int Feb = 28;
        int June = 30;
        switch (month){

            case (28):
                System.out.println("28");
                break;
            case (30):
                System.out.println("30");
                break;
            default:
                System.out.println("wrong number!");
                break;
        }
    }
}
