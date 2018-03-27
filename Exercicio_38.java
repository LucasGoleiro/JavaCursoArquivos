import javax.swing.JOptionPane;
import java.util.Random;
public class Exercicio_38{
	public static void main(String args[]){
		 Random rdm = new Random();
		int array[] = new int[10];
		System.out.println("Números sorteados:");
		System.out.print("[");
	for (int i=0; i<array.length; i++) {
                 array[i] = 0+rdm.nextInt(101); 
                 System.out.print(array[i]+" "); 

        }//fechando for
	 System.out.print("]");
	 System.out.println("");	
	  for (int i = array.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j - 1] < array[j]) {
		//inverta a logica desse if para ">" fica em ordem crescente
                    int aux = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = aux;
                }
            }
        }
System.out.println("Em ordem do maior para o menor:");
	System.out.print("[");
	for (int i=0; i<array.length; i++){
	System.out.print(array[i]+" ");
	}//fechando for
		 System.out.println("]");
	System.out.println("Maior: ["+array[0]+"]\n"+"Menor: ["+array[array.length-1]+"]");
	}//fechando main
}//fechando classe