package com.io;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;

import org.junit.Test;

/**
* @author ����
* @version ����ʱ�䣺2019��1��21�� ����11:18:16
* ��˵��
*/
public class IoTest {

	@Test
	public void test() {
		File file = new File("c:\\data\\imooc");
//		if(!file .exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println(file.getAbsolutePath());
	listDirectory(file);
		
	}
	public static void listDirectory(File dir) {
		if(!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼�����ڣ�"+dir);
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException("����Ŀ¼��"+dir);
		}
//		String[] filenames = dir.list();
//		for(String str :filenames) {
//			System.out.println(str);
//		}
		File[] files = dir.listFiles();
		if(files!=null && files.length>0) {
			for(File file : files) {
				if(file.isDirectory()) {
				   listDirectory(file);
				}else {
					System.out.println(file);
				}
			}
		}
	}
	
	@Test
	public void test001() throws IOException {
		File filedemo = new File("demo");
		if(!filedemo.exists()) {
			filedemo.mkdirs();
		}
		File file = new File("demo","demo.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		String str="��";
		byte[] b = str.getBytes("utf-8");
		raf.write(b);
		raf.close();
	}
	@Test
	public void test002() throws IOException  {
		FileInputStream file =new FileInputStream("C:\\data\\imooc\\file.txt") ;
		int b;
		int i=1;
		while((b =file.read())!=-1) {
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10==0) {
				System.out.println();
			}
		}
	}
	@Test
	public void test003() throws IOException  {
		FileInputStream file =new FileInputStream("C:\\data\\imooc\\file.txt") ;
		byte[] buf = new byte[20*1024];
		int bytes = file.read(buf, 0, buf.length);
		int j=1;
		for(int i=0;i<bytes;i++) {
			System.out.print(Integer.toHexString(buf[i]& 0xff)+" ");
			if(j++%10==0) {
				System.out.println();
			}
		}
	}
	@Test
	public void test004() throws IOException  {
		FileInputStream file =new FileInputStream("C:\\data\\imooc\\file.txt") ;
		byte[] buf = new byte[20*1024];
		int bytes = 0;
		int j=1;
		while((bytes=file.read(buf, 0, buf.length))!=-1) {
			for(int i=0;i<bytes;i++) {
				System.out.print(Integer.toHexString(buf[i]& 0xff)+" ");
				if(j++%10==0) {
					System.out.println();
				}
			}
		}
	}
	@Test
	public void test005() throws IOException  {
		FileOutputStream file =new FileOutputStream("C:\\data\\imooc\\file.txt",true) ;
		byte[]  b = "����".getBytes("GBK");
		file.write(b);
		file.flush();
		file.close();
	}

	@Test
	public void test006()  {
		try {
			FileInputStream fis = new FileInputStream("C:\\\\data\\\\imooc\\\\file.txt");
			FileOutputStream fos = new FileOutputStream("C:\\\\data\\\\imooc\\\\file1.txt");
			byte[] bytes = new byte[26]; // ����һ��26�ֽڳ�������
			int length = 0;
			System.out.println("=====�����ļ���ʼ=====");
			long startTime = System.currentTimeMillis();
			while ((length = fis.read(bytes, 0, bytes.length)) != -1) {
				// һ��д��һ������
				fos.write(bytes);
				fos.flush();
			}
			System.out.println("��ʱ:" + String.valueOf(System.currentTimeMillis() - startTime) + "ms.");
			System.out.println("=====�����ļ�����=====");
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test 
	public void test007() throws IOException {
		FileInputStream in = new FileInputStream("C:\\\\data\\\\imooc\\\\file.txt");
		FileOutputStream file =new FileOutputStream("C:\\data\\imooc\\file1.txt") ;
		byte[] buf=new byte[36];
		int b=0;
		while((b =in.read(buf, 0, buf.length))!=-1) {
			file.write(buf, 0, b);
			file.flush();
		}
		in.close();
		file.close();
	}
	@Test 
	public void test008() throws IOException {
		OutputStream file = new FileOutputStream("C:\\\\data\\\\imooc\\\\filedata.txt");
		DataOutputStream out = new DataOutputStream(file);
		out.writeInt(10);
		out.writeInt(-10);
		out.writeLong(10l);
		out.writeUTF("�й���������");
	}

	@Test 
	public void test009() throws IOException {
		InputStream infile = new FileInputStream("C:\\data\\imooc\\filedata.txt");
		DataInputStream in = new DataInputStream(infile);
		int i =in.readInt();
		int j =in.readInt();
		long l = in.readLong();
		String s =in.readUTF();
		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		System.out.println(s);
	}
	@Test 
	public void test010() throws IOException {
		OutputStream outfile = new FileOutputStream(new File("C:\\data\\imooc\\bufferFile.txt"));
		BufferedOutputStream out = new BufferedOutputStream(outfile);
		byte[] b = "�й���������".getBytes("GBK"); 
		out.write(b);
		out.flush();
		out.close();
	}
	/**
	 * 
	* @Title: test011  
	* @Description:�ַ���
	* @param @throws IOException    �趨�ļ�  
	* @return void    ��������  
	* @throws  
	* @author bjh
	 */
	@Test 
	public void test011() throws IOException {
		FileInputStream in = new FileInputStream("C:\\data\\imooc\\file.txt");
		InputStreamReader inr = new InputStreamReader(in,"utf-8");
		int c ;
		while((c = inr.read())!=-1) {
			System.out.print((char)c);
		}
	}
	

}
