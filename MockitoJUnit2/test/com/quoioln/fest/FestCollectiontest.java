/**
 * 
 */
package com.quoioln.fest;

/**
 * @author vpquoi
 *
 */
import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
public class FestCollectiontest {
	private Set<String> setA;
	private Set<String> setB;
	
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
		assertThat(setA).isNotEmpty().hasSize(2).doesNotHaveDuplicates();
		assertThat(setA).containsOnly(s1, s2);
	}
	@Test
	public void mapUtilityMethods() {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("a", 2);
		map.put("b", 3);
		assertThat(map).isNotNull().isNotEmpty()
			.includes(entry("a", 2), entry("b", 3)).excludes(entry("c", 1));
	}
}
