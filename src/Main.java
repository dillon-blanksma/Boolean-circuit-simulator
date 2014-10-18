public class Main
{

	public static void main(String[] args)
	{
		// Simple main which just reads in the 3 files
		// You'll need to modify the parsers to save the
		// data read from files however you'd like. Do not
		// assume the way it is done is ideal for you. Do 
		// what makes sense to you.
		
		CircuitParser cp = new CircuitParser("C:\\Users\\Dillon\\Java\\arch&Org_Project_02\\src\\SampleCircuit.txt");
		GatePropagationParser gpp = new GatePropagationParser("C:\\Users\\Dillon\\Java\\arch&Org_Project_02\\src\\SamplePropagationTimes.txt");
		InputVectorParser ivp = new InputVectorParser("C:\\Users\\Dillon\\Java\\arch&Org_Project_02\\src\\SampleInputVectors.txt");
	}
}
