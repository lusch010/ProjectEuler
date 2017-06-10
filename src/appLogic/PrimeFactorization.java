package appLogic;

public class PrimeFactorization implements Problem{

	@Override
	public double getSolution(double max) {
	    long x=600851475143L;
	    long biggest=0L;
	    for(long i=2L; i<=x; i++){
	        for(long l=1L; l<=Math.sqrt(i); l++){
	            if(l%i==0){
	                break;
	            } else{
	                while(x%i==0){
	                    x=x/i;
	                    biggest =i;
	                }
	            }
	        }
	    }
	    
		return biggest;
	}
	
}
