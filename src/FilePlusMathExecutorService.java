import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FilePlusMathExecutorService {
	public static void main(String[] args) {
		ExecutorService executorservice = Executors.newSingleThreadExecutor();
		executorservice.execute(() -> {
			Path src = Paths.get("C://Users//GPXPWRUSR//eclipse-workspace//temp3//src//prac1.java");
			Path target = Paths.get("D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\target\\target.txt");
            try {
            	
            	Files.copy(src, target, StandardCopyOption.REPLACE_EXISTING);
			}
			catch (IOException e){
				throw new RuntimeException(e);
			}

		});
		executorservice.execute(() -> {
			String filepath = "C://Users//GPXPWRUSR//eclipse-workspace//temp3//src//prac1.java";
			try(Stream<String> lines = Files.lines(Path.of(filepath))){
				lines.forEach(System.out::println);
			}catch (IOException e){
				throw new RuntimeException(e);
			}
		});
		int n=30;
		MathSeries mathseries = new MathSeries(new Random());
		System.out.println(mathseries.fibo(n));
		executorservice.shutdown();
		
	}

}
