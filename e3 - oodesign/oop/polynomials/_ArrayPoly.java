package com.nbicocchi.exercises.oop.polynomials;

import java.util.Arrays;

public class _ArrayPoly extends AbstractPoly {
    final double[] coefficients;

    //  constructor
    public _ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    //  setters --> cant exists as 'coefficients' is final

    //  overrides
    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return (new ArrayPoly(derive()));
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }
}
