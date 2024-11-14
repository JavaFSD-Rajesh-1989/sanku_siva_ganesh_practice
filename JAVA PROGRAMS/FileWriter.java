import java.io.*;
public class FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\DT043\\Documents\\files\\file.txt");
			fos.write(65);
			String s="pple";
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
		}
		catch(Exception e)
		{
		    e.printStackTrace();;
		}

	}

}
