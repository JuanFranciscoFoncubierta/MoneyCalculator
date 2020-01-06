
package moneycalculator;
import controller.*;
import view.*;


public class MoneyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MoneyCalculatorView mainFrame = new MoneyCalculatorView("Money Calculator");
        Controller controller = new Controller(mainFrame);
        controller.initialize();
    }
    
}
