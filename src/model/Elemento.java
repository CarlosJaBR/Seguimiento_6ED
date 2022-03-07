package model;

public class Elemento<E> implements Comparable<E> {

	    private E item;
	    private Elemento<E> next;
	    private Elemento<E> previous;


	    public Elemento(E element) {
	        this.item = element;
	        this.next = null;
	        this.previous=null;

	    }

	    public Elemento<E> getPrevious() {
	        return this.previous;
	    }

	    public void setPrevious(Elemento<E> previous) {
	        this.previous = previous;
	    }



	    public void setItem(E item) {
	        this.item = item;
	    }


	    public E getItem() {
	        return item;
	    }


	    public Elemento<E> getNext() {
	        return next;
	    }

	    public void setNext(Elemento<E> next) {
	        this.next = next;
	    }



	    @Override
	    public int compareTo(E o) {
	    	
	        return ((Comparable<E>) getItem()).compareTo(o);
	    }




	    @Override
	    public String toString() {
	        return "{"+getItem();
	    }
}
