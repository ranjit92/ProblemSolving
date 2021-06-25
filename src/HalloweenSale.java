
public class HalloweenSale {

	public static void main(String[] args) {
		
		int count = getNumberOfGame(20, 3, 6, 85);
		System.out.println(count);
		
		
	}
	
	//20 3  6 80
	//20, 3, 5, 85
	public static int getNumberOfGame(int p, int d, int m, int s) {
		int count = 0;
		int prev = 0;
		if(s > p) {
			s = s-p;
			prev = p;
			count++;
		}
		else return 0;
		
		while(s >=0) {
			
			if( prev- d <= m) {
				s = s-m;
				prev = m;
			}
			
			else {
				s = s - (prev-d);
				prev = prev-d;
				
			}
			
			if(s >=0) {
				count++;
			}
		}
		return count;
	}
	
}
