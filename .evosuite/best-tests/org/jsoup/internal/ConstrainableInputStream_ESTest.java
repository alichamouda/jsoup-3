/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 22:14:40 GMT 2022
 */

package org.jsoup.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrainableInputStream_ESTest extends ConstrainableInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 32768, 32768);
      constrainableInputStream0.timeout(1837000000L, 1837000000L);
      byte[] byteArray0 = new byte[13];
      // Undeclared exception!
      try { 
        constrainableInputStream0.read(byteArray0, (-2668), (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 1304, 0);
      constrainableInputStream0.readToByteBuffer(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Enumeration<ConstrainableInputStream> enumeration0 = (Enumeration<ConstrainableInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(sequenceInputStream0, (byte)115, (byte)0);
      constrainableInputStream0.readToByteBuffer(32768);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 111, 111);
      // Undeclared exception!
      try { 
        constrainableInputStream0.readToByteBuffer((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, (byte)25, 468);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((byte)25, (byte)25);
      try { 
        constrainableInputStream1.read(byteArray0, (int) (byte)25, (-1));
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)52);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pushbackInputStream0, 2649, (byte)1);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer(2649);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=1 cap=1]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)52);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pushbackInputStream0, (byte)52, 0);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer((byte)1);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(1, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 1, 1);
      ConstrainableInputStream constrainableInputStream1 = ConstrainableInputStream.wrap(constrainableInputStream0, (-1036), 1);
      assertSame(constrainableInputStream0, constrainableInputStream1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (-242));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 4);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(pushbackInputStream0, (byte)3, (-242));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 1, 1);
      try { 
        constrainableInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }
}
