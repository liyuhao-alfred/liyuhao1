package CA;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *证书序列号工具类
 *
 * @ClassName CertUtil
 * @author 阿拉甲
 * @Date 2017年1月23日 下午4:46:47
 * @version 1.0.0
 */
public class CertUtil {

	/**
	 * 证书序列号生成
	 * 
	 * @return
	 */
	public static BigInteger getSerialNumber() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String newtime = format.format(Calendar.getInstance().getTime());
		String newrandom = String.valueOf((int) (Math.random() * 100) + 1);
		return BigInteger.valueOf(Long.valueOf(newtime + newrandom).longValue());
	}

}
