import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>(intList);
        // filter positive:
        for (int element : intList) {
            if (element <= 0) {
                resultList.remove(Integer.valueOf(element));
            }
        }
        // filter %2 elements (we could do that with first cycle but the task description demands doing it separately:
        intList = new ArrayList<>(resultList);
        for (int element : intList) {
            if (element % 2 != 0) {
                resultList.remove(Integer.valueOf(element));
            }
        }
        // sort left elements:
        resultList.sort(Comparator.naturalOrder());
        // print elements in line:
        for (int element : resultList) {
            System.out.print(element + " ");
        }
    }
}
