package quiz_q5;

public class Cafe 
{
	String cafeName;
	String cafeMenu;
	int cafeCount;
	int menuPrice;
	int money;
	
	
	Cafe(String cafeName,String cafeMenu , int price)
	{
		this.cafeName = cafeName;
		this.cafeMenu = cafeMenu;
		this.menuPrice = price;
	}
	
	public int getMenuPrice()
	{
		return menuPrice;
	}
	
	public void Sell()
	{
		money += menuPrice;
	}
	
	public void showInfo()
	{
		System.out.println(cafeName +"의 메뉴명은" +cafeMenu +"이고" +"가격은 "+ menuPrice+"입니다.");
	}
}
