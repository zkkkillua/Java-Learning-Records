public class SubCat extends Cat  {

    SubCat (int c){

        super (5); 

        System.out.print ("cable");

    }

    SubCat()  {  

        this (4); 

    }

    public static void main (String  []  args)  {

        SubCat s= new SubCat();

    }

}