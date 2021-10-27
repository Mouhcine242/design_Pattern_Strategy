package CaseStudy_Strategy;

public class Context {
	
	private StrategySort sorting ;
	
	

	public StrategySort getSortingStrategy() {
		return sorting;
	}

	public void setSortingStrategy(StrategySort sorting) {
		this.sorting = sorting;
	}
	
	public void arrange(TableauAtrier tab) {
		
		sorting.sort(tab);
		
	}
	
	

}
