package it.unical.ingsw2020.testLaboratorio.TestLaboratorio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.*;

public class MyListUtilTest {
		
	private static MyListUtil ut;
	private  static DateTime dt = new DateTime();
	
	@BeforeClass
	public static void beforeClass() {
		ut= new MyListUtil();
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before, " + dt.toString("dd-MM-YYY") +"  "+ dt.toString("hh:mm"));
		
	}
	
	@After
	public void after() {
		System.out.println("After, " + dt.toString("dd-MM-YYY") +"  "+ dt.toString("hh:mm"));
	}
	
	@Test
	public void getCrescenteWork() {
		assertEquals(Arrays.asList(1,2,3,4,7), ut.getCrescente(Arrays.asList(2,7,1,4,3)));
	}
	
	@Test
	public void getDecrescenteWork() {
		assertEquals(Arrays.asList(7,4,3,2,1), ut.getDecrescente(Arrays.asList(2,7,1,4,3)));
	}
	
	
}
