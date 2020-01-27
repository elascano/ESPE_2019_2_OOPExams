
package ec.edu.espe.client.view;

import ec.edu.espe.client.controller.ConcreteStrategyA;
import ec.edu.espe.client.controller.ConcreteStrategyB;
import ec.edu.espe.client.controller.ConcreteStrategyC;
import ec.edu.espe.client.controller.Context;
import ec.edu.espe.client.controller.Strategy;
import java.util.Scanner;


public class Client {

    
    public static void main(String[] args) {
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
    
}
