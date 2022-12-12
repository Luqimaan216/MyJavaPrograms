import java.util.Scanner;

public class PostageCosts {
	
	public static void main(String [] args) {
		String length;
		String width;
		String depth;
		String weight;
		String postType = null;
		boolean validation;
		String deliveryType;
		float cost = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to royal mail package and letter quotation system");
		System.out.println("");
		System.out.println("What is the length of your package in cm?");
		length = in.nextLine();
		System.out.println("What is the width if your package in cm?");
		width = in.nextLine();
		System.out.println("What is the thickeness/depth of your package in cm?");
		depth = in.nextLine();
		System.out.println("What is the weight of your package in grams?");
		weight = in.nextLine(); 
		if (Float.parseFloat(length)<=24 && Float.parseFloat(width)<=16.5 && Float.parseFloat(depth)<=0.5 && Float.parseFloat(weight)<=100) {
			postType = "Normal Sized Letter";
			validation = true;
		}
		else if (Float.parseFloat(length)<=35.3 && Float.parseFloat(width)<=25 && Float.parseFloat(length)>24 && Float.parseFloat(width)>16.5 && Float.parseFloat(depth)<=2.5 && Float.parseFloat(weight)<=750 && Float.parseFloat(weight)>100) {
			postType = "Large Letter";
			validation = true;
		}
		else if (Float.parseFloat(length)<=45 && Float.parseFloat(width)<=35 && Float.parseFloat(length)>35.3 && Float.parseFloat(width)>25 && Float.parseFloat(depth)<=16 && Float.parseFloat(weight)<=2000 && Float.parseFloat(weight)>750) {
			postType = "Small Parcel";
			validation = true;
		}
		else if (Float.parseFloat(length)<=61 && Float.parseFloat(width)<=46 && Float.parseFloat(length)>45 && Float.parseFloat(width)>35 && Float.parseFloat(depth)<=46 && Float.parseFloat(weight)<=20000 && Float.parseFloat(weight)>2000) {
			postType = "Medium Parcel";
			validation = true;
		}
		else if (Float.parseFloat(length)<=2500 && (Float.parseFloat(width)+Float.parseFloat(depth)<=5000) && Float.parseFloat(length)>61 && Float.parseFloat(width)>46 && Float.parseFloat(weight)<=30000 && Float.parseFloat(weight)>20000) {
			postType = "Large Parcel";
			validation = true;
		}
		else {
			System.out.println("Sorry we do not provide services for that size of letter or parcel");
			validation = false;
		}
		
		if (validation = true) {
			System.out.println("Your parcel type is "+ postType);
			System.out.println("Would you like first class or second class delivery? ('1' for first, '2' for second)");
			deliveryType = in.nextLine();
			if(deliveryType.equals("1")) {
				if(postType.equals("Normal Sized Letter") && Integer.parseInt(weight)<=100) {
					cost = 0.67f;
					validation = true;
				}
				else if(postType.equals("Large Letter") && Integer.parseInt(weight)<=100) {
					cost = 1.01f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=250 && Integer.parseInt(weight)>100) {
					cost = 1.4f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=500 && Integer.parseInt(weight)>250) {
					cost = 1.87f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=750 && Integer.parseInt(weight)>500) {
					cost = 2.6f;
					validation = true;
				}
				else if(postType.equals("Small Parcel") && Integer.parseInt(weight)<=1000 && Integer.parseInt(weight)>750) {
					cost = 3.45f;
					validation = true;
				}
				else if(postType.equals("Small Parcel") && Integer.parseInt(weight)<=2000 && Integer.parseInt(weight)>1000) {
					cost = 5.5f;
					validation = true;
				}
				else if(postType.equals("Medium Parcel") && Integer.parseInt(weight)<=1000 && Integer.parseInt(weight)>750) {
					cost = 5.75f;
					validation = true;
				}
				else if(postType.equals("Medium Parcel") && Integer.parseInt(weight)<=2000 && Integer.parseInt(weight)>1000) {
					cost = 8.95f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=5000 && Integer.parseInt(weight)>2000) {
					cost = 15.85f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=10000 && Integer.parseInt(weight)>5000) {
					cost = 21.9f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=20000 && Integer.parseInt(weight)>10000) {
					cost = 33.4f;
					validation = true;
				}
				else {
					validation = false;
					System.out.println("Oops, an error has occurred!");
				}
				
				
			}
			else if (deliveryType.equals("2")) {
				if(postType.equals("Normal Sized Letter") && Integer.parseInt(weight)<=100) {
					cost = 0.58f;
					validation = true;
				}
				else if(postType.equals("Large Letter") && Integer.parseInt(weight)<=100) {
					cost = 0.79f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=250 && Integer.parseInt(weight)>100) {
					cost = 1.26f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=500 && Integer.parseInt(weight)>250) {
					cost = 1.64f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=750 && Integer.parseInt(weight)>500) {
					cost = 2.22f;
					validation = true;
				}
				else if(postType.equals("Small Parcel") && Integer.parseInt(weight)<=1000 && Integer.parseInt(weight)>750) {
					cost = 2.95f;
					validation = true;
				}
				else if(postType.equals("Small Parcel") && Integer.parseInt(weight)<=2000 && Integer.parseInt(weight)>1000) {
					cost = 2.95f;
					validation = true;
				}
				else if(postType.equals("Medium Parcel") && Integer.parseInt(weight)<=1000 && Integer.parseInt(weight)>750) {
					cost = 5.05f;
					validation = true;
				}
				else if(postType.equals("Medium Parcel") && Integer.parseInt(weight)<=2000 && Integer.parseInt(weight)>1000) {
					cost = 5.05f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=5000 && Integer.parseInt(weight)>2000) {
					cost = 13.75f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=10000 && Integer.parseInt(weight)>5000) {
					cost = 20.25f;
					validation = true;
				}
				else if(Integer.parseInt(weight)<=20000 && Integer.parseInt(weight)>10000) {
					cost = 28.55f;
					validation = true;
				}
				else {
					validation = false;
					System.out.println("Oops, an error has occurred!");
				}}
		else {
				System.out.println("Oops, some kind of error has occcurred!");	
			}
			
			if(validation = true) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("Calculating cost...");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("Your parcel type is "+ postType+" and it will cost you £"+ cost+" to have it delivered");
			}
			}
		}
		
	}

