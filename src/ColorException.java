
public class ColorException extends RuntimeException {
	
	public ColorException(){
		super("An error occurred in a Color class");
	}
	
	public ColorException(String msg){
		super(msg);
	}
	
	public static void main(String[] args){
		
		//throw new ColorException("testing main");
	}
}
