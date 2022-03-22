/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:16:05 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isEOF();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.isEOF();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("GL7JSZ,@-3Yp~5");
      token_CData0.isCharacter();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isCharacter();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      Token.TokenType token_TokenType0 = Token.TokenType.Comment;
      token_Doctype0.type = token_TokenType0;
      token_Doctype0.isComment();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.isComment();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.isEndTag();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      token_EOF0.isEndTag();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.isStartTag();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.isDoctype();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName(']');
      token_StartTag0.newAttribute();
      // Undeclared exception!
      try { 
        token_StartTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeValue("");
      token_EndTag0.appendAttributeValue("<EndTag>");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      int[] intArray0 = new int[4];
      token_EndTag0.appendAttributeValue(intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      char[] charArray0 = new char[3];
      token_StartTag0.appendAttributeValue(charArray0);
      token_StartTag0.appendAttributeValue("=\"");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName(">");
      token_EndTag0.appendAttributeName('*');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendTagName("EndTag");
      token_StartTag0.appendTagName('_');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendTagName("EndTag");
      String string0 = token_StartTag0.toString();
      assertEquals("<EndTag>", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName(']');
      token_StartTag0.setEmptyAttributeValue();
      token_StartTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName('g');
      token_StartTag0.appendAttributeValue("VG.}w!");
      token_StartTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName("");
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName("!L5QYYb]]S2/8x4");
      token_StartTag0.finaliseTag();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Token.reset((StringBuilder) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      boolean boolean0 = token_Doctype0.isForceQuirks();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPublicIdentifier();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPubSysKey();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.reset();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getName();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getSystemIdentifier();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      String string0 = token_Character0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("");
      Token token0 = token_CData0.reset();
      assertSame(token0, token_CData0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("<!---->");
      String string0 = token_CData0.toString();
      assertEquals("<![CDATA[<!---->]]>", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token token0 = token_Comment0.reset();
      assertSame(token_Comment0, token0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      String string0 = token_Comment0.toString();
      assertEquals("<!---->", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      boolean boolean0 = token_StartTag0.isSelfClosing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeValue('(');
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName('-');
      char[] charArray0 = new char[9];
      token_StartTag0.appendAttributeValue(charArray0);
      token_StartTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.Tag token_Tag0 = token_EndTag0.name("");
      assertSame(token_EndTag0, token_Tag0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      String string0 = token_EndTag0.normalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Attributes attributes0 = token_EndTag0.getAttributes();
      assertNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      // Undeclared exception!
      try { 
        token_EOF0.asComment();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$Comment
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      // Undeclared exception!
      try { 
        token_Character0.asDoctype();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$Character cannot be cast to org.jsoup.parser.Token$Doctype
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.asStartTag();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EndTag cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      // Undeclared exception!
      try { 
        token_EOF0.asCharacter();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$Character
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Token.EndTag token_EndTag1 = token_EndTag0.asEndTag();
      assertSame(token_EndTag0, token_EndTag1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      String string0 = token_EOF0.tokenType();
      assertEquals("EOF", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      boolean boolean0 = token_Character0.isCData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token token0 = token_EOF0.reset();
      assertSame(token0, token_EOF0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.Tag token_Tag0 = token_StartTag0.reset();
      assertSame(token_StartTag0, token_Tag0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("", (Attributes) null);
      // Undeclared exception!
      try { 
        token_StartTag1.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
