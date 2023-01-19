package functionalinterfacelambdaexample;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		SumArray sa = (arr) -> {
			int sum = 0;
			for(int a : arr) {
				sum = sum + a;
			}
		}
	}

}
