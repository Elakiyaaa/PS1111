package PS11;
 
import java.util.Scanner;

public class PS116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size");
Scanner s=new Scanner(System.in);
int tenp=0;
int n=s.nextInt();
int sum1=0,sum2=0;
int i=0,j=0;
int a[]=new int[n];
int b[]=new int[n];
System.out.println("enter the value1:");
for(i=0;i<n;i++){
	a[i]=s.nextInt();
}
System.out.println("enter the value2:");
for(i=0;i<n;i++){
	b[i]=s.nextInt();
}
for(i=0;i<n;i++){
	sum1=sum1+a[i];
}
System.out.println("sum1 "+sum1);
for(i=0;i<n;i++){
	sum2=sum2+b[i];
}
System.out.println("sum2 "+sum2);
int temp=0;
if(sum1>sum2){
	temp=sum1;
	sum1=sum2;
	sum2=temp;
}
System.out.println(sum1);
	}

}
	
	


