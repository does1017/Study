package com.yc.bean1.recursion;

import java.io.File;

public class Test6 {
	/**
	 *  File类： isFile()   isDirectory()
	 *  	如果是目录 则要取出目录下所有的文件和目录  File[]  listFiles();
	 *  	取出大小累加
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		File f=new File("D:\\file");  //c:/document and setting   System.getProperty("user.home")
		System.out.println("大小为："+getFileSize(f));
	}

	private static long getFileSize(File f) {
		long total=0;
		if(f.isFile()){//是文件
			total=f.length();
		}else{//是目录
			File[] fs=f.listFiles();
			if(fs!=null&&fs.length>0){
				for(File file:fs){
					total+=getFileSize(f);
				}
			}
		}
		return total;
	}

}
