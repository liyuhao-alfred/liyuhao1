package CA;

/**
 * 证书参数类
 * 
 * @ClassName CAConfig
 * @author 阿拉甲
 * @Date 2017年1月23日 下午4:44:08
 * @version 1.0.0
 */
public interface CAConfig {

	/**
	 * C:国家代码
	 */
	String CA_C = "China";

	/**
	 * ST:省份代码
	 */
	String CA_ST = "GuangDong";

	/**
	 * L:城市、区域
	 */
	String CA_L = "GuangZhou";

	/**
	 * O:组织名称
	 */
	String CA_O = "CNCA";

	/**
	 * OU:组织单位名称
	 */
	String CA_OU = "CNCA";

	/**
	 * 发行者,CN:姓氏、名字
	 */
	String CA_ISSUER_CN = "localhost";

	/**
	 * 使用者,CN:姓氏、名字
	 */
	String CA_SUBJECT_CN = "localhost";

	/**
	 * 证书发行者
	 */
	String CA_ROOT_ISSUER = "C=" + CA_C + ",ST=" + CA_ST + ",L=" + CA_L + ",O=" + CA_O + ",OU=" + CA_OU + ",CN="
			+ CA_ISSUER_CN;

	/**
	 * 证书使用者
	 */
	String CA_DEFAULT_SUBJECT = "C=" + CA_C + ",ST=" + CA_ST + ",L=" + CA_L + ",O=" + CA_O + ",OU=" + CA_OU + ",CN="
			+ CA_SUBJECT_CN;

	/**
	 * 签名算法
	 */
	String CA_SHA = "SHA256WithRSAEncryption";

}