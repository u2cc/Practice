package com.personal.practice.exception;

public class NaughtyResource implements AutoCloseable
{
   /**
    * Method that intentionally throws an exception.
    * 
    * @throws RuntimeException Thrown no matter how you call me.
    */
   public void doNothingGood() throws Exception
   {
      throw new Exception("Exception at doing nothing good.");
   }

   /**
    * The overridden closure method from AutoCloseable interface.
    * 
    * @throws Exception Exception that might be thrown during closure of this
    *    resource.
    */
  // @Override
   public void close() throws Exception
   {
      throw new Exception("Exception at closure.");
   }
}