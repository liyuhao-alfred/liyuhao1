package CA;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.X509V3CertificateGenerator;

import sun.misc.BASE64Encoder;

import javax.security.auth.x500.X500Principal;

import java.io.FileWriter;
import java.security.*;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/**
 * 证书实现类
 * 
 * @ClassName BaseCert
 * @author 阿拉甲
 * @Date 2017年1月23日 下午4:41:18
 * @version 1.0.0
 */
public class BaseCert {

	static {
		// 安全支持提供者?BouncyCastleProvider
		Security.addProvider(new BouncyCastleProvider());
	}

	// 实例化KeyPairGenerator对象
	protected KeyPairGenerator kpg = null;

	public BaseCert() throws NoSuchAlgorithmException {
		// 采用 RSA 非对称算法加密
		kpg = KeyPairGenerator.getInstance("RSA");
		// 初始化KeyPairGenerator对象
		kpg.initialize(1024);
	}

	/**
	 * 生成 X509 证书
	 * 
	 * @return
	 * @throws CertificateEncodingException
	 * @throws InvalidKeyException
	 * @throws IllegalStateException
	 * @throws NoSuchProviderException
	 * @throws NoSuchAlgorithmException
	 * @throws SignatureException
	 */
	public X509Certificate generateCert() throws CertificateEncodingException, InvalidKeyException,
			IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException {
		// 公钥和私钥可以通过KeyPairGenerator执行generateKeyPair()后生成密钥对KeyPair
		// 通过KeyPair.getPublic()和KeyPair.getPrivate()来获取
		KeyPair keyPair = this.kpg.generateKeyPair();
		// 公钥
		PublicKey pubKey = keyPair.getPublic();
		// 私钥
		PrivateKey priKey = keyPair.getPrivate();

		System.out.println("private key:\n" + new BASE64Encoder().encode(priKey.getEncoded()));
		System.out.println("public key:\n" + new BASE64Encoder().encode(pubKey.getEncoded()));

		// 构造一个证书生成器对象
		X509V3CertificateGenerator certGen = new X509V3CertificateGenerator();
		// 设置序列号
		certGen.setSerialNumber(CertUtil.getSerialNumber());
		// 设置颁发者
		certGen.setIssuerDN(new X500Principal(CAConfig.CA_ROOT_ISSUER));
		// 证书有效期起
		certGen.setNotBefore(DateUtil.getCurrentDate());
		// 证书有效期止
		certGen.setNotAfter(DateUtil.getNextYear());
		// 设置使用者
		certGen.setSubjectDN(new X500Principal(CAConfig.CA_DEFAULT_SUBJECT));
		// 公钥
		certGen.setPublicKey(pubKey);
		// 签名算法
		certGen.setSignatureAlgorithm(CAConfig.CA_SHA);
		// 生成证书
		X509Certificate cert = certGen.generate(priKey, "BC");
		return cert;
	}
}
