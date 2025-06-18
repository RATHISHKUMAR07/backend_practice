package basic.problems;
public class JavaTask
{
	public static void main(String[] args)
	{
		String[] words = {"Hello","My","Name", "is","Rathish","Hi"};
		String[] encode= {"Hello","is","Name"};
	
		int [] encodedValues= new int[words.length];	
		for(int i=0;i<words.length;i++)
		{
			String temp=words[i];
			for(int j=0;j<encode.length;j++) 
			{
				String check=encode[j];
				if(temp==check)
				{
					encodedValues[i]=1;
					break;					
				}	
			}		
		}
		System.out.println("Encoded Array will be displayed as '1' and not encoded array as '0' ");
	
		for(int k=0;k<encodedValues.length;k++)
		{
			System.out.print("  "+encodedValues[k]);
			//System.out.print(words[k]+" - "+encodedValues[k]+" , ");


		}			

	}
}







//package basic.problems;
//public class JavaTask
//{
//	public static void main(String[] args)
//	{
//		String[] towords = {"Hello","How","Are", "You"};
//		String[] toencode= {"Hello","You"};
//		int [] encodedValues= new int[towords.length];	
//		for(int i=0;i<towords.length;i++)
//		{
//			String temp=towords[i];
//			for(int j=0;j<toencode.length;j++) 
//			{
//				String check=toencode[j];
//				if(temp==check)
//				{
//					encodedValues[i]=1;
//					break;
//				}				
//			}		
//		}
//		System.out.println("Encoded Arrays");
//	
//		for(int k=0;k<encodedValues.length;k++)
//		{
//			System.out.print(encodedValues[k]+" ");
//		}		
//	}
//}


