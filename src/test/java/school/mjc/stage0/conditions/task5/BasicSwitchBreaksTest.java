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

class BasicSwitchBreaksTest extends BaseIOTest {

    @Test
    void mainPrintsDefault() {
        BasicSwitchBreaks.main(null);

        assertOutEquals("twenty\n");
    }

    @Test
    void notContainsIfOrObjects() throws IOException {

        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task5/BasicSwitchBreaks.java");
        List<String> strings = Files.readAllLines(path);
        List<String> ifLines = strings.stream()
                .filter(line -> line.contains("if"))
                .collect(Collectors.toList());

        List<String> soutAmount = strings.stream()
                .filter(line -> line.contains("System.out.println"))
                .collect(Collectors.toList());

        assertEquals(0, ifLines.size());
        assertEquals(4, soutAmount.size());
    }
}