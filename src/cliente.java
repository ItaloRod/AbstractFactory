
public class cliente {

	private Cor cor;
	
	cliente(AbstractFactory fabrica){
		cor = fabrica.imprimirAmarelo();
		cor = fabrica.imprimirVerde();
	}
	
	void executar(){
	cor.imprimircor();
	}
}
