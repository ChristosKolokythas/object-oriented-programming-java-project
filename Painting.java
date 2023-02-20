public class Painting extends Masterpiece{
	
	int length, width;
	String technique;
	
	public Painting(int index, int year, String creator, String movement, String condition, int length, int width, String technique) {
		super(index, year,creator, movement, condition);
		this.length = length;
		this.width = width;
		this.technique = technique;
		System.out.println("Creating an instance of Painting");
	}
	
	@Override
	public void getInfo() {
		int surface;
		surface = length * width;
		
		super.getInfo();
		System.out.println("The legth is " +length+ " cm");
		System.out.println("The width is " +width+ " cm");
		System.out.println("The technique is " +technique);
		System.out.println("The surface is " +surface+ " sqcm");
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
