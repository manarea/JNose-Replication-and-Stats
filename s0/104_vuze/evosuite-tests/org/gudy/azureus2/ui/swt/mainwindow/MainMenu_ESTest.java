/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:48:13 GMT 2020
 */

package org.gudy.azureus2.ui.swt.mainwindow;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.swt.widgets.Shell;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gudy.azureus2.ui.swt.mainwindow.MainMenu;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MainMenu_ESTest extends MainMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MainMenu mainMenu0 = null;
      try {
        mainMenu0 = new MainMenu((Shell) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument cannot be null
         //
         verifyException("org.eclipse.swt.SWT", e);
      }
  }
}