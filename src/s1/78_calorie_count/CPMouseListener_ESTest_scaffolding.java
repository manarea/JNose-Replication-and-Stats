/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 10:10:48 GMT 2020
 */

package com.lts.swing.contentpanel;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CPMouseListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.lts.swing.contentpanel.CPMouseListener"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/78_caloriecount"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CPMouseListener_ESTest_scaffolding.class.getClassLoader() ,
      "com.lts.pest.data.event.DataChangeEvent",
      "com.lts.swing.contentpanel.ContentPanel$13",
      "com.lts.swing.contentpanel.ContentPanel",
      "com.lts.pest.data.event.DataChangeListener",
      "com.lts.pest.tree.TreeListenerHelper",
      "com.lts.swing.contentpanel.CPMouseListener",
      "com.lts.util.deepcopy.DeepCopier",
      "com.lts.Suspender",
      "com.lts.swing.SimpleGridBagConstraint",
      "com.lts.swing.menu.NewMenuNode",
      "com.lts.pest.tree.IdTreeNode",
      "com.lts.swing.menu.MenuBuilder",
      "com.lts.util.deepcopy.DeepCopyException",
      "com.lts.event.Callback",
      "com.lts.event.ListenerHelper$DeferredEvent",
      "com.lts.pest.tree.SimpleTreeListener",
      "com.lts.swing.contentpanel.SimpleMouseListener",
      "com.lts.event.ListenerHelper",
      "com.lts.LTSException",
      "com.lts.pest.data.IdTree",
      "org.jdesktop.swingx.JXColorSelectionButton$1",
      "org.jdesktop.swingx.JXColorSelectionButton$2",
      "com.lts.pest.tree.TreeListener",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$MagnifyingPanel",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$3",
      "com.lts.pest.tree.Tree",
      "com.lts.util.CaselessMap",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$2",
      "com.lts.pest.data.DataItem",
      "com.lts.util.TreeNode",
      "com.lts.swing.TextContentPanel",
      "com.lts.event.CallbackListenerHelper",
      "com.lts.swing.menu.MenuWrapper",
      "com.lts.swing.contentpanel.ContentPanel$2",
      "com.lts.pest.tree.DirtyCleanTree",
      "com.lts.swing.contentpanel.ContentPanel$3",
      "com.lts.swing.contentpanel.ContentPanel$CloseWaiter",
      "com.lts.swing.contentpanel.ContentPanel$4",
      "com.lts.exception.NotImplementedException",
      "org.jdesktop.swingx.JXColorSelectionButton",
      "com.lts.swing.tree.EditTree",
      "com.lts.pest.data.IdObject",
      "com.lts.swing.LTSPanel",
      "com.lts.swing.contentpanel.ContentPanel$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CPMouseListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.lts.swing.contentpanel.CPMouseListener",
      "com.lts.swing.LTSPanel",
      "com.lts.swing.contentpanel.ContentPanel",
      "com.lts.swing.TextContentPanel",
      "com.lts.event.ListenerHelper",
      "com.lts.event.CallbackListenerHelper",
      "com.lts.swing.SimpleGridBagConstraint",
      "com.lts.Suspender",
      "com.lts.exception.NotImplementedException",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$MagnifyingPanel",
      "org.jdesktop.swingx.JXColorSelectionButton",
      "org.jdesktop.swingx.JXColorSelectionButton$1",
      "org.jdesktop.swingx.JXColorSelectionButton$2",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$2",
      "org.jdesktop.swingx.color.EyeDropperColorChooserPanel$3",
      "com.lts.swing.contentpanel.ContentPanel$13",
      "com.lts.pest.tree.Tree",
      "com.lts.pest.data.IdTree",
      "com.lts.pest.tree.DirtyCleanTree",
      "com.lts.swing.tree.EditTree",
      "com.lts.pest.tree.SimpleTreeListener",
      "com.lts.swing.contentpanel.ContentPanel$2",
      "com.lts.swing.contentpanel.ContentPanel$1",
      "com.lts.swing.contentpanel.ContentPanel$3",
      "com.lts.swing.contentpanel.ContentPanel$4",
      "com.lts.swing.contentpanel.ContentPanel$CloseWaiter"
    );
  }
}