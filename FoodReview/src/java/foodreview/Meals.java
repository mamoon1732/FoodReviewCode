package foodreview;

public class Meals {
	
	String restaurantName;
	
	String mealName;
        
        String address;
        
        double price;
        
        String city;
	
	public Meals()	{
		
	}
	
	//getters
	public String getRestaurantName() {
            return restaurantName;
	}
	
	public String getMealName() {
            return mealName;
	}
        
        public String getAddress()  {
            return address;
        }
        
        public double getPrice()    {
            return price;
        }
        
        public String getCity() {
            return city;
        }
        
        //setters
        public void setRestaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
        }
        
        public void setMealName(String mealName) {
            this.mealName = mealName;
        }
        
        public void setAddress(String address)    {
            this.address = address;
        }
        
        public void setPrice(double price)  {
            this.price = price;
        }
        
        public void setCity(String city)    {
            this.city = city;
        }
        
        /*
         for (int x = 0; x < restaurantNames.size(); x++)
        {
            if (meal.getRestaurantName().equalsIgnoreCase(restaurantNames.get(x)))
            {
                %><img src="<%=restaurantNames.get(x)%>/<%=x + 1%>.jpg" alt="image of <%=restaurantNames.get(x)%>"><%
            }
        }
        
        %><img src="<%=meals.get(x)%>/<%=x + 1%>.jpg" alt="image of <%=meals.get(x)%>"><%

*/
        
}