package project;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Project {
	static Scanner sc=new Scanner(System.in);
	static void multiFloorHostel() 
	{
		System.out.println("-------------------------------------------------------------------");
	    System.out.println("           ______________________");
	    System.out.println("          |  SRAVANTHI HOSTEL   |");
	    System.out.println("  ________|_____________________|________");
	    System.out.println(" |   Room 301  |   Room 302  |  Room 303 |");
	    System.out.println(" |_____________|_____________|___________|");
	    System.out.println(" |   Room 201  |   Room 202  |  Room 203 |");
	    System.out.println(" |_____________|_____________|___________|");
	    System.out.println(" |   Room 101  |   Room 102  |  Room 103 |");
	    System.out.println(" |_____________|_____________|___________|");
	    System.out.println(" |   Mess      |   Visitors  |   Office  |");
	    System.out.println(" |_____________|_____________|___________|");
	   System.out.println("-------------------------------------------------------------------");
	}

	void meth1()
	{
		System.out.println("-------------------------------Welcome to Sravanthi Ladies Hostel-----------------------------------------");
		System.out.println("Please Enter Below Details");
		System.out.println("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println("Enter Your Contact Number:");
		String contact=sc.nextLine();
		System.out.println("Enter Your Email Id:");
		String email=sc.nextLine();
		
		// Displaying the Student Details...
		System.out.println("Hello "+name);
		System.out.println("Welcome to SRAVANTHI HOSTEL");
		System.out.println("Your Registered Student Name:"+name);
		System.out.println("Your Contact Number:"+contact);
		System.out.println("Your Email Id:"+email);
		
		
	
		// Room Allotment for Registered Students...
		 //Displaying the Options
	    System.out.println("select room type");
		System.out.println("1. One Sharing");
		System.out.println("2. Two Sharing");
		System.out.println("3. Three Sharing");
		System.out.println("4. Four Sharing");
		System.out.println("5. Five Sharing");
	    System.out.println("6. Six Sharing");
	    System.out.println("Choose Your Option in Between 1 and 6");
	    

		int roomtype=sc.nextInt();
		switch(roomtype) 
		{   
		    case 1:
			System.out.println("You Selected 1 Sharing");
			break;
		    case 2:
			System.out.println("You Selected 2 Sharing");
			break;
		    case 3:
			System.out.println("You Selected 3 Sharing");
			break;
		    case 4:
		    System.out.println("You Selected 4 Sharing");
		    break;
		    case 5:
			System.out.println("You Selected 5 Sharing");
			break;
		    case 6:
			System.out.println("You Selected 6 Sharing");
			default:
				System.out.println("Invalid Number! Choose in blw 1-6");
			    
	
		}	
		String status="available";
		if(status.equals("available"))
		{
			System.out.println("the room is available");
			
		}
		else
		{
			System.out.println("the room is not available");
			System.out.println("please try another type or contact admin");
			
		}
		//Menu Management
		
		System.out.println("====================MENU OF THE WEEK=======================");
		System.out.println("Day           - Tiffin    Lunch     Dinner");
        System.out.println("1.Monday      - Idli      Dal       Chapathi+rice");
        System.out.println("2.Tuesday     - Bonda     Cabbage   Drumstick+Tomato");
        System.out.println("3.Wednesday   - Idli      Rice      Sambar");
        System.out.println("4.Thursday    - Pulihora  Dal       Curry");
        System.out.println("5.Friday      - Puri      Curry     Rice");
        System.out.println("6.Saturday    - Utappa    Rice      Fry");
        System.out.println("7.Sunday      - Upma      Special   Special");
        
        System.out.println("You have Any Complaints to register(Yes/No)??");
        RegisterComplaint();
        
        
        
        studentName=name;
		roomtype=sc.nextInt();
		
		}
		static void RegisterComplaint()
		{
			Scanner sc=new Scanner(System.in);
		
			String choice=sc.nextLine();
			if(choice.equals("yes"))
			{
				System.out.println("Choose Complaint Type");
				System.out.println("1.Food Quality");
				System.out.println("2.Power");
				System.out.println("3.Wifi");
				System.out.println("4.Water");
				System.out.println("5.Other");
				System.out.println("Select ur choice in between 1-5");
				int type=sc.nextInt();
				sc.nextLine();
				String typeNext;
			    switch(type)
				{
				case 1:
					typeNext="Food Quality";
					break;
				case 2:
					typeNext="Power";
					break;
				case 3:
					typeNext="Wi-fi";
					break;
				case 4:
					typeNext="Water";
					break;
				case 5:
					typeNext="Other";
					break;
				default:
						typeNext="Invalid";
				
				
				}
			    if (!typeNext.equals("Invalid")) 
			    {
		            System.out.println("Your complaint regarding " + typeNext + " has been registered. Thank you!");
		        }
			    else
			    {
		            System.out.println("Invalid complaint type selected.");
		        }
		    } 
			else
			{
		        System.out.println("No complaint registered.");
		    }
			
			System.out.println("====Visitors Entry=====");
			System.out.println("Do You Want to Visit(Yes/No)");
			//String choice=sc.nextLine();
		
			VisitorsEntry();
			}
		static void VisitorsEntry()
		{
		//System.out.println("====Visitors Entry=====");
		//System.out.println("Do You Want to Visit(Yes/No)");
		String choice=sc.nextLine();
		
		if(choice.equalsIgnoreCase("yes")) 
		{
			System.out.println("Enter Your Name ");
			String name=sc.nextLine();
			System.out.println("Enter Your Contact Number ");
			int con=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Purpose to Visit");
			String purpose=sc.nextLine();
			
			 LocalDateTime now = LocalDateTime.now();
		     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		     String dateTime = now.format(formatter);
		     
		     
		     System.out.println("------Visitor Registered Successfully-----");
		     System.out.println("Visitor Name:"+name);
             System.out.println("Contact Number:"+con);
		     System.out.println("Purpose:"+purpose);
		     System.out.println("Date and Time of Entry:"+dateTime);
		     }
		 else
		     {
		
		     System.out.println("No Visitor entry registered");
		     }
		}
		static int roomtype;
		static String studentName;
		static void MonthlyFee(int roomtype,String studentName)
		{   
			Scanner sc=new Scanner(System.in);
			int[] fees= {7000,6500,6000,5500,5000,4500};
			
			if(roomtype>=1 && roomtype<=6)
			{
				int amount=fees[roomtype-1];
				System.out.println("-----Monthly Payment-----");
				System.out.println("Student Name:"+studentName);
				System.out.println("Selected Room type "+roomtype+"sharing");
				System.out.println("Monthly Fee:"+amount);
			    System.out.println("Do you want to Pay Now(Yes/No)");
			    
			    
				 sc.nextLine();
				 String choice=sc.nextLine();
				  if(choice.equalsIgnoreCase("Yes"))
				  {
					  System.out.println("Enter Your Choice");
					  System.out.println("1.Phone Pay");
					  System.out.println("2. Google Pay");
					  System.out.println("3.Net Cash");
					  
					  int payOption=sc.nextInt();
					  sc.nextLine();
					   
					  String method="";
					  switch(payOption)
					  {
					  case 1:method="Phone Pay";
						  break;
					  case 2:
						  method="Google Pay";
						  break;
					  case 3:
						  method="Net Cash";
						  break;
						  default: method="Invalid";
						  break;
						  
					  }
					  if(!method.equals("Invalid"))
					  {
					  System.out.println("Processing payment through"+method+"....");
					  System.out.println("Payment of ₹" +amount+ "completed Successfully");
					  }
					  
					  else
					  {
						  System.out.println("Invalid Payment method.Payment not proceeded");
					  }
					  
					  }
					  else
					  {
						  System.out.println("Payment is Pending...");
						 
					  }
				  } else
				  {
					  System.out.println("Invalid room type. cannot calculate fee");
				  }
			}
		static void Feedback()
		{
		    System.out.println("Would you like to provide feedback? (Yes/No)");
		    String choice = sc.nextLine();
		    
		    if (choice.equalsIgnoreCase("Yes"))
		    {
		        System.out.println("Please rate your experience (1 to 5 stars):");
		        int rating = sc.nextInt();
		        sc.nextLine(); //consume leftover newline
		        
		        if (rating < 1 || rating > 5) 
		        {
		            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
		        }
		        else
		        {
		            System.out.println("Thank you! You rated us: " + rating + " star(s).");
		        }

		        System.out.println("Any additional comments?");
		        String comments = sc.nextLine();

		        System.out.println("Thank you for your valuable feedback!");
		        System.out.println("-----Feedback Summary-----");
		        System.out.println("Rating: " + rating + " star(s)");
		        System.out.println("Comments: " + comments);
		    } 
		    else 
		    {
		        System.out.println("No feedback provided.");
		    }
		}

	
	
			
	public static void main(String[] args)
	{
		Project p=new Project();
		multiFloorHostel();
		p.meth1();
		
		sc.nextLine();
		
		RegisterComplaint();
		VisitorsEntry();
		MonthlyFee(roomtype,studentName);
		Feedback();
	
}
}