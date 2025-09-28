package com.app.Exceptions;

public class InvalidCategoryException extends Exception {
   private String message;
   private String category;
   public InvalidCategoryException() {
	   
   }
   public InvalidCategoryException(String category, String message) {
	   this.message = message;      // 👈 assign
       this.category = category;
   }
   @Override
   public String getMessage() {
	   return "Exception due to :"+category+" ,reason:"+message;
   }
}
