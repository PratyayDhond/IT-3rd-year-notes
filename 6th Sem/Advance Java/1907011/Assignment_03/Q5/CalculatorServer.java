import java.rmi.*;
import java.rmi.server.*;

public class CalculatorServer{
  public static void main(String[] args) throws Exception{
    CalculatorImpl add = new CalculatorImpl();
    Naming.rebind("rmi://127.0.0.1/AddServer",add);
  }
}
