/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 08:32:40 GMT 2020
 */

package com.liferay.portal.kernel.messaging.proxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ProxyMessageListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portal.kernel.messaging.proxy.ProxyMessageListener"; 
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
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/108_liferay"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ProxyMessageListener_ESTest_scaffolding.class.getClassLoader() ,
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "com.beust.jcommander.internal.Maps",
      "com.liferay.portal.kernel.messaging.DestinationStatistics",
      "org.testng.internal.YamlParser",
      "org.testng.TestRunner$ListenerHolder",
      "com.liferay.portal.kernel.util.StringBundler",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.internal.version.VersionInfo",
      "com.liferay.portal.kernel.util.PortalClassLoaderUtil",
      "org.testng.internal.IInvoker",
      "com.liferay.portal.kernel.log.LogFactory",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "org.testng.IAnnotationTransformer",
      "com.beust.jcommander.converters.BaseConverter",
      "org.testng.xml.XmlTest",
      "org.testng.internal.thread.graph.IWorker",
      "org.testng.IHookCallBack",
      "com.liferay.portal.kernel.messaging.sender.MessageSender",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.kernel.messaging.ParallelDestination",
      "org.testng.internal.annotations.TestAnnotation",
      "org.testng.internal.DynamicGraph$Status",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "org.testng.IMethodInstance",
      "org.testng.annotations.IAnnotation",
      "org.testng.xml.XmlSuite",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.SuiteRunState",
      "com.liferay.portal.kernel.messaging.MessageListener",
      "org.testng.ITestNGListener",
      "com.liferay.portal.kernel.messaging.InvokerMessageListener",
      "org.testng.IAttributes",
      "org.testng.internal.thread.graph.IThreadWorkerFactory",
      "com.liferay.portal.kernel.concurrent.ThreadPoolExecutor$WorkerTask",
      "org.testng.ITestClass",
      "org.testng.ITestNGMethod",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "com.liferay.portal.kernel.util.MethodKey",
      "com.beust.jcommander.IDefaultProvider",
      "org.testng.TestRunner",
      "org.springframework.transaction.annotation.Isolation",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.collections.Maps",
      "org.testng.ReporterConfig",
      "com.liferay.portal.kernel.concurrent.TaskQueue$Node",
      "com.beust.jcommander.Parameter",
      "com.liferay.portal.kernel.messaging.DefaultMessageBus",
      "com.liferay.portal.kernel.messaging.SynchronousDestination",
      "org.testng.ITestResult",
      "org.jgroups.util.DefaultThreadFactory",
      "com.liferay.portal.kernel.messaging.proxy.ProxyRequest",
      "com.liferay.portal.kernel.exception.PortalException",
      "org.testng.internal.AnnotationTypeEnum",
      "com.liferay.portal.kernel.messaging.MessageBusException",
      "org.testng.IHookable",
      "com.liferay.portal.kernel.messaging.sender.SynchronousMessageSender",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "org.jruby.threading.DaemonThreadFactory",
      "com.liferay.portal.kernel.security.pacl.permission.PortalMessageBusPermission",
      "com.liferay.portal.kernel.util.TransientValue",
      "org.testng.xml.XmlInclude",
      "org.testng.TestNG",
      "com.liferay.portal.kernel.messaging.MessageListenerException",
      "org.testng.IInvokedMethod",
      "org.testng.ClassMethodMap",
      "org.testng.ISuiteListener",
      "org.testng.ITestObjectFactory",
      "com.liferay.portal.kernel.messaging.Message",
      "org.testng.xml.IPostProcessor",
      "com.liferay.portal.kernel.messaging.proxy.ProxyResponse",
      "org.jgroups.util.ThreadManager",
      "org.testng.internal.ITestResultNotifier",
      "org.testng.ReporterConfig$Property",
      "org.testng.annotations.ITestAnnotation",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal",
      "com.liferay.portal.kernel.messaging.BaseAsyncDestination",
      "com.liferay.portal.kernel.util.MethodHandler",
      "org.testng.internal.ConfigurationGroupMethods",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMap",
      "com.beust.jcommander.IStringConverterFactory",
      "org.testng.IObjectFactory",
      "org.testng.internal.InvokedMethod",
      "org.testng.xml.XmlClass",
      "org.testng.IMethodSelector",
      "com.beust.jcommander.ParameterException",
      "org.testng.internal.annotations.IDataProvidable",
      "org.testng.collections.Lists",
      "org.testng.ITestMethodFinder",
      "com.liferay.portal.kernel.util.MapBackedSet",
      "org.testng.IObjectFactory2",
      "org.testng.internal.ClassHelper",
      "com.liferay.portal.kernel.concurrent.RejectedExecutionHandler",
      "org.testng.annotations.IParameterizable",
      "org.testng.IInvokedMethodListener",
      "org.testng.internal.MethodInstance",
      "com.liferay.portal.kernel.messaging.BaseDestinationEventListener",
      "com.beust.jcommander.converters.IntegerConverter",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.xml.XMLParser",
      "com.beust.jcommander.IStringConverter",
      "com.liferay.portal.kernel.messaging.MessageBus",
      "org.testng.IMethodSelectorContext",
      "org.testng.CommandLineArgs",
      "com.liferay.portal.kernel.messaging.proxy.ProxyMessageListener",
      "org.testng.annotations.ITestOrConfiguration",
      "org.testng.IClass",
      "org.testng.ITestContext",
      "com.beust.jcommander.ParameterDescription",
      "org.testng.internal.IConfigurationListener",
      "org.testng.IResultMap",
      "org.testng.InstanceOrderingMethodInterceptor",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.kernel.concurrent.ThreadPoolHandler",
      "com.beust.jcommander.internal.Lists",
      "com.beust.jcommander.converters.FileConverter",
      "org.testng.xml.IFileParser",
      "com.liferay.portal.kernel.messaging.BaseDestination",
      "org.testng.internal.MethodInstance$1",
      "com.liferay.portal.kernel.util.OSDetector",
      "com.liferay.portal.kernel.concurrent.TaskQueue",
      "org.testng.internal.annotations.IAnnotationFinder",
      "org.testng.IMethodInterceptor",
      "org.testng.junit.JUnitUtils",
      "org.testng.IConfigureCallBack",
      "com.liferay.portal.kernel.memory.SoftReferenceThreadLocal",
      "org.testng.internal.MapList",
      "com.beust.jcommander.converters.BooleanConverter",
      "org.testng.SuiteRunner",
      "com.beust.jcommander.converters.LongConverter",
      "org.testng.log4testng.Logger",
      "com.liferay.portal.kernel.util.SetUtil",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$Entry",
      "org.testng.xml.XmlMethodSelector",
      "org.testng.TestNGException",
      "com.liferay.portal.kernel.log.Log",
      "org.jgroups.util.ThreadDecorator",
      "org.testng.IConfigurable",
      "org.testng.ITestListener",
      "org.testng.IRetryAnalyzer",
      "com.liferay.portal.kernel.concurrent.ConcurrentHashSet",
      "org.testng.IReporter",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMapThreadLocal",
      "org.springframework.transaction.annotation.Propagation",
      "com.liferay.portal.kernel.messaging.MessageBusUtil",
      "org.testng.internal.IConfiguration",
      "org.testng.ISuite",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.beust.jcommander.converters.StringConverter",
      "com.liferay.portal.kernel.concurrent.ThreadPoolExecutor",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "org.testng.internal.DynamicGraph",
      "com.beust.jcommander.JCommander",
      "org.testng.ITestRunnerFactory",
      "com.liferay.portal.kernel.messaging.GlobalDestinationEventListener",
      "com.liferay.portal.kernel.exception.NestableException",
      "org.testng.xml.TestNGContentHandler",
      "com.liferay.portal.kernel.messaging.Destination",
      "org.testng.xml.SuiteXmlParser",
      "com.beust.jcommander.internal.DefaultConverterFactory",
      "org.jgroups.util.ThreadFactory",
      "org.testng.PreserveOrderMethodInterceptor",
      "com.liferay.portal.kernel.messaging.DestinationEventListener",
      "org.testng.xml.Parser",
      "org.testng.internal.TestMethodWorker",
      "org.jgroups.util.LazyThreadFactory",
      "org.testng.junit.IJUnitTestRunner"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ProxyMessageListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.messaging.proxy.ProxyMessageListener",
      "org.springframework.transaction.annotation.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.internal.AnnotationTypeEnum",
      "org.testng.xml.XmlSuite",
      "com.liferay.portal.kernel.messaging.Message",
      "com.liferay.portal.kernel.messaging.proxy.ProxyResponse",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.kernel.messaging.DefaultMessageBus",
      "com.liferay.portal.kernel.util.MapBackedSet",
      "com.liferay.portal.kernel.concurrent.ConcurrentHashSet",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.TestAnnotation",
      "com.liferay.portal.kernel.messaging.proxy.ProxyRequest",
      "com.liferay.portal.kernel.util.MethodHandler",
      "com.liferay.portal.kernel.util.MethodKey",
      "org.testng.xml.XmlClass",
      "org.testng.collections.Lists",
      "com.liferay.portal.kernel.messaging.BaseDestinationEventListener",
      "com.liferay.portal.kernel.messaging.GlobalDestinationEventListener",
      "com.liferay.portal.kernel.util.SetUtil",
      "com.liferay.portal.kernel.messaging.BaseDestination",
      "com.liferay.portal.kernel.messaging.BaseAsyncDestination",
      "com.liferay.portal.kernel.messaging.ParallelDestination",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "com.liferay.portal.kernel.util.OSDetector",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "org.jgroups.util.DefaultThreadFactory",
      "com.liferay.portal.kernel.util.StringBundler",
      "com.liferay.portal.kernel.messaging.MessageBusUtil",
      "com.liferay.portal.kernel.util.TransientValue",
      "com.liferay.portal.kernel.messaging.SynchronousDestination",
      "com.liferay.portal.kernel.util.PortalClassLoaderUtil",
      "org.jgroups.util.LazyThreadFactory",
      "org.testng.internal.version.VersionInfo",
      "org.jruby.threading.DaemonThreadFactory",
      "org.testng.TestNG",
      "com.liferay.portal.kernel.messaging.DestinationStatistics"
    );
  }
}