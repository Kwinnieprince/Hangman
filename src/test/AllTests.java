package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PuntTest.class, 
				SpelerTest.class, 
				CirkelTest.class, 
				DriehoekTest.class, 
				HintLetterTest.class,
				HintWoordTest.class,
				LijnStukTest.class,
				OmhullendeTest.class,
				TekeningTest.class,
				WoordenLijstTest.class
				})
public class AllTests {

}
