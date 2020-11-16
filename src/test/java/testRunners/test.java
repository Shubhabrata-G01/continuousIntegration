package testRunners;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.ReportGeneration;


public class test extends ReportGeneration{
	static SoftAssert sa = new SoftAssert();
	@Test
	public static void test1() {
		Assert.assertTrue(true); // PASS

	}
	@Test
	public static void test2() {
		Assert.assertTrue(false); //FAIL
	}
	@Test
	public static void test3() {
		Assert.assertEquals(true, true); // PASS
	}
	@Test
	public static void test4() {
		Assert.assertEquals(false, true); //FAIL
	}
	@Test
	public static void test5() {
		Assert.assertEquals(false, false); // PASS
	}
	@Test
	public static void test6() {
		Assert.assertEquals(true, false); //FAIL
	}
	@Test
	public static void test7() {
		Assert.assertFalse(true); //FAIL
	}
	@Test
	public static void test8() {
		Assert.assertFalse(false); // PASS
	}

}
