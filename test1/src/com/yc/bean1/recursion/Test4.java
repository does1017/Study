package com.yc.bean1.recursion;

public class Test4 {

	//判定给的字符串是否为回文字符串
	public static void main(String[] args) {
		System.out.println( isPalinDrom("abba",0,"abba".length()-1));
	}

	/**
	 * c  true
	 * ab  false
	 * aba true
	 * 
	 * 将字符串进行截取..   subString()
	 * @param string
	 * @return
	 */
	private static boolean isPalinDrom(String str) {
		if( str==null||str.length()<=1){
			return true;
		}else{
			//判断第一个和最后一个字符是否相同
			if( str.charAt(0)==str.charAt(str.length()-1) ){
				str=str.substring(1,str.length()-1);//如果相同则截取 去头 去尾的 
				return isPalinDrom(str);//在递归调用
			}else{//不相同
				return false;
			}
			
		}
		
	}
	
	private static boolean isPalinDrom(String str,int low,int high) {
		if(  low>=high){
			return true;
		}else{
			//判断第一个和最后一个字符是否相同
			if( str.charAt(low)==str.charAt(high) ){
				return isPalinDrom(str,low+1,high-1);//在递归调用
			}else{//不相同
				return false;
			}
			
		}
		
	}

}
