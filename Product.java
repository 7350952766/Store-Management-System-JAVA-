

class Product
{
	int id;
	String brandName;
	String productName;
	float price;
	String mfg_date;
	
	
	Product(){}
	
	Product(String brandName, String productName, float price, String mfg_date)
	{
		this.brandName = brandName;
		this.productName = productName;
		this.price = price;
		this.mfg_date = mfg_date;
	}
	
	int getId()
	{
		return id;
	}
	
	String getBrandName()
	{
		return brandName;
	}
	
	String getProductName()
	{
		return productName;
	}
	
	float getPrice()
	{
		return price;
	}
	
	String getMfg_date()
	{
		return mfg_date;
	}
}
