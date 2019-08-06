package test;

public class ExtendsTestMain {
	public static void main(String[] args) {
		BusinessMan bMan = new BusinessMan("김성림", "카카오", "프로그래머");
		
		// bMan.name = "ㄴㅇㄴ";
		bMan.tellYourName();
		bMan.tellYourInfo();
		
		Man man = new Man("tester");
		man.toString();
	}
}
