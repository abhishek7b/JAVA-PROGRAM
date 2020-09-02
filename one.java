import java.util.Scanner;
import java.io.*;

public class one 
{
    public static void main(String[] args) 
	{
		String[] lines= new String[10];
		String[][] words= new String[10][1000];
		String[] reversedString= new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your paragraph : ");
 
        String paragraph = scanner.nextLine();
		
		lines = paragraph.split("\\.");
		int x = 0;
		for (int i = 0;i <=lines.length; i++)
		{
			words[i][0] = lines[i].split("\\s");
			x++;
		}
		
		for (int i = 0; i <=words.length; i++) 
		{ 
			int k=0;
			for (int j = 0; j <=words[j].length; j++)
			{
				if (words[j].length - j == 2)
				{
					reversedString[k] = reversedString[k] +" "+ words[j];	
				}
				else
				{
					reversedString[k] = words[j] +" "+ reversedString[k];
				} 
			}
			k++;
		}
		System.out.println("YOUR FINAL STRING IS :");
		for (int m = 0; m <=reversedString.length ; m++)
		{
			System.out.println(reversedString[m]+". ");
			
		}
		
	}
}