package CaseStudy_Strategy;

public class SelectionSort implements StrategySort {

	@Override
	public void sort(TableauAtrier tab) {
		for(int i=0 ; i< tab.tableau.length-1 ; i++) {
			int min_index = i;
			for(int j=i+1 ; j< tab.tableau.length; j++) {
				if(tab.tableau[j] < tab.tableau[min_index]) {
					min_index = j;
				}
				
				
			}
			int temp= tab.tableau[i];
			tab.tableau[i] = tab.tableau[min_index];
			tab.tableau[min_index] = temp;
		}
		
	}
	
	

}
