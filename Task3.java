class Task2lab3
{
	 public static int CharacterSearching(char arr[],char x)
	 {
       int p=0,q=arr.length-1;
		while(p<=q)
		{
		int i=(p+q)/2;
		if(arr[i]==x)
		return i;
		if(arr[i]<x)
		p=i+1;
		else
		q=i-1;
        }
		return -1;

	    }
	 
	public static void main(String args[])
	{
     char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   // char x='q';
     System.out.println(CharacterSearching(arr,'q'));
	}
}