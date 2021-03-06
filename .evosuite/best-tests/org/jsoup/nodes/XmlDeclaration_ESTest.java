/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:17:02 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlDeclaration_ESTest extends XmlDeclaration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("Tag name must not be empty.", "{XZC?JKz^C", true);
      xmlDeclaration0.toString();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("S)", "S)", false);
      xmlDeclaration0.getWholeDeclaration();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("%;cl~@n_\"e[@", false);
      xmlDeclaration0.toString();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", false);
      xmlDeclaration0.name();
      assertEquals("#declaration", xmlDeclaration0.nodeName());
  }
}
