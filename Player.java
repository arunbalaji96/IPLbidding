
public class Player {
	private String name;private int biddingPrice,bidderId,bidders,bidderCount;Bidder []b=new Bidder [200] ;int i=0;
	int j=0;
	public Player(String name){
		this.name=name;
		}
	  public void attach( Bidder o ){
		  b[i]=o;i++;
	  }
	  public void count(int c){
		  this.bidderCount=c;System.out.println("bidding starts for player"+" "+name);
	  }
	   public void setBidderAndPrice(int bidderId, int biddingPrice){
		   j++;
		   this.bidderId=bidderId;this.biddingPrice=biddingPrice;
		  if(j<bidderCount)
		  notifyBidding();
		  else 
			  notifyDeal();
	   }
 public int [] getBidderAndPrice(){
		   int a[] = new int[30];
		   a[0]=bidderId;
		   a[1]=biddingPrice;
		 return  a; 
	  
		   
	   }
	   public void completeDeal(int bidderId, int biddingPrice){
		   
		   
	   }
	   private void notifyBidding(){
		   for(int a=0;a<i;a++){
			   Bidder bm=b[a];
			  bm.updateBidding();
			   
		   }
		   
		   System.out.println(" ");
		   
	   }
	   private void notifyDeal(){
		   System.out.println("Bid Winner");
		   for(int a=0;a<i;a++){
			   Bidder bm=b[a];
			  bm.updateFinalDeal();}
		   System.out.println(" ");
	   }
	   
	}


