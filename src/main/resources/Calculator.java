public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Default delimiter
        String delimiter = ",|\n";

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        // Split the string using the delimiter
        String[] numberArray = numbers.split(delimiter);

        // Calculate the sum
        int sum = 0;
        StringBuilder negativeNumbers = new StringBuilder();

        for (String number : numberArray) {
            int num = Integer.parseInt(number);

            if (num < 0) {
                if (negativeNumbers.length() > 0) {
                    negativeNumbers.append(", ");
                }
                negativeNumbers.append(num);
            }

            sum += num;
        }

        // Check for negative numbers and throw exception
        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }

        return sum;
    }
}
