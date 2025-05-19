public class Example3 {
    public static void main(String[] args) {
        String expression = "11 33   55"; // Example input
        int sum = calculateSum(expression.replaceAll("\\s+"," "));
        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(String exp) {
        int sum = 0;
        int startPos = 0;
        int endPos = 0;

        while (endPos < exp.length()) {
            endPos = findEnd(exp, startPos);
            int number = Integer.parseInt(exp.substring(startPos, endPos));
            sum += number;
            startPos = endPos + 1;
        }

        return sum;
    }

    public static int findEnd(String exp, int searchPos) {
        while (searchPos < exp.length() && Character.isDigit(exp.charAt(searchPos))) {
            searchPos++;
        }
        return searchPos;
    }
}
