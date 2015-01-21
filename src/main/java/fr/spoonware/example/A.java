package fr.spoonware.example;

/**
 * Created by nicolas on 21/01/2015.
 */
public class A {
	private final B delegate;

	public A(B delegate) {
		this.delegate = delegate;
	}

	public void doIt() {
		delegate.doIt();
	}
}
