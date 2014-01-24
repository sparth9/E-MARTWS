/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.emart.creditValid;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Rahul
 */
@WebService(serviceName = "CreditCardVerification")
@Stateless()
public class CreditCardVerification {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verifyCard")
    public String verifyCard(@WebParam(name = "cardNum") String cardNum) {
        //TODO write your implementation code here:
 //int cNum=Integer.parseInt(cardNum);
    
    if(cardNum.length()==16){
    int[] cnum=new int[cardNum.length()];
    for(int i=0;i< cardNum.length();i++){
    cnum[i]=(cardNum.charAt(i)-'0');}
    
      boolean status= ismod10(cnum);
      System.out.println("Status:"+status);

   if(status==true)
       return "True";
   else
       return "False";}
    else{
    return "False";
    }
       }
 public boolean ismod10(int[] cnum){
 int sum=0,temp=0;
     for(int i=cnum.length-2;i>=0;i=i-2){
     
         sum=cnum[i]*2;
         if(sum >9){
             temp=0;
           while(sum > 0){  
         temp=temp+sum%10;
         sum=sum/10;
         }
         sum=temp;
         
         }
         cnum[i]=sum;
     }
     //      for(int j=0;j<cnum.length;j++){
//    System.out.print(cnum[j]);}
     
 sum=0;
     for(int i=0;i<cnum.length;i++){
         
         sum=sum+cnum[i];
 }
     if(sum%10==0)
         return true;
     else
     return false;
 }
    /**
     * This is a sample web service operation
     */
  
}
