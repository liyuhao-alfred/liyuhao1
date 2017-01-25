package CA;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

import sun.misc.BASE64Encoder;

/**
 * 测试类
 *
 * @ClassName GenerateCa
 * @author 阿拉甲
 * @Date 2017年1月23日 下午4:48:17
 * @version 1.0.0
 */
public class GenerateCa {
	private static String certPath = "d:/lee.cer";

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			BaseCert baseCert = new BaseCert();
			// 生成证书
			X509Certificate cert = baseCert.generateCert();
			// 输出内容
			System.out.println(cert.toString());

			// 导出为 cer 证书
			fos = new FileOutputStream(certPath);
			fos.write(cert.getEncoded());
			fos.close();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (CertificateEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}