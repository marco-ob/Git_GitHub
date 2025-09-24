package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks
{
    @Before("@NetBanking") //lo hace antes de ejecutar todos y cada uo de los escenarios
    public void netBankingSetup(){
        System.out.println("*******************************");
        System.out.println("setup the entries in netbanking database");
    }
    @Before("@Mortgage")
    public void mortgageSetup(){
        System.out.println("setup the entries in Mortgage database");
    }
    @After
    public void tearDown(){
        System.out.println("CLEAR THE ENTRIES");
    }

}
