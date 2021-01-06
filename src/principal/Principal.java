/**
 * 
 */
package principal;

/**
 * @author andres
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOLA, ESTE ES UN MENSAJE DE PRUEBA.");
		int i;
		int j;
		for(i=0, j=0; j<1; ++j, i++) {
			System.out.println(i+" "+j);
		}
		System.out.println(i+" "+j);
		
		int[] arr = new int[0];
		System.out.println("Size: "+arr.length);
		
		String a="Hello";
		new TestClass().probe(a);
		
		char c="f";
		int ar[][] = new int[][5];
		String s = 'b'+new Integer(63)+"a";
		int []b[]=new int[4][];
		Integer num=new Integer(5);
	}

}
