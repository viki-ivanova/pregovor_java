package zad_2;

public class ComparableSquare_Test {
	 public static void main(String[] args){
	        ComparableSquare cS1 = new ComparableSquare(new double[]{5,5,5,5});
	        ComparableSquare cS2 = new ComparableSquare(new double[]{7,7,7,7});
	        System.out.println("Compare result: " + cS1.compareTo(cS2));
	    }
}
