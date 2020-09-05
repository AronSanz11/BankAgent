/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontologies;

import jade.content.*;


public class Transfer implements AgentAction{
    
   private int type;
   private float amount;
   private String origin_account;
   private String target_account;
   
   public int getType() {
      return type;
   }

   public float getAmount() {
     return amount;
   }

   public String getAccountId() {
      return origin_account;
   }
   
   public String getTargetAccount(){
       return target_account;
   }

   public void setType(int type) {
      this.type = type;
   }

   public void setAmount(float amount) {
      this.amount = amount;
   }

   public void setAccountId(String accountId) {
      this.origin_account = accountId;
   }
   
   public void setTargetAccount(String targetA){
       this.target_account = targetA;
   }
}
