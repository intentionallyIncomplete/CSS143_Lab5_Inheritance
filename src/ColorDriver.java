public class ColorDriver {

	public static void main(String[] args) {
		testColorWithAlpha();
	}

	public static void testColorWithAlpha() {
		ColorWithAlpha a = new ColorWithAlpha(50);
		ColorWithAlpha b = new ColorWithAlpha(100,100,100,150);
		ColorWithAlpha c = new ColorWithAlpha(b);

		System.out.println( "a includes --> " + a);
		System.out.println( "\nb includes --> " + b.toString());
		System.out.println( "\nc includes --> " + c.toString());

		System.out.println("\na equals c: " + a.equals(c));
		System.out.println("\nb equals c: " + b.equals(c));


		//try some bad alpha values for exception handling
//		try {
//			c.setR(300);
//			c.setG(300);
//			c.setB(300);
//		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
