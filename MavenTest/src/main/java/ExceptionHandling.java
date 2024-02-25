
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
		String z=null;
		System.out.println(z.concat("str"));
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
