package sml;

public class BnzInstruction extends Instruction {
	private String L2;
	private int register;
	
	public BnzInstruction(String l, String op) {
		super(l, op); 
	}
	
	public BnzInstruction(String label, int register, String L2) {
		this(label, "bnz");
		this.register = register;
		this.L2 = L2;
	}
	
	@Override
	public String toString() {
		return super.toString() + " if register " + register + " is not zero then execute " + L2;
	}
	
	public void execute(Machine m) {
		if(m.getRegisters().getRegister(register) != 0) {
			m.setPc(m.getLabels().indexOf(L2));
		}
	}
}
