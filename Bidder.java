
public  class Bidder extends Observer {
private  int bidderId,budget;private Player p;Bidder b;int biddingamount;int a[];int id;
 
	public Bidder(int bidderid2, int amount, Player p1) {
		// TODO Auto-generated constructor stub
		this.bidderId=bidderid2;
    	this.budget=amount;this.p=p1;
      
	}
	  
	
    @Override  
	public void updateBidding() {
		// TODO Auto-generated method stub
    	 a=p.getBidderAndPrice();
    	 
         this.biddingamount=a[1];
         System.out.println(bidderId+":"+"["+a[0]+","+biddingamount+"]");
	}

	@Override
	public void updateFinalDeal() {
		// TODO Auto-generated method stub
		a=p.getBidderAndPrice();
        this.biddingamount=a[1];
        id=a[0];
        if(id==bidderId)
        	   System.out.println(bidderId+":"+"["+(budget-biddingamount)+","+id+"]");
        	
        else
        	System.out.println(bidderId+":"+"["+(budget-10)+","+id+"]");
		
	}

}
