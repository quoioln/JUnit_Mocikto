/**
 * 
 */
package hamcrest;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class HamcrestCollectionTest {
	private Set<String> setA;
	private Set<String> setB;
	@Mock
	List<String> list;// = Mockito.mock(List.class);
	HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	@Before
	public void beforeMethod() {
		setA = new HashSet<String>();
		setB = new HashSet<String>();
	}
	
	@Test
	public void collectionsUtilityMethods() {
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s3";
		setA.add(s1);
		setA.add(s2);
//		setA.add(s3);
//		assertThat(setA, hasItem(s1));
//		assertThat(setA, hasItem(s2));
//		assertThat(setA, hasItem("xyz"));
//		assertThat(setA, hasItems(s1, s2, "xyz"));
	}
	@Test
	public void mapsUtilityMethods() {
		map.put("a", 2);
		map.put("b", 3);
		assertThat(map).isNotNull().isNotEmpty()
			.includes(entry("a", 2), entry("b", 3)).excludes(entry("c", 1));
		
		Mockito.when(list.size()).thenReturn(6);
		System.out.println(list.size());
		Assert.assertEquals(5, list.size());
	}
}