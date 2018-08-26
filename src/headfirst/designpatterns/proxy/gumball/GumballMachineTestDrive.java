package headfirst.designpatterns.proxy.gumball;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
 
	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
 			System.exit(1);
		}

		try {
//			LocateRegistry.createRegistry(6600);
			count = Integer.parseInt(args[1]);

			gumballMachine = 
				new GumballMachine(args[0], count);
			Naming.rebind("rmi://localhost/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
