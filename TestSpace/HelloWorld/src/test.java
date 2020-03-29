class Pencil  {

	public void write (String content){

		System.out.println( "Write"+content);

	}

}



class RubberPencil extends Pencil{

	public void write (String content){

		System.out.println("Rubber Write"+content);

	}



  public void erase (String content){

	  System.out.println( "Erase "+content);

  }

}

public class test {

	public static void main(String[] args) {

		Pencil  p=new  Pencil();

		(( RubberPencil) p).write("Hello");

	}	

}