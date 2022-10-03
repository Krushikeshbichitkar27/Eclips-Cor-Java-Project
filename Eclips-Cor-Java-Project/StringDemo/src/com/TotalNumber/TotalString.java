package com.TotalNumber;


//count frequency of character using string
//declaring class 
public class TotalString
{
	//make static method
	static void printFrequency(String str)
	{
		
		int []freq=new int[str.length()];
		
		int i,j;
		//converting string to array
		char ch[]=str.toCharArray();
		
		//setting the frequency
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if (ch[i]==ch[j]) 
				{
					freq[i]++; //increasing frequency of i
				    ch[j]=0; //setting ch of j is 0 //we do not us it again thats why we taking zero null value
				}
			}
		}
		for(i=0;i<freq.length;i++)
		{
			//ignoring spaces and duplicate value
			if(ch[i]!=' '&& ch[i]!='0') //both the string are same then it will run
				
			{
				System.out.println(ch[i]+" :"+ freq[i]);
			}
		}
		//duplicate value
		System.out.println("---THe Duplicate Value---");
		for(i=0;i<freq.length;i++)
		{
			//ignoring spaces and duplicate value
			if(ch[i]!=' '&& ch[i]!='0')
			{
				if(freq[i]>1)
				System.out.println(ch[i]+" :"+ freq[i]);
			}
		}
	}
	//calling main method
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="Krushikesh";
		printFrequency(str);
		

	}

}

//null means space

//examination