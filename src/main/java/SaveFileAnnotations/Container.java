package SaveFileAnnotations;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by PRO on 15.02.2017.
 */

@SaveTo(path="D:\\file.txt")
public class Container {
    String s = "Hello world, i'm went to annotations";
@Saver
    public void save (String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        try{fileWriter.write(s);}
        finally {fileWriter.close();}
    }
}
