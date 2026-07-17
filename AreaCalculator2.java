import java.util.Scanner;

public class AreaCalculator2 {

    public static double rectangleArea (double length, double height){
        return length*height;
    }
    public static double rectanglePerimeter (double length, double height){
        return 2*(length+height);
    }
    public static double circleArea (double radius){
        return 3.14*radius*radius;
    }
    public static double circlePerimeter (double radius){
        return 2*3.14*radius;
    }
    public static double cubeVolume (double side){
        return side*side*side;
    }
	public static double triangleArea (double base, double height){
		return (base*height)/2;
	}
		public static double trianglePerimeter (double side1, double side2, double side3){
		return side1 + side2 +side3;
	}

    public static void main(String[] args) {

		double length, height, radius, side, side1, side2, side3, base;

		Scanner m = new Scanner(System.in);

		System.out.println("Choose your Option:\na. Calculate the area and perimeter of a rectangle.\nb. Calculate the area and perimeter of a circle.\nc. Calculate the volume of a cube.\nd. Calculate the area and perimeter of the triangle\ne. Exit.");

		char option = m.next().charAt(0);

		while(option != 'a' && option != 'b' && option != 'c' && option != 'd' && option != 'e'){

			System.out.println("Wrong choice. Try Again\na. Calculate the area and perimeter of a rectangle.\nb. Calculate the area and perimeter of a circle.\nc. Calculate the volume of a cube.\nd. Calculate the area and perimeter of the triangle\ne. Exit.");

			option = m.next().charAt(0);
		}



		if(option == 'a'){

			System.out.println("Enter the length of the rectangle: ");
			length = m.nextDouble();
			while (length <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				length = m.nextDouble();
			}
			System.out.println("Enter the height of the rectangle:");
			height = m.nextDouble();
			while (height <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				height = m.nextDouble();
			}
			System.out.println("The rectangle area is " + rectangleArea(length, height) + ". The rectangle perimeter is " + rectanglePerimeter(length, height));

		}
		else if (option == 'b'){

			System.out.println("Enter the radius of the circle: ");
			radius = m.nextDouble();
			while (radius <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				radius = m.nextDouble();
			}
			System.out.println("The circle area is " + circleArea(radius) + ". The circle perimeter is " + circlePerimeter(radius));
		}

		else if (option == 'c'){

			System.out.println("Enter the side of the cube: ");
			side = m.nextDouble();
			while (side <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				side = m.nextDouble();
			}
			System.out.println("The cube volume is " + cubeVolume(side));
		}

		else if(option == 'd'){

			System.out.println("Enter the base of the triangle: ");
			base = m.nextDouble();
			while (base <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				base = m.nextDouble();
			}
			System.out.println("Enter the height of the Triangle:");
			height = m.nextDouble();
			while (height <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				height = m.nextDouble();
			}
			System.out.println("Enter the size of the side One of the Triangle:");
			side1 = m.nextDouble();
			while (side1 <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				side1 = m.nextDouble();
			}
			System.out.println("Enter the size of the side Two of the Triangle:");
			side2 = m.nextDouble();
			while (side2 <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				side2 = m.nextDouble();
			}
			System.out.println("Enter the size of the side Three of the Triangle:");
			side3 = m.nextDouble();
			while (side3 <= 0) {
				System.out.println("Incorrect Value. The number has to be greater than 0. Insert again:");
				side3 = m.nextDouble();
			}
			System.out.println("The triangle area is " + triangleArea(base, height) + ". The triangle perimeter is " + trianglePerimeter(side1, side2, side3));
		}
		else
			System.out.println("See you next time");

		m.close();


	}
}

