package barclaystraining;

class Accountholder{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
		
	}
	
}


public class GetterandSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accountholder s1=new Accountholder();
		s1.setName("Dheeraj");
		
		System.out.print(s1.getName());

	}

}
