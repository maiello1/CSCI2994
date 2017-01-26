package week02;

public class week02 {

	public static void main(String[] args) {
				
		String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] highTemperatures = {45, 29, 10, 22, 41, 28, 33};
        double[] precip = {0.95, 0.60, 0.25, 0.05, 0, 0.75, 0.90};
        
        System.out.println("Days next week with high temperature less than or equal to 32\n"
        		+ "and probability of precipation greater than 50%:");

        for (int i = 0; i < dayNames.length; i++) {
                      
            /*
            if (highTemperatures[i] > 32 || precip[i] <= 0.50) {
            	//continue;
        	}
        	  System.out.println(dayNames[i]);
        	*/
        	
        	if (highTemperatures[i] <= 32 && precip[i] > 0.50){
        			 System.out.println(dayNames[i]);
           }
        
        }
	}
}

