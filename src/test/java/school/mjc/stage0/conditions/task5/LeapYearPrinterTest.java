package school.mjc.stage0.conditions.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class LeapYearPrinterTest extends BaseIOTest {

    @Test
    void isLeapYearPrintsLeapWhenTrue() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2004);

        assertOutEquals("leap\n");
    }

    @Test
    void isLeapYearPrintsNotLeapWhenFalse() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2000);

        assertOutEquals("not leap\n");
    }
}