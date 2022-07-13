package inheritance;

public class VIPCustomer extends Customer 
{
private int agentID;
double saleRatio;

public VIPCustomer(int customerID,String customerName, int agentID)
{
	super(customerID,customerName);
	customerGrade = "VIP";
	bonusRatio = 0.05;
	saleRatio = 0.1;
	this.agentID = agentID;
	System.out.println("VIPCustomer() 생성자 호출"); //하위 클래스 생성할 때 콘솔 출력문
}

@Override
public int calcPrice(int price)
{
	bonusPoint += price * bonusRatio;
	return price - (int)(price * saleRatio);	//할인된 가격을 계산하여 반환
}

public int getAgentID()
{
	return agentID;
}
}
