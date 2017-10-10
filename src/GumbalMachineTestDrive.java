
public class GumbalMachineTestDrive {
	public static void main(String[] arqs){
		GumbalMachine gumbalMachine = new GumbalMachine(3);
			/*	
		System.out.println (gumbalMachine);
		
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		
		System.out.println (gumbalMachine);
	
		*/	
		gumbalMachine.insertQuarter();
		gumbalMachine.ejectQuarter();
		gumbalMachine.turnCrank ();
	
		
		System.out.println (gumbalMachine);
		/*
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank ();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank ();
		gumbalMachine.ejectQuarter();
		
		System.out.println (gumbalMachine);
		
		gumbalMachine.insertQuarter();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank ();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank ();
		System.out.println(gumbalMachine);
   
*/
}
}