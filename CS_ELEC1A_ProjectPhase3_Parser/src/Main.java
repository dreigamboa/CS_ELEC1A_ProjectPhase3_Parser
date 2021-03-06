import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
	public static int count=0;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LexAnalyzer.mainCall();
		File in=new File("src/in2.txt");
		Scanner sc=new Scanner(in);
		Scanner counter=new Scanner(in);
		while(counter.hasNext()){
			counter.nextLine();
			count++;
		}
		counter.close();
		String s=sc.next();
		if(s.contains("GAME")){
			if(GameSimulation(sc));
		}else{
			if(ProblemSimulation(sc,s));
		}
	}
	
	public static boolean GameSimulation(Scanner sc){
		System.out.println("GAMEPLAY\n|");
		System.out.println("---------------------------------------------------------");
		System.out.println("|		|		|			|");
		System.out.println("START		STMT		STMTS			STOP");
		int i=0;
		while(sc.hasNext()){
			String next=sc.next();
			if(next.equals("Game")){
				System.out.println("							|");
				System.out.println("							|");
				
			}
			if(next.equals("MOVE") && i==0){
				String color=sc.next();
				System.out.println("		|		|			|");
				System.out.println("-----------------		|			|");
				System.out.println("|	|	|		|			|");
				System.out.println("MOVE	"+color+"	CELL		|			|");
				i++;
			}
			else if(next.equals("PASSED") && i==0){
				String color=sc.next();
				System.out.println("		|		|		|		|");
				System.out.println("-----------------		|		|		|");
				System.out.println("|		|		|		|		|");
				System.out.println("PASS		"+color+"		|		|		|");
				i++;
			}
			else if(next.equals("COUNT") && i==0){
				String color=sc.next();
				System.out.println("		|		|		|");
				System.out.println("-----------------		|		|");
				System.out.println("|	|	|		|		|");
				System.out.println("COUNT	"+color+"	 SHAPE		|		|");
				i++;			
			}
			else if(next.equals("DRAW") && i==0){
				System.out.println("		|		|		|");
				System.out.println("-----------------		|		|");
				System.out.println("|		|		|		|");
				System.out.println("DISPLAY	"+"	BOARD		|		|");
				i++;
			}
			else if(next.equals("DISPLAY") && i==0){
				System.out.println("		|		|		|");
				System.out.println("-----------------		|		|");
				System.out.println("|		|		|		|");
				System.out.println("DISPLAY	"+"	WINNER		|		|");
				i++;
			}
			else if(next.equals("CHECK") && i==0){
				String color=sc.next();
				System.out.println("		|		|		|");
				System.out.println("-----------------		|		|");
				System.out.println("|	|	|		|		|");
				System.out.println("CHECK	"+color+"	SHAPE		|		|");
				i++;
			}
			else if(i<count-2){
				if(next.equals("Game")){
					System.out.println("							|");
					System.out.println("							|");
					
				}
				if(next.equals("MOVE")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					String color=sc.next();
					System.out.println("			|		|		|");
					System.out.println("	-----------------		|		|");
					System.out.println("	|	|	|		|		|");
					System.out.println("	MOVE	"+color+"	CELL		|		|");
					i++;
				}
				else if(next.equals("PASSED")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					String color=sc.next();
					System.out.println("			|		|		|");
					System.out.println("	-----------------		|		|");
					System.out.println("	|		|		|		|");
					System.out.println("	PASS		"+color+"		|		|");
					i++;
				}
				else if(next.equals("COUNT")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					String color=sc.next();
					System.out.println("			|		|		|");
					System.out.println("	-----------------		|		|");
					System.out.println("	|	|	|		|		|");
					System.out.println("	COUNT	"+color+"	SHAPE		|		|");
					i++;			
				}
				else if(next.equals("DRAW")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					System.out.println("			|		|		|");
					System.out.println("	-----------------		|		|");
					System.out.println("	|		|		|		|");
					System.out.println("	DISPLAY	"+"	BOARD		|		|");
					i++;
				}
				else if(next.equals("DISPLAY")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					System.out.println("			|				|");
					System.out.println("	-----------------				|");
					System.out.println("	|		|				|");
					System.out.println("	DISPLAY	"+"	WINNER				|");
					i++;
				}
				else if(next.equals("CHECK")){
					System.out.println("			-----------------		|");
					System.out.println("			|		|		|");
					System.out.println("			STMT		STMTS		|");
					String color=sc.next();
					System.out.println("			|		|		|");
					System.out.println("	-----------------		|		|");
					System.out.println("	|	|	|		|		|");
					System.out.println("	CHECK	"+color+"	SHAPE		|		|");
					i++;
				}
			}
			else if(i<count-1){
				if(next.equals("MOVE")){
					System.out.println("			-----------------		|");
					System.out.println("			|			|");
					System.out.println("			STMT		|");
					String color=sc.next();
					System.out.println("			|		|");
					System.out.println("	-----------------		|");
					System.out.println("	|	|	|				|");
					System.out.println("	MOVE	"+color+"	CELL		|");
					i++;
				}
				else if(next.equals("PASSED")){
					String color=sc.next();
					System.out.println("			-----------------		|");
					System.out.println("			|				|");
					System.out.println("			STMT				|");
					System.out.println("			|				|");
					System.out.println("	-----------------				|");
					System.out.println("	|		|				|");
					System.out.println("	PASS		"+color+"				|");
					i++;
				}
				else if(next.equals("COUNT")){
					System.out.println("			-----------------		|");
					System.out.println("			|				|");
					System.out.println("			STMT				|");
					String color=sc.next();
					System.out.println("			|				|");
					System.out.println("	-----------------				|");
					System.out.println("	|	|	|				|");
					System.out.println("	COUNT	"+color+"	SHAPE				|");
					i++;		
				}
				else if(next.equals("DRAW")){
					System.out.println("			-----------------		|");
					System.out.println("			|				|");
					System.out.println("			STMT				|");
					System.out.println("			|				|");
					System.out.println("	-----------------				|");
					System.out.println("	|		|				|");
					System.out.println("	DISPLAY		"+"BOARD"+"				|");
					i++;
				}
				else if(next.equals("DISPLAY")){
					System.out.println("			-----------------");
					System.out.println("			|	");
					System.out.println("			STMT");
					System.out.println("			|");
					System.out.println("	-----------------");
					System.out.println("	|		|		");
					System.out.println("	DISPLAY		"+"WINNER");
					i++;
				}
				else if(next.equals("CHECK")){
					System.out.println("			-----------------		|");
					System.out.println("			|				|");
					System.out.println("			STMT				|");
					String color=sc.next();
					System.out.println("			|				|");
					System.out.println("	-----------------				|");
					System.out.println("	|	|	|				|");
					System.out.println("	CHECK	"+color+"	SHAPE				|");
					i++;
				}else if(next.equals("Game")){
					System.out.println("							|");
					System.out.println("							END");
					System.exit(0);
					
				}
			}else{
				System.out.println("Program not terminated.");
				return false;
			}
		}
		return true;
	}
	
	public static boolean ProblemSimulation(Scanner sc, String s){
		System.out.println("PROBLEM SIMULATION\n");
		System.out.println("E");
		System.out.println("|");
		System.out.println("T");
		System.out.println("|");
		System.out.println("-------------------------------------------------");
		while(sc.hasNext()){
			if(s.equals("EXP")){
				System.out.println("|	|	|	|	|");
				System.out.print("F	^");
				while(sc.hasNext()){
					if(sc.next().equals("VARIABLE")){
						System.out.print("	F");
					}if(sc.next().equals("EQUALS")){
						System.out.print("	=");
					}
				}
				System.out.println("\n   |     |     |        |");
			}
			if(s.equals("LP")){
				boolean flag=false;
				boolean ls=true;
				System.out.println("	|		|		|	");
				System.out.println("	T		/		F");
				System.out.println("	|				|");
				System.out.println("-------------------------		INT");
				System.out.println("|  |  |  |  |  |  |  |  |");
				System.out.print("LP ");
				while(sc.hasNext()){
					s=sc.next();
					if(s.equals("VARIABLE")&&ls==true){
						System.out.print("F  ");
					}
					if(s.equals("ADD")&&ls==true){
						System.out.print("+  ");
					}
					if(s.equals("RP")&&ls==true){
						flag=true;
						System.out.print("RP ");
					}
					if(s.equals("EQUALS")&&ls==true){
						ls=false;
						System.out.print("=  F");
					}
				}
				if(flag==true&&ls==false){
					System.out.println("\n   |     |     |        |");
					System.out.println("   INT   INT   INT      INT");
					return true;
				}else{
					System.out.println("\nERROR: No RP detected.");
					System.exit(0);
				}
			}
			if(s.equals("MULT")){
				int j;
				System.out.println("|	|	|	|	|	|	|");
				System.out.println("T	+	T	+	T	=	F");
				System.out.println("-------		-------		-------		|");
				System.out.println("|  |  |		|  |  |		|  |  |		VARIABLE");
				for(j=0;j<=2;j++){
					System.out.print("F  *  F		");
				}
				System.out.println("\n|     |		|     |		|     |		");
				for(j=2;j>=0;j--){
					System.out.print("INT   INT	");
				}
			}
			s=sc.next();
		}
		return false;
	}

}
