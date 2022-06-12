package school.mjc.stage0.conditions.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchDaysInMonthPrinterTest extends BaseIOTest {

    @Test
    void amountOfDaysPrintDaysInJune() {
        SwitchDaysInMonthPrinter daysPrinter = new SwitchDaysInMonthPrinter();

        daysPrinter.amountOfDays(6);

        assertOutEquals("30\n");
    }

    @Test
    void amountOfDaysPrintDaysInFeb() {
        SwitchDaysInMonthPrinter daysPrinter = new SwitchDaysInMonthPrinter();

        daysPrinter.amountOfDays(2);

        assertOutEquals("28\n");
    }

    @Test
    void amountOfDaysPrintWrong() {
        SwitchDaysInMonthPrinter daysPrinter = new SwitchDaysInMonthPrinter();

        daysPrinter.amountOfDays(-2);

        assertOutEquals("wrong number!\n");
    }

    @Test
    void notContainsIfOrObjects() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task5/SwitchDaysInMonthPrinter.java");
        List<String> strings = Files.readAllLines(path);
        List<String> ifLines = strings.stream()
                .filter(line -> line.contains("if"))
                .collect(Collectors.toList());

        List<String> switchAmount = strings.stream()
                .filter(line -> line.contains("switch"))
                .collect(Collectors.toList());

        assertEquals(0, ifLines.size());
        assertEquals(1, switchAmount.size());
    }

}