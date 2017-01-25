package CA;

/**
 * 
 * 
 * @ClassName Demo
 * @author 阿拉甲
 * @Date 2017年1月24日 下午4:58:44
 * @version 1.0.0
 */
public class Demo {
	public native void sayHello();

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));// user.dir指定了当前的路径
		System.setProperty("java.library.path", System.getProperty("user.dir"));
		System.loadLibrary("JniDemo");
		Demo dm = new Demo();
		dm.sayHello();
	}

}
