
public class concreteFactory implements AbstractFactory {

	@Override
	public Cor imprimirVerde() {
		 new Verde().imprimircor();
		return null;
	}

	@Override
	public Cor imprimirAmarelo() {
		new Amarelo().imprimircor();
		return null;
	}

}
