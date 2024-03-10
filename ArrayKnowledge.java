import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String for array : ");
        String a = in.nextLine();

        char[] resultArray = stringToArray(a);
        System.out.print("Array : [");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print("'" + resultArray[i] + "'");
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

    public static char[] stringToArray(String input) {
        char[] resultArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            resultArray[i] = input.charAt(i);
        }
        return resultArray;
    }
}
