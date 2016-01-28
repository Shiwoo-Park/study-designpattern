package headfirst.chp7.adapter;

import java.util.Enumeration;
import java.util.Iterator;

// Real usage example
public class EnumIterator<E> implements Iterator<E>{
	Enumeration<E> enumeration;
	public EnumIterator(Enumeration<E> enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public E next() {
		return enumeration.nextElement();
	}

	// if adaptee has no related method. 
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
