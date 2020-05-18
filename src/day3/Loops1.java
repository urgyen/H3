/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author Urgyen
 */
public class Loops1 {
 
    public static void main(String[] args){
        
        //Java 
        //1. We do something // variables haru
        //2. We do something if thats true;
        //3. We do something again and again
        
        //  Loops
            //  while
            //  do while
            //  for loop
       
      int number=7;
     // number=8
////        
////        //o<5 true Print 1 ;; num=1
////        //1<5 trye Print 2 ;; num =2
////          //2<5 trye Print 3 ;; num =3
////          //3<5 trye Print 4 ;; num =4
////          //4<5 trye Print 5 ;; num =5
////          //5<5 false END
////        
        while(number==7){
            System.out.println("ok");
             number++;
             //number=1
        }
        //end
        
        //do while
        int num1= 600;
//        
        do{
            System.out.println("Hello");
            num1++;
            
        }while(num1<500);

     //for loop;
        
       //   Scenario
       //   Hi 10
            //number increment important;
            //condition ---
            //index or starting point
        
        for(int index= 10; index<20 ; index++){
            System.out.println(index + " : Hii Hello");
        }
        
        //output
        
//        for(int index=1 ;index<=10;index++){
//            
//            int multipleResult= 9*index;
//            
//            System.out.println( " 9 * "+ index + " = " + multipleResult);
//            
//            // 5 * 1 = 5
//            // 5 * 2 = 10
//         
//        }
        
       // System.out.println("Hi");
        
    }
    
}