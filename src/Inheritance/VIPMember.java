package Inheritance;


public class VIPMember extends Member {
	
    public VIPMember(String parentName, int parentMemberID, int parentMemberSince)
    {
	super(parentName, parentMemberID, parentMemberSince);
	System.out.println("Child Constructor with 3 parameters");
    } 

    @Override
    public void calculateAnnualFee()
    {
    	annualFee = (1-0.01*getDiscount())*1200;
    }    
}
