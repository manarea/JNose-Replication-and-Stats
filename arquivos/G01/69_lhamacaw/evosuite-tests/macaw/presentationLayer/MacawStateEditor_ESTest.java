/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:16:56 GMT 2020
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import macaw.presentationLayer.CategoryStateEditor;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class MacawStateEditorTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      CategoryStateEditor categoryStateEditor0 = null;
      try {
        categoryStateEditor0 = new CategoryStateEditor(sessionProperties0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
