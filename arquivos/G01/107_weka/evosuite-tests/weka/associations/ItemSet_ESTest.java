/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:02:58 GMT 2020
 */

package weka.associations;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.associations.ItemSet;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.FastVector;
import weka.core.Instances;
import weka.core.SparseInstance;

 
public class ItemSetTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet(61);
      int[] intArray0 = new int[2];
      itemSet0.setItem(intArray0);
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("weka.associations.ItemSet", (-2571));
      arrayList0.add(attribute0);
      ItemSet itemSet0 = new ItemSet((-1), intArray0);
      Instances instances0 = new Instances("@attribute", arrayList0, 4);
      String string0 = itemSet0.toString(instances0);
      assertEquals("weka.associations.ItemSet= 1", string0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute attribute0 = new Attribute("weka.associations.ItemSet");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("&HUJTBU(T", arrayList0, 0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-3921);
      ItemSet itemSet0 = new ItemSet(intArray0);
      String string0 = itemSet0.toString(instances0);
      assertEquals("weka.associations.ItemSet= 0", string0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = new Attribute(":(N/~k]&");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("relational", arrayList0, 1);
      ItemSet itemSet0 = new ItemSet(2);
      // Undeclared exception!
      try { 
        itemSet0.toString(instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = 3174;
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.hashCode();
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-2012);
      ItemSet itemSet0 = new ItemSet((-2012), intArray0);
      int[] intArray1 = new int[9];
      ItemSet itemSet1 = new ItemSet(intArray1);
      boolean boolean0 = itemSet0.equals(itemSet1);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertFalse(itemSet1.equals((Object)itemSet0));
      assertFalse(boolean0);
      assertEquals(0, itemSet1.counter());
      assertEquals(1, itemSet0.counter());
      assertFalse(itemSet1.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[32];
      ItemSet itemSet0 = new ItemSet(intArray0);
      int[] intArray1 = new int[0];
      ItemSet itemSet1 = new ItemSet(intArray1);
      boolean boolean0 = itemSet1.equals(itemSet0);
      assertFalse(boolean0);
      assertEquals(0, itemSet1.counter());
      assertFalse(itemSet1.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-1332);
      intArray0[1] = (-1332);
      intArray0[2] = (-1332);
      intArray0[3] = (-1332);
      intArray0[4] = (-1332);
      intArray0[5] = (-1332);
      intArray0[6] = (-1332);
      ItemSet itemSet0 = new ItemSet((-1332), intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(5);
      boolean boolean0 = itemSet0.containedBy(binarySparseInstance0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 15;
      ItemSet itemSet0 = new ItemSet(intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(32);
      itemSet0.containedBy(binarySparseInstance0);
      assertEquals(0, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(2204, intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(388);
      itemSet0.containedBy(binarySparseInstance0);
      assertEquals(1, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[6];
      ItemSet itemSet0 = new ItemSet(41, intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3);
      binarySparseInstance0.setMissing((-1732));
      boolean boolean0 = itemSet0.containedBy(binarySparseInstance0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      ItemSet itemSet0 = new ItemSet((-1), intArray0);
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      boolean boolean0 = itemSet0.containedBy(binarySparseInstance0);
      assertTrue(boolean0);
      assertEquals(1, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-892);
      ItemSet itemSet0 = new ItemSet((-892), intArray0);
      itemSet0.setTreatZeroAsMissing(true);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) (-892);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2, doubleArray0);
      itemSet0.upDateCounter(binarySparseInstance0);
      assertEquals(1, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[7];
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.setItemAt((-2100), 0);
      assertArrayEquals(new int[] {(-2100), 0, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet(3791);
      itemSet0.setCounter(3791);
      int int0 = itemSet0.support();
      assertEquals(3791, itemSet0.counter());
      assertEquals(3791, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[8];
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.setCounter((-1502));
      int int0 = itemSet0.support();
      assertEquals((-1502), itemSet0.counter());
      assertEquals((-1502), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.items();
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[0];
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.items();
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertEquals(0, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[3] = 3842;
      ItemSet itemSet0 = new ItemSet(3842, intArray0);
      int int0 = itemSet0.itemAt(3);
      assertEquals(3842, int0);
      assertEquals(1, itemSet0.counter());
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-912);
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.itemAt(0);
      assertEquals(0, itemSet0.counter());
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[17];
      ItemSet itemSet0 = new ItemSet(3, intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      itemSet0.getTreatZeroAsMissing();
      assertEquals(1, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-583));
      int int0 = itemSet0.counter();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(0, intArray0);
      itemSet0.setCounter((-268));
      int int0 = itemSet0.counter();
      assertEquals((-268), itemSet0.support());
      assertEquals((-268), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-912);
      ItemSet itemSet0 = new ItemSet((-912), intArray0);
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-912), intArray0, (-912));
      // Undeclared exception!
      itemSet0.upDateCounter(binarySparseInstance0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-1849));
      double[] doubleArray0 = new double[1];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1849), doubleArray0);
      // Undeclared exception!
      try { 
        itemSet0.upDateCounter(binarySparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(intArray0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Attribute attribute0 = new Attribute("@attribute", arrayList1, 2);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 2);
      // Undeclared exception!
      try { 
        itemSet0.toString(instances0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("weka.as ociations.ItemSet");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("relational", arrayList0, 1);
      int[] intArray0 = new int[0];
      ItemSet itemSet0 = new ItemSet(intArray0);
      // Undeclared exception!
      try { 
        itemSet0.toString(instances0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[0];
      ItemSet itemSet0 = new ItemSet(intArray0);
      // Undeclared exception!
      try { 
        itemSet0.setItemAt((-503), (-503));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -503
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ItemSet.pruneRules((FastVector[]) null, (-102.4344));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FastVector<Integer>[] fastVectorArray0 = (FastVector<Integer>[]) Array.newInstance(FastVector.class, 0);
      // Undeclared exception!
      try { 
        ItemSet.pruneRules(fastVectorArray0, (-4211.487762309864));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-1476));
      // Undeclared exception!
      try { 
        itemSet0.itemAt((-1476));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[9];
      ItemSet itemSet0 = new ItemSet(intArray0);
      // Undeclared exception!
      try { 
        itemSet0.itemAt((-2430));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2430
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet(61);
      // Undeclared exception!
      try { 
        itemSet0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet(421);
      // Undeclared exception!
      try { 
        itemSet0.equals(itemSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(2);
      ItemSet itemSet0 = new ItemSet(3);
      // Undeclared exception!
      try { 
        itemSet0.containedBy(binarySparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[17];
      ItemSet itemSet0 = new ItemSet(intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2785.335;
      DenseInstance denseInstance0 = new DenseInstance(0.0, doubleArray0);
      itemSet0.containedBy(denseInstance0);
      assertEquals(0, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-39);
      ItemSet itemSet0 = new ItemSet(intArray0);
      double[] doubleArray0 = new double[9];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3505.538, doubleArray0);
      // Undeclared exception!
      try { 
        itemSet0.containedBy(binarySparseInstance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-1849));
      double[] doubleArray0 = new double[0];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance((-1849), doubleArray0);
      itemSet0.upDateCounter(binarySparseInstance0);
      assertEquals(1, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      Attribute attribute0 = new Attribute("Wb]v@]P|FJvI");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 3938);
      ItemSet itemSet0 = new ItemSet(intArray0);
      String string0 = itemSet0.toString(instances0);
      assertEquals("0", string0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(intArray0);
      int[] intArray1 = new int[1];
      intArray1[0] = (int) (byte) (-124);
      ItemSet itemSet1 = new ItemSet(3, intArray1);
      boolean boolean0 = itemSet0.equals(itemSet1);
      assertFalse(boolean0);
      assertEquals(1, itemSet1.support());
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertFalse(itemSet1.getTreatZeroAsMissing());
      assertFalse(itemSet1.equals((Object)itemSet0));
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[5];
      ItemSet itemSet0 = new ItemSet(421, intArray0);
      int[] intArray1 = new int[2];
      ItemSet itemSet1 = new ItemSet(intArray1);
      boolean boolean0 = itemSet0.equals(itemSet1);
      assertEquals(1, itemSet0.support());
      assertEquals(0, itemSet1.counter());
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertFalse(itemSet1.equals((Object)itemSet0));
      assertFalse(itemSet1.getTreatZeroAsMissing());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int[] intArray0 = new int[0];
      ItemSet itemSet0 = new ItemSet(intArray0);
      Object object0 = new Object();
      boolean boolean0 = itemSet0.equals(object0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertFalse(boolean0);
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int[] intArray0 = new int[5];
      ItemSet itemSet0 = new ItemSet(421, intArray0);
      boolean boolean0 = itemSet0.equals(itemSet0);
      assertEquals(1, itemSet0.counter());
      assertTrue(boolean0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(intArray0);
      boolean boolean0 = itemSet0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      assertEquals(0, itemSet0.counter());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(0, intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      assertTrue(itemSet0.getTreatZeroAsMissing());
      
      double[] doubleArray0 = new double[9];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0, doubleArray0);
      DenseInstance denseInstance0 = new DenseInstance(binarySparseInstance0);
      itemSet0.containedBy(denseInstance0);
      assertEquals(1, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[9];
      ItemSet itemSet0 = new ItemSet(3842, intArray0);
      SparseInstance sparseInstance0 = new SparseInstance(3842);
      itemSet0.containedBy(sparseInstance0);
      assertEquals(1, itemSet0.support());
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-39);
      ItemSet itemSet0 = new ItemSet(intArray0);
      double[] doubleArray0 = new double[9];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(3505.538, doubleArray0);
      // Undeclared exception!
      try { 
        itemSet0.upDateCounter(binarySparseInstance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int[] intArray0 = new int[5];
      ItemSet itemSet0 = new ItemSet(0, intArray0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0);
      boolean boolean0 = itemSet0.containedBy(binarySparseInstance0);
      assertTrue(boolean0);
      assertEquals(1, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int[] intArray0 = new int[10];
      ItemSet itemSet0 = new ItemSet(intArray0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
      
      itemSet0.setTreatZeroAsMissing(true);
      SparseInstance sparseInstance0 = new SparseInstance(3);
      boolean boolean0 = itemSet0.containedBy(sparseInstance0);
      assertTrue(itemSet0.getTreatZeroAsMissing());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-916);
      ItemSet itemSet0 = new ItemSet((-916), intArray0);
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.0, intArray0, 32);
      // Undeclared exception!
      itemSet0.containedBy(binarySparseInstance0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      ItemSet itemSet0 = new ItemSet(intArray0);
      itemSet0.setTreatZeroAsMissing(true);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      boolean boolean0 = itemSet0.containedBy(binarySparseInstance0);
      assertTrue(itemSet0.getTreatZeroAsMissing());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[] intArray0 = new int[9];
      ItemSet itemSet0 = new ItemSet(3842, intArray0);
      String string0 = itemSet0.getRevision();
      assertEquals(1, itemSet0.counter());
      assertEquals("8034", string0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet(61);
      // Undeclared exception!
      try { 
        itemSet0.setItemAt(61, 61);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.associations.ItemSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-3225));
      itemSet0.items();
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ItemSet itemSet0 = new ItemSet((-566));
      int int0 = itemSet0.support();
      assertEquals(0, int0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = new int[1];
      ItemSet itemSet0 = new ItemSet(0, intArray0);
      int int0 = itemSet0.counter();
      assertEquals(1, int0);
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int[] intArray0 = new int[9];
      ItemSet itemSet0 = new ItemSet(3842, intArray0);
      boolean boolean0 = itemSet0.getTreatZeroAsMissing();
      assertFalse(boolean0);
      assertEquals(1, itemSet0.support());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int[] intArray0 = new int[9];
      ItemSet itemSet0 = new ItemSet(3842, intArray0);
      itemSet0.itemAt(3);
      assertEquals(1, itemSet0.counter());
      assertFalse(itemSet0.getTreatZeroAsMissing());
  }
}
