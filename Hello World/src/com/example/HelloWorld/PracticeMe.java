package com.example.HelloWorld;

public class PracticeMe {
	int a,b,c;
	public PracticeMe(int a,int b,int c){
			this.a=a;
			this.b=b;
			this.c=c;
	}
	public int total(int a, int b,int c){
		int total=(a+b+c);
		return total;
	}
	public void stud(){
		int total=a+b+c;
		float avg=total/3;
		System.out.println("Average of the Student A is : "+avg);
		if(avg>=90 && avg<=100){
			System.out.println("Grade A");
		}
		else if(avg>=80 && avg<=89){
			System.out.println("Grade B");
		}
		else if(avg>=70 && avg<=79){
			System.out.println("Grade C");
		}
		else if(avg>=60 && avg<=69){
			System.out.println("Grade D");
		}
		else if(avg>=50 && avg<=59){
			System.out.println("Grade E");
		}
		else{
			System.out.println("Grade F");
		}	
	}
	
	public static void main(String[] args) {
		PracticeMe obj = new PracticeMe(85,76,82);
		System.out.println("Student A");
		System.out.println("TotalMarks secured by Student A is : "+obj.total(85,76,82));
		obj.stud();
		PracticeMe obj1 = new PracticeMe(64,79,80);
		System.out.println("Student B");
		System.out.println("TotalMarks secured by Student B is : "+obj1.total(64,79,80));
		obj1.stud();
	}	
}
