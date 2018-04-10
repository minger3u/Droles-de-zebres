/**
 * 
 */
package pawn;

/**
 * @author Adrien
 *
 */
public abstract class Pawn {
	private int valeur;
	private boolean visible = true;
	private String couleur;
	
	public Pawn(int v, String couleur){
		valeur = v;
		this.couleur = couleur;
	}
	
	public void seCache(){
		this.visible = false;
		this.valeur = 0;
	}
	
	public void fuite(){
		
	}
}