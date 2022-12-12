
public class EvenNumbers {
	
	public static void main(String [] args) {
		int a;
		a = 0;
		for(int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
			a = a + i;
		}
		System.out.println("All these numbers added together give: "+a);
	}

}
