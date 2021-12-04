public class TesteLacos2 {
    public static void main(String[] args) {
        //Piramide
    	
    	/*for(int coluna=0; coluna < 10; coluna++) {
            for(int linha=0; linha <=coluna; linha++) {
                System.out.print("*");
            }
            System.out.println();*/
    	//Piramide invertida
    	for(int coluna=10; coluna >= 0; coluna--) {
            for(int linha=0; linha <=coluna; linha++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}