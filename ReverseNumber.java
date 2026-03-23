public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        String input = args[0];
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed number: " + reversed);
    }
}
