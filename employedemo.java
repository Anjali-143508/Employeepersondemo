package Pack;

public class employedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1= new employee();
	    e1.id=1;
		e1.name="anjali";
		e1.qualif="BE";
		e1.swim();
		System.out.println("the name is "+e1.name);
		System.out.println("the qualif is "+e1.qualif);
		System.out.println("the id is "+e1.id);
		employee e2= new employee();
		e1.id=2;
		e1.name="aruna";
		e1.qualif="arts";
		e1.swim();
		System.out.println("the name is "+e1.name);
		System.out.println("the qualif is "+e1.qualif);
		System.out.println("the id is "+e1.id);


		


	}

}
