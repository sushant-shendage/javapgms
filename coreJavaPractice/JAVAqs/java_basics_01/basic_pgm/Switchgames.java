import java.util.Scanner;
import java.util.Random;
class Switchgames
{
	public static void main(String[] args) 
	{
		int count1=0;
		int userScore=0;
		int computerScore=0;

		System.out.println("[code]	[Game name]		    ");
		System.out.println("[1]	    Snake and ladder		");
		System.out.println("[2]   	Numberguessing		");
		System.out.println("[3]     Snake,water,sessor		");


		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter game code	to play	game.");
			int	switchVar=sc.nextInt();


		while(switchVar!=10)
		{
			System.out.println("Enter game code	to play	game.");
			switchVar=sc.nextInt();
			

				switch(switchVar)
				{
					case 1:
					{
						
						//System.out.println("case1");
						{

							System.out.println("Welcome to snake and ladder game");
							Random rnum=new Random();
							
							int rnum1=rnum.nextInt(6);
							System.out.println("rnum1  :"+rnum1);

							int rnum2=rnum.nextInt(6);
							System.out.println("rnum2  :"+rnum2);

							count1++;
							System.out.println("count1 :"+count1);

							 userScore=userScore+rnum1;
							 computerScore=computerScore+rnum2;

							 if(userScore>100 || computerScore>100 )
								{
									if(userScore>100  )
								{
									userScore=userScore-rnum1;
								}
									else if (computerScore>100)
									{
										computerScore=computerScore-rnum2;
									}
								}
							
							System.out.println("Your score     :"+userScore);
							System.out.println("Computer score :"+computerScore);

							if(computerScore==100 || userScore==100 )
							{
								if(userScore==100  )
								{
									System.out.println("You win the game");
									break;
								}
									else if (computerScore==100)
									{
										System.out.println("Computer win the game");
										break;
									}
									int play=sc.nextInt();
							}
							
							


						}
						
						break;
					}
					case 2:
					{
						System.out.println("case2");
						break;
					}
					case 3:
					{
						System.out.println("case3");
						break;
					}
					default:
					{
						System.out.println("Enter valid	code");
						break;
					}
					
				}

        }
		System.out.println("App closed");
     }	
 }
