package Mohokar.Dhananjay;

public class Product_Mohokar
{
	 private int catId;
     private int productId;
	 private String productName;
	 private String productDesc;
	 private float productPrice;
	 
	 public Product_Mohokar(int catId, int productId, String productName, String productDesc, float productPrice)
		{
			
			this.catId = catId;
			this.productId = productId;
			this.productName = productName;
			this.productDesc = productDesc;
			this.productPrice = productPrice;
		}
	 
	 

	
	 public int getCatId()
	{
		return catId;
	}


	public void setCatId(int catId)
	{
		this.catId = catId;
	}


	public int getProductId()
	{
		return productId;
	}


	public void setProductId(int productId)
	{
		this.productId = productId;
	}


	public String getProductName()
	{
		return productName;
	}


	public void setProductName(String productName)
	{
		this.productName = productName;
	}


	public String getProductDesc()
	{
		return productDesc;
	}


	public void setProductDesc(String productDesc)
	{
		this.productDesc = productDesc;
	}


	public float getProductPrice()
	{
		return productPrice;
	}


	public void setProductPrice(float productPrice)
	{
		this.productPrice = productPrice;
	}


	
	
}
