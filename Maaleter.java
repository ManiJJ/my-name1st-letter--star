package Exercise;

public class Maaleter {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			System.out.print("*");
			if(i==1){
				System.out.print("    ");
				System.out.println("");
				
				
			}
			 step1(i);
			 step2(i);
			 step3(i);
			//if(i==2){
			///	System.out.print(" ");
			}
		}
		// TODO Auto-generated method stub

	
public static void step1(int i){
	if(i==2){
		System.out.print(" ");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("");
		
	}
	
}
public static void step2(int i){
	
	if(i ==3 || i == 4 ){
		System.out.print(" ");
		System.out.print("*");
		System.out.print(" ");
		System.out.print("*");
		System.out.println("");
	}
}
	

public static void step3(int i){
	if(i==5){
		
	
	for(int j=1;j<=4;j++){
		System.out.print("*");
	}
	}}
}

