import java.util.Scanner ;  
  
public class Lanches {  
  
    public static void main( String[ ] args ) {  
          
        int pedido ;  
  
        System.out.println( "========== Barraca de Lanches ==========" ) ;  
        System.out.println( "Menu de lanches: " ) ;  
        System.out.println( "1 - X-Bacon" ) ;  
        System.out.println( "2 - X-Salada" ) ;  
        System.out.println( "3 - X-Picanha" ) ;  
        System.out.println( "4 - X-Tudo: Pre�o" ) ;  
  
        Scanner captura = new Scanner( System.in ) ;  
        System.out.println( "Digite o n�mero do seu lanche: " ) ;  
        pedido = captura.nextInt( ) ;  
  
        switch ( pedido ) {  
            case 1:  
                System.out.println( "Voc� escolheu X-Bacon" ) ;  
                System.out.println( "O pre�o do X-Bacon �: R$ 20" ) ;  
                break ;  
            case 2:  
                System.out.println( "Voc� escolheu X-Salada" ) ;  
                System.out.println( "O pre�o do X-Salada �: R$ 15" ) ;  
                break ;  
            case 3:  
                System.out.println( "Voc� escolheu X-Picanha" ) ;  
                System.out.println( "O pre�o do X-Picanha �: R$ 22" ) ;  
                break ;  
            case 4:  
                System.out.println( "Voc� escolheu X-Tudo" ) ;  
                System.out.println( "O pre�o do X-Tudo �: R$ 30" ) ;  
                break ;  
            default:  
                System.out.println( "Erro! N�mero n�o existe no menu!" ) ;  
                break ;  
        }  
    }  
  
}  