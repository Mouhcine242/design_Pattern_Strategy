package CaseStudy_Strategy;

public class InsertionSort implements StrategySort {

	@Override
	public void sort(TableauAtrier tab) {
		for(int i=1; i< tab.tableau.length; i++) {
			int key = tab.tableau[i];
			
			int j= i-1 ;
			
			 while (j >= 0 && tab.tableau[j] > key) {
	                tab.tableau[j + 1] = tab.tableau[j];
	                j = j - 1;
	            }
			 tab.tableau[j+1] = key;
			 
			
		}
		
		
	}
	

}
