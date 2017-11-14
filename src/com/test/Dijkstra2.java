package com.test;


import java.util.Scanner;

//���·�����
public class Dijkstra2{
    static class GraphMatrix{
        static final int MaxNum=20;
        char[] Vertex=new char[MaxNum];  //���涥����Ϣ����Ż���ĸ��
        int GType;    //ͼ�����ͣ�0������ͼ��1������ͼ��
        int VertexNum;        //���������
        int EdgeNum;        //�ߵ�����
        int[][] EdgeWeight=new int[MaxNum][MaxNum];        //����ߵ�Ȩ
        int[] isTrav=new int[MaxNum];        //������־
    }
    
    static final int MaxValue=65535;    //���ֵ������Ϊһ�����������
    static int[] path=new int[GraphMatrix.MaxNum];    //���㾭���Ķ��㼯�ϵ�����   ���·������������
    static int[] tmpvertex=new int[GraphMatrix.MaxNum];  //���·������ʼ�㼯��
    static Scanner input=new Scanner(System.in);
    
    //�����ڽӾ���ͼ
    static void CreateGraph(GraphMatrix GM){
        int i,j,k;
        int weight;     //Ȩ
        char EstartV,EendV;        //�ߵ���ʼ����
        System.out.printf("����ͼ�и�������Ϣ\n");
        for(i=0;i<GM.VertexNum;i++){        //���붥��
            System.out.printf("��%d�����㣺", i+1);
            GM.Vertex[i]=(input.next().toCharArray())[0];  //���浽�����������Ԫ����
        }
        System.out.printf("���빹�ɸ��ߵĶ��㼰Ȩֵ��\n");
        for(k=0;k<GM.EdgeNum;k++){            //����ߵ���Ϣ
            System.out.printf("��%d���ߣ�", k+1);
            EstartV=input.next().charAt(0);
            EendV=input.next().charAt(0);
            weight=input.nextInt();
            for(i=0;EstartV!=GM.Vertex[i];i++);      //�����ж����в���ʼ��
            for(j=0;EendV!=GM.Vertex[j];j++);        //�����еĶ����в����յ�
            GM.EdgeWeight[i][j]=weight;          //��Ӧλ�ñ���Ȩֵ����ʾ��һ����
            if(GM.GType==0){        //��������ͼ
                GM.EdgeWeight[j][i]=weight;        //�ڶԽ�λ�ñ���Ȩֵ
            }
        }
    }

    // ��վ���
    static void ClearGraph(GraphMatrix GM) {
        int i, j;
        for (i = 0; i < GM.VertexNum; i++) {
            for (j = 0; j < GM.VertexNum; j++) {
                GM.EdgeWeight[i][j] = MaxValue; // ���þ����и�Ԫ�ص�ֵΪMaxValue
            }
        }
    }

    // ����ڽӾ���
    static void OutGraph(GraphMatrix GM) {
        int i, j;
        for (j = 0; j < GM.VertexNum; j++) {
            System.out.printf("\t%c", GM.Vertex[j]); // �ڵ�һ�����������Ϣ
        }
        System.out.println();
        for (i = 0; i < GM.VertexNum; i++) {
            System.out.printf("%c", GM.Vertex[i]);
            for (j = 0; j < GM.VertexNum; j++) {
                if (GM.EdgeWeight[i][j] == MaxValue) { // ��ȨֵΪ���ֵ
                    System.out.printf("\tZ"); // ��Z��ʾ�����
                } else {
                    System.out.printf("\t%d", GM.EdgeWeight[i][j]); // ����ߵ�Ȩֵ
                }
            }
            System.out.println();
        }
    }
    
    //���·���㷨
    static void distMin(GraphMatrix GM,int vend){    //vendΪ������
        int[] weight=new int[GraphMatrix.MaxNum];        //ĳ��ֹ�㵽����������·������
        int i,j,k,min;
        vend--;
        for(i=0;i<GM.VertexNum;i++){        //��ʼ��weight����
            weight[i]=GM.EdgeWeight[vend][i];
        }
        for(i=0;i<GM.VertexNum;i++){        //��ʼ��path����
            if(weight[i]<MaxValue&&weight[i]>0){    //��ЧȨֵ
                path[i]=vend;
            }
        }
        for(i=0;i<GM.VertexNum;i++){        //��ʼ��tmpvertex����
            tmpvertex[i]=0;            //��ʼ�����㼯��Ϊ��
        }
        tmpvertex[vend]=1;        //ѡ�붥��vend    ��ʶ�Ƿ���ʹ�����
        weight[vend]=0;
        for(i=0;i<GM.VertexNum;i++){        //����δ�ö������СȨֵ
            min=MaxValue;
            k=vend;
            for(j=0;j<GM.VertexNum;j++){
                if(tmpvertex[j]==0&&weight[j]<min){
                    min=weight[j];
                    k=j;
                }
            }
            tmpvertex[k]=1;            //������kѡ��
            for(j=0;j<GM.VertexNum;j++){        //�Զ���kΪ�м�㣬���¼���Ȩֵ
                if(tmpvertex[j]==0&&weight[k]+GM.EdgeWeight[k][j]<weight[j]){
                    weight[j]=weight[k]+GM.EdgeWeight[k][j];
                    path[j]=k;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        GraphMatrix GM=new GraphMatrix();   //���屣���ڽӱ�ṹ��ͼ
        String go;
        int vend;
        int i,k;
        System.out.println("������·�����⣡");
        do{
            System.out.print("������������ͼ�����ͣ�");
            GM.GType=input.nextInt();   //ͼ������
            System.out.print("������ͼ�Ķ���������");
            GM.VertexNum=input.nextInt();         //����ͼ�ж�����
            System.out.print("������ͼ�ıߵ�������");
            GM.EdgeNum=input.nextInt();        //����ͼ�б���
            ClearGraph(GM);            //���ͼ
            CreateGraph(GM);        //�����ڽӱ�ṹ��ͼ
            
            System.out.print("\n����������㣺");
            vend=input.nextInt();
            
            distMin(GM,vend);
            vend--;
            System.out.printf("\n�����㵽�ﶥ��%c�����·���ֱ�Ϊ����ʼ��-�����㣩��\n",GM.Vertex[vend]);
            for(i=0;i<GM.VertexNum;i++){        //������
                if(tmpvertex[i]==1){    //��·����Ϊ1
                    k=i;
                    while(k!=vend){
                        System.out.printf("����%c-", GM.Vertex[k]);
                        k=path[k];    //������ָ��k�������һ�������𣿣�����
                    }
                    System.out.printf("����%c\n", GM.Vertex[k]);
                }else{
                    System.out.printf("%c-%c:��·��\n", GM.Vertex[i],GM.Vertex[vend]);
                }
            }
            System.out.println("\n��������y/n��?");
            go=input.next();
        }while(go.equalsIgnoreCase("y"));
        System.out.println("��Ϸ������");
    }

}