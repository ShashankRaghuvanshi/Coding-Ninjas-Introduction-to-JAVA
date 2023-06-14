package Lecture_9_Arrays;
import java.util.Scanner;

public class Return_Array_Sum 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int []input = new int[size];
		for(int i=0; i<size; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static void print(int input[])
	{
		int size = input.length;
		for(int i=0; i<size; i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void sum(int input[])
	{
		int size = input.length;
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum = sum + input[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		print(arr);
		sum(arr);

	}

}
