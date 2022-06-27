
public class TestaMetodo {
	    
	public static void main(String[] args) { 
	        Conta contaDoRenato = new Conta();
	        contaDoRenato.saldo = 100;
	        contaDoRenato.deposita(55);
	        System.out.println(contaDoRenato.saldo); 

	        boolean conseguiuRetirar = contaDoRenato.saca(20);
	        System.out.println(contaDoRenato.saldo); 
	        System.out.println(conseguiuRetirar);

	        Conta contaDaJuciele = new Conta();
	        contaDaJuciele.deposita(1500);

	        boolean sucessoTransferencia = contaDaJuciele.transfere(350, contaDoRenato);
	        if(sucessoTransferencia) {
	            System.out.println("transferencia com sucesso");
	        } else {
	            System.out.println("faltou dinheiro");

	        }
	        System.out.println(contaDaJuciele.saldo);
	        System.out.println(contaDoRenato.saldo); 
	    }
	}
