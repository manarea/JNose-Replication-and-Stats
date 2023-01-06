/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 09:13:25 GMT 2020
 */

package de.huxhorn.lilith.data.logging.protobuf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.protobuf.ExtensionRegistry;
import de.huxhorn.lilith.data.eventsource.EventIdentifier;
import de.huxhorn.lilith.data.eventsource.EventWrapper;
import de.huxhorn.lilith.data.eventsource.SourceIdentifier;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.data.logging.protobuf.LoggingEventWrapperProtobufDecoder;
import de.huxhorn.lilith.data.logging.protobuf.generated.LoggingProto;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LoggingEventWrapperProtobufDecoder_ESTest extends LoggingEventWrapperProtobufDecoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(false);
      boolean boolean0 = loggingEventWrapperProtobufDecoder0.isCompressing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(false);
      EventWrapper<LoggingEvent> eventWrapper0 = loggingEventWrapperProtobufDecoder0.decode(byteArray0);
      assertNotNull(eventWrapper0);
      assertFalse(loggingEventWrapperProtobufDecoder0.isCompressing());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(false);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)5;
      // Undeclared exception!
      try { 
        loggingEventWrapperProtobufDecoder0.decode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.protobuf.UnknownFieldSet$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventWrapper<LoggingEvent> eventWrapper0 = LoggingEventWrapperProtobufDecoder.convert((LoggingProto.EventWrapper) null);
      assertNull(eventWrapper0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SourceIdentifier sourceIdentifier0 = LoggingEventWrapperProtobufDecoder.convert((LoggingProto.SourceIdentifier) null);
      assertNull(sourceIdentifier0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (byte) (-1));
      LoggingProto.SourceIdentifier loggingProto_SourceIdentifier0 = LoggingProto.SourceIdentifier.parseFrom((InputStream) byteArrayInputStream0, (ExtensionRegistry) null);
      SourceIdentifier sourceIdentifier0 = LoggingEventWrapperProtobufDecoder.convert(loggingProto_SourceIdentifier0);
      assertNull(sourceIdentifier0.getIdentifier());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LoggingProto.EventIdentifier loggingProto_EventIdentifier0 = LoggingProto.EventIdentifier.getDefaultInstance();
      EventIdentifier eventIdentifier0 = LoggingEventWrapperProtobufDecoder.convert(loggingProto_EventIdentifier0);
      assertEquals((-1L), eventIdentifier0.getLocalId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventIdentifier eventIdentifier0 = LoggingEventWrapperProtobufDecoder.convert((LoggingProto.EventIdentifier) null);
      assertNull(eventIdentifier0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-61);
      LoggingProto.EventIdentifier loggingProto_EventIdentifier0 = LoggingProto.EventIdentifier.parseFrom(byteArray0);
      EventIdentifier eventIdentifier0 = LoggingEventWrapperProtobufDecoder.convert(loggingProto_EventIdentifier0);
      assertNotNull(eventIdentifier0);
      assertEquals(8703L, eventIdentifier0.getLocalId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LoggingProto.EventWrapper loggingProto_EventWrapper0 = LoggingProto.EventWrapper.getDefaultInstance();
      EventWrapper<LoggingEvent> eventWrapper0 = LoggingEventWrapperProtobufDecoder.convert(loggingProto_EventWrapper0);
      assertEquals((-1L), eventWrapper0.getLocalId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(false);
      loggingEventWrapperProtobufDecoder0.decode(byteArray0);
      assertFalse(loggingEventWrapperProtobufDecoder0.isCompressing());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(false);
      loggingEventWrapperProtobufDecoder0.decode((byte[]) null);
      assertFalse(loggingEventWrapperProtobufDecoder0.isCompressing());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(true);
      loggingEventWrapperProtobufDecoder0.decode(byteArray0);
      assertTrue(loggingEventWrapperProtobufDecoder0.isCompressing());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(true);
      assertTrue(loggingEventWrapperProtobufDecoder0.isCompressing());
      
      loggingEventWrapperProtobufDecoder0.setCompressing(false);
      assertFalse(loggingEventWrapperProtobufDecoder0.isCompressing());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LoggingEventWrapperProtobufDecoder loggingEventWrapperProtobufDecoder0 = new LoggingEventWrapperProtobufDecoder(true);
      boolean boolean0 = loggingEventWrapperProtobufDecoder0.isCompressing();
      assertTrue(boolean0);
  }
}