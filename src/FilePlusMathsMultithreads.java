import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FilePlusMathsMultithreads {
	public static void main(String[] args) {
		// c reating thread
		Thread thread = new Thread(() -> {
			//Io Logic
			Path src = Paths.get("C://Users//GPXPWRUSR//eclipse-workspace//temp3//src//prac1.java");
			Path target = Paths.get("D:\\One Drive\\OneDrive - Global Payex Private Limited\\Desktop\\target\\target.txt");

			try{
			Files.copy(src, target, StandardCopyOption.REPLACE_EXISTING);
			}
			catch (IOException e){
				throw new RuntimeException(e);
			}
			
		});
		thread.start();//schedule thread for execution

		int n=30;
		MathSeries mathseries = new MathSeries(new Random());
		System.out.println(mathseries.fibo(n));
	}

}
