package testRunners;


import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ReportGeneration;

public class test2 extends ReportGeneration{

	@Test
	public static void test9() {
		Assert.assertTrue(true); // PASS
	}
	@Test
	public static void test10() {
		Assert.assertTrue(false); //FAIL
	}
	@Test
	public static void test11() {
		Assert.assertEquals(true, true); // PASS
	}
	@Test
	public static void test12() {
		Assert.assertEquals(false, true); //FAIL
	}
	@Test
	public static void test13() {
		Assert.assertEquals(false, false); // PASS
	}
	@Test
	public static void test14() {
		Assert.assertEquals(true, false); //FAIL
	}
	@Test
	public static void test15() {
		Assert.assertFalse(true); //FAIL
	}
	@Test
	public static void test16() {
		Assert.assertFalse(false); // PASS
	}

}
