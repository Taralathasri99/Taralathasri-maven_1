package maven.NewYearsGift;
public class App implements Choclates,Sweet
{
	public void addChoclate(String name,String flavour,int quantity,int weight)
	{
	  System.out.println("Choclate is "+name+" flavour is "+flavour+" and it's quantity is "+quantity+" wieght of each choclate is"+weight+"\n");	
	}
	public void sortChoclates(int[] choclates,int noofchoclates)
	{
		int tmp=0;
		for(int i=0;i<noofchoclates;i++)
		{
			for(int j=i+1;j<noofchoclates;j++)
			{
				if(choclates[i]>choclates[j])
				{
					tmp=choclates[j];
					choclates[j]=choclates[i];
					choclates[i]=tmp;
				}
			}
		}
				
	}
	public int total(int[] sweets_choclates)
	{
		int sum=0;
		for(int i=0;i<sweets_choclates.length;i++)
			sum=sum+sweets_choclates[i];
		return sum;
	}
	public void addSweet(String name,int quantity,int weight)
	{
		System.out.println("Sweet is "+name+" and quantity of each sweet is "+quantity+" ,weight of each Sweet is "+weight+"\n");
	}
	public static void main( String[] args )
    {
        int cindex=0,sindex=0,Gift=0;
        int[] choclates=new int[10];
        int[] sweets=new int[10];
        Choclates obj1=new App();
        obj1.addChoclate("Dairymilk","Choclatey",50,100);
        choclates[cindex++]=50*100;
        Choclates obj2=new App();
        obj2.addChoclate("MilkyBar","Vanella",25,50);
        choclates[cindex++]=25*50;
        Choclates obj3=new App();
        obj3.addChoclate("Sandwitch","wafor",30,80);
        choclates[cindex++]=30*80;
        Sweet s1=new App();
        s1.addSweet("Barfi",50,60);
        sweets[sindex++]=50*60;
        Sweet s2=new App();
        s2.addSweet("Kova",30,100);
        sweets[sindex++]=30*100;
        Gift=obj3.total(choclates)+s2.total(sweets);
        obj3.sortChoclates(choclates,cindex);
        System.out.println("Gift weight is: "+Gift+"\n");
        System.out.println("Candies in sorted order: "+"\n");
        for(int i=0;i<cindex;i++)
        {
        	System.out.print(choclates[i]+" ");
        }    
        
        
    }
}
