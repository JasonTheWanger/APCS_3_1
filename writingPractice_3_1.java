import java.util.*;
public class writingPractice_3_1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		mainMenu();

	}
	public static int randomInt(int n) {
		return ((int)(Math.random()*n+1));
	}
	public static void flipCoin(){
		int wins=0, losses=0;
		while(true) {
			String cpuStr="";
			System.out.println("Call heads or tails");
			String str=scan.next();
			int i = randomInt(2);
			if(i==1) {
				cpuStr="heads";
			}
			else if(i==2) {
				cpuStr="tails";
			}
			if(str.equals(cpuStr)) {
				System.out.println("Ok, I’m flipping the coin! I got: "+cpuStr+". You called it! ");
				wins++;
			}
			else {
				System.out.println("Ok, I’m flipping the coin! I got: "+cpuStr+". You did not call it!");
				losses++;
			}
			System.out.println("Your current stats are: "+ wins + " wins, "+ losses + " losses.");
			System.out.println("Do you want to play another game?");
			String again=scan.next();
			if(again.equals("n")||again.equals("no")) {
				break;
			}
		}
	}
	public static void rps(){
		int wins=0, losses=0, ties=0;
		while(true) {
			int x=0;
			String cpuStr="";
			System.out.println("Human, let’s battle an epic game of rock, paper, scissors! Your choice: ");
			String str = scan.next();
			if(str.equals("rock"))
				x=1;
			else if(str.equals("paper"))
				x=2;
			else if(str.equals("scissors"))
				x=3;
			int i = randomInt(3);
			if(i==1) {
				cpuStr="rock";
			}
			else if(i==2) {
				cpuStr="paper";
			}
			else if(i==3) {
				cpuStr="scissors";
			}
			if(str.equals(cpuStr)) {
				System.out.println("Ok, I chose "+cpuStr+"! You are just as good as me, human!");
				ties++;
			}
			else if(i==3&&x==2||i==2&&x==1||i==1&&x==3) {
				System.out.println("Ok, I chose "+cpuStr+"! Haha, you are no match for me, human!");
				losses++;
			}
			else if(x==3&&i==2||x==2&&i==1||x==1&&i==3) {
				System.out.println("Ok, I chose "+cpuStr+"! How come you beat me, human!");
				wins++;
			}
			System.out.println("Your current stats are: "+ wins + " wins, "+ losses + " losses, "+ ties + " ties.");
			System.out.println("Do you want to play another game?");
			String again=scan.next();
			if(again.equals("n")||again.equals("no")) {
				break;
			}
		}
	}
	public static void magic8Ball() {
		while(true) {
			System.out.println("Human, I can see into the FUTURE! Ask me a yes/no question:");
			scan.next();
			int i=randomInt(20);
			switch(i) {
				case 1:
					System.out.println("It is certain"); break;
				case 2:
					System.out.println("It is decidedly so"); break;
				case 3:
					System.out.println("Without a doubt"); break;
				case 4:
					System.out.println("Yes, definitely"); break;
				case 5:
					System.out.println("You may rely on it"); break;
				case 6:
					System.out.println("As I see it, yes"); break;
				case 7:
					System.out.println("Most likely"); break;
				case 8:
					System.out.println("Outlook good"); break;
				case 9:
					System.out.println("Yes"); break;
				case 10:
					System.out.println("Signs point to yes"); break;
				case 11:
					System.out.println("Reply hazy, try again"); break;
				case 12:
					System.out.println("Ask again later"); break;
				case 13:
					System.out.println("Better not tell you now"); break;
				case 14:
					System.out.println("Cannot predict now"); break;
				case 15:
					System.out.println("Concentrate and ask again"); break;
				case 16:
					System.out.println("Don’t count on it"); break;
				case 17:
					System.out.println("My reply is no"); break;
				case 18:
					System.out.println("My sources say no"); break;
				case 19:
					System.out.println("Outlook not so good"); break;
				case 20:
					System.out.println("Very doubtful"); break;
				default:
					System.out.println("I dont understand");
			}
			System.out.println("Do you have another question?");
			String str=scan.next();
			if(str.equals("n")||str.equals("no")) {
				break;
			}
		}
	}
	public static void diceRoller() {
		while(true) {
			System.out.println("Describe your die: ");
			String [] pair = scan.next().split("d");
			if(pair[1].equals("one"))
				break;
			int reps=Integer.parseInt(pair[0]);
			int type=Integer.parseInt(pair[1]);
			int sum=0;
			System.out.print("Your roll: ");
			for(int i=0; i<reps; i++) {
			int x = randomInt(type);
			sum+=x;
			System.out.print(x+", ");
			}
			System.out.println("Total = " + sum);
		}
	}
	public static void mainMenu() {
		while(true) {
			System.out.println("Welcome to the console carnival!");
			System.out.println("--------------------------------");
			System.out.println("Shall we play a game?");
			System.out.println("\n1. Flip Coin");
			System.out.println("2. Rock, Paper, Scissors");
			System.out.println("3. Magic 8 Ball");
			System.out.println("4. Dice Roller");
			System.out.println("5. Quit");
			System.out.println("What game do you want to play");
			int gameMode = scan.nextInt();
			if(gameMode==1) {
				flipCoin();
			}
			else if(gameMode==2) {
				rps();
			}
			else if(gameMode==3) {
				magic8Ball();
			}
			else if(gameMode==4) {
				diceRoller();
			}
			else if(gameMode==5) {
				System.out.println("Good-Bye");
				break;
			}
		}
	}
}
