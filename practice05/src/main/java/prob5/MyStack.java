package prob5;

import java.util.Arrays;

public class MyStack {

	String[] array;
	int index = -1;

	public MyStack(int a) {
		array = new String[a];

	}

	public void push(String input) {

		index++;
		if (index > array.length - 1) {
			array = Arrays.copyOf(array, array.length + 1);
		}
		array[index] = input;

	}

	public String pop() throws MyStackException {
		String str;
		if (array.length == 0) {
			throw new MyStackException();
		}

		

		while (true) {
			str = array[array.length - 1];
			if (str == null) {
				array = Arrays.copyOf(array, array.length - 1);
			} else {

				array = Arrays.copyOf(array, array.length - 1);

				break;
			}
		}

		return str;
	}

	public boolean isEmpty() {

		if (array.length == 0) {
			return true;
		} else {
			return false;
		}

	}
}