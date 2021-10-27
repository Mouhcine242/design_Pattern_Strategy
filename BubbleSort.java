package CaseStudy_Strategy;

public  class BubbleSort implements StrategySort {

	@Override
	public void sort(TableauAtrier tab) {
		for(int i=0; i< tab.tableau.length-1; i++) {
			for(int j=0; j< tab.tableau.length-i-1 ;j++) {
				if(tab.tableau[j]> tab.tableau[j+1]) {
					int temp =tab.tableau[j] ;
					tab.tableau[j] = tab.tableau[j+1];
					tab.tableau[j+1] = temp;
				}
				
			}
		}
		
	}
	
	
	
	

}
