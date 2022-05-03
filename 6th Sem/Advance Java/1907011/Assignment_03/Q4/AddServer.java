import java.rmi.*;
import java.rmi.server.*;

public class AddServer{
  public static void main(String[] args) throws Exception{
    AddServerImpl add = new AddServerImpl();
    Naming.rebind("rmi://127.0.0.1/AddServer",add);
  }
}
