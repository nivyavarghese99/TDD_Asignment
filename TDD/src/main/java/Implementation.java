

	public class Implementation  {
		
		public long add(long...ls) {
			
			long result= 0;
			
			for(long temp : ls) {
				
				result += temp;
				
			}
			
			return result;
			
		}
		
		
		
		public long sub(long...ls) {
		
		long result = ls[0];
		for(int i=1; i<ls.length; i++) {
			
			result -= ls[i];
		}
		
		return result;
	}
		
	}