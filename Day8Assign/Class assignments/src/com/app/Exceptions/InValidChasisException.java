package com.app.Exceptions;

public class InValidChasisException extends Exception {
		private String message;
		private String chasis;
		public InValidChasisException() {
			
		}
		public InValidChasisException(String message,String chasis) {
			this.chasis=chasis;
			this.message= message;
		}
		@Override
		public  String getMessage() {
			return "chasis no :"+chasis+" ,Exception :"+message;
			
		}

	}

	
	

