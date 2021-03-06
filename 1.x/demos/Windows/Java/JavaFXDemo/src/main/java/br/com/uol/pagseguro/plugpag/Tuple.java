package br.com.uol.pagseguro.plugpag;

/**
 * Tuple to hold 3 types of data.
 *
 * @param <A>
 * @param <B>
 * @param <C>
 */
public class Tuple<A, B, C> {

    // -----------------------------------------------------------------------------------------------------------------
    // Instance attributes
    // -----------------------------------------------------------------------------------------------------------------

    private A mA = null;
    private B mB = null;
    private C mC = null;

    // -----------------------------------------------------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------------------------------------------------

    public Tuple(A a, B b, C c) {
        this.mA = a;
        this.mB = b;
        this.mC = c;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // Getters
    // -----------------------------------------------------------------------------------------------------------------

    public A getFirst() {
        return mA;
    }

    public B getSecond() {
        return mB;
    }

    public C getThird() {
        return mC;
    }
}
