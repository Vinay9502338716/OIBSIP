import java.util.*;
class OnlineExam
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("user1",1212);
		info.put("user2",2323);
		info.put("user3",3434);
		info.put("user4",4545);
		info.put("user5",5656);
		String id;
		int pwd;
		System.out.println("Login to your account!");
		System.out.println("Enter your user ID:");
		id = sc.next();
		System.out.println("Enter your password:");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrest user ID or password!\nTry again!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter your choice:");
		System.out.println("1.Update profile \n2.Start exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid operation!");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter your username:");
		update_id = sc.next();
		System.out.println("Enter your old password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter new password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password reset successfully!");
		}
		else
		{
			System.out.println("User record not found!\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		System.out.println("Instructions:");
		System.out.println("1. There are 5 questions in this exam");
		System.out.println("2. All questions are compulsory");
		System.out.println("3. For each correct answer you will get 5 marks");
		System.out.println("4. For each wrong answer 1 mark will be reduced from your obtained marks");
		System.out.println("5. Time limit to complete the exam is 5 minutes");
		System.out.println("\n All The Best!\n");
		System.out.println("*********************Exam has started*********************");
		System.out.println("*********************Java Examination*********************");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.Which of the following option leads to the portability and security of Java?");
			System.out.println("1.Bytecode is executed by JVM \t2.The applet makes the Java code secure and portable \t3.Use of exception handling\t4.Dynamic binding between objects");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.Which of the following is not a Java features?");
			System.out.println("1.Dynamic\t2.Architecture Neutral\t3.Use of pointers\t4.Object-oriented");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.The \u0021 article referred to as a");
			System.out.println("1.Unicode escape sequence\t2.Octal escape\t3.Hexadecimal\t4.Line feed");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4._____ is used to find and fix bugs in the Java programs.");
			System.out.println("1.JVM\t2.JRE\t3.JDK\t4.JDB");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.What is the return type of the hashCode() method in the Object class?");
			System.out.println("1.Object\t2.int\t3.long\t4.void");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("Your exam has ended.");
		System.out.println();
		System.out.println("Your score is "+score);
		if(score>10)
			System.out.println("Congratulations!");
		else
			System.out.println("Better Luck Next Time!");
	}
	public static void main(String args[])
	{
		OnlineExam obj = new OnlineExam();
		obj.login();
	}
}