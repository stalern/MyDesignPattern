package decorator;

import com.stalern.designpattern.decorator.io.LowerCaseInputStream;

import java.io.*;

/**
 * @author stalern
 * @date 2019/11/13~20:04
 */
public class InputTest {
    public static void main(String[] args) {
        int c ;
        try(InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/stalern/designpattern/decorator/io/test.txt")))){
            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
