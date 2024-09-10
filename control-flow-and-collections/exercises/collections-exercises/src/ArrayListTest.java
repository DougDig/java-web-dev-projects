import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        System.out.println("Enter string for the string god (Enter to finish)");
        Scanner input = new Scanner(System.in);
        String inputString;

        do {
            inputString = input.nextLine();
            if (!inputString.isEmpty()) {
                testList.add(inputString);
            }
        } while (!inputString.isEmpty());

        System.out.println("what length are we looking at champ?");
        int searchNum = input.nextInt();

        for (String word : testList) {
            if (word.length())
        }
}
}
