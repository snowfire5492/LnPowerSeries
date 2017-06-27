 /**
 * CS 301: Numerical Methods
 * Professor: A. Khakpour
 *
 * Computer Exercise: 1.2 #24
 *
 * @author - Eric Schenck
 * last modified: June 27, 2017
 *   
 */
public class LnPowerSeries {
	public static void main(String[] args){
		
		float natLog1 = 0;		// used to hold Data for ln(1+x)
		float natLog2 = 0;		// used to hold Data for ln(1+x / 1-x)
		float x1 = 1; 			
		float x2 = (float)0.333333;	// values of x1, x2 chosen to get ln(2)
		
		float absError1, absError2; // used to hold absError for both cases
		float relError1, relError2; // relative Error 
		
		// used to calculate ln(1+x)
		for(int i = 1; i < 9 ; ++i){ 
			natLog1 += (Math.pow(-1, i-1)/i) * Math.pow(x1, i);
		}
		
		// used to calculate ln(1+x / 1-x)
		for(int i = 0; i < 6 ; ++i){
			natLog2 += (Math.pow(x2, 2*i+1)) / (2*i+1);
		}
		natLog2 *= 2; 			// completes operation

		// computes both absolute Errors
		absError1 = (float)Math.abs(Math.log(2) - natLog1);
		absError2 = (float)Math.abs(Math.log(2) - natLog2);
		// computes both relative Errors
		relError1 = absError1 / (float)Math.abs(Math.log(2));
		relError2 = absError2 / (float)Math.abs(Math.log(2));
		
		System.out.printf("x = 1 : ln(1+x) = %.5f\n", natLog1);
		System.out.printf("x = 1/3 : ln((1+x)/(1-x)) = %.5f\n\n", natLog2);
		
		System.out.printf("Absolute Error for ln(1+x) = %.5f\n", absError1);
		System.out.printf("Absolute Error for ln((1+x)/(1-x)) = "
				+ "%.10f\n\n", absError2);
		
		System.out.printf("Relative Error for ln(1+x) = %.5f\n", relError1);
		System.out.printf("Relative Error for ln((1+x)/(1-x)) = "
				+ "%.10f\n", relError2);	
	}
}
