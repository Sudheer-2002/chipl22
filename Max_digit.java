import java.util.*;
class Max_digit {
    public static void main(String[] args) {
        int rem,max=0;
	Scanner sc=new Scanner(System.in);
	System.out.printf("Enter a number:");
	int num=sc.nextInt();
        while(num>0){
            rem=num%10;
            System.out.println(rem);
		if(rem>max){
			max=rem;
		}
            num=num/10;
        }
	System.out.println("The largest digit is " +max);
    }
}
