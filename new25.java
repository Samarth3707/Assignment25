package new25;
import java.util.Scanner;

public class new25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//1st* problem****************************************************aw		
		
		int[][] arr=new int[3][3];
		int[][] arr2=new int[3][2];
		int n=0;
		int m=arr.length-1;
		int p=0;
		int q=arr[0].length-1;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print("enter the number");
				
				arr[i][j]=sc.nextInt();
				
				
				
				
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.print("enter the arr2 number");
				
				arr2[i][j]=sc.nextInt();
				
				
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(n==p && m==q) {
					arr[i][j]=arr[i][j]+arr2[i][j];
					System.out.print(arr[i][j]+"   ");
				}
			
				
			}
			System.out.println();
		}
//2* problem***************************************************
		int[][] array=new int[3][3];
		System.out.print("enter the element");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print("enter the new element");
				arr[i][j]=sc.nextInt();
				
				
			}
		}
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+ " ");
				
			}
			System.out.println();
		}
	}
	

}
