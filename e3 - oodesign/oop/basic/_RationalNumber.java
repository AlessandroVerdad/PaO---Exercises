package com.nbicocchi.exercises.oop.basic;

import java.util.Objects;

public class _RationalNumber {

    final int denominator;
    final int numerator;

    public _RationalNumber(int denominator, int numerator) {
        int mcd = greatestCommonDivisor(denominator, numerator);

        this.denominator = denominator / mcd;
        this.numerator = numerator / mcd;
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public _RationalNumber addRationalNumber(_RationalNumber o) {
        int lcm = leastCommonMultiple(denominator, o.getDenominator());
        int num = (numerator * lcm / denominator) + (o.getNumerator() * lcm / o.getDenominator());

        return (new _RationalNumber(lcm, num));
    }

    public _RationalNumber multiply(_RationalNumber o) {
        int num = denominator * o.getDenominator();
        int den = numerator * o.getNumerator();

        return (new _RationalNumber(num, den));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        _RationalNumber that = (_RationalNumber) o;

        if (denominator != that.denominator) return false;
        return numerator == that.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "_RationalNumber{" +
                "denominator=" + denominator +
                ", numerator=" + numerator +
                '}';
    }
}
