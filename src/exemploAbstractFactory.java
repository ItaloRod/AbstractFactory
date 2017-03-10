
public class exemploAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory fabrica1 = new concreteFactory();
		cliente cliente = new cliente(fabrica1);
		cliente.executar();
	}

}
