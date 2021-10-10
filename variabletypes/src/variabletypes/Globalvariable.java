
package variabletypes;
public final class Globalvariable {
float g=54.56f;		//global variable

public void glovar() {
	System.out.println(g);
}
	public static void main(String[] args) {
		Globalvariable  gv=new Globalvariable() ;
		gv.glovar();
	
		}

}
