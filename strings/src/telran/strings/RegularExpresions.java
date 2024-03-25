package telran.strings;

public class RegularExpresions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|__|[\\\\w$]+";
		return regex;
}
public static String zero_300() {
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
	return regex;
}
public static String ipOctet() {
	String regex = "([0-9]\\d?|[0-1]\\d{2}|2[0-4]\\d|25[0-5])";
	return regex;
}
public static String mobileIsraelPhone() {
	String regex = "\\+972-5[0-9]\\d{7}|05[0-9]\\d{7}";
	return regex;
}
public static String ipV4Address() {
	String ipOctetExpr = ipOctet();
	return String.format("%1$s(\\.%1$s){3}", ipOctetExpr, ipOctetExpr);
}
public static String simpleArithmeticExpression() {
//	TODO
//	operations only binary +,-,*,/
//	operands only integer numbers
//	no brackets
	String operand = integerNumberExp();
	String operation = operationExp();
	return String.format("%1$s(%2$s%1$s)*", operand, operation);
}
private static String operationExp(){
	return "[-+*/]";
}
private static String integerNumberExp(){
	return "(\\s*\\d+\\s*)";
}
public static String arithmeticExpression () {
	//operand - any number or Java variable name
	//operation - the same as for simpleArithmeticExpression
	//brackets '(' ')' are allowed
	String operand = arithmeticOperandExpression();
	return arithmeticExpressionMethodCopy(operand);
}
public static String arithmeticExpressionMethodCopy(String operand) {
	String operation = operationExp();
	return String.format("%1$s(%2$s%1$s)*", operand, operation);
}
private static String arithmeticOperandExpression() {
	String variable = javaVariable();
	String number = number();
	return String.format("[\\s(]*(%s|%s)[\\s)]*", variable, number);
}
private static String number() {
	
    return "(\\d+\\.?\\d*|\\d*\\.\\d+)";
}

}