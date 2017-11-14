package com.test;

import java.io.*;
/**
 * JAVA实现的批量更改文件后缀名的程序。
 * 
 * @author rommnn
 */
public class ExtBatchRename2 {
  /**
   * 修改程序。<br>
   * 内部递归调用，进行子目录的更名
   * 
   * @param path
   *          路径
   * @param from
   *          原始的后缀名，包括那个(.点)
   * @param to
   *          改名的后缀，也包括那个(.点)
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
    rf.reName("C:\\Users\\wty\\Desktop\\国富论", ".html", ".txt");
  }
}