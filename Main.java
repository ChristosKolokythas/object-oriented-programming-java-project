import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Error. Need 3 args.");
			System.exit(0);
		}
		
		int N = Integer.parseInt(args[0]);
				
		String[] Movement = new String[] {"impressionism", "expressionism", "naturalism"};
		String[] Condition = new String[] {"bad", "good", "excellent"};
		String[] Technique= new String[] {"oil", "aquarelle", "tempera"};
		String[] Material = new String[] {"wood", "stone", "iron"};
		
		Random rand = new Random();
		
		Artifact artifacts[] = new Artifact[N]; 
		
		for(int i = 0; i < N; i++ ) { 			//initialing the creations
			
			String s = String.valueOf(i);         //creating the creator
			String creator = new String("Creator");
			creator = creator + s;
			
			int year = rand.nextInt(2022);			//creating the year
			
			int k = rand.nextInt(3);
			String movement = Movement[k];
			
			k = rand.nextInt(3);
			String condition = Condition[k];
						
			k = rand.nextInt(2);  //0 for painting 1 for sculpture
			
			if(k == 0) {
				k = rand.nextInt(3);
				String technique = Technique[k];
				int length = rand.nextInt(4000);
				int width = rand.nextInt(4000);
				artifacts[i] = new Painting(i, year, creator, movement, condition, length, width, technique);
			}
			else {
				int volume = rand.nextInt(5000);
				k = rand.nextInt(3);
				String material = Material[k];
				
				artifacts[i] = new Sculpture(i, year, creator, movement, condition, volume, material );
			}
		}
		
		auction(artifacts, args[1], args[2]);
	}
	
	public static void auction(Artifact artifacts[], String movement, String condition){
		
		for(int i =0; i < artifacts.length; i++) {
			artifacts[i].getIndex();
			artifacts[i].getInfo();
			System.out.println(artifacts[i].evaluate(movement, condition) );
		}
	}
}