#Full_pyramid:

public class Main {

    public static void main(String[] args) {
        int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

#IPyramid :

Class Main{
public static void main(String args[])
	{
	int x = 5;
	for(int i=x;i >= 1; i--){
	  for(int j=1;j<=i;j++){
	    System.out.print("*");
	  }
	  System.out.println(" ");
	}
	}
}

#LPyramid:

public class Main
{
	// Function to demonstrate printing pattern
	public static void main(String[] args)
	{
		// number of spaces
		int i, j, k=2*5-2;

		// outer loop to handle number of rows
		// n in this case
		for(i=0; i<5; i++)
		{

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for(j=0; j<k; j++)
			{
				// printing spaces
				System.out.print(" ");
			}
			
			// decrementing k after each loop
			k = k - 2;// 2 to get left side half pyramid //1 to get full pyramid
			
			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for(j=0; j<=i; j++)
			{
				// printing stars
				System.out.print("* ");
			}
			
			// ending line after each row
			System.out.println();
		}
	}
}

#RPyramid:

#initial programs
class Main {
  public static void main(String[] args) {
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print('*');
      }
    System.out.println();  
    }
  }
}
