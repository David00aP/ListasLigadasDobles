public class Main{
	
	public static void main(String[] args){
	 ListaDoble lista = new ListaDoble();
	 lista.insertaPrimerNodo("C");
	 lista.insertaAntesPrimerNodo("B");
	 lista.insertaAntesPrimerNodo("A");
	 //lista.devolverReferencia("B");
	 //lista.insertarNodoDespues("B","K");
	 lista.intercambiarNodo("B","K");
  	 lista.imprimir();

	 System.out.println(lista);
	}
}
