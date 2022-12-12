
public class TenGreenBottles {
	
	public static void main(String [] args) {
		
		for(int i = 10; i > 0; i = i - 1) {
			System.out.print(i+" green bottles hanging on the wall \n");	
			System.out.println(i+" green bottles hanging on the wall");
			System.out.println("And if 1 green bottle was to accidentally fall");
			System.out.println("There'll be "+(i-1)+" green bottles hanging on the wall");
			System.out.println("");
		}
	}

}
