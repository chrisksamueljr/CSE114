package Inheritance;


// Extends is a Java Keyword used to indicate that one 
// class is inherited from member class.
// In our example, the NormalMember



public class NormalMember extends Member{
    
    public NormalMember() {
        System.out.println("Child constructor with no parameter");
    }
    
    public NormalMember(String pName, int pMemberID, int pMemberSince)
    {
	super(pName, pMemberID, pMemberSince);
	System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee()
    {
	annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }

}