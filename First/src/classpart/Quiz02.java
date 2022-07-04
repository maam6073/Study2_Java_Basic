package classpart;

public class Quiz02 
{
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String productNum;
	String address;
	
	public void getOrderInfo()
	{
		System.out.println("주문번호 : "+orderNum);
		System.out.println("주문ID : "+orderId);
		System.out.println("주문날짜 : "+orderDate);
		System.out.println("주문자 : "+orderName);
		System.out.println("상품번호 : "+productNum);
		System.out.println("배송주소 : "+address);
	}
	public static void main(String[] args)
	{
		Quiz02 order1 = new Quiz02();
		order1.orderNum = 201803120001L;
		order1.orderId = "abc123";
		order1.orderDate = "2018년 3월 12일";
		order1.orderName = "홍길순";
		order1.productNum = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		order1.getOrderInfo();
	}
}
