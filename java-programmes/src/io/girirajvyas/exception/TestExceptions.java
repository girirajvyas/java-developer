package io.girirajvyas.exception;

public class TestExceptions {

	public static void main(String[] args) {
		// Case 1 : Must handle this exception
		 try {
			throw new CustomThrowableException();
		} catch (CustomThrowableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Case 2 : Must handle this exception
		 try {
			throw new CustomException();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		// Case 3: No need to handle this as it is runtime 
		// throw new CustomRuntimeException();
		
		// Case 4: No need to handle this as it is error
		throw new CustomError();
	}

}
