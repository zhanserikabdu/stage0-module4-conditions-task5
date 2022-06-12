package school.mjc.stage0.conditions.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class RangeNumbersPrinterTest extends BaseIOTest {

    @Test
    void printRangePrint1StRange() {
        RangeNumbersPrinter rangePrinter = new RangeNumbersPrinter();

        rangePrinter.printRange(1);

        assertOutEquals("number is between 1 and 5\n");
    }

    @Test
    void printRangePrint2ndRange() {
        RangeNumbersPrinter rangePrinter = new RangeNumbersPrinter();

        rangePrinter.printRange(10);

        assertOutEquals("number is between 6 and 10\n");
    }
    @Test
    void printRangePrint3rdRange() {
        RangeNumbersPrinter rangePrinter = new RangeNumbersPrinter();

        rangePrinter.printRange(0);

        assertOutEquals("out of range\n");
    }


    @Test
    void notContainsIfOrObjects() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task5/RangeNumbersPrinter.java");
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