package com.test;

public class TestDijk {
	
	
	
	
	//���������ͼ�����еĵ����С����·��
    public static int[]  Dijsktra(int[][] weight,int start){
        //����һ������ͼ��Ȩ�ؾ��󣬺�һ�������start����0��ţ�������������У�
        //����һ��·��
        int n = weight.length;        //�������
        int[] v = new int[n];    //  ���ÿһ�����ǰһ������������Ķ��㣡����
        int[] visited = new int[n];        //��ǵ�ǰ�ö�������·���Ƿ��Ѿ����,1��ʾ�����
        
        //��ʼ��
        for (int i = 0; i < n; i++) {
			v[i] = start;
		}
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)        //Ҫ����n-1������
        {
            int k = -1;    //ѡ��һ�������ʼ����start�����δ��Ƕ���
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            //����ѡ���Ķ�����Ϊ��������·��
            //v[k] = start;
            visited[k] = 1;
            
            //��kΪ�м���룬������start��δ���ʸ���ľ���
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
    
    
    
    //��ӡ�����·��-----������֤��
    /*public static void printMinCostRoad(int[][] costMatrix,int start,int end){
	     
	    int[] v = Dijsktra(costMatrix, start);
		int i = end;
		System.out.print("��" + i + " ");
		while(v[i] != start){
			System.out.print("��" + v[i] + " ");
			i = v[i];
		}
		System.out.print("��" + v[i] + " ");
    }*/
	
    
    //������֤
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
