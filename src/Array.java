public class Array {
    public static void main(String[] args) {
        // String
        String string = "Rikkei Academy";
        // Khoi tao doi tuong
        String str = new String(" Hello");

        System.out.println(changeString(string));
        System.out.println(string);

        //length
        System.out.println(str.length());
        // charAt
        System.out.println(str.charAt(1));
        // substring
        System.out.println(str.substring(1, 3));
        // concat
        System.out.println(str.concat(" World!!!"));
        // replace
        System.out.println(str.replace("l", "e"));
        // toUpperCase
        System.out.println(str.trim());

        //comparTo: space co gia tri 32
        System.out.println(string.compareTo(str));
        // contains
        System.out.println(string.contains("I"));

        // lop StringBuiler
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 1; i <= 5; i++) {
            if (i == 1) System.out.println("hi");
            System.out.println("Hello");
        }

    }

    public static String changeString(String oldStr) {
        oldStr = "new" + oldStr;
        return oldStr;
    }
}
