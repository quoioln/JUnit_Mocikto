package sample;

public class MyClass {
	public int doSomeThing1(int a, int b) {
		int c = a + b;
		try {
			c = privateMethod(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
		
	}
	
	private int privateMethod(int a, int b) throws Exception {
		int i =0;
		throw new Exception();
	}
}
