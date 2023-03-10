/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:21:37 GMT 2020
 */

package corina.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import corina.editor.Editor;
import corina.gui.ElementsPanel;
import java.awt.HeadlessException;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class ElementsPanelTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      linkedList0.add(integer0);
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel(linkedList0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel(stack0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel((Editor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("corina.gui.ElementsPanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ElementsPanel elementsPanel0 = null;
      try {
        elementsPanel0 = new ElementsPanel((List) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }
}
