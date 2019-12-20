package com.gill;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("this executes before any test cases, Count = " + count++);
    }

    @Before
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        //double balance = account.withdraw(200.00, true);
        //assertEquals(800.00, balance, 0);

        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);

    }

    @Test(expected = IllegalArgumentException.class)
    //@Test
    public void withdraw_notbranch() {
        account.withdraw(600.00, false);
        fail("Should have thrown IllegalArgument exception");
    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(300.00, true);
        assertEquals(700.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true(){
        assertTrue("The account is NOT a checking account",account.isChecking());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases, Count = " + count++);
    }

    @After
    public void teardown() {
        System.out.println("Count = " + count++);
    }

}

