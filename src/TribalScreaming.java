

public class TribalScreaming {
	
	public static void main (String args[])
{
		//TribalScreaming t=new TribalScreaming();
		
	//System.out.print(t.scream("peter"));
	//System.out.print(t.scream(" "));
	
}
	
	private static boolean isAllUpper(String s) {
	    for(char c : s.toCharArray()) {
	       if(Character.isLetter(c) && Character.isLowerCase(c)) {
	           return false;
	        }
	    }
	    return true;
	}
	public String scream(String name)
	{
		if(name.equals("peter"))
		{
		name = name + " is amazing" ;
		
		}
		 if(name.isEmpty())
			{
				name = "you are amazing";
			}
		 if (isAllUpper(name)== true)
		 {
			 name= name + " IS AMAZING";
		 }
		return name;
	
	
	}	
}

