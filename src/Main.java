import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean isBracketSequenceValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingBracket(stack.pop(), c)) {
                    return false;
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingBracket(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '[' && closeBracket == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập");
        String input = sc.nextLine();
        boolean isValid = isBracketSequenceValid(input);
        System.out.println("Chuỗi " + (isValid ? "đúng" : "không đúng"));
    }
}
