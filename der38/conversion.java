 class Conversion {
    public static void main(String[] args) {
        // Convert char to String
        char character = 'A';
        String charToString = String.valueOf(character);  // Convert char to String
        System.out.println("Char to String: " + charToString);

        // Convert String to char
        String str = "Hello";
        char stringToChar = str.charAt(0);  // Get the first character of the string
        System.out.println("String to Char: " + stringToChar);
    }
}