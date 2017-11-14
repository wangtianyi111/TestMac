package com.test;


/*public class Dijkstra {
	
	
	public static void main(String[] args) {
		int[][] tu = { { 0, 1, 3, -1, -1, -1 }, { 1, 0, 1, 7, 5, -1 },
				{ 3, 1, 0, -1, 2, -1 }, { -1, 7, -1, 0, 2, 1 },
				{ -1, 5, 2, 2, 0, 4 }, { -1, -1, -1, 1, 4, 0 } };
		showPaths(tu);
	}

	private static void showPaths(int[][] tu) {
		String[] paths = { "V0", "V0", "V0", "V0", "V0", "V0" };// �ô���¼·��
		int[] s = { 1, 0, 0, 0, 0, 0 };// 0-5��������V0-V5, 1�������ҵ��˽ڵ�����·����0����û��
		int[] pathLength = { 0, -1, -1, -1, -1, -1 };// ��¼��V0��ÿ���ڵ�����·������;
		//�Ͻ�˹�����㷨
		for (int i = 1; i < 6; i++) {//ѭ��5�Σ��ҵ���V0�⣬V0�������ڵ�����·��
			int min = Integer.MAX_VALUE;//��¼�˴�ѭ���õ��Ĵζ�·���ĳ���
			int v = 0;//��¼��ǰ�ҵ��Ĵζ�·�����յ�
			int vlast = 0;//�յ��ǰһ���ڵ�
			for (int j = 0; j < s.length; j++) {
				if (s[j] == 0) {//��û���ҵ����·���Ľڵ����
					int minOfOne = Integer.MAX_VALUE;//��¼��V0����ǰ�ڵ�����·��
					int len;//·������
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
			s[v] = 1;//���ҵ�
			pathLength[v] = min;//¼�볤��
		}
		for (int i = 1; i < pathLength.length; i++) {
			System.out.print("V0��V" + i + "���·����" + pathLength[i] + " ");
			System.out.println(paths[i]);
		}
	}
}*/











//��ţ���㷨��������

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
        //����һ������ͼ��Ȩ�ؾ��󣬺�һ�������start����0��ţ�������������У�
        //����һ��int[] ���飬��ʾ��start���������·������
        int n = weight.length;        //�������
        int[] shortPath = new int[n];    //��Ŵ�start��������������·��
        int[] visited = new int[n];        //��ǵ�ǰ�ö�������·���Ƿ��Ѿ����,1��ʾ�����
        
        //��ʼ������һ���������
        shortPath[start] = 0;
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)        //Ҫ����n-1������
        {
            int k = -1;    //ѡ��һ�������ʼ����start�����δ��Ƕ���
            int dmin = 1000;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            //����ѡ���Ķ�����Ϊ��������·�����ҵ�start�����·������dmin
            shortPath[k] = dmin;
            visited[k] = 1;
            
            //��kΪ�м���룬������start��δ���ʸ���ľ���
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i])
                     weight[start][i] = weight[start][k] + weight[k][i];
            }    
    
        }
        
        return shortPath;
    }
}