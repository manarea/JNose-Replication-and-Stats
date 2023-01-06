/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 08:16:56 GMT 2020
 */

package macaw.presentationLayer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MacawStateEditor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "macaw.presentationLayer.MacawStateEditor"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/69_lhamacaw"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MacawStateEditor_ESTest_scaffolding.class.getClassLoader() ,
      "com.mysql.jdbc.VersionedStringProperty",
      "macaw.businessLayer.MacawCurationAPI",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermFilter",
      "macaw.persistenceLayer.demo.InMemoryVariableFilter",
      "com.mysql.jdbc.ConnectionProperties$LongConnectionProperty",
      "macaw.persistenceLayer.production.ProductionCurationService",
      "com.mysql.jdbc.CachedResultSetMetaData",
      "com.mysql.jdbc.ConnectionFeatureNotAvailableException",
      "com.mysql.jdbc.ServerPreparedStatement$BindValue",
      "com.mysql.jdbc.CallableStatement$CallableStatementParam",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermManager",
      "macaw.util.Displayable",
      "macaw.persistenceLayer.ChangeEventGenerator",
      "com.mysql.jdbc.ConnectionProperties$StringConnectionProperty",
      "com.mysql.jdbc.MysqlIO",
      "macaw.businessLayer.VariableTypeFilter",
      "com.mysql.jdbc.Connection",
      "com.mysql.jdbc.NotUpdatable",
      "macaw.persistenceLayer.production.SQLOntologyTermManager",
      "com.mysql.jdbc.SingleByteCharsetConverter",
      "com.mysql.jdbc.PingTarget",
      "macaw.system.Log",
      "com.mysql.jdbc.SocketFactory",
      "macaw.businessLayer.MacawListChoice",
      "macaw.businessLayer.SupportingDocument",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentsManager",
      "com.mysql.jdbc.PacketTooBigException",
      "com.mysql.jdbc.log.StandardLogger",
      "macaw.persistenceLayer.demo.InMemoryValueLabelManager",
      "macaw.system.MacawError",
      "com.mysql.jdbc.log.Log",
      "macaw.persistenceLayer.production.SQLUserManager",
      "com.mysql.jdbc.ConnectionProperties$BooleanConnectionProperty",
      "com.mysql.jdbc.StringUtils",
      "macaw.persistenceLayer.DummyDataProvider",
      "macaw.system.MacawException",
      "com.mysql.jdbc.exceptions.MySQLTransientException",
      "com.mysql.jdbc.StandardSocketFactory",
      "macaw.persistenceLayer.production.SQLFilterQueries",
      "macaw.presentationLayer.CategoryStateEditor",
      "macaw.businessLayer.DerivedVariable",
      "com.mysql.jdbc.UpdatableResultSet",
      "macaw.system.StartupOptions",
      "com.mysql.jdbc.Connection$1",
      "macaw.system.ChangeEventType",
      "macaw.businessLayer.OntologyTerm",
      "com.mysql.jdbc.Statement",
      "macaw.persistenceLayer.demo.InMemoryCurationConceptManager",
      "macaw.util.ValidationUtility",
      "com.mysql.jdbc.Buffer",
      "macaw.persistenceLayer.production.SQLValueLabelManager",
      "macaw.businessLayer.AvailabilityState",
      "macaw.businessLayer.RawVariable",
      "macaw.persistenceLayer.demo.InMemoryUserManager",
      "macaw.util.SearchUtility",
      "macaw.persistenceLayer.production.SQLCurationConceptManager",
      "com.mysql.jdbc.Util$RandStructcture",
      "macaw.businessLayer.ValueLabel$EditingOperationType",
      "macaw.system.UserInterfaceFactory",
      "com.mysql.jdbc.PreparedStatement",
      "com.mysql.jdbc.exceptions.MySQLTimeoutException",
      "com.mysql.jdbc.util.LRUCache",
      "com.mysql.jdbc.util.ReadAheadInputStream",
      "com.mysql.jdbc.Util",
      "com.mysql.jdbc.MysqlDataTruncation",
      "macaw.persistenceLayer.demo.InMemoryChangeEventManager",
      "com.mysql.jdbc.CharsetMapping",
      "macaw.system.MacawMessages",
      "com.mysql.jdbc.Field",
      "com.mysql.jdbc.CommunicationsException",
      "macaw.persistenceLayer.demo.InMemoryListChoiceManager",
      "macaw.persistenceLayer.production.SQLSupportingDocumentsManager",
      "macaw.businessLayer.ValueLabel",
      "macaw.businessLayer.User",
      "com.mysql.jdbc.ConnectionProperties",
      "macaw.businessLayer.CleaningState",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.CompressedInputStream",
      "macaw.persistenceLayer.production.SQLConnectionManager",
      "com.mysql.jdbc.ServerPreparedStatement",
      "com.mysql.jdbc.NotImplemented",
      "com.mysql.jdbc.log.NullLogger",
      "com.mysql.jdbc.ConnectionProperties$ConnectionProperty",
      "macaw.util.DisplayableListItemViewer",
      "macaw.businessLayer.MacawRetrievalAPI",
      "macaw.businessLayer.VariableSummary",
      "macaw.persistenceLayer.production.SQLVariableManager",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentFilter",
      "com.mysql.jdbc.MysqlSavepoint",
      "com.mysql.jdbc.Statement$CancelTask",
      "macaw.presentationLayer.MacawStateEditor",
      "com.mysql.jdbc.CallableStatement",
      "macaw.presentationLayer.CleaningStateEditor",
      "com.mysql.jdbc.ConnectionProperties$IntegerConnectionProperty",
      "com.mysql.jdbc.ResultSet",
      "com.mysql.jdbc.RowData",
      "macaw.persistenceLayer.demo.DemonstrationCurationService",
      "macaw.businessLayer.MacawSecurityAPI",
      "macaw.util.DisplayableListItemEditor",
      "macaw.persistenceLayer.production.SQLListChoiceManager",
      "macaw.persistenceLayer.production.SQLChangeEventManager",
      "com.mysql.jdbc.CallableStatement$CallableStatementParamInfoJDBC3",
      "com.mysql.jdbc.PreparedStatement$ParseInfo",
      "macaw.presentationLayer.AvailabilityStateEditor",
      "com.mysql.jdbc.ConnectionProperties$MemorySizeConnectionProperty",
      "macaw.persistenceLayer.production.SQLListChoiceManager$ListChoiceType",
      "macaw.businessLayer.AliasFilePath",
      "macaw.util.DisplayableList",
      "com.mysql.jdbc.Messages",
      "macaw.persistenceLayer.demo.InMemoryVariableManager",
      "com.mysql.jdbc.CallableStatement$CallableStatementParamInfo",
      "macaw.util.DisplayableListItemAdder",
      "macaw.system.MacawChangeEvent",
      "com.mysql.jdbc.NonRegisteringDriver",
      "macaw.businessLayer.Variable",
      "macaw.system.SessionProperties",
      "macaw.util.DisplayableListItemDeleter",
      "macaw.businessLayer.Category",
      "macaw.system.MacawErrorType",
      "macaw.persistenceLayer.demo.DemonstrationRetrievalService"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MacawStateEditor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "macaw.presentationLayer.MacawStateEditor",
      "macaw.system.MacawMessages",
      "macaw.system.MacawErrorType",
      "macaw.system.SessionProperties",
      "macaw.system.Log",
      "macaw.system.UserInterfaceFactory",
      "macaw.system.StartupOptions",
      "macaw.presentationLayer.AvailabilityStateEditor",
      "macaw.presentationLayer.CleaningStateEditor",
      "macaw.presentationLayer.CategoryStateEditor",
      "macaw.persistenceLayer.production.ProductionCurationService",
      "macaw.persistenceLayer.production.SQLChangeEventManager",
      "macaw.persistenceLayer.production.SQLConnectionManager",
      "macaw.persistenceLayer.production.SQLCurationConceptManager",
      "macaw.persistenceLayer.production.SQLUserManager",
      "macaw.persistenceLayer.production.SQLSupportingDocumentsManager",
      "macaw.persistenceLayer.production.SQLListChoiceManager",
      "macaw.persistenceLayer.production.SQLValueLabelManager",
      "macaw.persistenceLayer.production.SQLOntologyTermManager",
      "macaw.persistenceLayer.production.SQLFilterQueries",
      "macaw.persistenceLayer.production.SQLVariableManager",
      "macaw.businessLayer.User",
      "macaw.persistenceLayer.demo.DemonstrationCurationService",
      "macaw.persistenceLayer.demo.DemonstrationRetrievalService",
      "macaw.persistenceLayer.demo.InMemoryChangeEventManager",
      "macaw.persistenceLayer.demo.InMemoryUserManager",
      "macaw.persistenceLayer.demo.InMemoryCurationConceptManager",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermManager",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentsManager",
      "macaw.persistenceLayer.demo.InMemoryListChoiceManager",
      "macaw.persistenceLayer.demo.InMemoryVariableManager",
      "macaw.persistenceLayer.demo.InMemoryValueLabelManager",
      "macaw.persistenceLayer.demo.InMemoryVariableFilter",
      "macaw.persistenceLayer.demo.InMemorySupportingDocumentFilter",
      "macaw.persistenceLayer.demo.InMemoryOntologyTermFilter",
      "macaw.persistenceLayer.DummyDataProvider",
      "macaw.businessLayer.MacawListChoice",
      "macaw.businessLayer.Category",
      "macaw.util.ValidationUtility",
      "macaw.util.SearchUtility",
      "macaw.system.MacawChangeEvent",
      "macaw.system.ChangeEventType",
      "macaw.businessLayer.CleaningState",
      "macaw.businessLayer.AvailabilityState",
      "macaw.businessLayer.AliasFilePath",
      "macaw.businessLayer.Variable",
      "macaw.businessLayer.DerivedVariable",
      "macaw.persistenceLayer.ChangeEventGenerator",
      "macaw.businessLayer.SupportingDocument",
      "macaw.system.MacawException",
      "macaw.system.MacawError",
      "macaw.businessLayer.RawVariable",
      "macaw.businessLayer.OntologyTerm",
      "macaw.businessLayer.ValueLabel",
      "macaw.businessLayer.VariableSummary",
      "macaw.businessLayer.VariableTypeFilter",
      "macaw.util.DisplayableList",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.Util",
      "com.mysql.jdbc.log.StandardLogger",
      "com.mysql.jdbc.ConnectionProperties$ConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties",
      "com.mysql.jdbc.log.NullLogger",
      "com.mysql.jdbc.Connection",
      "com.mysql.jdbc.ConnectionProperties$BooleanConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$IntegerConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$MemorySizeConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$StringConnectionProperty",
      "com.mysql.jdbc.ConnectionProperties$LongConnectionProperty",
      "com.mysql.jdbc.StandardSocketFactory",
      "com.mysql.jdbc.VersionedStringProperty",
      "com.mysql.jdbc.CharsetMapping"
    );
  }
}