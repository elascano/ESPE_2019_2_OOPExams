
package ec.edu.espe.client.controller;

import java.util.Scanner;




public class Context {

    public Context() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void selectStrategy(){
    System.out.println("Deme el numero de elementos");
        Scanner readElement = new Scanner(System.in);
        int element;
        element = readElement.nextInt();
        
         if(element <=3){
         Strategy strategyA = new ConcreteStrategyA();
         Context context = new Context(strategyA);
         context.ContextInterface();
         }
         else{
         if(element <= 7){
         Strategy strategyB = new ConcreteStrategyB();
         Context context = new Context(strategyB);
         context.ContextInterface();
         }
         else{
         Strategy strategyC = new ConcreteStrategyC();
         Context context = new Context(strategyC);
         context.ContextInterface();
         }
         }
    }
    
    
    Strategy stg;
 
    public Context(Strategy stg) {
        this.stg = stg;
    }

   
    public void setStrategy(Strategy stg) {
        this.stg = stg;
    }
  
    public void ContextInterface(){
        stg.AlgorithmInterface();
    }
}
