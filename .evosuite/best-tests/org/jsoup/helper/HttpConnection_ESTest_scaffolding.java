/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 22 22:16:01 GMT 2022
 */

package org.jsoup.helper;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HttpConnection_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.helper.HttpConnection"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/ali/Desktop/jsoup-master"); 
    java.lang.System.setProperty("user.home", "/home/ali"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ali"); 
    java.lang.System.setProperty("user.timezone", "Africa/Tunis"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "7"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "13359"); 
    java.lang.System.setProperty("initialization_timeout", "7"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "7"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "2"); 
    java.lang.System.setProperty("write_pool", "/home/ali/Desktop/jsoup-master/.evosuite/tmp_2022_03_22_23_05_20/pools/org.jsoup.helper.HttpConnection.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "7"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/home/ali/Desktop/jsoup-master/.evosuite/evosuite-seeds/org.jsoup.helper.HttpConnection.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,BranchCoverage,BranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "52"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "46733"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/home/ali/Desktop/jsoup-master/.evosuite/tmp_2022_03_22_23_05_20/logs/org.jsoup.helper.HttpConnection"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/home/ali/Desktop/jsoup-master/.evosuite/tmp_2022_03_22_23_05_20/reports/org.jsoup.helper.HttpConnection"); 
    java.lang.System.setProperty("minimization_timeout", "7"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile7025972363396048942.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/home/ali/Desktop/jsoup-master/.evosuite/tmp_2022_03_22_23_05_20/seeds/org.jsoup.helper.HttpConnection.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.jsoup.helper.HttpConnection"); 
    java.lang.System.setProperty("spawn_process_manager_port", "40049"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "7"); 
    java.lang.System.setProperty("test_dir", "/home/ali/Desktop/jsoup-master/.evosuite/tmp_2022_03_22_23_05_20/tests"); 
    java.lang.System.setProperty("search_budget", "52"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "BRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HttpConnection_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.Connection$Response",
      "org.jsoup.parser.TokeniserState$52",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.eclipse.jetty.io.EofException",
      "org.jsoup.parser.Parser",
      "org.jsoup.nodes.Element",
      "org.jsoup.helper.HttpConnection",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState$63",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.jsoup.parser.TokeniserState$64",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.TokeniserState$66",
      "org.eclipse.jetty.io.FillInterest",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.parser.Token$Character",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.jsoup.nodes.Document",
      "org.jsoup.Connection$KeyVal",
      "org.jsoup.parser.Token$CData",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.eclipse.jetty.util.BufferUtil",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.UnsupportedMimeTypeException",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.parser.ParseErrorList",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.jsoup.nodes.BooleanAttribute",
      "org.jsoup.SerializationException",
      "org.jsoup.Connection$Base",
      "org.eclipse.jetty.util.log.Log$1",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.parser.Token$Doctype",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.parser.CharacterReader",
      "org.eclipse.jetty.io.WriteFlusher$FailedState",
      "org.eclipse.jetty.io.Connection",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.jsoup.helper.HttpConnection$Response",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.eclipse.jetty.io.EndPoint",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.TokeniserState$10",
      "org.eclipse.jetty.io.ByteArrayEndPoint$1",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.nodes.Comment",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.HttpStatusException",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.parser.TokeniserState$3",
      "org.jsoup.helper.StringUtil$1",
      "org.eclipse.jetty.util.Uptime$Impl",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.eclipse.jetty.io.RuntimeIOException",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.parser.TokeniserState$23",
      "org.eclipse.jetty.util.Loader",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.Connection$Method",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.parser.TokeniserState$22",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.nodes.Node",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.TokeniserState$28",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.parser.TokeniserState$36",
      "org.eclipse.jetty.util.Uptime",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.jsoup.Connection",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.eclipse.jetty.io.WriteFlusher$PendingState",
      "org.jsoup.helper.Validate",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.parser.TokeniserState$41",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.eclipse.jetty.io.QuietException",
      "org.jsoup.parser.TokeniserState$40",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.nodes.Attribute",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.util.log.Log",
      "org.jsoup.parser.Token$Comment",
      "org.eclipse.jetty.util.log.Logger",
      "org.jsoup.parser.TokeniserState$49"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, HttpConnection_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HttpConnection_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.helper.HttpConnection$KeyVal",
      "org.jsoup.helper.HttpConnection$Response$2",
      "org.jsoup.helper.HttpConnection$Response$1",
      "org.jsoup.Connection$Method",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.helper.Validate",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.internal.Normalizer",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.util.BufferUtil",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Element",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill",
      "org.eclipse.jetty.util.thread.strategy.EatWhatYouKill$State",
      "org.eclipse.jetty.util.thread.TryExecutor$1",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.util.thread.TryExecutor$NoTryExecutor",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.io.FillInterest",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.eclipse.jetty.io.WriteFlusher$StateType",
      "org.eclipse.jetty.io.WriteFlusher$State",
      "org.eclipse.jetty.io.WriteFlusher$IdleState",
      "org.eclipse.jetty.io.WriteFlusher$WritingState",
      "org.eclipse.jetty.io.WriteFlusher$CompletingState",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.eclipse.jetty.io.ByteArrayEndPoint$1",
      "org.eclipse.jetty.util.thread.Locker",
      "org.eclipse.jetty.util.thread.Locker$Lock",
      "org.eclipse.jetty.io.AbstractEndPoint$3",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.nodes.Attributes$Dataset",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.nodes.Attributes$Dataset$EntrySet",
      "org.jsoup.nodes.Attributes$Dataset$DatasetIterator",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.nodes.FormElement",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableTask",
      "org.eclipse.jetty.io.ChannelEndPoint$RunnableCloseable",
      "org.eclipse.jetty.io.ChannelEndPoint$1",
      "org.eclipse.jetty.io.ChannelEndPoint$2",
      "org.eclipse.jetty.io.ChannelEndPoint$3",
      "org.jsoup.HttpStatusException",
      "org.jsoup.select.Selector",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.jsoup.internal.ConstrainableInputStream"
    );
  }
}
