/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:17:56 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Element;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CombiningEvaluator_ESTest extends CombiningEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      CombiningEvaluator.Or combiningEvaluator_Or1 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.add(combiningEvaluator_Or1);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = combiningEvaluator_Or0.matches(element0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[0];
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      combiningEvaluator_Or0.add(combiningEvaluator_And0);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = combiningEvaluator_Or0.matches(element0, element0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Evaluator[] evaluatorArray0 = new Evaluator[4];
      evaluatorArray0[0] = (Evaluator) combiningEvaluator_Or0;
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      boolean boolean0 = combiningEvaluator_And0.matches((Element) null, (Element) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      Evaluator evaluator0 = combiningEvaluator_Or0.rightMostEvaluator();
      assertNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[4];
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(evaluatorArray0);
      // Undeclared exception!
      try { 
        combiningEvaluator_And0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      String string0 = combiningEvaluator_Or0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Evaluator[] evaluatorArray0 = new Evaluator[0];
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(evaluatorArray0);
      // Undeclared exception!
      try { 
        combiningEvaluator_Or0.replaceRightMostEvaluator((Evaluator) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or();
      combiningEvaluator_Or0.add(combiningEvaluator_Or0);
      Evaluator evaluator0 = combiningEvaluator_Or0.rightMostEvaluator();
      assertSame(combiningEvaluator_Or0, evaluator0);
  }
}