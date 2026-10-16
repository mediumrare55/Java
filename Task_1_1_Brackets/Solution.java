import java.util.Stack;
class main {


    public boolean Validnost(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;

                }
                char highest = stack.pop();
                if (c == '}' && highest != '{' || c == ')' && highest != '(' || c == ']' && highest != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args){

    }

}
