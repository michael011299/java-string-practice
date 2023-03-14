package strings;

public class strings {

	public static void main(String[] args) {
		String rainy = "yesterday it was raining";
		String sunny = "today it is sunny";
		String allUpper = sunny.toUpperCase() + ", " + rainy.toUpperCase();
		System.out.println("Task 1:");
		System.out.println(allUpper);

		String i = sunny.substring(0, 11);
		String j = rainy.substring(16, 24);
		String nowRaining = i.toUpperCase() + j.toUpperCase();
		System.out.println(nowRaining);

		System.out.println("Task 2:");
		System.out.println("Method 1:");
		System.out.println("sunny length: " + sunny.length());
		System.out.println("rainy length: " + rainy.length());
		System.out.println("Method 2:");
		String a = sunny.replace(" ", "\n");
		System.out.println(a);
		System.out.println("Method 3:");
		String b = rainy.replace(" ", "\n");
		System.out.println(b);
		System.out.println("Method 4:");
		String search1 = "hello";
		String search2 = "world";
		String search3 = "spaghetti";
		String matchAgainst = "\"hello world\"";
		System.out.println(search1 + " is in " + matchAgainst + " = " + matchAgainst.contains(search1));
		System.out.println(search2 + " is in " + matchAgainst + " = " + matchAgainst.contains(search2));
		System.out.println(search3 + " is in " + matchAgainst + " = " + matchAgainst.contains(search3));

	}
}
