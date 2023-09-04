package day20.exam02;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExam {

	public static void main(String[] args) throws URISyntaxException, IOException {
//		URL url = FileStreamExam.class.getResource("data.txt");
//		System.out.println(url);
		
		Path path = Paths.get(FileStreamExam.class.getResource("data.txt").toURI());
		//System.out.println(path);
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
		

	}

}
