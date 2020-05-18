/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Urgyen
 */
public class Functions {
    
    public static void main(String[] args){
       
        //argument pass gareko xaina
//        printWorld();
//        //argument pass gareko
//        printMyName("Puskar");
//        printMyName("Abushek");
        
        //dui ta number 
        //15
       double response = addTwoNumber(5, 10);
       System.out.println(response);
       
       printWorld();
       
    }
    
    //num1=5
    //num2=10
      static double addTwoNumber(int num1, int num2){
        
          //15
          double sum= num1+num2;
          return sum;
          
     }
      
      
    static void printWorld(){
        System.out.println("Hello World");
        System.out.println("Hi");
        
    }
    
    //myName= Abishek
    
    static void printMyName(String myName){
        for(int i=0; i<10; i++){
            System.out.println(myName);
        }  
    }
    
  
    
    
    //Function on the basis of return type and argument
//    1. Function with argument and return type ok
//    2. Function with argument and no return type ok 
//    3. Function with no argument and return type ok
//    4. Function with no argument and no return type
    
}
