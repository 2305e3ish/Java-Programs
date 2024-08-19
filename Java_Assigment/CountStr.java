public class CountStr {
    public static void main(String[] args) {
        String str = "There are 14 char";
        int count = countCharacters(str);
        System.out.println("Total number of characters (excluding spaces): " + count);
    }

    public static int countCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}