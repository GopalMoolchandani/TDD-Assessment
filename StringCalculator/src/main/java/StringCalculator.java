public class StringCalculator {
    public static int add(String numbers) {
        int result = 0;

        String[] numbersArray = numbers.split(",|\n");

        for (String i : numbersArray) {
            int num = 0;
            try {
                if (i.trim().isEmpty()) continue;
                num = Integer.parseInt(i.trim());
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number: " + i);
            }
            result += num;
        }
        return result;
    }
}
