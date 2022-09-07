package week02;

public class StringParsing {

	public static void main(String[] args) {
		String strr = "mj.notion.com";
		//잘못된 사용예씨
		String[] strAry = strr.split("\\.");

		for (String s : strAry)
			System.out.println(s);	
		
		String ipv6 = "fe80::bda7:2e2:a235:8f98";
		String[] octets = ipv6.split(":");

		for (int cnt =1; cnt<= octets.length; cnt++ )
			System.out.println(cnt + "번째옥탯:" + octets[cnt-1]);
	
		String tel = "02-123-4567";
		String area_nbr = tel.split("-")[0];
	    System.out.println(area_nbr);
	    
		String mail = "hello-kitty@hellokitty.com";
		String[] strArr = mail.split("-|@|\\.");

		for (String s : strArr)
			System.out.println(s);
		
		String str = "123::4:67:10::::";
		String[] noLimit = str.split(":");
		String[] limitTwo = str.split(":", 2);
		String[] limitPlus = str.split(":", 7);
		String[] limitZero = str.split(":", 0);
		String[] limitMinus = str.split(":", -1);

		System.out.println("-----noLimit-----");
		for (int cnt =0; cnt< noLimit.length; cnt++ )
			System.out.println(cnt + "위치:" + noLimit[cnt]);

		System.out.println("-----limitTwo-----");
		for (int cnt =0; cnt< limitTwo.length; cnt++ )
			System.out.println(cnt + "위치:" + limitTwo[cnt]);

		System.out.println("-----limitPlus-----");
		for (int cnt =0; cnt< limitPlus.length; cnt++ )
			System.out.println(cnt + "위치:" + limitPlus[cnt]);

		System.out.println("-----limitZero-----");
		for (int cnt =0; cnt< limitZero.length; cnt++ )
			System.out.println(cnt + "위치:" + limitZero[cnt]);

		System.out.println("-----limitMinus-----");
		for (int cnt =0; cnt< limitMinus.length; cnt++ )
			System.out.println(cnt + "위치:" + limitMinus[cnt]);
	}
}
