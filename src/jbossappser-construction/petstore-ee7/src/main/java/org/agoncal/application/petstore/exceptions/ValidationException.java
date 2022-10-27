package org.agoncal.application.petstore.exceptions;

/**
 * Thrown when data is not valid
 */

public class ValidationException extends RuntimeException {
   // ======================================
   // = Constructors =
   // ======================================

   public ValidationException() {
      super();
   }

   public ValidationException(String message) {
      super(message);
   }
}