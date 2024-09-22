package JavaBasicPrograms;

public class PatternProgram {

	public static void main(String[] args) {
		
		int i,j,k;
		int n=6;
		for(i=1;i<=n;i++) {
			
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
		
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
}