package toWeirdCase;

public class ToWeirdCase {

	public String toWeirdCase(String str) {
		
		String[] strArray = str.split("\\s");
		String result = "";
		
		for (int i = 0; i < strArray[0].length(); i++) {

			if(i %  2 == 0)
				result += Character.toUpperCase(strArray[0].charAt(i))+"";
			else
				result+= Character.toLowerCase(strArray[0].charAt(i))+"";
			
		}
		
		if(strArray.length == 1)
			return result;

		return result+ " " + toWeirdCase(str.substring(strArray[0].length()+1));
	}

	public static void main(String[] args) {

		ToWeirdCase twc = new ToWeirdCase();

		System.out.println(twc.toWeirdCase("hello world"));
		System.out.println(twc.toWeirdCase("The Hypertext Transfer Protocol (HTTP) is an application protocol for distributed, collaborative, and hypermedia information systems.[1] HTTP is the foundation of data communication for the World Wide Web."));
		System.out.println(twc.toWeirdCase("A later version, the successor HTTP/2, was standardized in 2015, and is now supported by major web servers and browsers over TLS using ALPN extension[2] where TLS 1.2 or newer is required."));
	}
}
