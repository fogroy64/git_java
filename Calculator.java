/*
		Класс реализует калькулятор.
*/
public class Calculator {
	private int result; //Результат вычисления
	public void add(int ... params) { //Суммируем аргументы. Аргументы суммирования
		for (Integer param : params) {
			this.result += param;
		}
	}
	public int getResult () { // Получить результат
		return this.result;
	}
	public void cleanResult() { // Очистить результат вычисления
		this.result = 0;
	}
}