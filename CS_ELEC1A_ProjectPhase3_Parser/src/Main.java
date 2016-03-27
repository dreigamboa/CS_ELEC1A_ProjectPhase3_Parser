import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LexAnalyzer.mainCall();
		File in=new File("src/in2.txt");
		Scanner sc=new Scanner(in);
			String s=sc.next();
			if(s.contains("GAME")){
				GameSimulation(sc);
			}else if(s.contains("INT")){
				System.out.println("PROBLEM SIMULATION");
			}
	}
	
	public static boolean GameSimulation(Scanner sc){
		System.out.println("GAMEPLAY\n|");
		System.out.println("-------------------------------------------------");
		System.out.println("|		|		|		|");
		System.out.println("START		STMT		STMTS		STOP");
		while(sc.hasNext()){
			String next=sc.next();
			if(next.equals("MOVE")){
				String color=sc.next();
				System.out.println("		|");
				System.out.println("-----------------");
				System.out.println("|	|	|");
				System.out.println("MOVE	"+color+"	CELL");
				
			}
		}
		return false;
	}
	
	public static boolean ProblemSimulation(Scanner sc){
		return false;
	}

}
