package com.test1;

import java.util.ArrayList;

public class MinCostRoute {
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟酵硷拷锟斤拷锟斤拷械牡锟斤拷锟斤拷小锟斤拷锟斤拷路锟斤拷
    public static int[]  Dijsktra(int[][] weight,int start){
        //锟斤拷锟斤拷一锟斤拷锟斤拷锟斤拷图锟斤拷权锟截撅拷锟襟，猴拷一锟斤拷锟斤拷锟斤拷锟絪tart锟斤拷锟斤拷0锟斤拷牛锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟叫ｏ拷
        //锟斤拷锟斤拷一锟斤拷路锟斤拷
        int n = weight.length;        //锟斤拷锟斤拷锟斤拷锟�
        int[] v = new int[n];    //  锟斤拷锟矫恳伙拷锟斤拷锟斤拷前一锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷亩锟斤拷悖★拷锟斤拷锟�
        int[] visited = new int[n];        //锟斤拷堑锟角帮拷枚锟斤拷锟斤拷锟斤拷锟铰凤拷锟斤拷欠锟斤拷丫锟斤拷锟斤拷,1锟斤拷示锟斤拷锟斤拷锟�
        
        //锟斤拷始锟斤拷
        for (int i = 0; i < n; i++) {
			v[i] = start;
		}
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)        //要锟斤拷锟斤拷n-1锟斤拷锟斤拷锟斤拷
        {
            int k = -1;    //选锟斤拷一锟斤拷锟斤拷锟斤拷锟绞硷拷锟斤拷锟絪tart锟斤拷锟斤拷锟轿达拷锟角讹拷锟斤拷
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            //锟斤拷锟斤拷选锟斤拷锟侥讹拷锟斤拷锟斤拷为锟斤拷锟斤拷锟斤拷锟斤拷路锟斤拷
            //v[k] = start;
            visited[k] = 1;
            
            //锟斤拷k为锟叫硷拷锟斤拷耄拷锟斤拷锟斤拷锟絪tart锟斤拷未锟斤拷锟绞革拷锟斤拷木锟斤拷锟�
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
    
    //閲嶈浇鏈�煭璺緞绠楁硶锛屾坊鍔爀xist鏁扮粍锛屽凡缁忚姹傚嚭鐨勬渶鐭矾寰勪笂鐨勭偣锛堥櫎浜嗛灏剧殑鐐癸級鏍囪涓�
    public static int[]  Dijsktra(int[][] weight,int start,int[] exist){
        
        int n = weight.length;        
        int[] v = new int[n];    
        int[] visited = new int[n];        
        
        for (int i = 0; i < n; i++) {
			v[i] = start;
		}
        visited[start] = 1;
        
        for(int count = 1;count <= n - 1;count++)     
        {
            int k = -1;    
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && exist[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }    
            }
            
            
            visited[k] = 1;
            
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && exist[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i]){
                     weight[start][i] = weight[start][k] + weight[k][i];
                	 v[i] = k;
                } 
            }    
    
        }
        
        return v;
    }
    
    
    
    public static int[] returnMinCostRoad(int[][] costMatrix,int start,int end){
	     
	    int[] v = Dijsktra(costMatrix, start);
	    ArrayList<Integer> arrayList = new ArrayList<>();
		int i = end;
		arrayList.add(end);
		while(v[i] != start){
			arrayList.add(v[i]);
			i = v[i];
		}
		arrayList.add(start);
		int[] a = new int[arrayList.size()];
		for (int j = 0; j < a.length; j++) {
			a[j] = arrayList.get(j);
		}
		return a;
    }
	
    
    
  	public static void main(String[] args){
  		int[][] cost= {{0,4,2,100,100,100},
  				       {4,0,1,5,100,100},
  				       {2,1,0,8,10,100},
  				       {100,5,8,0,2,6},
  				       {100,100,10,2,0,3},
  				       {100,100,100,6,3,0}};

  		int[]a = returnMinCostRoad(cost, 2,5);
  		for (int i = 0; i < a.length; i++) {
			System.out.println(  a[i]);
		}
  	}
}
