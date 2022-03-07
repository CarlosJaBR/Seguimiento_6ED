package model;

public interface Conjunto<T> {
	
	public void crearConjunto(); 
	public void agregarElemento(Conjunto<T> conj, T elemt); 
	public boolean verificarElemento(Conjunto<T> conj, T elemt); 
	public void eliminarElemento(Conjunto<T> conj,T elemt); 
	public Conjunto<T> unionConjunto(Conjunto<T> conj); 
	public Conjunto<T> interseccionConjunto(Conjunto<T> conj); 
}
