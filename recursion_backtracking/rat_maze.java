import java.util.Scanner;

public class rat_maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
        char maze[][]=new char[m][n];    // 2D array input structure.
        for(int i=0;i<m;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                maze[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[m][n];
        maze(maze,0,0,m,n,ans);
        if(x==false);
        System.out.println("PATH NOT FOUND.");
        
    }
    static boolean x=false;
    public static void maze(char maze[][],int r,int c,int m,int n,int ans[][]){
        if(r<0 || c<0 || r>=m || c>=n || maze[r][c]=='X' ){
            return;
        }
        if(r==m-1 && c==n-1){
            ans[r][c]=1;
            println(ans,m,n);
            x=true;
            return;
        }
        maze[r][c]='X';
        ans[r][c]=1;
        int ro[]={-1,0,0,1};
        int co[]={0,-1,1,0};
        // maze(maze,r-1,c,m,n,ans);
        // maze(maze,r+1,c,m,n,ans);
        // maze(maze,r,c+1,m,n,ans);
        // maze(maze,r,c-1,m,n,ans);
        for(int i=0;i<co.length;i++){
            maze(maze,r+ro[i],c+co[i],m,n,ans);
            
        }
        maze[r][c]='0';             // backtrack
        ans[r][c]=0;              // backtrack
    }
    public static void println(int ans[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}