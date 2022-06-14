import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
import java.util.Random;


public class ReadFromFile {
	public static void main(String[] args) {
		
		String filepath = "C://Users//GPXPWRUSR//eclipse-workspace//temp3//src//prac1.java";
		Path src = Paths.get("C://Users//GPXPWRUSR//eclipse-workspace//temp3//src//prac1.java");
		Path target = Paths.get("D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\target\\target.txt");
//		Stream<String> Lines5 =Files.Lines5(Path.of(filepath));
		try(Stream<String> lines = Files.lines(Path.of(filepath))){
			lines.forEach(System.out::println);
		}catch (IOException e){
			throw new RuntimeException(e);
		}
		//for small files
		//read from file in one go
		try {
			List<String> lines = Files.readAllLines(Path.of(filepath));
			System.out.println(lines);
		}
		catch (IOException e){
			throw new RuntimeException(e);
			
		}
		//take src file and copy to destination file
		
		
		try{
			Files.copy(src, target, StandardCopyOption.REPLACE_EXISTING);
			
//			
		}catch (IOException e){
			throw new RuntimeException(e);
		}
		
	}

}
