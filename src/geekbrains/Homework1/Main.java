package geekbrains.Homework1;

public class Main {
	/* Задание 1 (Создать переменные всех пройденных типов данных, и инициализировать их значения;)*/
	public static void main(String[] args) {
		byte num1 = -1;
		short num2 = 10;
		int num3 = 100;
		long num4 = 1000;
		float num5 = 2.0f;
		double num6 = Math.random() * 100;
		char num7 = 'G';
		boolean isCrazy;
		isCrazy = true;
			/* Задание 2 (Написать метод вычисляющий выражение a * (b + (c / d))
			 и возвращающий результат,где a, b, c, d – входные параметры этого метода)
			 */
		int a = 7;
		int b = 8;
		int c = 4;
		int d = 2;
		int expressionResult = getExpression(a, b, c, d);
		getExpression(a, b, c, d);
		System.out.println("Результат вычислений " + expressionResult);

		isSumBetween10to20(a, b);
		printPositiveorNegative(a);
		isNegative(num1);
		printName("Азат");
		int year = 2020;
		printLeapYear(year);


	}

	public static int getExpression(int a, int b, int c, int d) {
		return a * (b + (c / d));

	}

	/* Задание 3 (  Написать метод, принимающий на вход два числа, и проверяющий что их сумма
	 лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false)*/
	public static void isSumBetween10to20(int a, int b) {
		int sum = a + b;
		if (sum > 10 && sum < 20) {
			System.out.println("Правда");
		} else {
			System.out.println("Ложь");
		}
	}

	/* Задание 4 (Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
	 положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.) */
	public static void printPositiveorNegative(int a) {
		if (a >= 0) {
			System.out.println("Это положительное число");
		} else {
			System.out.println("Это отрицательное число");
		}
	}

	/* Задание 5 (Написать метод, которому в качестве параметра передается целое число,
	 метод должен вернуть true, если число отрицательное;)*/
	public static boolean isNegative(byte num1) {
		return num1 < 0;
	}

	/* Задание 6 (Написать метод, которому в качестве параметра передается строка, обозначающая имя,
	 метод должен вывести в консоль сообщение «Привет, указанное_имя!)*/
	public static void printName(String name) {
		System.out.println("Привет " + name + "!");
	}
	/* Задание 7 (Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
	 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.)*/
	public static void printLeapYear(int year){
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
		System.out.println("Год является високосным");
	}else{
		System.out.println("Год явялется невисокосным");
	}
		System.out.println("Спасибо!");
	}
}

