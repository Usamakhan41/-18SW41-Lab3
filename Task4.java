class Task2
{
	static String []a={"Ali","Farhana","Roomasa","Durdana","Pirih","Hina","Saira","Moiz","Eman","Moon","Ford"};
	static int min=0;
	static int max=a.length-1;
	static int mid;
	static String key="bb";
	public static int StringSearch()
	{
		while(min<=max)
		{
			mid=(min+max)/2;
			if(a[mid].compareTo(key)<0)
		    min=max+1;
		if(a[mid].compareTo(key)>0)
			max=mid-1;
		    else 
		    return mid;

		}
		return -1;
	}
	public static void main(String args[])
	{
     System.out.println("key found at "+StringSearch()+" position");
	}

}