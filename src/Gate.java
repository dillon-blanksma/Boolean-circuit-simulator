import java.util.ArrayList;

public class Gate extends Executable 
{
	private GateType type;
	private String label;
	private ArrayList<Boolean> gateIn;
	private ArrayList<Boolean> gateOut;
	
	public Gate(GateType type, String label)
	{
		this.type = type;
		this.label = label;
		//lists to hold the inputs and outputs (boolean data type in order to do boolean operations on stored values)
		gateIn = new ArrayList<Boolean>();
		gateOut = new ArrayList<Boolean>();
	}
	
	public boolean doOperation(boolean val1, boolean val2)
	{
		switch(type)
		{
		case AND:
			return val1 && val2;
		case OR:
			return val1 || val2;
		case NAND:
			return !(val1 && val2);
		case NOR:
			return !(val1 || val2);
		case XOR:
			return val1 ^ val2;
		default:
			return true;
		}
	}
	
	public boolean doOperation(boolean val)
	{
		return !val;
	}
	
	public GateType getGateType()
	{
		return type;
	}
	
	public String getGateLabel()
	{
		return label;
	}
	
}
