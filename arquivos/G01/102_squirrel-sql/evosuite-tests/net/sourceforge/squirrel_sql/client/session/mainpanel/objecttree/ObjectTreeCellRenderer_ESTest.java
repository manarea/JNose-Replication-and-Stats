/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 07:56:49 GMT 2020
 */

package net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.ImageIcon;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.resources.SquirrelResources;
import net.sourceforge.squirrel_sql.client.session.ISession;
import net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeCellRenderer;
import net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeModel;
import net.sourceforge.squirrel_sql.client.session.properties.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class ObjectTreeCellRendererTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      SessionProperties sessionProperties1 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      doReturn("The 'data' array must have length == 2.").when(sessionProperties1).getObjectFilterExclude();
      doReturn("7}3c]d+XG]mJk!6La").when(sessionProperties1).getObjectFilterInclude();
      ISession iSession0 = mock(ISession.class, new ViolatedAssumptionAnswer());
      doReturn((IApplication) null).when(iSession0).getApplication();
      doReturn(sessionProperties0, sessionProperties1, sessionProperties1).when(iSession0).getProperties();
      ObjectTreeCellRenderer objectTreeCellRenderer0 = null;
      try {
        objectTreeCellRenderer0 = new ObjectTreeCellRenderer((ObjectTreeModel) null, iSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeCellRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SessionProperties sessionProperties0 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      SessionProperties sessionProperties1 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      doReturn("The 'data' array must have length == 2.").when(sessionProperties1).getObjectFilterExclude();
      doReturn("The 'data' array must have length == 2.").when(sessionProperties1).getObjectFilterInclude();
      SquirrelResources squirrelResources0 = mock(SquirrelResources.class, new ViolatedAssumptionAnswer());
      doReturn((ImageIcon) null).when(squirrelResources0).getIcon(anyString());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(squirrelResources0).when(iApplication0).getResources();
      ISession iSession0 = mock(ISession.class, new ViolatedAssumptionAnswer());
      doReturn(iApplication0).when(iSession0).getApplication();
      doReturn(sessionProperties0, sessionProperties1, sessionProperties1).when(iSession0).getProperties();
      ObjectTreeCellRenderer objectTreeCellRenderer0 = null;
      try {
        objectTreeCellRenderer0 = new ObjectTreeCellRenderer((ObjectTreeModel) null, iSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeCellRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SessionProperties sessionProperties0 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      ISession iSession0 = mock(ISession.class, new ViolatedAssumptionAnswer());
      doReturn(sessionProperties0, (SessionProperties) null).when(iSession0).getProperties();
      ObjectTreeCellRenderer objectTreeCellRenderer0 = null;
      try {
        objectTreeCellRenderer0 = new ObjectTreeCellRenderer((ObjectTreeModel) null, iSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeCellRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SessionProperties sessionProperties0 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      SessionProperties sessionProperties1 = mock(SessionProperties.class, new ViolatedAssumptionAnswer());
      doReturn("!0WO\"n}G+12w\u0006_").when(sessionProperties1).getObjectFilterExclude();
      doReturn((String) null).when(sessionProperties1).getObjectFilterInclude();
      ISession iSession0 = mock(ISession.class, new ViolatedAssumptionAnswer());
      doReturn((IApplication) null).when(iSession0).getApplication();
      doReturn(sessionProperties0, sessionProperties1, sessionProperties1).when(iSession0).getProperties();
      ObjectTreeCellRenderer objectTreeCellRenderer0 = null;
      try {
        objectTreeCellRenderer0 = new ObjectTreeCellRenderer((ObjectTreeModel) null, iSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeCellRenderer", e);
      }
  }
}