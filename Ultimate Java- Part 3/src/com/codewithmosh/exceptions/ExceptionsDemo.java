package com.codewithmosh.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.nio.file.ClosedDirectoryStreamException;
import java.nio.file.ClosedFileSystemException;

// public class ExceptionsDemo {
//   public static void show() {
//     var account = new Account();
//     try {
//       account.withdraw(10);
//     } catch (AccountException e) {
//       var cause = e.getCause();
//       System.out.println(cause.getMessage());
//     }
//   }
// }

public class ExceptionsDemo {
  
  //try with ressources statement
  public static void show(){
    try(
      var reader = new FileReader("file.txt");
      var writer = new FileWriter("lamine.txt");
    ) {
      System.out.println("File opened");
    } catch (IOException e) {
      System.out.println("File does not exist " + e.getMessage());
    }
    
  }
  
  public static void accountHandler() throws IOException {
    var account = new Account();
    try {
      account.deposit(-1);
    } catch (IOException e) {
      System.out.println("Loggin");
      throw e;
    }
  }

  public static void inputOutput () {
    FileReader file = null;
    try{
      file = new FileReader("lamine.txt");

      var data = file.read();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
    }
    finally{
      if(file != null)
        try{
          file.close();
        }
        catch(IOException e){
          System.out.println(e.getMessage());
        }
    }
  }

}