/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:15:02 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("notifyEvents {} {}", "notifyEvents {} {}", "", "5zM px%Wi", "5zM px%Wi");
      String string0 = documentType0.outerHtml();
      assertEquals("<!DOCTYPE notifyEvents {} {} notifyEvents {} {} \"5zM px%Wi\">", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "method", "", "");
      StringBuilder stringBuilder0 = new StringBuilder("Ud");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      documentType0.outerHtmlHead(stringBuilder0, 1, document_OutputSettings0);
      assertEquals("Ud<!DOCTYPE PUBLIC \"method\">", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "systemId", "", "7A\"re@\"xdNDdNUM>J");
      MockFileWriter mockFileWriter0 = new MockFileWriter("PUBLIC", false);
      Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      documentType0.outerHtmlHead(mockFileWriter0, 0, document_OutputSettings1);
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, " ", "", " ");
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      documentType0.outerHtmlHead(stringWriter0, 114, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "publicId", "X#NxDVL");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("<^wN{P?4ci`Gyy*Mn", "<^wN{P?4ci`Gyy*Mn", "<^wN{P?4ci`Gyy*Mn");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "");
      documentType0.setPubSysKey("");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DocumentType documentType0 = new DocumentType(" ", " ", "-", ".gvT0ymm[JdI", (String) null);
      documentType0.setPubSysKey((String) null);
      assertEquals("#doctype", documentType0.nodeName());
  }
}