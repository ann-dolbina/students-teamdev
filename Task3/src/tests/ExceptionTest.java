package tests;



import hook.LastErrorException;

import org.junit.Test;



public class ExceptionTest {

	@Test
	public void lastErrorExceptionThrowing() {
		try{
			throw new LastErrorException(5, "Test");
		}catch(LastErrorException e){
			e.printStackTrace();
		}
	}

}
