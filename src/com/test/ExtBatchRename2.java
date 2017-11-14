package com.test;

import java.io.*;
/**
 * JAVAʵ�ֵ����������ļ���׺���ĳ���
 * 
 * @author rommnn
 */
public class ExtBatchRename2 {
  /**
   * �޸ĳ���<br>
   * �ڲ��ݹ���ã�������Ŀ¼�ĸ���
   * 
   * @param path
   *          ·��
   * @param from
   *          ԭʼ�ĺ�׺���������Ǹ�(.��)
   * @param to
   *          �����ĺ�׺��Ҳ�����Ǹ�(.��)
   */
  public void reName(String path, String from, String to) {
    File f = new File(path);
    File[] fs = f.listFiles();
    for (int i = 0; i < fs.length; ++i) {
      File f2 = fs[i];
      String name = f2.getName();
      if (name.endsWith(from)) {
    	  f2.renameTo(new File(f2.getParent() + "/" + name.substring(0, name.indexOf(from)) + to));
      }
    }
  }
  public static void main(String[] args) {
    ExtBatchRename rf = new ExtBatchRename();
    rf.reName("C:\\Users\\wty\\Desktop\\������", ".html", ".txt");
  }
}