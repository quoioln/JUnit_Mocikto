/**
 * 
 */
package hamcrest;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
public class HamcrestCollectionTest {
	private Set<String> setA;
	private Set<String> setB;
	
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
	}
}