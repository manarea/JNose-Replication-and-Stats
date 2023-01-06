/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:53:23 GMT 2020
 */

package com.atlassw.tools.eclipse.checkstyle.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.atlassw.tools.eclipse.checkstyle.config.ConfigProperty;
import com.atlassw.tools.eclipse.checkstyle.config.Module;
import com.atlassw.tools.eclipse.checkstyle.config.meta.RuleGroupMetadata;
import com.atlassw.tools.eclipse.checkstyle.config.meta.RuleMetadata;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Module_ESTest extends Module_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("", "", (String) null, severityLevel0, false, false, false, false, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, false);
      String string0 = module0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("O", "9uD{;(z>)%'s~lRw`AM", "O", (SeverityLevel) null, true, true, true, true, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, true);
      RuleMetadata ruleMetadata1 = module0.getMetaData();
      assertSame(ruleMetadata0, ruleMetadata1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("", "", (String) null, severityLevel0, false, false, false, false, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, false);
      RuleMetadata ruleMetadata1 = module0.getMetaData();
      assertEquals("", ruleMetadata1.getInternalName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Module module0 = new Module("DELETED");
      module0.setId("DELETED");
      String string0 = module0.getId();
      assertEquals("DELETED", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("O", "9uD{;(z>)%'s~lRw`AM", "O", (SeverityLevel) null, true, true, true, true, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, true);
      module0.setCustomMessage(");u1Sq .*RQW1m");
      String string0 = module0.getCustomMessage();
      assertEquals(");u1Sq .*RQW1m", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Module module0 = new Module("DELETED");
      module0.setCustomMessage("");
      String string0 = module0.getCustomMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Module module0 = new Module("DELETED");
      module0.setComment("DELETED");
      String string0 = module0.getComment();
      assertEquals("DELETED", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      RuleMetadata ruleMetadata0 = new RuleMetadata("", "", "", severityLevel0, true, true, true, true, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, true);
      // Undeclared exception!
      try { 
        module0.setSeverity((SeverityLevel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.atlassw.tools.eclipse.checkstyle.config.Module", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Module module0 = new Module("[ ( O8");
      RuleMetadata ruleMetadata0 = module0.getMetaData();
      assertNull(ruleMetadata0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Module module0 = new Module("e0A");
      List list0 = module0.getProperties();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("js`c", "js`c", "js`c", severityLevel0, true, true, true, true, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, true);
      SeverityLevel severityLevel1 = SeverityLevel.WARNING;
      SeverityLevel severityLevel2 = SeverityLevel.IGNORE;
      module0.setSeverity(severityLevel1);
      module0.setSeverity(severityLevel2);
      assertEquals("ignore", severityLevel2.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      RuleMetadata ruleMetadata0 = new RuleMetadata("/Q>\"Cuv#vs-@B4!w.C", "/Q>\"Cuv#vs-@B4!w.C", "/Q>\"Cuv#vs-@B4!w.C", severityLevel0, true, true, true, true, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, true);
      SeverityLevel severityLevel1 = SeverityLevel.IGNORE;
      module0.setSeverity(severityLevel1);
      module0.setSeverity(severityLevel1);
      assertNull(module0.getCustomMessage());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.IGNORE;
      RuleMetadata ruleMetadata0 = new RuleMetadata("'k~e&K/:I\"N@", "'k~e&K/:I\"N@", "'k~e&K/:I\"N@", severityLevel0, true, true, true, true, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, true);
      module0.setSeverity(severityLevel0);
      assertEquals("'k~e&K/:I\"N@", module0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      RuleMetadata ruleMetadata0 = new RuleMetadata("'k~e&K/:I\"N@", "'k~e&K/:I\"N@", "'k~e&K/:I\"N@", severityLevel0, false, false, false, false, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, false);
      module0.setSeverity(severityLevel0);
      assertEquals("'k~e&K/:I\"N@", module0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Module module0 = new Module("e0A");
      // Undeclared exception!
      try { 
        module0.setSeverity((SeverityLevel) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.atlassw.tools.eclipse.checkstyle.config.meta.MetadataFactory
         //
         verifyException("com.atlassw.tools.eclipse.checkstyle.config.Module", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.INFO;
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("js`^c", "js`^c", "js`^c", severityLevel0, false, true, true, true, ruleGroupMetadata0);
      Module module0 = new Module(ruleMetadata0, false);
      SeverityLevel severityLevel1 = SeverityLevel.WARNING;
      module0.setSeverity(severityLevel1);
      SeverityLevel severityLevel2 = module0.getSeverity();
      assertEquals("warning", severityLevel2.getName());
      assertNotNull(severityLevel2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      RuleMetadata ruleMetadata0 = new RuleMetadata("2h<6|gy=", "2h<6|gy=", "2h<6|gy=", severityLevel0, false, false, true, true, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, true);
      SeverityLevel severityLevel1 = module0.getSeverity();
      assertNull(severityLevel1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      RuleMetadata ruleMetadata0 = new RuleMetadata("", "", "", severityLevel0, true, true, true, true, (RuleGroupMetadata) null);
      Module module0 = new Module(ruleMetadata0, true);
      SeverityLevel severityLevel1 = module0.getSeverity();
      assertSame(severityLevel0, severityLevel1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Module module0 = new Module("e0A");
      SeverityLevel severityLevel0 = module0.getSeverity();
      assertNull(severityLevel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Module module0 = new Module("DESCRIPTION");
      ConfigProperty configProperty0 = module0.getProperty((String) null);
      assertNull(configProperty0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Module module0 = new Module("}7");
      RuleGroupMetadata ruleGroupMetadata0 = mock(RuleGroupMetadata.class, new ViolatedAssumptionAnswer());
      RuleMetadata ruleMetadata0 = new RuleMetadata("}7", "}7", "}7", (SeverityLevel) null, false, false, false, true, ruleGroupMetadata0);
      module0.setMetaData(ruleMetadata0);
      String string0 = module0.getName();
      assertEquals("}7", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Module module0 = new Module("1.2");
      String string0 = module0.getName();
      assertEquals("1.2", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Module module0 = new Module((RuleMetadata) null, true);
      String string0 = module0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Module module0 = new Module("com.atlassw.tools.eclipse.checkstyle.config.Module");
      Object object0 = module0.clone();
      assertNotSame(object0, module0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Module module0 = new Module("DESCRIPTION");
      SeverityLevel severityLevel0 = SeverityLevel.IGNORE;
      module0.setLastEnabledSeverity(severityLevel0);
      SeverityLevel severityLevel1 = module0.getLastEnabledSeverity();
      assertSame(severityLevel1, severityLevel0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Module module0 = new Module("com.atlassw.tools.eclipse.checkstyle.config.Module");
      module0.setComment("");
      String string0 = module0.getComment();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Module module0 = new Module("com.atlassw.tools.eclipse.checkstyle.config.Module");
      String string0 = module0.getComment();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Module module0 = new Module("e0A");
      String string0 = module0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Module module0 = new Module("e0A");
      module0.setId("");
      String string0 = module0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Module module0 = new Module("DESCRIPTION");
      SeverityLevel severityLevel0 = module0.getLastEnabledSeverity();
      assertNull(severityLevel0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Module module0 = new Module("com.atlassw.tools.eclipse.checkstyle.config.Module");
      Map map0 = module0.getCustomMetaData();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Module module0 = new Module("DELETED");
      String string0 = module0.getCustomMessage();
      assertNull(string0);
  }
}