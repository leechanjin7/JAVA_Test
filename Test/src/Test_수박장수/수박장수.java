package Test_수박장수;


class Buyer{
	private int MyMoney;
	private int WMCnt;
	
	
	public Buyer(int myMoney, int wmCnt) {
		MyMoney = myMoney;
		WMCnt = wmCnt;
	}
	
	public void Payment(Seller seller,int money )
	{
		//1 MyMoney에서 money만큼 차감
		MyMoney-=money;
		//2 seller에게 money전달,//3 seller로부터 사과개수받기
		int cnt= seller.Receive(money);
		//4 사과개수를 멤버인 AppleCnt 누적
		WMCnt+=cnt;
	}
	public void ShowInfo() {
		//속성 정보를 Console에 출력
		System.out.println("-----구매자정보-----");
		System.out.println("-Buyer-");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("수박 개수 : "+ WMCnt);
	}
}

class Seller{
	private int MyMoney;
	private int WMCnt;
	public int Price;
	
	public Seller(int myMoney, int wmCnt, int price) {
		MyMoney = myMoney;
		WMCnt = wmCnt;
		Price = price;
	}
	public int Receive(int money) {
		//1 money 를 MyMoney 에 누적
		MyMoney+=money;
		//2 money 에 해당되는 만큼 사과개수를 계산
		int revcnt=money/Price;
		//2 AppleCnt에서 계산된 만큼의 사과개수를 차감
		WMCnt-=revcnt;
		//3 계산된 사과개수를 리턴
		return revcnt;
	}
	public void ShowInfo() {
		//속성 정보를 Console에 출력
		System.out.println("-----판매자정보-----");
		System.out.println("보유 금액 : "+ MyMoney);
		System.out.println("수박 개수 : "+ WMCnt);
		System.out.println("개당 가격 : "+ Price);

	}
}

public class 수박장수 {

	public static void main(String[] args) {
		
		Seller 수박장수 = new Seller(100000,100,1000);//보유금액,사과개수,개당가격
		Buyer 이찬진 = new Buyer(10000,0);	//보유금액,사과개수
		Buyer 전찬식 = new Buyer(20000,0);
		Buyer 권일근 = new Buyer(30000,0);
		Buyer 정미르 = new Buyer(40000,0);
		
		이찬진.Payment(수박장수, 2000);
		수박장수.ShowInfo();
		이찬진.ShowInfo();
		
		전찬식.Payment(수박장수, 3000);
		전찬식.ShowInfo();
		
		권일근.Payment(수박장수, 4000);
		권일근.ShowInfo();
		
		정미르.Payment(수박장수, 5000);
		정미르.ShowInfo();
		
	}

}



