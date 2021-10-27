package CaseStudy_Strategy;

public class Client {
	
	int client_id ;
	
	Client(int client_id){
		this.client_id = client_id;
	}

	public static void main(String[] args) {
		
		
		
		int[] tableau = {23,45,63,1,5,4,789} ;
		
		TableauAtrier tab = new TableauAtrier(tableau);
		
		Context ctx  = new Context();
		
		ctx.setSortingStrategy(new BubbleSort());
		
		ctx.arrange(tab);
		
		for(int i=0 ; i< tableau.length ; i++){
			System.out.println(tableau[i]);
		}
		
		

	}

}
