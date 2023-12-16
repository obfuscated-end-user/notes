package com.mycompany.midsum2_redacted;

class Fraction {
    private int numerator;
    private int denominator;
    
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0)
            this.denominator = 1;
        else
            this.denominator = denominator;
    }

    public String toString() {
       return numerator + "/" + denominator;
    }
    
    public String addFraction(int numerator, int denominator) {
        String result;
        int i, lcd, gcf = 1;
        
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        if (this.denominator < 0) {
            setNumerator(this.numerator * -1);
            setDenominator(this.denominator * -1);
        }

        for (i = 1; i <= Math.abs(denominator) && i <= Math.abs(this.denominator); i++) {
            if (denominator % i == 0 && this.denominator % i == 0) 
                gcf = i;
        }
        lcd = (denominator * this.denominator) / gcf;
        
        int tempDenominator1 = Math.abs(lcd) / denominator;
        int tempDenominator2 = Math.abs(lcd) / this.denominator;
        
        int tempNumerator1, tempNumerator2, newNumerator;
        if (denominator < 0) {
            tempNumerator1 = numerator * tempDenominator1 * -1;
            denominator *= -1; 
        } else
            tempNumerator1 = numerator * tempDenominator1;
        if (this.denominator < 0) {
            tempNumerator2 = this.numerator * tempDenominator2 * -1;
            this.denominator *= -1; 
        } else 
            tempNumerator2 = this.numerator * tempDenominator2;
        newNumerator = tempNumerator1 + tempNumerator2;
        
        result = newNumerator + "/" + lcd;        
        return result;
    }
    
    public String multiplyFraction(int numerator, int denominator) {
        int productNumerator = numerator * this.numerator;
        int productDenominator = denominator * this.denominator;
        return productNumerator + "/" + productDenominator;
    }
    
    public String simplifyFraction(int numerator, int denominator) {
        String result;
        int i, gcf = 1;
        
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        
        for (i = 1; i <= Math.abs(numerator) && i <= Math.abs(denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0)
                gcf = i;
        }
        
        int simplifiedNumerator = numerator / gcf;
        int simplifiedDenominator = denominator / gcf;
        if (simplifiedDenominator == 1)
            result = Integer.toString(simplifiedNumerator);
        else
            result = simplifiedNumerator + "/" + simplifiedDenominator;
        return result;
    }
}
