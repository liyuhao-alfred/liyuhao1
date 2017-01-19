/**
 * @author 李裕豪
 * @date 2017-01-19 10:12:52
 */
package com.liyuhao.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class util {

	/**
	 * 获得当前系统时间
	 * 
	 * @return "yyyy-MM-dd HH:mm:ss"
	 */
	public static String GetCurrentTime() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		return time;
	}

	/**
	 * 以当前时间命名 yyyyMMddHHmmss
	 * 
	 * @return
	 */
	public static String NameByTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");// 其中yyyy-MM-dd是你要表示的格式
		String str = sdf.format(d);
		return str;
	}

}
