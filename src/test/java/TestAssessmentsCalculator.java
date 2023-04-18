import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssessmentsCalculator {
    @Test
    public void testCalcClassEngagement(){
        int daysPresent = 22;
        String expectedGrade = "B";
        Assertions.assertEquals(expectedGrade, AssessmentsCalculator.calcClassEngagement(daysPresent));
    }

    @Test
    public void testCalcAssignments(){
        int assignmentsCompleted = 2;
        String expectedGrade = "F";
        Assertions.assertEquals(expectedGrade, AssessmentsCalculator.calcAssignments(assignmentsCompleted));
    }

    @Test
    public void testCalcSelfAssessmentA(){
        boolean completed = true;
        String expectedGrade = "A";
        Assertions.assertEquals(expectedGrade, AssessmentsCalculator.calcSelfAssessment(completed));
    }

    @Test
    public void testCalcSelfAssessmentD(){
        boolean completed = false;
        String expectedGrade = "D";
        Assertions.assertEquals(expectedGrade, AssessmentsCalculator.calcSelfAssessment(completed));
    }
}
