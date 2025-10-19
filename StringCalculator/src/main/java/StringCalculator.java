public class StringCalculator {
    public static int add(String numbers) {
        int result = 0;
        String[] numbersArray = numbers.split(",");
        for (String i : numbersArray) {
            int num = 0;
            try {
                num = Integer.parseInt(i);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number: " + i);
            }
            result+=num;
        }
        return result;
    }
}
