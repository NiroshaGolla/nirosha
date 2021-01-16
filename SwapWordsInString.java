package patterns;

public class SwapWordsInString 
{
	public static void main(String[] args) 
	{
		String s="Welcome to Test Yantra";
		String[] words = s.split(" ");
		String temp=words[0];
		words[0]=words[words.length-1];
		words[words.length-1]=temp;
		
		for(String s1:words)
		{
			System.out.print(s1+" ");
		}

	}

}
