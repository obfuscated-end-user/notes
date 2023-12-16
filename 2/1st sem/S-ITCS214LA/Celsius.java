public class Celsius {
    private double celsius;

    // default constructor
    Celsius() {
        celsius = 37;
    }
    // parameterized constructor
    Celsius(double celsius) {
        this.celsius = celsius;
    }

    // getters and setters
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // fahrenheit conversion
    public double convertToFahrenheit() {
        return (this.celsius * ((double) 9/5)) + 32;
    }

    // kelvin conversion
    public double convertToKelvin() {
        return this.celsius + 273.15;
    }
    public static void main(String[] args) {
        Celsius fahrenheit = new Celsius();
        Celsius kelvin = new Celsius();

        System.out.println("The Fahrenheit using the default constructor is " + String.format("%,.2f", fahrenheit.convertToFahrenheit()));
        fahrenheit = new Celsius(10);   // user-defined value
        System.out.println("The Fahrenheit using the user-defined value is " + String.format("%,.2f", fahrenheit.convertToFahrenheit()));

        System.out.println("The Kelvin using the default constructor is " + String.format("%,.2f", kelvin.convertToKelvin()));
        kelvin = new Celsius(19.85);
        System.out.println("The Kelvin using the user-defined value is " + String.format("%,.2f", kelvin.convertToKelvin()));
    }
}