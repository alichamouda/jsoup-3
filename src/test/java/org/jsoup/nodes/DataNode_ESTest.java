/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:18:25 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("org.jsoup.select.Evaluator$Id", "org.jsoup.select.Evaluator$Id");
      dataNode0.setWholeData("org.jsoup.select.Evaluator$Id");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("", "$VALUES");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataNode dataNode0 = new DataNode("~[G;iVS");
      dataNode0.toString();
  }
}
