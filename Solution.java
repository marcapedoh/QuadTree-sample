public class Solution{

    public static Node construct(int[][] grid){
        return help(grid,0,0,grid.length);
    }

    private static Node help(int[][] grid, int r, int c, int n){
        boolean allSame=true;
        int init=grid[r][c];
        for(int i=r;i<r+n;i++){
            for(int j=c;j<c+n;j++){
                if(grid[i][j]!=init){
                    allSame=false;
                    break;
                }
            }

        }

        if(allSame){
            return new Node(init==1,true);
        }

        Node topLeft= help(grid,r,c,n/2);
        Node topRight= help(grid,r,c+n/2,n/2);
        Node bottomLeft= help(grid,r+n/2,c,n/2);
        Node bottomRight= help(grid,r+n/2,c+n/2,n/2);
        return new Node(false,false,topLeft,topRight,bottomLeft,bottomRight);
    }
    public static void main(String[] args){
        int[][] grid = {
    {1, 1, 0, 0},
    {1, 1, 0, 0},
    {0, 0, 1, 1},
    {0, 0, 1, 1}
};
        System.out.println(construct(grid).toString());
    }
}