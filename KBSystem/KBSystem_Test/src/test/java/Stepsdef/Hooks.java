package Stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@InsuranceCopilot")
	public void InsuranceCopilotMethod() {
		System.out.println("Database setted in insurance copilot");
	}
	
	@After
	public void Teardown() {
		System.out.println("Entries cleared");
	}
	
	
	@Before("@SQLQueryGenerator")
	public void SQLQueryGeneratorMethod() {
		System.out.println("Database setted in SQL Query Generator");
	}


}
//Before->Backgroung->Scenario->After