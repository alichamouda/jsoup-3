/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:08:30 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.TokenQueue;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokenQueue_ESTest extends TokenQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("a*{35Yo");
      tokenQueue0.consumeAttributeKey();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("N");
      tokenQueue0.consumeAttributeKey();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("_");
      tokenQueue0.consumeAttributeKey();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("_%X");
      tokenQueue0.consumeCssIdentifier();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.consumeCssIdentifier();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("|");
      tokenQueue0.consumeElementSelector();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.consumeTagName();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("JCv7rxVtd?hsilOoCK#");
      tokenQueue0.consumeWord();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenQueue.unescape("y,?");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TokenQueue.unescape("uJ+#5pgm&+m\\r&l");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("~j~Ll&ZbFPp3Kk'");
      Character character0 = Character.valueOf('z');
      tokenQueue0.addFirst(character0);
      tokenQueue0.chompBalanced('6', 'z');
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Z!r@\"MiXCZAMC");
      tokenQueue0.addFirst("Z!r@\"MiXCZAMC");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('Z', '?');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '!r@\"MiXCZAMCZ!r@\"MiXCZAMC'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("q{E}N<rR6L-['rw(}h\"");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('q', 'B');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '{E}N<rR6L-['
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("\"S1?)_V-{GqQV6aab?a");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\"', ']');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'S1?)_V-{GqQV6aab?a'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("\"~ '`&S");
      Character character0 = Character.valueOf('7');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('7', '`');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not find balanced m{rker'at '");
      Character character0 = Character.valueOf('\u001B');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\u001B', '\u001B');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'Did not find balanced m{rker'at ''
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not find balanced marker at '");
      Character character0 = Character.valueOf('\'');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\'', '\'');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'Did not find balanced marker at ''
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("queue did nothi^jkyyts:zxpl@ sequence");
      tokenQueue0.consumeTagName();
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced(' ', ' ');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'did nothi^jkyyts:zxpl@ sequence'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(">`LF`Q*~]-9ib>YF0");
      tokenQueue0.chompBalanced('Z', 'Z');
      tokenQueue0.consumeToIgnoreCase(">`LF`Q*~]-9ib>YF0");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("#8%x");
      tokenQueue0.chompToIgnoreCase("             ");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("<(FxBYdQ0tg");
      // Undeclared exception!
      try { 
        tokenQueue0.consume("iR @l9<JM");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Queue did not match expected sequence
         //
         verifyException("org.jsoup.parser.TokenQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(".UgdI75cT");
      tokenQueue0.consume(".UgdI75cT");
      assertTrue(tokenQueue0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("&");
      tokenQueue0.advance();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.advance();
      assertTrue(tokenQueue0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(":XV.XMg%v;y,?8");
      assertFalse(tokenQueue0.isEmpty());
      
      tokenQueue0.chompTo("oBT3");
      boolean boolean0 = tokenQueue0.matchesWord();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("JCv7rxVtd?hsilOoCK#");
      boolean boolean0 = tokenQueue0.matchesWhitespace();
      assertFalse(boolean0);
      assertEquals('J', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("</dGw/3(cu(vn");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("<yTZz");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(":XV.XMg%v;y,?8");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Wkj%'B5");
      assertEquals('W', tokenQueue0.peek());
      
      tokenQueue0.chompToIgnoreCase("Wkj%'B5");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("a*{35Yo");
      Character character0 = new Character(':');
      tokenQueue0.addFirst(character0);
      tokenQueue0.consumeTagName();
      assertEquals("*{35Yo", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("ku1*BbJ");
      tokenQueue0.chompToIgnoreCase("ku1*BbJ");
      assertEquals("", tokenQueue0.toString());
      
      boolean boolean0 = tokenQueue0.matchesAny((char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("a*{35Yo");
      tokenQueue0.consumeCssIdentifier();
      assertEquals('*', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Z!r@\"MiXCZAMC");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Z!r@\"MiXCZAMC";
      tokenQueue0.consumeToAny(stringArray0);
      assertFalse(tokenQueue0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("jbm;uxw60##D]B");
      tokenQueue0.consumeElementSelector();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "jbm";
      stringArray0[1] = "jbm;uxw60##D]B";
      stringArray0[2] = "jbm";
      stringArray0[3] = "jbm;uxw60##D]B";
      stringArray0[4] = "jbm;uxw60##D]B";
      stringArray0[5] = "jbm";
      stringArray0[6] = "jbm;uxw60##D]B";
      tokenQueue0.consumeToAny(stringArray0);
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("                  ");
      tokenQueue0.consumeWhitespace();
      char char0 = tokenQueue0.peek();
      assertEquals("", tokenQueue0.toString());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("#8%x");
      char char0 = tokenQueue0.peek();
      assertEquals('#', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("                  ");
      String string0 = tokenQueue0.toString();
      assertEquals("                  ", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(":XV.XMg%v;y,?8");
      tokenQueue0.chompToIgnoreCase("oBT3");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("_");
      boolean boolean0 = tokenQueue0.matchesCS("_");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.chompTo("");
      assertTrue(tokenQueue0.isEmpty());
  }
}
