package designPattern_FactoryMethod;

public class DomesticPlan extends Plan
{

	@Override
	void getrate() {
		rate=3.50;
		System.out.println(rate);
		
	}

}
