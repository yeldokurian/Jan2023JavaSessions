package JavaBasics;

public class ArraysConcept {

	public static void main(String[] args) {

		String browsers[] = {"chrome", "firefox", "IE", "edge", "safari"};
		for(int k= 0; k<browsers.length; k++) {
//			
//			if(browsers[k].equals("chrome")) {
//				System.out.println("chrome browser is coming from Google");
//			}
//			if(browsers[k].equals("firefox")) {
//				System.out.println("firefox browser is coming for Mozilla");
//			}
//			if(browsers[k].equals("IE")) {
//				System.out.println("IE browser is coming from Microsoft and is deprecated");
//			}
//			if(browsers[k].equals("edge")) {
//				System.out.println("edge browser is coming from Microsoft");
//			}
//			if(browsers[k].equals("safai")) {
//				System.out.println("safari is coming form Apple");
//				
//			}
			switch (browsers[k]) {
			case "chrome":
			System.out.println("chrome is coming form Google");
			break;
			case "firefox":
				System.out.println("firefox is coming form Mozilla");
				break;
			case "IE":
				System.out.println("IE is coming form Microsoft and deprecated");
				break;
			case "edge":
				System.out.println("edge is coming form Microsoft");
				break;
			case "safari":
				System.out.println("safari is coming form Apple");
				break;
				
			default:
			break;
			
			}
		}
		
	}

}
