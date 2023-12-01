public class Complex {
    // Static member to store the number of complex numbers created
    private static int numberOfComplexNumbers = 0;

    // Instance variables for real and imaginary parts
    private double real;
    private double imaginary;

    // Constructor to initialize complex numbers
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        numberOfComplexNumbers++;
    }

    // Destructor (finalize method in Java)
    protected void finalize() {
        numberOfComplexNumbers--;
    }

    // Function to calculate the sum of two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Function to calculate the difference of two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Function to calculate the product of two complex numbers
    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(resultReal, resultImaginary);
    }

    // Function to calculate the modulus of a complex number
    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Function to calculate the complex conjugate (complement) of a complex number
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    // Function to display the number of complex numbers created
    public static void displayNumberOfComplexNumbers() {
        System.out.println("Number of complex numbers created: " + numberOfComplexNumbers);
    }

    public static void main(String[] args) {
        // Creating complex numbers
        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(1.5, 2.5);

        // Performing operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        double modulus = complex1.modulus();
        Complex conjugate = complex1.conjugate();

        // Displaying results
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
        System.out.println("Product: " + product.real + " + " + product.imaginary + "i");
        System.out.println("Modulus: " + modulus);
        System.out.println("Conjugate: " + conjugate.real + " + " + conjugate.imaginary + "i");

        // Displaying the number of complex numbers created
        Complex.displayNumberOfComplexNumbers();

        // Explicitly invoking garbage collection to call finalize methods (destructors)
        System.gc();
    }
}
