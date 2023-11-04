

public class amstrongNum {

	public static void main(String[] args) {

		int num =371;
		int r;
		int sum = 0;
		int temp = num;

		while(num>0){
			r=num%10;
			sum = sum+(r*r*r);
			num = num/10;


		}
		if(sum == temp) {
			System.out.println("It is a Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
		System.out.println(sum);
	}

}
