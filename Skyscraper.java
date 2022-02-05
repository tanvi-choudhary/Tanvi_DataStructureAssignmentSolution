package BinaryAssignment;

import java.util.*;

public class Skyscraper 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int floor = sc.nextInt();
		int[] array = new int[floor];
		
		int[] box = new int[array.length];
		
		//Skyscraper s = new Skyscraper();
		
		for(int i = 0;i< (array.length); i++) 
		{	
			int j = i+1;
			System.out.println("enter the floor size given on day : " +j);
			box[i] =sc.nextInt();
		}
		
		System.out.println("The order of construction is as follows");
		
		int maxheight = array.length;
		//System.out.println("Maxheight1 : " + maxheight);
		for(int i = 0;i< (array.length); i++) 
		{	
			int j = i+1;
			
			System.out.println("Day: " +j);
			
			if (maxheight == box[i]) 
			{
				System.out.println(box[i]);
				maxheight = maxheight -1;
				for(int m = 0;m< i; m++)
				{
					for(int n = 0;n< i; n++)
					{
						System.out.println("Maxheight2 : " + maxheight);
							if (maxheight == box[n]) 
							{
								System.out.println(box[n]);
								maxheight = maxheight -1;
							
							}
					}
				}
				
				
			}
			for(int k = 1;k<i;k++)
			{
				System.out.println("Maxheight3 : " + maxheight);
				if (maxheight == box[k]) 
				{
					System.out.println(box[k]);
					maxheight = maxheight -1;
					
				}		
					
			}			
			
		}
		
		sc.close();
	}

}
