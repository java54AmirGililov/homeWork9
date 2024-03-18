package telran.strings;

public class RegularExpresions {
	public static String javaVariable() {
		String regex = "[A-Za-z$][\\w$]*|_[\\\\w$]+";
		return regex;
}
public static String zero_300() {
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
	return regex;
}
public static String ipOctet() {
	String regex = "[1-9]\\d?|[0-1]\\d{2}|2[0-4]\\d|25[0-5]|0|00|000";
	return regex;
}
public static String mobileIsraelPhone() {
	//TODO
	//string contains possible Israel mobile phone number
	//+972-<prefix two digits begining from 5>-<7 digits of number>
	//<prefix three digits: first - 0, second 5, third - any>-<7 digits>
	return null;
}
}
