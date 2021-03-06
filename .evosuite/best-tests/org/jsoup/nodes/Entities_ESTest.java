/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:12:20 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("fallback");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("UTF-org.jsoup.nodes.Entities", false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Charset charset0 = Charset.forName("US-ASCII");
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
      Entities.escape((Appendable) mockFileWriter0, "UTF-org.jsoup.nodes.Entities", document_OutputSettings1, false, true, true);
      assertFalse(document_OutputSettings1.outline());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.encoder();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings0.coreCharset = entities_CoreCharset0;
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, "D,;s,", document_OutputSettings0, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      document_OutputSettings0.prepareEncoder();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.ascii;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      String string0 = Entities.escape("Bi:'i", document_OutputSettings0);
      assertEquals("Bi:'i", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("f?\"kImi7iN=M9:9c)S");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, "f?\"kImi7iN=M9:9c)S", document_OutputSettings0, true, true, true);
      assertFalse(document_OutputSettings0.outline());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("UTF-org.jsoup.nodes.Entities", false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) mockFileWriter0, "<onIncompleteFlush s={}/{} fi={} w={}", document_OutputSettings0, true, true, true);
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Entities.escape(":<&>l,A\"&\"^$/B");
      assertEquals(":&lt;&amp;&gt;l,A\"&amp;\"^$/B", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("UTF-org.jsoup.nodes.Entities");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockFileWriter0, " xr. 6.Uf.>m", document_OutputSettings0, true, true, true);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("UTF-org.jsoupnodes.Entities", false);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockFileWriter0, "<onIncompleteFlush s={}/{} fi={} w={}", document_OutputSettings0, true, true, false);
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Entities.escape((String) null, (Document.OutputSettings) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = Entities.codepointsForName("`(_", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Entities.getByName("amp");
      assertEquals("&", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Entities.getByName("\"");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = Entities.unescape("&lt;");
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Entities.unescape("CQyxVK}z\\&h8949");
      assertEquals("CQyxVK}z\\&h8949", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(38);
      assertEquals("amp", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(255);
      assertEquals("yuml", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(38);
      assertEquals("amp", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint((-476));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("amp");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.getCharacterByName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
