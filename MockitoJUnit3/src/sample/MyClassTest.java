package sample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyClass.class)
public class MyClassTest {
	@Test
	public void testDoSomeThing1() {
		MyClass myTest = PowerMockito.spy(new MyClass());
		try {
			int expected = 3;
			PowerMockito.doReturn(3).when(myTest, "privateMethod", Mockito.anyInt(), Mockito.anyInt());
			int actual = myTest.doSomeThing1(Mockito.anyInt(), Mockito.anyInt());
			Assert.assertEquals(expected, actual);
//			Assert.assertNu
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
