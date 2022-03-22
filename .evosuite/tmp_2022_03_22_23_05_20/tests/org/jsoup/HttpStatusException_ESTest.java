/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:18:12 GMT 2022
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.HttpStatusException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpStatusException_ESTest extends HttpStatusException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("2S5g@f&", 2747, "");
      String string0 = httpStatusException0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("2S5g@f&", 2747, "");
      int int0 = httpStatusException0.getStatusCode();
      assertEquals(2747, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HttpStatusException httpStatusException0 = new HttpStatusException("2S5g@f&", 2747, "");
      String string0 = httpStatusException0.getUrl();
      assertEquals("", string0);
  }
}