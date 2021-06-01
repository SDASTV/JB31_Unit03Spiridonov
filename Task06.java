package by.epam.unit03.main;

public class Task06 {

	public static void main(String[] args) {
		int x, y, a, b;
		x = 1000 + (int)(Math.random() * (9999 - 1000 + 1));
		y = 1000 + (int)(Math.random() * (9999 - 1000 + 1));
		System.out.println("x = " + x + ", y = " + y);
		System.out.print("Совпадающие цифры: ");
        for (int i = x; i > 0; i = i / 10) {
            a = i % 10;
            for (int j = y; j > 0; j = j / 10) {
                b = j % 10;
                if (a == b) {
                    System.out.print(a + " ");
                }
            }
        }
	}
}
