package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Console {

	private static Console instance = new Console();
	private BufferedReader reader;
	private BufferedWriter writer;

	private Console() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new BufferedWriter(new OutputStreamWriter(System.out));
	}

	public static Console getInstance() {
		return instance;
	}

	public void write(int value) {
		write(String.valueOf(value));
	}

	public void writeln(String message) {
		write(message + System.lineSeparator());
	}

	public void writeln() {
		write(System.lineSeparator());
	}

	public void write(String message) {
		try {
			writer.write(message);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readString() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int readInt() {
		try {
			String input = readString();
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
