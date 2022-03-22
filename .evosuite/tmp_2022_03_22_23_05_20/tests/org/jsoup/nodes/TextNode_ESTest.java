/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:14:42 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document document0 = Document.createShell("P4/:nU#G@");
      document0.prependChild(textNode0);
      Pattern pattern0 = Pattern.compile("Scanner-", 58);
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      assertEquals(0, elements0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document document0 = Document.createShell("P4/:nU#G@");
      textNode0.setParentNode(document0);
      TextNode textNode1 = textNode0.splitText(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.outline(true);
      textNode1.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
      assertEquals("\nP4/:nU#G@", stringBuilder0.toString());
      assertEquals(1, textNode1.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document document0 = Document.createShell("P4/:nU#G@");
      textNode0.setParentNode(document0);
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.outline(true);
      textNode0.outerHtmlHead(stringBuilder0, (-137), document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      textNode0.outerHtmlHead(stringBuilder0, (-137), document_OutputSettings1);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document document0 = Document.createShell("P4/:nU#G@");
      textNode0.setParentNode(document0);
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals(1, textNode1.siblingIndex());
      
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      textNode0.outerHtmlHead(stringBuilder0, (-137), document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      // Undeclared exception!
      try { 
        textNode0.splitText(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      TextNode textNode1 = textNode0.splitText(0);
      assertEquals("#text", textNode1.nodeName());
      assertNotSame(textNode1, textNode0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = new TextNode("p`^'_b6JV8j9(Fj");
      String string0 = textNode0.toString();
      assertEquals("p`^'_b6JV8j9(Fj", string0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = new TextNode("", "");
      // Undeclared exception!
      try { 
        textNode0.splitText((-18));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("Split offset must be not be negative", "");
      StringBuilder stringBuilder0 = new StringBuilder(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.prettyPrint(false);
      textNode0.outerHtmlHead(stringBuilder0, 0, document_OutputSettings0);
      assertEquals("Split offset must be not be negative", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("=za*7[0Cx!r");
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      textNode0.outerHtmlTail((Appendable) null, 106, document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("4EoB0Q?d6AROqqm#A{");
      String string0 = textNode0.text();
      assertEquals("#text", textNode0.nodeName());
      assertEquals("4EoB0Q?d6AROqqm#A{", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TextNode.normaliseWhitespace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("P4/:nU#G@");
      Document document0 = Document.createShell("P4/:nU#G@");
      document0.prependChild(textNode0);
      Document document1 = document0.normalise();
      document1.outerHtml();
  }
}