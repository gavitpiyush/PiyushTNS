// to calculate
package com.scanner;

public class Taxcalculation {

	public void calculateTax(Person person)
	{
		if(person.getAge()>65 || (person.getGender().equalsIgnoreCase("Female")))
		{
			person.setTax(0);
			System.out.println("Tax not applicable");
		}else if(person.getIncome()<150000)
			{
				person.setTax(0);
				System.out.println("Not tax due to less income");
			}
			else if((person.getIncome()>=150000) && (person.getIncome()<500000))
				{
					person.setTax((person.getIncome()-150000)*(10/100));
					System.out.println("10% tax paid :" + person.getTax()+" ");
				}
			else if((person.getIncome()>=500000) && (person.getIncome()<800000))
			    {
				    person.setTax((person.getIncome()-500000)* 20/100 + 34000);
					System.out.println("20% tax paid :" + person.getTax()+" ");

			    }else {
			    	person.setTax((person.getIncome()-800000)* 30/100 + 95000);
					System.out.println("30% tax paid :" + person.getTax()+" ");

			    }
		
		}
}

