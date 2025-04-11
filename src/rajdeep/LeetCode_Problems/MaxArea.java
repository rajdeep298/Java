package rajdeep.LeetCode_Problems;

public class MaxArea {
    public static void main(String[] args) {
        int [][] arr={{0,1,1,1,1},
                      {1,1,1,1,0},
                      {0,1,1,1,0},
                      {1,1,1,1,0},
                      {1,1,1,1,1},
                      {0,0,0,0,0}};

        int maxArea=1;
        for(int i = 0; i < 6;i ++){
            for(int j=0;j<5;j++){
                int area=maxArea;
                if(arr[i][j]==0) {
                    area =1;
                    continue;
                }
                boolean check = true;
                for(int k=i; k<=6-i && k<6;k++){
                    for(int l=j;l<=5-j && l<5;l++){
                        for(int a=k;a<=k+area && a<6;a++){
                            for(int b=l;b<=l+area && b<5;b++){
                                if(arr[a][b]==0) check=false;
                            }
                        }
                        if(check) area++;
                        check =true;
                    }
                }
                if(area>=maxArea) maxArea=area;
            }
        }
        System.out.println("max area is:"+maxArea*maxArea+"sq.units");
    }
}
