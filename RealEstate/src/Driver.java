import java.util.Scanner;
import java.io.*;

public class Driver {

	public static void main(String[] args) {
		System.out.println("----------Real Estate Association of Jamaica----------");
		Scanner in = new Scanner(System.in);
		
		House houses[] = new House[3];
		String image_name;
		int image_size;
		Photo new_image = new Photo();
		
		for(House house: houses) {
			house = new House();
			System.out.println("Please Enter id \n");
			house.setId(in.nextInt());
			System.out.println("Please Enter price \n");
			house.setPrice(in.nextFloat());
			System.out.println("Please Enter location \n");
			house.setLocation(in.next());
			System.out.println("Please Enter advertiser \n");
			house.setAdvertiser(in.next());
			System.out.println("Please Enter image name and size \n");
			image_name = in.next();
			image_size = in.nextInt();
			new_image = new Photo(image_name, image_size);
			
			try {
				FileWriter file = new FileWriter("houses.text", true);
				file.write(house.getId() + "\t" + house.getPrice() + "\t" + house.getLocation() + "\t" + house.getAdvertiser() + "\t" + new_image + "\r\n");
				file.close();
			}
			catch(IOException e) {
				e.getMessage();
			}
			
		}
		
		
		in.close();

	}

}
