import java.util.*;

public class Inheritance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        System.out.println("Real part: ");
        int real1 = sc.nextInt();
        System.out.println("Imaginary part: ");
        int img1 = sc.nextInt();
        System.out.println("Enter the second complex number: ");
        System.out.println("Real part: ");
        int real2 = sc.nextInt();
        System.out.println("Imaginary part: ");
        int img2 = sc.nextInt();

        Complex complex1 = new Complex(real1, img1);
        Complex complex2 = new Complex(real2, img2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.difference(complex2);
        Complex product = complex1.product(complex2);

        System.out.println("Sum: ");
        sum.print();

        System.out.println("Difference: ");
        difference.print();

        System.out.println("Product: ");
        product.print();

        
    }
}

class Complex{
    private int real;
    private int img;

    public Complex(int real, int img){
        this.real = real;
        this.img = img;
    }

    public Complex add(Complex complex){ 

        int sumReal = this.real + complex.real;
        int sumImg = this.img + complex.img;
        return new Complex(sumReal, sumImg);
    }

    public Complex difference(Complex  complex) {
        int diffReal = this.real - complex.real;
        int diffImg = this.img - complex.img;
        return new Complex(diffReal, diffImg);
    }

    public Complex product(Complex complex) {
        int prodReal = this.real*complex.real;
        int prodImg = this.img*complex.img;
        return new Complex(prodReal, prodImg);
    }

    public void print() {
        if (img >= 0) {
            System.out.println(real + " + " + img + "i");
        } else {
            System.out.println(real + " - " + Math.abs(img) + "i");
        }
    }

}
    