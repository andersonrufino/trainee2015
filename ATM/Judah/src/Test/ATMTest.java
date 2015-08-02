package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import Util.*;
/**
 *
 * @author Judah
 */
public class ATMTest {
    
    public ATMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    static public void assertArrayEquals(Bill[] expected, Bill[] actual) {
        if(actual.length!=expected.length){
            fail();
        }
        for (int index = 0; index < actual.length; index++) {
            assertEquals(expected[index], actual[index]);
        }
    }
    
    static public void assertEquals(Bill expected, Bill actual) {
        if (expected == null && actual == null) {
            return;
        }
        if ((expected != null) && (actual.getNumber()==expected.getNumber()) && (actual.getValue()==expected.getValue()) && (actual.getSymbol() == null ? null == expected.getSymbol() : actual.getSymbol().equals(expected.getSymbol()))) {
            return;
        }
        fail();
    }

//    @Test
//    public void testAssertEqualsArrayErrorValue() {
//        ATM atm=new ATM();
//        Bill[] billArray0 = {new Bill(1, 10, "R$"),new Bill(1, 10, "R$")};
//        Bill[] billArray1 = {new Bill(1, 10, "R$"),new Bill(1, 10, "RS")};
//        assertArrayEquals(billArray0, billArray1);
//    }
//    
//    @Test
//    public void testAssertEqualsArrayErrorSize() {
//        ATM atm=new ATM();
//        Bill[] billArray0 = {new Bill(1, 10, "R$"),new Bill(1, 10, "R$")};
//        Bill[] billArray1 = {new Bill(1, 10, "R$")};
//        assertArrayEquals(billArray0, billArray1);
//    }
//    
//    @Test
//    public void testAssertEqualsErrorValue() {
//        ATM atm=new ATM();
//        Bill bill0 = new Bill(1, 20, "R$");
//        Bill bill1 = new Bill(1, 10, "R$");
//        assertEquals(bill0, bill1);
//    }
    
    @Test
    public void testAssertEqualsArrayOK() {
        ATM atm=new ATM();
        Bill[] billArray0 = {new Bill(1, 10, "R$"),new Bill(1, 10, "R$")};
        Bill[] billArray1 = {new Bill(1, 10, "R$"),new Bill(1, 10, "R$")};
        assertArrayEquals(billArray0, billArray1);
    }
    
    @Test
    public void testAssertEqualsOK() {
        ATM atm=new ATM();
        Bill bill0 = new Bill(1, 10, "R$");
        Bill bill1 = new Bill(1, 10, "R$");
        assertEquals(bill0, bill1);
    }
    
    @Test
    public void testWithdrawFor10() throws Exception {
        ATM atm=new ATM();
        Bill[] billArray = atm.withdraw(10);
        Bill[] billArrayExpected = {new Bill(1, 10, "R$")};
        assertArrayEquals(billArrayExpected, billArray);
    }
    
    @Test
    public void testWithdrawFor20() throws Exception {
        ATM atm=new ATM();
        Bill[] billArray = atm.withdraw(20);
        Bill[] billArrayExpected = {new Bill(1, 20, "R$")};
        assertArrayEquals(billArrayExpected, billArray);
    }
    
    @Test
    public void testWithdrawFor30() throws Exception {
        ATM atm=new ATM();
        Bill[] billArray = atm.withdraw(30);
        Bill[] billArrayExpected = {new Bill(1, 20, "R$"),new Bill(1, 10, "R$")};
        assertArrayEquals(billArrayExpected, billArray);
    }
    
    @Test(expected = Exception.class)
    public void testWithdrawFor31() throws Exception {
        ATM atm=new ATM();
        Bill[] billArray = atm.withdraw(31);
//        Bill[] billArrayExpected = {new Bill(1, 20, "R$"),new Bill(1, 10, "R$")};
//        assertArrayEquals(billArrayExpected, billArray);
    }
    
    @Test
    public void testWithdrawFor30With3x10() throws Exception {
        Bill[] billArrayinit = {new Bill(3, 10, "R$")};
        ATM atm=new ATM(billArrayinit);
        Bill[] billArray = atm.withdraw(30);
        Bill[] billArrayExpected = {new Bill(3, 10, "R$")};
        assertArrayEquals(billArrayExpected, billArray);
    }
    
    @Test(expected = Exception.class)
    public void testWithdrawFor30With2x10() throws Exception {
        Bill[] billArrayinit = {new Bill(2, 10, "R$")};
        ATM atm=new ATM(billArrayinit);
        Bill[] billArray = atm.withdraw(30);
//        Bill[] billArrayExpected = {new Bill(3, 10, "R$")};
//        assertArrayEquals(billArrayExpected, billArray);
    }
}
