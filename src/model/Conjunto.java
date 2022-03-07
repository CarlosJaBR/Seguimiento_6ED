package model;

public interface Conjunto<T> {
	
	public void crearConjunto(); 
	public void agregarElemento(T elemt); 
	public boolean verificarElemento(T elemt); 
	public void eliminarElemento(T elemt); 
	public Conjunto<T> unionConjunto(); 
	public Conjunto<T> interseccionConjunto(); 
}
