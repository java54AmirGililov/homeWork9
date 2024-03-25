package telran.strings;

public class Validations {
public static boolean isArithmeticExpression(String expression) {
	String regex = RegularExpresions.arithmeticExpression();
	int count = 0;
    if (!expression.matches(regex)) {
        return false;
    }
    for (char ch : expression.toCharArray()) {
        if (ch == '(') {
            count++;
        } else if (ch == ')') {
        	count--;
            if (count < 0) {
                return false;
            }
        }
    }
    if (count > 0) {
        return false;
    }
    return count == 0;
}
}
