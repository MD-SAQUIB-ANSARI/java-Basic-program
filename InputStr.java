package IOSTREAM;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputStr {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String data=sc.nextLine();
        byte[]arr=data.getBytes();
        try{
            OutputStream os=new FileOutputStream("FileIOstraem.txt",true);
            os.write(arr);
            os.close();
            System.out.println("file is save");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }catch (InputMismatchException e)
        {
            System.out.println(e);
        }
    }
}
