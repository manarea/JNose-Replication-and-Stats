/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:02:06 GMT 2020
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.MacawCurationAPI;
import macaw.businessLayer.RawVariable;
import macaw.businessLayer.User;
import macaw.businessLayer.ValueLabel;
import macaw.persistenceLayer.demo.DemonstrationCurationService;
import macaw.persistenceLayer.demo.DemonstrationRetrievalService;
import macaw.persistenceLayer.production.ProductionCurationService;
import macaw.presentationLayer.VariableLabelTableModel;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class VariableLabelTableModelTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt((Object) null, 0, (-862));
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      String string0 = variableLabelTableModel0.getColumnName((-132));
      assertEquals("Is Missing Value", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      Class class0 = variableLabelTableModel0.getColumnClass((-2528));
      assertEquals("class java.lang.Boolean", class0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.addValueLabel(1, valueLabel0);
      assertEquals("", valueLabel0.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.deleteValueLabel(0);
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      boolean boolean0 = variableLabelTableModel0.isCellEditable(268, (-2110));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      int int0 = variableLabelTableModel0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      String string0 = variableLabelTableModel0.getColumnName(0);
      assertEquals("Value", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt(demonstrationCurationService0, 3, 3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt(demonstrationCurationService0, (-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      RawVariable rawVariable0 = new RawVariable();
      User user0 = new User();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setData(user0, rawVariable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.persistenceLayer.demo.InMemoryValueLabelManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      ProductionCurationService productionCurationService0 = new ProductionCurationService(sessionProperties0);
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(productionCurationService0, false);
      RawVariable rawVariable0 = new RawVariable();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setData((User) null, rawVariable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.mysql.jdbc.CharsetMapping
         //
         verifyException("com.mysql.jdbc.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.getValueAt(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.getValueAt((-4434), (-4434));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.deleteValueLabel((-2735));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      // Undeclared exception!
      try { 
        variableLabelTableModel0.addValueLabel(1, valueLabel0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt((Object) null, 0, 3004);
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("", 0, 0);
      assertEquals(1, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("", 0, (-4203));
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.DELETE;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt("", 0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Boolean
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("", 0, 1629);
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.setValueAt((Object) null, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("", 0, 0);
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.CANCEL;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      variableLabelTableModel0.setValueAt("2mv_j", 0, 0);
      assertEquals(1, VariableLabelTableModel.LABEL_COLUMN);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, 1);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, (-98));
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      variableLabelTableModel0.findColumn(":7R");
      assertEquals(3, variableLabelTableModel0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel((MacawCurationAPI) null, true);
      Class class0 = variableLabelTableModel0.getColumnClass(1);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      DemonstrationRetrievalService demonstrationRetrievalService0 = new DemonstrationRetrievalService(sessionProperties0);
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationRetrievalService0, true);
      Class class0 = variableLabelTableModel0.getColumnClass(0);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      ValueLabel.EditingOperationType valueLabel_EditingOperationType0 = ValueLabel.EditingOperationType.DELETE;
      valueLabel0.setEditingOperationType(valueLabel_EditingOperationType0);
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.save();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.persistenceLayer.demo.InMemoryVariableManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.save();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.persistenceLayer.demo.InMemoryVariableManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      ProductionCurationService productionCurationService0 = new ProductionCurationService(sessionProperties0);
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(productionCurationService0, false);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.save();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.mysql.jdbc.CharsetMapping
         //
         verifyException("com.mysql.jdbc.Connection", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, false);
      User user0 = new User("39bE)", "39bE)");
      RawVariable rawVariable0 = new RawVariable();
      rawVariable0.setIdentifier(1);
      variableLabelTableModel0.setData(user0, rawVariable0);
      assertEquals(4, variableLabelTableModel0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      int int0 = variableLabelTableModel0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ValueLabel valueLabel0 = new ValueLabel();
      variableLabelTableModel0.addValueLabel(0, valueLabel0);
      Object object0 = variableLabelTableModel0.getValueAt(0, 0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      ArrayList<ValueLabel> arrayList0 = variableLabelTableModel0.getData();
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      DemonstrationRetrievalService demonstrationRetrievalService0 = new DemonstrationRetrievalService(sessionProperties0);
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationRetrievalService0, false);
      boolean boolean0 = variableLabelTableModel0.isCellEditable(2288, 247);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      // Undeclared exception!
      try { 
        variableLabelTableModel0.deleteValueLabel(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DemonstrationCurationService demonstrationCurationService0 = new DemonstrationCurationService();
      VariableLabelTableModel variableLabelTableModel0 = new VariableLabelTableModel(demonstrationCurationService0, true);
      int int0 = variableLabelTableModel0.getColumnCount();
      assertEquals(3, int0);
  }
}