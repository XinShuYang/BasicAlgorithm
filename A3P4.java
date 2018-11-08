package A2P2;
import java.util.*;
public class A3P4 {
	public static void bfsnote(int[][] G,int v) {
		for(int i=1;i<G[0].length;i++) {
			if(G[v][i]==1 || G[i][v]==1)
				G[i][i]=1;
		}
	}
	
	public static boolean bfs(int[][] G,int v) {
		for(int i=0;i<G[0].length;i++) {
			if(G[v][i]==1 || G[i][v]==1) {
				System.out.println(v+" "+G[v][v]+" "+i+" "+G[i][i]);
				if(G[v][v]==1 && G[i][i]==1 && i!=v)
					return false;
				else if(G[v][v]==0 && G[i][i]==0 && i!=v)
					return false;
				
			}
				
		}
		/*for(int i=0;i<G[0].length;i++) {
			if((G[v][i]==1 || G[i][v]==1)&& i!=v) {
				int a=v;
					for(int j=0;j<G[0].length;j++) {
						if((G[i][j]==1 || G[j][i]==1)&& i!=j && j!=a) {
							int b=j;
							for(int k=0;k<G[0].length;k++) {
								if((G[j][k]==1 || G[k][j]==1)&& k!=j && k!=i && i!=j) {
									System.out.println(i+""+j+""+k+"!");
									return false;}
							}
						}
							
					}
				
				
			}
				
		}*/
		
		
		return true;
	}
	
	public static void main(String args[]) {
		int n = 5;//number of node
		//boolean[] g= new boolean[n];
		Scanner in=new Scanner(System.in);
		System.out.println("input the number of nodes:");
		n = in.nextInt();
		int[][] G = new int[n][n];
		//initialize
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
		{
			System.out.println("tell me if ("+i+","+j+") is an edge or not(use 1,0)");
			G[i][j]=in.nextInt();
			G[i][i]=0;
			G[n-1][n-1]=0;
		}
		bfsnote(G,0);
		for(int i=1;i<n;i++) {
			boolean w= bfs(G,i);
			if(w==false) {
				System.out.println(i+"Not the 3 layout!");
				System.exit(0);
				
			}}
		System.out.println("3 layout is true!");
	}

}
