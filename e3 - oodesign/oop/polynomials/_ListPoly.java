package com.nbicocchi.exercises.oop.polynomials;

import java.util.ArrayList;

public class _ListPoly extends AbstractPoly {
    ArrayList<Double> coefficients = new ArrayList<>();

    //  constructor
    public _ListPoly(ArrayList<Double> coefficients) {
        //  this.coefficients.addAll(coefficients);

        for (double number : coefficients)
            this.coefficients.add(number);
    }

    public ArrayList<Double> getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }

    //  overrides
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return (new ListPoly(derive()));
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] coefficientsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++)
            coefficientsArray[i] = coefficients.get(i);

        return coefficientsArray;
    }
}
