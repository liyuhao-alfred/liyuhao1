package CA;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期工具类
 * 
 * @ClassName DateUtil
 * @author 阿拉甲
 * @Date 2017年1月23日 下午4:40:44
 * @version 1.0.0
 */
public class DateUtil {

	/**
	 * 获得当前时间
	 * 
	 * @return
	 */
	public static Date getCurrentDate() {
		Date date = new Date();
		return date;
	}

	/**
	 * 获得下一年的时间
	 * 
	 * @return
	 */
	public static Date getNextYear() {
		Date date = new Date();
		GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
		gc.setTime(date);
		gc.add(Calendar.YEAR, 1);

		date = gc.getTime();
		return date;
	}

}
