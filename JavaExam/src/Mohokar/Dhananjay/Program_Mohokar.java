package Mohokar.Dhananjay;

import java.util.Scanner;
import java.util.Vector;

public class Program_Mohokar
{

	public static void main(String[] args)
	{
		final int ADD_DETAILS = 1;
		final int SHOW_DETAILS = 2;
		final int EXIT = 3;
		Vector<Product_Mohokar> objMohokar = new Vector<>();
		
		Scanner scanner =null;
		try {
				scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != EXIT) {
			System.out.println("1. Add Product Details\n2. Show All the Products\n3. EXIT ");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice)
			{
			case ADD_DETAILS: {
				System.out.println("---Add details of the product---");
				System.out.println("Enter Category ID Number : ");
				int catId = scanner.nextInt();
				System.out.println("Enter Product ID Number : ");
				int productId = scanner.nextInt();
				System.out.println("Enter Product Name : ");
				String productName = scanner.next();
				System.out.println("Enter Product Description");
				String productDescription = scanner.next();
				System.out.println("Enter the Price of the Product");
				float productPrice = scanner.nextFloat();

				Product_Mohokar objProduct_Mohokar = new Product_Mohokar(catId, productId, productName,
						productDescription, productPrice);
				objMohokar.add(objProduct_Mohokar);
			}
				break;

			case SHOW_DETAILS: {
				System.out.println("---Details of all the Products---");
				
				int productCounter = 0;
				Product_Mohokar objProduct_Mohokar = (Product_Mohokar) objMohokar.get(productCounter);
				try
				{
					while(objMohokar.get(productCounter)!=null)
					{
						System.out.println("Product number : "+(productCounter+1));
						System.out.println("Category ID : " + objProduct_Mohokar.getCatId());
						System.out.println("Product ID : " + objProduct_Mohokar.getProductId());
						System.out.println("Product Name : " + objProduct_Mohokar.getProductName());
						System.out.println("Product Description : " + objProduct_Mohokar.getProductDesc());
						System.out.println("Product Price : " + objProduct_Mohokar.getProductPrice()+"/-");
						productCounter++;
					}
				} catch (Exception e)
				{
					e.printStackTrace();
				}
				}
				break;
			case EXIT:
				System.exit(0);
					
				default:
					System.out.println("The Input is Invalid");
				

			}

			}
		
		}finally{
			if(scanner!=null) {
			scanner.close();
			}
			
			}

		}

	}
