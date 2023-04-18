import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGradeSorter {
    @Test
    public void testDroppedGradesMinusLowest(){
        ArrayList<String> droppedGrades = new ArrayList<>(List.of("A", "C", "B"));
        ArrayList<String> includedGrades = new ArrayList<>(List.of("A", "B"));
        Assertions.assertEquals(includedGrades, GradeSorter.droppedGradesMinusLowest(droppedGrades));
    }

    @Test
    public void testSortGradesNatural(){
        ArrayList<String> grades = new ArrayList<>(List.of("F", "C", "A", "D", "B"));
        ArrayList<String> sortedGrades = new ArrayList<>(List.of("A", "B", "C", "D", "F"));
        Assertions.assertEquals(sortedGrades, GradeSorter.sortGradesNatural(grades));
    }
}
