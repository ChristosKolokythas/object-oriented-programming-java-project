public abstract class Masterpiece extends Artifact{
	String movement, condition;
	
	public Masterpiece(int index, int year, String creator, String movement, String condition) {
		super(index, year, creator);
		this.movement = movement;
		this.condition = condition;
		System.out.println("Creating an instance of Masterpiece");
	}
	
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("The movenent is " +movement);
		System.out.println("The condition is " +condition);
	}
	
	@Override
	public abstract boolean evaluate(String movement, String condition);
	
	@Override
	public abstract boolean evaluate(String movement);
}
