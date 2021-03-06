package calculoDeIRPF.tests;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({RendimentosVaziosTest.class, 
			   DeducaoExceptionTest.class,
			   ImpostoExceptionTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AllExceptions {

}
