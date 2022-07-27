
public class Main {
	public static void main(String[] args) {
		final Display display1 = new StringDisplay("hello");
		final Display display2 = new SideBorder(display1 , '@');
		final Display display3 = new FullBorder(display2);
		
		display1.show();
		display2.show();
		display3.show();
		
		final Display display4 = new SideBorder(
										new FullBorder(
												new FullBorder(
														new SideBorder(
																new FullBorder(
																		new StringDisplay("Hello")
																		),
																'*'
																)
														)
												),
											'*'
										);
		display4.show();
	}

}
