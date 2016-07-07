package sample;

public class myClass1 {

	public int doSomeThing1(int a, int b) {
		int c = a + b;
		
		try {
			c = privateMethod(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
		
	}
	
	private int privateMethod(int a, int b) throws Exception {
		
		int i =0;
		System.out.println(i);
		throw new Exception();
		
	}
	
}
