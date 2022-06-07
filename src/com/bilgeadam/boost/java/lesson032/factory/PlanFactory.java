package com.bilgeadam.boost.java.lesson032.factory;

public class PlanFactory {

	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}
		else if (planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
		}
		else if (planType.equalsIgnoreCase("Instituional")) {
			return new InstituionalPlan();
		}
		return null;
	}
}
