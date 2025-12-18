package designPattern_FactoryMethod;

public class GetFactoryPlan 
{
	public static Plan getPlan(String plantype)
	{
		if(plantype==null)
		{
		return null;
		}
		else if(plantype =="DomesticPlan")
		{
			return new DomesticPlan();
		}
		else if (plantype =="CommercialPlan") 
		{
			return new CommercialPlan();
		}
		else if (plantype =="InstitutionalPlan") 
		{
			return new InstitutionalPlan();
		}
		return null;
	}

}
