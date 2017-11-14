package com.test;


/*public class Dijkstra {
	
	
	public static void main(String[] args) {
		int[][] tu = { { 0, 1, 3, -1, -1, -1 }, { 1, 0, 1, 7, 5, -1 },
				{ 3, 1, 0, -1, 2, -1 }, { -1, 7, -1, 0, 2, 1 },
				{ -1, 5, 2, 2, 0, 4 }, { -1, -1, -1, 1, 4, 0 } };
		showPaths(tu);
	}

	private static void showPaths(int[][] tu) {
		String[] paths = { "V0", "V0", "V0", "V0", "V0", "V0" };// 用串记录路径
		int[] s = { 1, 0, 0, 0, 0, 0 };// 0-5索引代表V0-V5, 1代表已找到此节点的最短路径，0代表没有
		int[] pathLength = { 0, -1, -1, -1, -1, -1 };// 记录从V0到每个节点的最短路径长度;
		//迪杰斯特拉算法
		for (int i = 1; i < 6; i++) {//循环5次，找到除V0外，V0到其他节点的最短路径
			int min = Integer.MAX_VALUE;//记录此次循环得到的次短路径的长度
			int v = 0;//记录当前找到的次短路径的终点
			int vlast = 0;//终点的前一个节点
			for (int j = 0; j < s.length; j++) {
				if (s[j] == 0) {//对没有找到最短路径的节点遍历
					int minOfOne = Integer.MAX_VALUE;//记录从V0到当前节点的最短路径
					int len;//路径长度
					for (int n = 0; n < 6; n++) {
						if (s[n] == 1 && tu[n][j] != -1) {
							len = pathLength[n] + tu[n][j];
							if (len < minOfOne) {
								minOfOne = len;
								vlast = n;
							}
						}
					}
					if (minOfOne < min) {
						min = minOfOne;
						v = j;
						paths[v] = paths[vlast] + " V" + v;
					}
				}
			}
			s[v] = 1;//已找到
			pathLength[v] = min;//录入长度
		}
		for (int i = 1; i < pathLength.length; i++) {
			System.out.print("V0到V" + i + "最短路径：" + pathLength[i] + " ");
			System.out.println(paths[i]);
		}
	}
}*/











//贼牛逼算法！！！！

public class Dijkstra {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] weight = {
                {0,3,9999999,7,9999999},
                {3,0,4,2,9999999},
                {9999999,4,0,5,6},
                {7,2,5,0,4},
                {9999999,9999999,6,4,0}
        };
        
        int[] path = Dijsktra(weight,0);
        for(int i = 0;i < path.length;i++)
            System.out.print(path[i] + "  ");
    }
    

    public static int[] Dijsktra(int[][] weight,int start){
        //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）
        //返回一个int[] 数组，表示从start到它的最短路径长度
        int n = weight.length;        //顶点个数
        int[] shortPath = new int[n];    //存放从start到其他各点的最短路径
        int[] visited = new int[n];        //标记当前该顶点的最短路径是否已经求出,1表示已求出
        
        //初始化，第一个顶点求出
        shortPath[start] = 0;
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)        //要加入n-1个顶点
        {
            int k = -1;    //选出一个距离初始顶点start最近的未标记顶点
            int dmin = 1000;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin
            shortPath[k] = dmin;
            visited[k] = 1;
            
            //以k为中间点想，修正从start到未访问各点的距离
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i])
                     weight[start][i] = weight[start][k] + weight[k][i];
            }    
    
        }
        
        return shortPath;
    }
}