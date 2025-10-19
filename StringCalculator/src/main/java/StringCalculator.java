import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(String numbers) {
        int result = 0;

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiterRegex = ",|\n";
        String numbersPart = numbers;

        if (numbers.startsWith("//")) {
            int delimiterEndIndex = numbers.indexOf("\n");
            if (delimiterEndIndex == -1) {
                throw new IllegalArgumentException("Invalid input: missing newline after delimiter declaration");
            }

            String delimiterPart = numbers.substring(2, delimiterEndIndex);

            if (delimiterPart.startsWith("[") && delimiterPart.endsWith("]")) {
                delimiterPart = java.util.regex.Pattern.quote(delimiterPart.substring(1, delimiterPart.length() - 1));
            } else {
                delimiterPart = java.util.regex.Pattern.quote(delimiterPart);
            }

            delimiterRegex = delimiterPart;
            numbersPart = numbers.substring(delimiterEndIndex + 1); // rest of numbers after \n
        }
        String[] numbersArray = numbersPart.split(delimiterRegex);
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String i : numbersArray) {
            if (i.trim().isEmpty()) continue;
            int num;
            try {
                num = Integer.parseInt(i.trim());
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number: " + i);
            }

            if (num < 0) {
                negativeNumbers.add(num);
            }

            result += num;
        }
        if (!negativeNumbers.isEmpty()) {
            String message = "negative numbers not allowed: " +
                    negativeNumbers.toString().replaceAll("[\\[\\]]", ""); // remove brackets
            throw new IllegalArgumentException(message);
        }
        return result;
        }
}
