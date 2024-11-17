package org.apache.commons.lang;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(46, 0, 48, 2155);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-4115), 65, 65);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(39);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-548), (-2094062880), (-548), (-2094062880));
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "d", "-0x");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Integer integer0 = new Integer((-3092));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-3092), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[4] = (Boolean) false;
      Integer integer0 = new Integer(1681);
      Integer integer1 = BooleanUtils.toIntegerObject(booleanArray0[4]);
      Integer integer2 = BooleanUtils.toIntegerObject(booleanArray0[4], integer0, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = new Integer((-388));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-388), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      Boolean boolean0 = new Boolean("(");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2107, 2107, 2107, (-1874));
      int int0 = BooleanUtils.toInteger(boolean0, (-1), (-2449), (-790));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "no", "58QV.ES");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{}");
      String string0 = BooleanUtils.toString(boolean0, "{}", "{}", "{}");
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "`}\"i`", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      Boolean[] booleanArray1 = new Boolean[3];
      booleanArray1[0] = (Boolean) false;
      booleanArray1[1] = (Boolean) booleanArray0[0];
      booleanArray1[2] = (Boolean) false;
      Boolean boolean0 = BooleanUtils.xor(booleanArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[4] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("nno", "K;Qx", "nno");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("The String did not match any specified value", "The String did not match any specified value", "The String did not match any specified value");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "SGa", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "A blank string is not a valid number", "tsya");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("The Integer did not match any specified value", "+_QT(+ZO84]KI", "n[_AVttn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("b>Iv");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(";i/J|&fX?j", "JIx", "JIx", "JIx");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Array is empty", (String) null, "Array is empty", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("ZnyrX>xLV", "n]Fo", "n]Fo", "ZnyrX>xLV");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "vSp", "The array must not contain any null elements", "W_?PhuC`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.ArrayUtils", (String) null, "Ur1z|4TIh36`~4?=@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, "', has a length less than 2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "|iL&qb0[YiZ7p{}rnMy", "|iL&qb0[YiZ7p{}rnMy", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(97, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Integer integer0 = new Integer(55);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals(55, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Integer integer0 = new Integer(1188);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1188, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) false, 46, 46, 0);
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 236, 236, 2327);
      assertEquals(2327, int0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 926, 926);
      assertEquals(926, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Integer integer1 = new Integer(4);
      Integer integer2 = new Integer(97);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Integer integer0 = new Integer(1700);
      Integer integer1 = new Integer(77);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Integer integer0 = new Integer(1700);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer((-1971483383));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1398), 100, (-1954419385), (-1954419385));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2050208923), 990, 391, (-2050208923));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Integer integer1 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Integer integer0 = new Integer(102);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-4641), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1925, 1925, 1925);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(766, (-1619398113), (-216));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Integer integer0 = new Integer((-1079959430));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-6));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1104631927));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(",", ",", "no", "no");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{}");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("qn", "qn", "qn", "3!");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("BsMt}", "BsMt}", "BsMt}", "BsMt}");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Integer integer0 = new Integer(55);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, " is not a valid number.", (String) null, "Array element ");
      assertNotNull(string0);
      assertEquals(" is not a valid number.", string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("msMta");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      Integer integer0 = new Integer(55);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2, 0, 0, (-2324));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2642), 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(325);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1212));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "5 Qmo:9ydI7jzJ-_");
      assertEquals("5 Qmo:9ydI7jzJ-_", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      Boolean boolean0 = new Boolean("m7d4jhG@B");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "", "off", "', has a length less than 2");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer((-3669));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer((-774));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals((-774), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 202, (-2200), 76);
      assertEquals((-2200), int0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "5 Qmo:9ydI7jzJ-_", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      Integer integer0 = new Integer(48);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "off");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf((String) null);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "off");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "'%.", (String) null, "~");
      assertEquals("~", string0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("kr 6gVlQKK&Oq", "'//~'_\"v", "kr 6gVlQKK&Oq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("yes", "!Z&V~4V.4Yb3ahn", "u|{h#;k`,$l}6jg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "true", "(_yv#KnQ%eJx6.[{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "The Integer did not match either specified value", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("R", "R", "]K3f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("R");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("9-", "no", "no", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(", '", "HycaU&]", ", '", "HycaU&]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "no", "no", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "nn", "nn", "7B,{MG_A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "nn", (String) null, "nn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "ez", "~$V0[!loaYm1j~t#i", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("~YGwqh*PP'9<pTZfyx", "~YGwqh*PP'9<pTZfyx", "~YGwqh*PP'9<pTZfyx", "9Yd");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertNotNull(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer(45);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(45, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Integer integer0 = new Integer(1026);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1026, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("|W,t\"R)DZDEZ.-35&S");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Integer integer0 = new Integer(1634);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1634, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, (-2246));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 120, 576, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 76, 48);
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1, (-1477));
      assertEquals((-1477), int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("]0g");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Integer integer0 = new Integer((-1953822641));
      Integer integer1 = new Integer((-1935344357));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-3086));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer(1026);
      Integer integer1 = new Integer(68);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Integer integer0 = new Integer(1514);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = new Integer(1514);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2763), 120, 120, (-2763));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3612), (-596), (-3612), (-1136));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-1075307805), (-2082416055));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-710), (-3669), 888, 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Integer integer0 = new Integer((-338));
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Integer integer0 = new Integer((-338));
      Integer integer1 = new Integer((-1));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer((-338));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer((-1969207593));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Integer integer0 = new Integer(1534);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-3305), (-1), (-3305));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1514, 1514, 1514);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1514, 478, 478);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1455010285));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(825);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("]0g");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("&]lP<.}p");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("]0g");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean1);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("utyg");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      String string0 = BooleanUtils.toStringYesNo((Boolean) booleanArray0[0]);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(100, 102, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-492), 0, (-5456));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2548));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-650));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      Integer integer0 = new Integer(772);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Integer integer0 = new Integer(745);
      Integer integer1 = new Integer((-3656));
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals((-3656), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Integer integer0 = new Integer((-1451022919));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, (Integer) null);
      assertEquals((-1451022919), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 97, (-373));
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 3039, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "fM6");
      assertEquals("fM6", string0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "yes", "0\">weg<c;g");
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "on", (String) null, "yes");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toString(boolean0, "", "F", "ezQ{J1<b(@?q");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "ezQ{J1<b(@?q", "", "ezQ{J1<b(@?q");
      assertEquals("ezQ{J1<b(@?q", string0);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[3];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("KKuZiYh)2T=6l o0", "off", "KKuZiYh)2T=6l o0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("!gfhsN3n", "6@HkqNKZ1@=8*_<", "6@HkqNKZ1@=8*_<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "q@", "The Integer did not match either specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.ArrayUtils", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("-0x", "-0x", "ezQ{J1<b(@?q");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("G^(?E", "", "", "G^(?E");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("^Hh^X", "L.$8:6", "^Hh^X", "L.$8:6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("nBS;o", "on", "on", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "'CR", "'CR", "'CR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "LkUtj0@j]1", (String) null, "LkUtj0@j]1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "H=(OxTk_L", "QMu&qGLiP-;A8R/%", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Integer integer0 = new Integer(600);
      Boolean boolean0 = new Boolean("kKjJ@Cnx>6}");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      BooleanUtils.toIntegerObject(boolean1, integer0, integer0, (Integer) null);
      assertFalse(boolean0.equals((Object)boolean1));
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(",`+Fh{)~rns2i", ",`+Fh{)~rns2i", "ABf{}Jed|E[DUNB", ",`+Fh{)~rns2i");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Integer integer0 = new Integer(735);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(735, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Boolean boolean0 = new Boolean(" is not a valid number.");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, 1300, (-703), 1300);
      assertEquals(1300, int0);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Integer integer0 = new Integer(2450);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      int int0 = BooleanUtils.toInteger(boolean0, 106, (-1), 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger((boolean) boolean0, (-1091456954), (-1463));
      assertEquals((-1463), int0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Integer integer0 = new Integer((-2414));
      Integer integer1 = new Integer((-2050208923));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Integer integer0 = Integer.getInteger("no", 96);
      Integer integer1 = new Integer((-153));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Integer integer0 = new Integer(3987);
      Integer integer1 = new Integer(2068);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer(600);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), 1568, 136, 3071);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3, 2331, 3, 3);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), (-1), (-1), (-4852));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3632, 3, 3, 3632);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Integer integer0 = new Integer(2450);
      Integer integer1 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Integer integer0 = Integer.getInteger("no", 96);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Integer integer0 = Integer.getInteger("|I;{|#");
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Integer integer0 = new Integer((-1618889062));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1620165597), (-1791957354), 3460);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2213), (-2213), (-2213));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1), 43, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Integer integer0 = new Integer((-1451022919));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1010);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("e'");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("XDw");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
@Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, 70, 1692, (-788));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 4069, (-2388), 0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-5723), 1498, 0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2037), (-2013355170), (-649));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 76, (-923));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Integer integer0 = new Integer((-2399));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "yes");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(237);
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Integer integer0 = new Integer((-649));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-649), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 1748);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "true", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "W!-V", "on");
      assertEquals("W!-V", string0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Boolean boolean0 = new Boolean("EIXKB|V7");
      String string0 = BooleanUtils.toString(boolean0, "EIXKB|V7", "EIXKB|V7", "EIXKB|V7");
      assertEquals("EIXKB|V7", string0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, (Integer) null);
      assertNotNull(boolean0);
      
      String string0 = BooleanUtils.toString(boolean0, "false", "['V=9", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "The Array must not be null", "no", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.valueOf(true);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3159);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Integer integer0 = new Integer((-1075826758));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("$@o!W1=", "no", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes", "W}D4tC`'", "yes");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "4!=p@43pxru", "4!=p@43pxru");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "EIXKB|V7", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "Array element ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("nSD", "on", "on", "nSD");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("nSD", (String) null, "nSD", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("MuMB", "MuMB", (String) null, "BbJ#<\"[<1Ui-`-M4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "%n  bd?r$m.&`]", ", '", "%n  bd?r$m.&`]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "?=xxco", "?=xxco", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "nSXD", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("O#9 e8M,", "no", "w", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer((-10));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-10), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Integer integer0 = new Integer((-584));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      Integer integer0 = new Integer(642);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(642, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      Boolean boolean0 = new Boolean("EIXKB|V7");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 237, 0);
      assertEquals(237, int0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 97, 2222, (-3918));
      assertEquals((-3918), int0);
  }

  @Test(timeout = 4000)
  public void test_0384()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(237);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 237, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1064), 1351);
      assertEquals((-1064), int0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 65);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("org.apache.commons.lang.math.numberutils");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0390()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Integer integer0 = new Integer((-2331));
      Integer integer1 = new Integer((-1613448383));
      Integer integer2 = new Integer((-2411));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      Integer integer0 = new Integer(1168);
      Integer integer1 = new Integer(70);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0395()  throws Throwable  {
      Integer integer0 = new Integer(388);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(388);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0397()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2891), 2147483645, (-2168), 881);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2399), (-2399), (-2399), (-2399));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1434193428), 57, (-1434193428), (-1434193428));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      Integer integer0 = new Integer(2651);
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0401()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1351, 1351, 1351);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-714), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      Integer integer0 = new Integer(3159);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1078918007));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1351);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3159);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, (boolean) boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, (boolean) boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3159);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("McV");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0430()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("MuMB");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-754), 0, 0, 97);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(404, 0, 70, 102);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 53, (-460));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Integer integer0 = new Integer((-275));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(4517);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "true", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "The String did not match either specified value", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "The array must not contain any null elements", ":X6XtkMVUbPXH=LW ", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(46, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("z0P-E,V#", "org.apache.commons.lang.BooleanUtils", "z0P-E,V#", "o+zZ8`D9");
      Integer integer0 = new Integer(587);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(587, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      Integer integer0 = new Integer((-1436254292));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, integer0);
      assertEquals((-1436254292), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-978));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0449()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-275), (-275));
      assertEquals((-275), int0);
  }

  @Test(timeout = 4000)
  public void test_0450()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0452()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "The String did not match either specified value", "ldh");
      assertEquals("ldh", string0);
  }

  @Test(timeout = 4000)
  public void test_0453()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "off", "off");
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "$?+ph*zLijO?`T%_$P", "', has a length less than 2", "', has a length less than 2");
      assertEquals("', has a length less than 2", string0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2020);
      String string0 = BooleanUtils.toString(boolean0, "B*\"4UV0bJ]M", (String) null, "`c");
      assertEquals("B*\"4UV0bJ]M", string0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, ".G!#%i", "xq\"", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = Boolean.valueOf("true");
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = booleanArray0[1];
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "!&~1p[D");
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("0w<N/u2*4?Uzl<Sn$.h", "Id", "Id");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{qq3z,v?h;ia_|", "BDVkn}>NR1/mZo<^z z", "{qq3z,v?h;ia_|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "lre#y_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "yes", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("', has a length less than 2", "', has a length less than 2", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(">Mb4M:~e6R]XQz=g`+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("zd3bres.t=! ohqul", "IxMM", "IxMM", "zd3bres.t=! ohqul");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("yes", "95)Z<Px", "Y^;o@`38", "=q[-vk8ge<l5urkv]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "The array must not contain any null elements", "on", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "sROE", (String) null, "sROE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "7UxLl=/27D>GsWVw#X", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", "off", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("7UxLl=/27D>GsWVw#X");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      Integer integer0 = new Integer((-1736));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1736), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 491);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-629), 0, (-652));
      assertEquals((-652), int0);
  }

  @Test(timeout = 4000)
  public void test_0493()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 491, 491, 491);
      assertEquals(491, int0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 2051, 0);
      assertEquals(2051, int0);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2479), 1121);
      assertEquals(1121, int0);
  }

  @Test(timeout = 4000)
  public void test_0496()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(57, 57, (-3708), (-3708));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "!&~1p[D");
      Integer integer0 = BooleanUtils.toIntegerObject((boolean) boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Integer integer0 = new Integer((-8335702));
      Integer integer1 = new Integer(100);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Integer integer0 = new Integer(444);
      Integer integer1 = new Integer(977);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0504()  throws Throwable  {
      Integer integer0 = new Integer(2380);
      Integer integer1 = new Integer((-763));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0505()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      Integer integer0 = new Integer((-3745));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1086919377), (-54467884), (-666), (-1086919377));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1504215132), 2738, (-1504215132), (-1504215132));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Integer integer0 = new Integer((-31));
      Integer integer1 = new Integer((-1169));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Integer integer1 = new Integer((-1084017925));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Integer integer0 = new Integer((-2995));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Integer integer0 = new Integer((-1971178909));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      Integer integer0 = new Integer((-3745));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1433736662), (-1979), 1216);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-659), (-659), (-659));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(491, (-3406), 491);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Integer integer0 = new Integer(2335);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3826));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-659));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      Boolean boolean0 = new Boolean("off");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "5K]193K#~`r2,-hW[C^", "!&~1p[D");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1), 102, 102, (-259));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(105, 1, 3981);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2000);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-3637));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      String string0 = BooleanUtils.toString(boolean0, "-0x", "", "Ewrp(H$N-RT6t");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0554()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0555()  throws Throwable  {
      Integer integer0 = new Integer((-776));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-776), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0556()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 63, 0);
      assertEquals(63, int0);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0559()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, ",", "8ZS=ts");
      assertEquals(",", string0);
  }

  @Test(timeout = 4000)
  public void test_0560()  throws Throwable  {
      Integer integer0 = new Integer(1938);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "b.'-*|Nw}>+c=[e{hE", "b.'-*|Nw}>+c=[e{hE", "");
      assertEquals("b.'-*|Nw}>+c=[e{hE", string0);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "7ZG3jBrSzE}6g", (String) null, "7ZG3jBrSzE}6g");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "ywJ-XuogGq].", (String) null, "2c");
      assertEquals("2c", string0);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("no", "QcJ,P\"{/i9},#", "QcJ,P\"{/i9},#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("y7FSr", "y7FSr", "y7FSr");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "ncg(LTcC57v", "ncg(LTcC57v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "7e(\tj", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no", "on", "no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "on", "on", "no");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Xg jAB3J", "40'^5~ Y!k8J}", "Xg jAB3J", "{9q]&omv.w%x?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("Array cannot be empty.", "k(", "on", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "5r`=56nx.j^u9V", "-<h~rrc2wk", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ",", (String) null, ")0K(O!+#x,#PyUp:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "zM", "off", "S6m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("C3&-i", "C3&-i", "C3&-i", "C3&-i");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Boolean boolean0 = new Boolean("Cs$qV9_3[");
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Integer integer0 = new Integer((-635));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2069));
      Integer integer0 = new Integer((-1222));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1222), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(76, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 75, 0, 75);
      int int0 = BooleanUtils.toInteger(boolean0, 1, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2296, 2296, 1938);
      assertEquals(1938, int0);
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-1789569704), 820, (-1845866749));
      assertEquals((-1789569704), int0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-71), 0);
      assertEquals((-71), int0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1033), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0604()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = new Integer((-1249));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0611()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Integer integer1 = new Integer((-1065));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0612()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Integer integer1 = new Integer((-1065));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Integer integer0 = new Integer(5123);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      Integer integer0 = new Integer(2147483645);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2157, (-3481), (-3481), 2157);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(100, 100, 100, 100);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-8335702), (-3067), 1, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      Integer integer0 = new Integer(848);
      Integer integer1 = new Integer(638);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
      
      Integer integer1 = new Integer((-1849));
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Integer integer0 = new Integer((-1969045228));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Integer integer0 = new Integer(2147483645);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, 1724, (-875));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1412), 1243, (-1412));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(156);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertFalse(boolean1);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("mcLqf");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1433736662));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1328), 1, 788, 1455);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2853), (-266), (-266), (-2853));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(4188, 2975, (-52));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      Integer integer0 = new Integer((-1995360330));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(46);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[7];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0662()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "The Array must not be null", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0663()  throws Throwable  {
      Boolean boolean0 = new Boolean("The String did not match either specified value");
      String string0 = BooleanUtils.toString(boolean0, "'t", (String) null, "The String did not match either specified value");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0664()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "", "Array is empty", "rix%Q\"");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
      Integer integer0 = new Integer((-955));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals((-955), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0667()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject("", "", "", "eL");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0668()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 46, (-3051));
      assertEquals((-3051), int0);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 97, 808, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "PuZ%peFb*t(/z*", "org.apache.commons.lang.math.NumberUtils");
      assertEquals("org.apache.commons.lang.math.NumberUtils", string0);
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "&abUU3E_Z3A4:DquH<m", "4");
      assertEquals("&abUU3E_Z3A4:DquH<m", string0);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "', is neither of type Map.Entry nor an Array", "', is neither of type Map.Entry nor an Array", "off");
      assertEquals("', is neither of type Map.Entry nor an Array", string0);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "NeAR#--`-Lz'x/E-DOr", "Hy6=z.", "Array element ");
      assertEquals("Array element ", string0);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-1239), 0);
      assertNotNull(boolean0);
      
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("", "org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.math.NumberUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("-0x", "-0x", "-0x");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "eDgX&EfHGa", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "true", "h2kb^!=N 0 /gg`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off", "', is neither of type Map.Entry nor an Array", "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{w8gc*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("', is neither of type Map.Entry nor an Array", "62U(.~", "The array must not contain any null elements", "', is neither of type Map.Entry nor an Array");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("fBm", (String) null, "fBm", "KF-.1C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("true", "off", "_", "h2kb^!=N 0 /gg`");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "os]4t;", "os]4t;", "os]4t;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "false", (String) null, "The Integer did not match either specified value");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "no", "no", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "yes", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      Integer integer0 = new Integer((-266));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-266), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-1239), 0);
      booleanArray0[0] = boolean0;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(booleanArray0[0], integer0, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Integer integer0 = new Integer(788);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals(788, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0714()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 1306, 0);
      assertEquals(1306, int0);
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 108, (-2853), (-1841));
      assertEquals((-1841), int0);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-582), (-582), (-582));
      assertEquals((-582), int0);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 2369, 2369);
      assertEquals(2369, int0);
  }

  @Test(timeout = 4000)
  public void test_0718()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0722()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      Integer integer0 = new Integer((-1613448383));
      Integer integer1 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      Integer integer0 = new Integer(120);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Integer integer1 = new Integer((-3051));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Integer integer0 = new Integer((-140));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Integer integer0 = new Integer((-4667));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(5083, (-500), (-500), (-500));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-145905990), (-1275), (-145905990), (-145905990));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      Integer integer0 = new Integer(788);
      Integer integer1 = new Integer(429);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = Integer.getInteger("yes");
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      Integer integer0 = new Integer(2603);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Integer integer0 = new Integer(48);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Integer integer0 = new Integer(3060);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1566, 3155, 1566);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2603, 2603, 2603);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1995354978), 1791, 1791);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "', is neither of type Map.Entry nor an Array", "', is neither of type Map.Entry nor an Array", "off");
      assertEquals("', is neither of type Map.Entry nor an Array", string0);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1619981207));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-3051));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-1239), 0);
      booleanArray0[0] = boolean0;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(booleanArray0[0], false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-97), (-97), (-97), (-97));
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("PrM8");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, (-1133393384), 68, 982);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(441, 1415, 1415, 102);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-93), 0, 68);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1271));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "yes");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "on", "0x", "0x");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      Integer integer0 = new Integer(45);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(45, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer((-1312));
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals((-1312), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0773()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0774()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer((-45));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-45), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0775()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-572), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      Integer integer0 = new Integer((-362));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, (-362));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "1.c.2ZyRH]p&U|", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0778()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "on", "on");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0779()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, "false", (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "yes", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.valueOf(true);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("&Anu#a", (String) null, "&Anu#a", "true");
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[2];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("`?m", "org.apache.commons.lang.math.NumberUtils", "`?m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("KIgBl@rbl~o", "^So'>zO", "^So'>zO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "mq", "mq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "Array cannot be empty.", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "org.apache.commons.lang.ArrayUtils");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("wDKeJI-mFHa");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("p^W", "]UZDYJ2rKU", "]UZDYJ2rKU", "p^W");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("]UZDYJ2rKU", "eQlDe", "eQlDe", "eQlDe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Uq", "Uq", "Uq", "Uq");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "!F&E%N9%O#", "-0x", ", '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "ty", "ty", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "a2Bk", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0815()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(101, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0818()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-278));
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 93, 93, 1897);
      assertEquals(93, int0);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 1885, (-1100), (-1105259156));
      assertEquals((-1105259156), int0);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("b8j$");
      int int0 = BooleanUtils.toInteger(boolean0, 1921, 1046, 0);
      assertEquals(1046, int0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-572), 0);
      assertEquals((-572), int0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1192, 1317);
      assertEquals(1317, int0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Integer integer0 = new Integer((-1698));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0826()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0827()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      Integer integer0 = new Integer(1613);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(100);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      Integer integer0 = new Integer((-1351));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      Integer integer0 = new Integer((-1613572489));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      Integer integer0 = new Integer(57);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      Integer integer0 = new Integer((-1065));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2525, (-54467884), (-54467884), 2525);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-2352), 1, (-2352));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(68, 68, 68, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      Integer integer0 = new Integer(3184);
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, (Integer) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      Integer integer0 = new Integer(458);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Integer integer0 = new Integer(2136);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Integer integer0 = new Integer(70);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1678, (-2956), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2136, 2136, 2136);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1), 3184, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1885);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(869);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      Boolean boolean0 = new Boolean("no");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      String string0 = BooleanUtils.toStringOnOff((Boolean) booleanArray0[1]);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Yde");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2147483645, (-2602), 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-32), 0, 132);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Integer integer0 = new Integer(102);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(699);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(28);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "false", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2091021125));
      String string0 = BooleanUtils.toString(boolean0, (String) null, "\"w|S>E?/[6B", "Array cannot be empty.");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2660));
      String string0 = BooleanUtils.toString(boolean0, "", "Array element ", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0883()  throws Throwable  {
      Integer integer0 = new Integer((-2099761786));
      Integer integer1 = new Integer(2745);
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals(2745, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0884()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(3);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(3, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0885()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-20), (-20));
      assertEquals((-20), int0);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-2660), (-2660), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 1938, 43, 523);
      assertEquals(1938, int0);
  }

  @Test(timeout = 4000)
  public void test_0888()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0889()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "9(6");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "8yxF:C+HNbCi{@]d{m", ".", "Array is empty");
      assertEquals("8yxF:C+HNbCi{@]d{m", string0);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "", "C@0~N", "{&+B%25bUz{qo=");
      assertEquals("{&+B%25bUz{qo=", string0);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[3];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("', is neither of type Map.Entry nor an Array", "', is neither of type Map.Entry nor an Array", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "lnfXT", "lnfXT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "G?xN|$J3X^%0<[>!nqE", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("true", "no", "The String did not match any specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("p`!GMJ1iY6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("t", "SrKF", "SrKF", "t");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("i{>ka", "}:1<-I(7!BI.a,;'mI", "}:1<-I(7!BI.a,;'mI", "true");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Array is empty", "Array is empty", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "@DO,c|[jnZPRj@[;p", "no", "false");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.math.NumberUtils", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      String string0 = BooleanUtils.toString(boolean0, "8yxF:C+HNbCi{@]d{m", ".", "Array is empty");
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("CE8.");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer((-1724158913));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, (Integer) null, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-1088990851));
      Boolean boolean0 = Boolean.FALSE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1088990851), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Integer integer0 = new Integer((-2062272287));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-2062272287), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", (String) null, "", (String) null);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-1), (-1), 46);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0931()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-4570), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Integer integer0 = new Integer((-1912893996));
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer((-1843829420));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
      
      Integer integer1 = new Integer((-1843829420));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer1, integer0, integer1, integer1);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0937()  throws Throwable  {
      Integer integer0 = new Integer((-2249));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0938()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer((-1));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-1433276633), 68, 1);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(3173, 3425, 3173, 3173);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), (-1), 1631, (-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1158), 0, 240, (-771));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      Integer integer0 = new Integer(1467);
      Integer integer1 = new Integer((-2061627621));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      Integer integer0 = new Integer((-1630856619));
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer1);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      Integer integer0 = Integer.valueOf(0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      Integer integer0 = Integer.getInteger("CE8.");
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-286), (-1082021283), (-1082021283));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1613322998), (-1613322998), (-1613322998));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-700), 683, (-700));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      Integer integer0 = new Integer((-329));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1613322983));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", (String) null, "", (String) null);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Z\"no", "Z\"no", "Z\"no", "Z\"no");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("-0x", "m~Pj|^}YRTw", "-0x", "m~Pj|^}YRTw");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      Boolean boolean0 = new Boolean("HM");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0972()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }
@Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, 0, 0, (-529));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(2329, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1084530373));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-6380));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "no", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      Integer integer0 = new Integer(61);
      Integer integer1 = BooleanUtils.toIntegerObject(false, (Integer) null, integer0);
      assertEquals(61, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      Integer integer0 = new Integer((-1153));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1153), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0990()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0991()  throws Throwable  {
      Integer integer0 = new Integer(61);
      Integer integer1 = new Integer((-390));
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
      assertFalse(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 101);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 5027, 5027);
      assertEquals(5027, int0);
  }

  @Test(timeout = 4000)
  public void test_0994()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "1[", "1[");
      assertEquals("1[", string0);
  }

  @Test(timeout = 4000)
  public void test_0995()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "{}", (String) null);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "The String did not match either specified value", "no");
      assertEquals("The String did not match either specified value", string0);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      Integer integer0 = new Integer((-2468));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "", (String) null, "I/$y ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "Array is empty", "trhz", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = (Boolean) false;
      Boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("5T*iX_.#&BP5eDJM", "Array cannot be empty.", "5T*iX_.#&BP5eDJM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no", "no", "no");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "Y", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "t", "', has a length less than 2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("=;SYo", "", "s4lX'8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("u$`", "'<~90PR'bTEc=Z#\"=", "'<~90PR'bTEc=Z#\"=", "u$`");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "off", "no", "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("9n[1xjwabR7zh", "9n[1xjwabR7zh", "9n[1xjwabR7zh", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "s", "s", "s");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "BZ*q8=4CUN^><t", "no", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "false", (String) null, "0#Czn**p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, "D!Ahs#58L?:=q&ma");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("bz,)b^}nn^4|s1}:l", "yes", "Dolfi", "yes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      Integer integer0 = new Integer(676);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(676, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 2460, (-3604), (-3604));
      assertEquals((-3604), int0);
  }

  @Test(timeout = 4000)
  public void test_1038()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-252), (-647), (-2805));
      assertEquals((-2805), int0);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 1075, 3, (-2005821530));
      assertEquals(1075, int0);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1843537359), (-1843537359));
      assertEquals((-1843537359), int0);
  }

  @Test(timeout = 4000)
  public void test_1041()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-647), (-1843537359));
      assertEquals((-1843537359), int0);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      Integer integer0 = new Integer((-1012));
      Integer integer1 = Integer.getInteger("{}");
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1);
      Integer integer1 = new Integer((-22741604));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      Integer integer0 = new Integer((-1012));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1049()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      Integer integer0 = new Integer(3051);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
      Integer integer0 = new Integer((-470));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1053()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1918);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
      
      Boolean boolean1 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-278), 1537, 1537, 1537);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(70, (-442), (-1096938698), 70);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2786, 767, 2786, 767);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      Integer integer0 = new Integer(1755);
      Integer integer1 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer1);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      Integer integer0 = new Integer((-6380));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      Integer integer0 = new Integer(4);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      Integer integer0 = new Integer(89);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      Integer integer0 = new Integer(1371);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      Integer integer0 = Integer.valueOf(587);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer0, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1076860143), 1312, 65);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2460, 2460, 2460);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-4182052), 2460, (-4182052));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      Boolean boolean0 = new Boolean("5:ZFlb;0");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1077()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1078()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = new Integer(275);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, integer0, integer0, integer0);
      assertEquals(275, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1079()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1080()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1081()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1082()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1918);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_1083()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_1084()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("qp");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_1085()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_1086()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_1087()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
}
