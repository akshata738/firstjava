import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PlayFiles {
	public static void main(String[] args) {
		String filePath = "C://Users//GPXPWRUSR//eclipse-workspace//temp3//src";
		//Check file exist or not
         System.out.println(Files.exists(Path.of(filePath)));
         String doesnotExistPath = "C://Users//GPXPWRUSR//eclipse-workspace//temp3//src";
         System.out.println(Files.exists(Path.of(doesnotExistPath)));
         String dirpath = "C://Users//GPXPWRUSR//eclipse-workspace//temp3//src";
         System.out.println(Files.isDirectory(Path.of(dirpath)));
//         Stream<Path> paths =null;
//         try {
//        	 paths = Files.list(Path.of(dirpath));
//        	 paths.forEach(path -> System.out.println(path.getFileName()));
//         } catch (IOException e){
//        	 throw new RuntimeException(e);
//        	 
//        	 
//         }
//         paths.close();
         //for automatically close
         try (Stream<Path> files = Files.list(Path.of(dirpath))){
        	 files.forEach(path -> System.out.println(path.getFileName()));
         } catch (IOException e){
        	 throw new RuntimeException(e);
         }
//        //listing all files recursively
         try (Stream<Path> recursive = Files.walk(Path.of(dirpath))){
        	 recursive
        	 .filter(path -> Files.isRegularFile(path))
        	 .forEach(path -> System.out.println(path.getFileName()));
         } catch (IOException e){
        	 throw new RuntimeException(e);
         }
         
         
         
	
		
	}
	

}
