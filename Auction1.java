
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Auction1
{	
	public static void main(String[] args) throws IOException 
	{       
		Bidder [] b;
		
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		String line=in.readLine();
		//System.out.println(line);
		
		
			//Scanner sn= new Scanner(System.in);
				//System.out.println("enter the player name");
			//String players=	sn.next();
			Player p1=new Player(line);
			
			
			//System.out.println("enter the number of bidders");
			
			 line=in.readLine();
			//System.out.println(line);
			int bnum=Integer.parseInt(line);
			b= new Bidder[bnum];
			
			for(int i=0;i<bnum;i++)
			{
				//System.out.println("enter the bidder id and amount");
				line=in.readLine();
				String[] arr=line.split(",");
				int bidderid=Integer.parseInt(arr[0]);
				int amount=Integer.parseInt(arr[1]);
			Bidder	bm=  new Bidder(bidderid,amount,p1);
		     	
			b[i]=bm;
			}
			for(int i=0;i<b.length;i++){
				Bidder bm=b[i];
				p1.attach(bm);
			}
			//System.out.println("enter the number of bidders intrested in the player");
             int ibnum=Integer.parseInt(in.readLine());
             p1.count(ibnum);
             int ibn=ibnum-1;
             for(int i=0;i<ibn;i++)
             {
 				//System.out.println("enter the bidder id and bidding amount");
            	 line=in.readLine();
 				String[] arr=line.split(",");
 				int bidderid=Integer.parseInt(arr[0]);
 				int bamount=Integer.parseInt(arr[1]);
 				p1.setBidderAndPrice(bidderid, bamount);
 				
             }
            // System.out.println("enter the bidder id and bidding amount");
             line=in.readLine();
				String[] arr=line.split(",");
				int bidderid=Integer.parseInt(arr[0]);
				int bamount=Integer.parseInt(arr[1]);
		p1.setBidderAndPrice(bidderid, bamount);
}}
				
