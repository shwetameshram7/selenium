package TestCase;

import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;

public class prc {

	
	@BeforeMethod
	 public void beforeMethod() {
	 System.out.println(" Before method");
	 }
	 
	@AfterMethod
	 public void afterMethod() {
	 System.out.println("After Method");
	 }
	 
	@BeforeClass
	 public void beforeClass() {
	 System.out.println("Before Class");
	 }
	 
	@AfterClass
	 public void afterClass() {
	 System.out.println("After Class");
	 }
	 
	@BeforeTest
	 public void beforeTest() {
	 System.out.println("Before Test");
	 }
	 
	@AfterTest
	 public void afterTest() {
	 System.out.println("After Test");
	 }
	 
	@BeforeSuite
	 public void beforeSuite() {
	 System.out.println("Before Suite");
	 }
	 
	@AfterSuite
	 public void afterSuite() {
	 System.out.println("After Suite");
	 }
	 
	@Test
	 public void firstTest() {
	 System.out.println("Hi, I am from first Test");
	 }
	 
	@Test
	 public void secondTest() {
	 System.out.println("Hi, I am from second Test");
	 }
	
	
}
