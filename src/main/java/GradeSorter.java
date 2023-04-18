import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSorter {
    public static ArrayList<String> droppedGradesMinusLowest (ArrayList<String> grades){
        sortGradesNatural(grades);
        return new ArrayList<>( List.of(grades.get(0), grades.get(1)));
    }

    public static ArrayList<String> sortGradesNatural (ArrayList<String> grades){
        Collections.sort(grades);
        return grades;
    }
}
