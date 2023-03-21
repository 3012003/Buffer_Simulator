package application;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ToolBox {
	FileHandler fileHandler = new FileHandler();
}

class Prime {
	// 1.prime number checker
	boolean isPrime(int number) {
		if (number == 2)
			return true;

		if (number <= 1)
			return false;

		for (int i = 2; i < number; i++)
			if (number % i == 0)
				return false;

		return true;
	}
}

class FileHandler {
	// 1.file picker
	String filePicker() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setInitialDirectory(new File("C:\\"));
		File file = fileChooser.showOpenDialog(new Stage());
		if (file == null) {
			return null;
		}
		return file.getAbsolutePath();
	}
	// 2.file writer

}
