/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Urgyen
 */
public class decision1 {
    
    
     public static void main(String[] args) {
         
       //Decision Control
         
         //if condition
            
//         
//        // condition check --> true ki false
//         
//         String name="Suzana";
//         
//         if( true ){
//             System.out.println("Absent");
//         }
//         
////            int number = 25;
////            
////          if(number % 2 == 0 ){
////              System.out.println("Even");
////          } 
////          else{
////              System.out.println("Odd");
////          }
////         
//         
////         Scenario
////         0 -9  Kid
////                 10 -19 Teen
////                         20+ Adult 100 101--> Wrong Input
//         
////         
////         int age=150;
////         
////         if(age<=9){
////             System.out.println("Kid");
////         }
////         else if( age<20){
////             System.out.println("Teen");
////         }
////         else if(age<=100){
////              System.out.println("ADult");
////         }
////         else{
////             System.out.println("Wrong Input");
////         }
//         
//         //Scenario
////         0-40 == Fail
////         41 -60 == 2nd div
////         61- 80 == 1st div
////         81- 100 ==Disticntion        
//         
//         int percentage =85;
//         if(percentage<=40){
//             System.out.println("FAil");
//         }
//         else if(percentage<=60){
//             System.out.println("2nd division");
//         }
//         else if(percentage<=80 ){
//             System.out.println("1st division");
//         }
//         else{
//             System.out.println("Distinction");
//         }
//         
         
        //Switch condition;
         //1,2,1000;
         
//         Sunday I
//         Monday II
//         Tues III
//         Iv
//         Saturday VII
         
         
         String weekDay="IIjhgI"; //Tuesday
         
         switch(weekDay){
             
             case "I":
                 System.out.println("Sunday");
                 break;
             
             case "II":
                 System.out.println("Monday");
                 break;
                 
             case "III":
                 System.out.println("Tuesday");
                 break;
                 
             case "IV":
                 System.out.println("Wednesday");
                 break;
                 
             case "V":
                 System.out.println("Thursday");
                 break;
                 
             case "VI":
                 System.out.println("Friday");
                 break;
                 
             case "VII": 
                 System.out.println("Saturday");
                 break;
                 
             default:
                 System.out.println("Wrong Input");
                
         }
         
         
         
         
         
         
         
     }
        
}
