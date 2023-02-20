public class Sculpture extends Masterpiece{
	int volume;
	String material;
	
	public Sculpture(int index, int year, String creator, String movement, String condition, int volume, String material) {
		super(index, year, creator, movement, condition);
		this.volume = volume;
		this.material = material;
		System.out.println("Creating an instance of Sculpture");
}

	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("The material is " +material);
		System.out.println("The volume is " +volume);
	}
	
	@Override
	public boolean evaluate(String movement, String condition){
		if(this.movement.equals(movement) && this.condition.equals(condition))
			return true;
		else if(this.movement.equals(movement)) {
			if(this.condition.equals("excellent"))
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	@Override
	public boolean evaluate(String movement){ //no condition ->condition is good

		if(this.movement == movement) {
			if(this.condition.equals("good"))
				return true;
			else if(this.condition.equals("excellent"))
				return true;
			else 
				return false;
		}
		else
			return false;
	}
}
