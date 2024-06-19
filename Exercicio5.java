package ExerciciosMatriz;

public class Exercicio5 {

	public static void main(String[] args) {
		String matriz[][] = new String [4][4];
		
		for(int i=0; i< 4; i++) {
			for(int j=3;j>=0;j--) {
				if(i+j<=3) {
					matriz[i][j]= "*";
				}
				else {
					matriz[i][j]=" ";
					
					
				}
	}
      for (String[] linha : matriz) {
    	  for (String letra : linha) {
    		  System.out.print(letra + " ");
    	  }
    	  System.out.println();
      }
}

}
}


