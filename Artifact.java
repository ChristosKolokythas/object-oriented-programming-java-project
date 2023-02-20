public abstract class Artifact {
	int index,year;
	String creator;
	
	public Artifact(int index, int year, String creator) {
		this.index = index;
		this.year = year;
		this.creator = creator;
		System.out.println("Creating an instance of Artifact");
	}
	
	public void getInfo() {
		System.out.println("The creator is " +creator);
		System.out.println("The year is " +year);
	}
	
	public void getIndex() {
		System.out.println("The index is " +index);
	}
	

	public abstract boolean evaluate(String movement, String condition);
	
	public abstract boolean evaluate(String movement);
}