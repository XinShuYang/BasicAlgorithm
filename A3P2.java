package A2P2;
import java.math.*;
public class A3P2 {
	public static void main(String args[]) {
		int[] A= {1,9,5,4,3,2,5};
		int l = A.length;
		int k = 5;
		int[][][] e=new int[l][l][k];
		int temp;
		for(int i=0;i<=l-1;i++)
					e[i][i][0]=A[i];
		for(int i=0;i<=l-1;i++)
			for(int j=i+1;j<=l-1;j++) 
				e[i][j][0]=e[i][j-1][0]+e[j][j][0];
		for(int q=1;q<=k-1;q++)
			for(int i=0;i<=l-1-q;i++)
				for(int j=i+q;j<=l-1;j++) {
					int max=Integer.MIN_VALUE;
					for(int r=i;r<j;r++) {
						temp=Math.min(e[i][r][q-1],e[r+1][j][0]);
						//System.out.println(e[i][r][q-1]+" "+e[r][j][0]);
						if(temp>max)
							max=temp;}
					e[i][j][q]= max;
					System.out.println("e["+i+"]["+j+"]["+q+"]="+max);
					
				}
		
	}

}
