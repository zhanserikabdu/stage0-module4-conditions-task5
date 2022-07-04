package school.mjc.stage0.conditions.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class LeapYearPrinterTest extends BaseIOTest {

    @Test
    void isLeapYearPrintsLeapWhen2004() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2004);

        assertOutEquals("leap\n");
    }

    @Test
    void isLeapYearPrintsNotLeapWhen2000() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(2000);

        assertOutEquals("leap\n");
    }
    
    
    @Test
    void isLeapYearPrintsNotLeapWhen1900() {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(1900);

        assertOutEquals("not leap\n");
    }
}
