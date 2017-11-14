package com.test;

public class TestDijk {
	
	
	
	
	//求服务器到图中所有的点的最小费用路径
    public static int[]  Dijsktra(int[][] weight,int start){
        //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）
        //返回一个路径
        int n = weight.length;        //顶点个数
        int[] v = new int[n];    //  存放每一个点的前一个距离它最近的顶点！！！
        int[] visited = new int[n];        //标记当前该顶点的最短路径是否已经求出,1表示已求出
        
        //初始化
        for (int i = 0; i < n; i++) {
			v[i] = start;
		}
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)        //要加入n-1个顶点
        {
            int k = -1;    //选出一个距离初始顶点start最近的未标记顶点
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            //将新选出的顶点标记为已求出最短路径
            //v[k] = start;
            visited[k] = 1;
            
            //以k为中间点想，修正从start到未访问各点的距离
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]){
                     weight[start][i] = weight[start][k] + weight[k][i];
                	 v[i] = k;
                } 
            }    
    
        }
        
        return v;
    }
    
    
    
    //打印出最短路径-----用于验证的
    /*public static void printMinCostRoad(int[][] costMatrix,int start,int end){
	     
	    int[] v = Dijsktra(costMatrix, start);
		int i = end;
		System.out.print("点" + i + " ");
		while(v[i] != start){
			System.out.print("点" + v[i] + " ");
			i = v[i];
		}
		System.out.print("点" + v[i] + " ");
    }*/
	
    
    //用于验证
  	/*public static void main(String[] args){
  		int[][] cost= {{0,4,2,100,100,100},
  				       {4,0,1,5,100,100},
  				       {2,1,0,8,10,100},
  				       {100,5,8,0,2,6},
  				       {100,100,10,2,0,3},
  				       {100,100,100,6,3,0}};

  		printMinCostRoad(cost, 0, 3);
  	}*/
}
