package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	private RetailHomePage homePage;
	
	
	

	public POMFactory () {
		this.homePage = new RetailHomePage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	
}
