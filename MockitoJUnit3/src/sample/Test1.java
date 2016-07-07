package sample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


public class Test1 {
	@Test
	public void testDoSomeThing1() {
//		PowerMockito.spy(myClass1.class);//spy(myClass1.class);
		myClass1 myTest = PowerMockito.spy(new myClass1());
		try {
//			Whitebox.invokeMethod(myTest, "privateMethod", Mockito.any(Integer.class), Mockito.any(Integer.class), 3);
			PowerMockito.doReturn(3).when(myTest, "privateMethod", 1, 2);
//			PowerMockito.mockStatic(
//			int result =  Whitebox.invokeMethod(myTest, "privateMethod", 1, 2);
			int actual = myTest.doSomeThing1(1, 2);
			Assert.assertEquals(3, actual);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
