public class AssessmentsCalculator {
    public static String calcClassEngagement(int daysPresent) {

        if (daysPresent >= 23) {
            return "A";
        } else if (daysPresent >= 21) {
            return "B";
        } else if (daysPresent >= 19) {
            return "C";
        } else if (daysPresent >= 16) {
            return "D";
        } else {
            return "F";
        }

    }

    public static String calcAssignments(int assignmentCompleted) {

        if (assignmentCompleted == 7) {
            return "A";
        } else if (assignmentCompleted == 6) {
            return "B";
        } else if (assignmentCompleted == 5) {
            return "C";
        } else if (assignmentCompleted == 4) {
            return "D";
        } else {
            return "F";
        }

    }

    public static String calcSelfAssessment(boolean completed){

        if (completed){
            return "A";
        } else {
            return "D";
        }

    }
}
