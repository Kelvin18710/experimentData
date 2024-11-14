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
        BooleanUtils.toBooleanObject((-2591), 45, 45, 70);
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
        BooleanUtils.toBoolean(1, (-527), (-1));
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
      Integer integer0 = new Integer((-1922));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3727);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
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
  public void test_0005()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, ")@k@?i3mvx^2}m79|", ")@k@?i3mvx^2}m79|", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Integer integer0 = new Integer(1352);
      Integer integer1 = new Integer((-3168));
      Integer integer2 = BooleanUtils.toIntegerObject(true, integer1, integer0);
      assertEquals((-3168), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("NG.mk_", "NG.mk_", "NG.mk_", "NG.mk_");
      Integer integer0 = new Integer((-188));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-3943), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 2012, 2012, 0);
      assertEquals(2012, int0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "The Array must not be null");
      assertEquals("The Array must not be null", string0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toString(boolean0, "h?LG#gN", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
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
  public void test_0020()  throws Throwable  {
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
  public void test_0021()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("NG.mk_", "NG.mk_", "NG.mk_", "NG.mk_");
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
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
  public void test_0023()  throws Throwable  {
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
  public void test_0024()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "Th Array must not enull");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "h?LG#gN", "", "");
      assertEquals("h?LG#gN", string0);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("yes", "GBYRY", "GBYRY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true", "true", "true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "k1ZtJ{BJ1+28 RHj=6", "k1ZtJ{BJ1+28 RHj=6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "9+Za\"", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array is empty", "l8_(XHL4,WOdS%l\"", "Array is empty");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "prp", "prp", "true");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(")qO", "X^%4p- QrPH<d?hcr", "Trxf", ";Xe.@rWG&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Th Array must not enull", "", "Th Array must not enull", "TW.  x/Eoh\"%8/,");
      Boolean[] booleanArray0 = new Boolean[1];
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "nm", "nm", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "<9#C", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "', has a length less than 2", "', has a length less than 2", "', has a length less than 2");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(".m-");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1441));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      Integer integer0 = new Integer((-1922));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1922), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("NG.mk_", "NG.mk_", "NG.mk_", "NG.mk_");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, (-188), 0, (-707));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-2645), 1506, (-188));
      assertEquals((-188), int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("NG.mk_", "NG.mk_", "NG.mk_", "NG.mk_");
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-2650), (-2650), (-188));
      assertEquals((-2650), int0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 969, 969);
      assertEquals(969, int0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-188), (-188));
      assertEquals((-188), int0);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Integer integer0 = new Integer((-6262915));
      Integer integer1 = new Integer(743);
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
  public void test_0064()  throws Throwable  {
      Integer integer0 = new Integer(2551);
      Integer integer1 = new Integer(480);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Integer integer0 = new Integer(101);
      Integer integer1 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
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
  public void test_0067()  throws Throwable  {
      Integer integer0 = new Integer(550);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      Integer integer0 = new Integer((-698));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      Integer integer0 = Integer.getInteger("nig");
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      Integer integer0 = new Integer((-19));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, (-1391), (-1391), (-1100960779));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-605), (-592), (-605), (-605));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-886), (-886), (-886), (-886));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2730), (-421), (-421), (-2730));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Integer integer0 = new Integer(70);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      Integer integer0 = new Integer((-707));
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
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(".m-", ".m-", ".m-", ".m-");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      
      boolean boolean1 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer(70);
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
  public void test_0081()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-527), (-188), 4051);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1461321847), (-1461321847), (-2525));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-19));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(48);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
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
      Boolean boolean0 = BooleanUtils.toBooleanObject(".m-", ".m-", ".m-", ".m-");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
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
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2089), 543, 68, 0);
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
        BooleanUtils.toBoolean(1763, 628, 1);
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
      boolean boolean0 = BooleanUtils.toBoolean(0, (-285), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2817));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
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
  public void test_0113()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "%#R~q&j^Op)=r1TO");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      Integer integer0 = new Integer(3455);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(3455, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Integer integer0 = new Integer(823);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) false, (Integer) null, integer0, integer0);
      assertEquals(823, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 3455);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, (-656));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "?ipI9@v", "");
      assertEquals("?ipI9@v", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toString(boolean0, "T|u<EUdpDxB:", (String) null, "T|u<EUdpDxB:");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) true, "no", "yes", "no");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "bhW", "", "bhW");
      assertEquals("bhW", string0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
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
  public void test_0132()  throws Throwable  {
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
  public void test_0133()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
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
  public void test_0135()  throws Throwable  {
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
  public void test_0136()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toStringOnOff(boolean1);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("i'ndn*v<K~,r", "true", "i'ndn*v<K~,r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("on", "true", "The Array must not be null");
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "no", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "!6h]r2o", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("7*p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "Bw!Fqn3y", "hzrric(ea*w", "true");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("GFDOnx[EE,tOEZg", "Fc6v9-]\":]2@qIA", "GFDOnx[EE,tOEZg", "Fc6v9-]\":]2@qIA");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("W+i", "n 4zjd>x%~8v;_gn[", "Bw!Fqn3y", "n 4zjd>x%~8v;_gn[");
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
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "yes", "yes", "org.apache.commons.lang.BooleanUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "nm", (String) null, "nm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "SSTa", "SSTa", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("oF6n", "oF6n", "ILiB:EG'", "oF6n");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("ILiB:EG'");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
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
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = Boolean.TRUE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Integer integer0 = Integer.getInteger((String) null, (-2043));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals((-2043), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      int int0 = BooleanUtils.toInteger(boolean1, (-2339), 1943, 1);
      assertEquals(1943, int0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-3762), 2115, 76);
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      int int0 = BooleanUtils.toInteger(boolean0, (-2339), 1943, 1);
      assertEquals((-2339), int0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, Integer.MAX_VALUE, 0);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2817), (-2817));
      assertEquals((-2817), int0);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Integer integer0 = new Integer(272);
      Integer integer1 = new Integer((-1934183150));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
      assertNotNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Integer integer0 = new Integer(1033);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      Integer integer0 = new Integer(998);
      Integer integer1 = new Integer(1);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
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
      Integer integer0 = Integer.getInteger((String) null, (-1723685876));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      Integer integer0 = new Integer((-1471));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1268, (-1082497129), (-1082497129), (-1082497129));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2424), (-1309), (-2424), (-2424));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1793), (-1793), (-1471), (-1793));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), 774, 774, (-1));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-932));
      Integer integer1 = new Integer(44);
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
  public void test_0187()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      Integer integer0 = new Integer((-1814));
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
  public void test_0189()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      Integer integer0 = new Integer((-1471));
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1841040619), (-1610612734), (-1610612734));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      Integer integer0 = new Integer((-1471));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(45);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Integer integer0 = new Integer(5);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1983376600), 932, 932, 932);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-2416), 2017, 1041);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Integer integer0 = new Integer((-1618));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1336));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[6];
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
  public void test_0221()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      Integer integer0 = new Integer((-1113411889));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "3Jq1/O@'a97HyCwqzu", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-914), (-914), 1, 1);
      String string0 = BooleanUtils.toString(boolean0, "", "", "DhC=g7D9Iig1cL^b");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      Boolean boolean0 = new Boolean("i*dD~M)c0xi/im@p|");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      Integer integer0 = new Integer(2147483645);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2147483645, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      Integer integer0 = new Integer((-2086133800));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-2086133800), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, (-1053));
      assertEquals((-1053), int0);
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "-0x", "false");
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toString(boolean0, "no", "', has a length less than 2", ", '");
      assertEquals("', has a length less than 2", string0);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      String string0 = BooleanUtils.toString(boolean0, "yes", "', has a length less than 2", ", '");
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "2f_5{", (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
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
  public void test_0240()  throws Throwable  {
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
  public void test_0241()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
      
      Boolean boolean1 = new Boolean(true);
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean1;
      booleanArray0[3] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
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
  public void test_0244()  throws Throwable  {
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
  public void test_0245()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("ye{", "W\"/w--V_A.X_&S", "W\"/w--V_A.X_&S");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("O", "O", "O");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "no", "no");
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
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "t3~-dPI*", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Mq{/", "', has a length less than 2", "Mq{/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("'Qr^", ">?eG?X", "", "'Qr^");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("--", ":KI3rD", "--", "^g7,NQo");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(":KI3rD", ":KI3rD", (String) null, "w%9+v)t");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "oLvG", "oLvG", "oLvG");
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
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, " is not a valid number.", " is not a valid number.", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "M92^URx:i*)", (String) null, "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("EtGRQ9!'~6", "off", "", "{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("/D),EO>di`!r%q|~bC#");
      Integer integer0 = new Integer((-181));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-181), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("0c{r],<xqvo");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1176);
      Integer integer0 = new Integer(1176);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1176, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("0c{r],<xqvo");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      int int0 = BooleanUtils.toInteger(boolean1, 1, 1, 246);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-898), (-898), (-3581));
      assertEquals((-3581), int0);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = BooleanUtils.toInteger(boolean0, 1, 1, 246);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 704);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-2943), 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Integer integer0 = new Integer(928);
      Integer integer1 = new Integer((-378));
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
  public void test_0283()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = new Integer((-1886245373));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      Integer integer0 = new Integer((-1249));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      Integer integer0 = new Integer((-1618));
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
  public void test_0286()  throws Throwable  {
      Integer integer0 = new Integer(623);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Integer integer0 = new Integer(1364);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3410), 1286, 0, (-3410));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1560), (-424), (-1560), (-424));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2256, (-1), 1103, (-2086133800));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      Integer integer0 = new Integer((-2));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      Integer integer0 = new Integer(1);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      Integer integer0 = new Integer(102);
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
  public void test_0295()  throws Throwable  {
      Integer integer0 = new Integer(102);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      Integer integer0 = Integer.getInteger("uP-y')0|@/PbmuHn-");
      Integer integer1 = new Integer((-2));
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
  public void test_0298()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, (-914), (-914));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(7, 7, 7);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      Integer integer0 = new Integer(1103);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) true, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toStringOnOff(boolean1);
      assertEquals("off", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("&?/ I<V]`I3KOkoU[/R");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1363, (-2021749864), (-2021749864), (-2021749864));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1), 0, 812);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(31);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
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
  public void test_0325()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "d17<");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "A blank string is not a valid number", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "A", (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      Integer integer0 = new Integer(2118);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2118, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      Integer integer0 = new Integer((-1433966677));
      Integer integer1 = BooleanUtils.toIntegerObject(false, (Integer) null, integer0);
      assertEquals((-1433966677), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = Integer.getInteger("@|ng'\"?");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-797));
      Integer integer0 = new Integer((-797));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-797), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 68, 68);
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "9u|[&\"Z,F", ":N<&tYPkyU1\"9>[^am");
      assertEquals(":N<&tYPkyU1\"9>[^am", string0);
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "The Array must not be null", "91ae3Y}z1mi)Q", "rI6ip4");
      assertEquals("The Array must not be null", string0);
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) false, "j#C69$KEUAj'*dZ", "j#C69$KEUAj'*dZ", "5F0[)G-");
      assertEquals("j#C69$KEUAj'*dZ", string0);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "true", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
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
  public void test_0344()  throws Throwable  {
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
  public void test_0345()  throws Throwable  {
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
  public void test_0346()  throws Throwable  {
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
  public void test_0347()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("s4@O(9_C]Qq", " r-F_", "{!aanm(VsIO_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("z^u", "z^u", "_0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "2!A:$k~[s4Rgw4.$q[", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, " r-F_", "{!aanm(VsIO_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("1^!U)0", "no", "1^!U)0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("'CbiAA7Y+\"]e~s>P", "on", "?`", "1^!U)0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Fe4 iy>|#)CZ*N|cg:R", "false", "Fe4 iy>|#)CZ*N|cg:R", "a blank string is not a valid number");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("^!k2TwE%B5rqp", "^!k2TwE%B5rqp", "^!k2TwE%B5rqp", "sYSpWObkLKk1:'}O");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.BooleanUtils", "Yps5T;P");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "', is neither of type Map.Entry nor an Array", (String) null, "1|xit");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "off", "off", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no", "{}", "{}", "no");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0364()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0365()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0366()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0367()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0368()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0369()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0370()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("{}");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0371()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0372()  throws Throwable  {
      Integer integer0 = new Integer(46);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(46, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0373()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0374()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.toBooleanObject(57);
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean1;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      int int0 = BooleanUtils.toInteger(boolean2, (-2353), (-2372), 0);
      assertEquals((-2353), int0);
  }

  @Test(timeout = 4000)
  public void test_0375()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 101, (-1), 101);
      assertEquals(101, int0);
  }

  @Test(timeout = 4000)
  public void test_0376()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      int int0 = BooleanUtils.toInteger((Boolean) booleanArray0[5], 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0377()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0378()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1880078749), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0379()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0380()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0381()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0382()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0383()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Integer integer1 = new Integer((-1613068366));
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
  public void test_0384()  throws Throwable  {
      Integer integer0 = new Integer(3441);
      Integer integer1 = new Integer((-454));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0385()  throws Throwable  {
      Integer integer0 = new Integer(554);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0386()  throws Throwable  {
      Integer integer0 = new Integer((-2921));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0387()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0388()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0389()  throws Throwable  {
      Integer integer0 = new Integer((-948));
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
  public void test_0390()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(456, (-1960), (-1960), 456);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0391()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1436893622), 3014, (-1436893622), (-1436893622));
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0392()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-516), (-516), (-516), (-516));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0393()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1880078749), 3448, (-3894), 108);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0394()  throws Throwable  {
      Integer integer0 = new Integer(0);
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
  public void test_0395()  throws Throwable  {
      Integer integer0 = new Integer((-2615));
      Boolean boolean0 = Boolean.TRUE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0396()  throws Throwable  {
      Integer integer0 = new Integer(829);
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
  public void test_0397()  throws Throwable  {
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0398()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0399()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0400()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1686, (-1619947538), (-1345));
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
      boolean boolean0 = BooleanUtils.toBoolean((-802), (-802), (-802));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0402()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1131298264), 97, (-1131298264));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0403()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0404()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0405()  throws Throwable  {
      Integer integer0 = new Integer((-1086919377));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0406()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0407()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0408()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1086919388));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0409()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0410()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0411()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0412()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[9];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      booleanArray0[8] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0413()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0414()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0415()  throws Throwable  {
      Integer integer0 = new Integer(43);
      Integer integer1 = new Integer((-2147483645));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0416()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0417()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0418()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0419()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0420()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0421()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0422()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0423()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0424()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-2418), 1583, 0, 676);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0425()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1567, 3643, 3643, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0426()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(70, 891, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0427()  throws Throwable  {
      Integer integer0 = new Integer((-413));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0428()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1512);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0429()  throws Throwable  {
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
  public void test_0430()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0431()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0432()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0433()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0434()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "on", "no");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0435()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, (Integer) null, integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "9'2iSU=,)&Xh6$~V", "yt");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0436()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toString(boolean0, "", "", "%4I4'");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0437()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0438()  throws Throwable  {
      Integer integer0 = new Integer((-1087580594));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1087580594), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0439()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0440()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("|7jz/X");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0441()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 743, (-1981));
      assertEquals(743, int0);
  }

  @Test(timeout = 4000)
  public void test_0442()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0443()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0444()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0445()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0446()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "", "on", "on");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0447()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, (String) null, "", "~vMsJG{h");
      assertEquals("~vMsJG{h", string0);
  }

  @Test(timeout = 4000)
  public void test_0448()  throws Throwable  {
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
  public void test_0449()  throws Throwable  {
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
  public void test_0450()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[5];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0451()  throws Throwable  {
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
  public void test_0452()  throws Throwable  {
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
  public void test_0453()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0454()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0455()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0456()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("d", "Array cannot be empty.", "Array cannot be empty.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0457()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("(fr]$6X=|L*q<c%DlT", "0;YUhQK3q", "(fr]$6X=|L*q<c%DlT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0458()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "yfe", "yfe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0459()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0460()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "oo", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0461()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true", "true", "true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0462()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0463()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0464()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0465()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0466()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "%UYn8", "%UYn8", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0467()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("y,+4jqo", "true", "true", "true");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0468()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "trub", "trub", "trub");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0469()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Bs>;8)&O~fk,5R", "no", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0470()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0471()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "|7jz/x", (String) null, "!x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0472()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0473()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0474()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0475()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0476()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0477()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0478()  throws Throwable  {
      Integer integer0 = new Integer(347);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(347, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0479()  throws Throwable  {
      Boolean boolean0 = new Boolean("oo");
      Integer integer0 = new Integer((-2097554571));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-2097554571), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0480()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0481()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0482()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("ad");
      int int0 = BooleanUtils.toInteger(boolean0, 120, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test_0483()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1863), (-4182052), (-4182052));
      assertEquals((-4182052), int0);
  }

  @Test(timeout = 4000)
  public void test_0484()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(574);
      int int0 = BooleanUtils.toInteger(boolean0, (-1963), (-4268), 574);
      assertEquals((-1963), int0);
  }

  @Test(timeout = 4000)
  public void test_0485()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, (-1523));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0486()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 108, (-1994803718));
      assertEquals((-1994803718), int0);
  }

  @Test(timeout = 4000)
  public void test_0487()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0488()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0489()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
      
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0490()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0491()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0492()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1994682096));
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
  public void test_0493()  throws Throwable  {
      Integer integer0 = new Integer((-3518));
      Integer integer1 = new Integer((-1598));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0494()  throws Throwable  {
      Integer integer0 = new Integer(1988);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0495()  throws Throwable  {
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
  public void test_0496()  throws Throwable  {
      Integer integer0 = new Integer((-30756608));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0497()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0498()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0499()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2501, (-1198), (-251338216), 2501);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0500()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(193, 193, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0501()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, (-1076860143), 1, 1);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0502()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("I$eW@");
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      Integer integer1 = new Integer((-4182052));
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0503()  throws Throwable  {
      Integer integer0 = new Integer(73);
      Integer integer1 = new Integer((-10400458));
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
  public void test_0504()  throws Throwable  {
      Integer integer0 = new Integer(1475);
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
  public void test_0505()  throws Throwable  {
      Integer integer0 = new Integer(1517);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0506()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0507()  throws Throwable  {
      Integer integer0 = new Integer(73);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0508()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-678), 6, (-22));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0509()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1644, 1644, 3116);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0510()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3097, 1475, 3097);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0511()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0512()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0513()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0514()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0515()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4625));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0516()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0517()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1109));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0518()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0519()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0520()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0521()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "true", "true", "true");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0522()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0523()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "wk", "true", "true");
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0524()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0525()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0526()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
      
      Boolean[] booleanArray0 = new Boolean[3];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean1;
      booleanArray0[2] = (Boolean) false;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0527()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0528()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0529()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("oo");
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0530()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0531()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0532()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(3, 1, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0533()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(65, 426, (-1212));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0534()  throws Throwable  {
      Integer integer0 = new Integer(2147483645);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0535()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2096597635));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0536()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2831));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0537()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0538()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0539()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "OeQ>Y*~#");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0540()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "on", "4i(JV+J");
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0541()  throws Throwable  {
      Integer integer0 = new Integer(1045);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1045, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0542()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0543()  throws Throwable  {
      Integer integer0 = new Integer((-70170231));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-70170231), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0544()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0545()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0546()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("5vTfb[s$2FrvL");
      assertFalse(boolean0);
      
      int int0 = BooleanUtils.toInteger((Boolean) boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0547()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0548()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "Array cannot be empty.", "n ", "no");
      assertEquals("n ", string0);
  }

  @Test(timeout = 4000)
  public void test_0549()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) true, (String) null, "]IKIB'k1", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0550()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, " ", " ", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0551()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0552()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0553()  throws Throwable  {
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
  public void test_0554()  throws Throwable  {
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
  public void test_0555()  throws Throwable  {
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
  public void test_0556()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0557()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0558()  throws Throwable  {
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
  public void test_0559()  throws Throwable  {
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
  public void test_0560()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0561()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0562()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1), (-1), (-1), (-1920));
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0563()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array is empty", "ypU", "Array is empty");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0564()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{@d", "{@d", "yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0565()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "wapPi<Vc>um:", "wapPi<Vc>um:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0566()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0567()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, ",#PBrH", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0568()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("0,X$6%1>eC", "pgnygq1l0FPizT2~{m", "Z'':%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0569()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0570()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0571()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0572()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("UJ]:$.t", "", "H{w!e}", "9rx\")V1trkYQs3#24");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0573()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "OeQ>Y*~#", "true", "true");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0574()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("/QcK", "", "OeQ>Y*~#", "/QcK");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0575()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "on", "wes", "on");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0576()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "[yK`r:IRiE4N^d~_]?", "UJ]:$.t", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0577()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0578()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0579()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0580()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0581()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0582()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0583()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0584()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("Z'':%");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0585()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("3I5ghrs7aW&XT7?7\",", "3I5ghrs7aW&XT7?7\",", "3I5ghrs7aW&XT7?7\",", "3I5ghrs7aW&XT7?7\",");
      Integer integer0 = new Integer((-3636));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-3636), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0586()  throws Throwable  {
      Integer integer0 = new Integer(3233);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(3233, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0587()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ",#PBrH", (String) null, (String) null);
      Integer integer0 = new Integer((-1566));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0588()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0589()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      int int0 = BooleanUtils.toInteger((Boolean) booleanArray0[1], 1, (-1), (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0590()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 76, (-1633884226), 76);
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test_0591()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[3];
      int int0 = BooleanUtils.toInteger((Boolean) booleanArray0[2], 1, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_0592()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0593()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, (-2160));
      assertEquals((-2160), int0);
  }

  @Test(timeout = 4000)
  public void test_0594()  throws Throwable  {
      Integer integer0 = new Integer((-70170231));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0595()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0596()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0597()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0598()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0599()  throws Throwable  {
      Integer integer0 = new Integer((-65));
      Integer integer1 = new Integer(277);
      Integer integer2 = new Integer((-65));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer2);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0600()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-125));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0601()  throws Throwable  {
      Integer integer0 = new Integer(248);
      Integer integer1 = new Integer((-1196));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0602()  throws Throwable  {
      Integer integer0 = new Integer(76);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0603()  throws Throwable  {
      Integer integer0 = new Integer((-49));
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
  public void test_0604()  throws Throwable  {
      Integer integer0 = new Integer(448);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0605()  throws Throwable  {
      Integer integer0 = new Integer(2236);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0606()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, (-2256), (-2256), 0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0607()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1934594493), 646, (-339), 646);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0608()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2583, (-263), 2583, 2583);
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0609()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0610()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) false);
      Integer integer1 = new Integer(45);
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
  public void test_0611()  throws Throwable  {
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
  public void test_0612()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0613()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0614()  throws Throwable  {
      Integer integer0 = new Integer((-1566));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0615()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(75, (-1095875758), 75);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0616()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0617()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1566), 684, (-1141));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0618()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0619()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0620()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0621()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(3638);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0622()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1263);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0623()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0624()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0625()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0626()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0627()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0628()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0629()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0630()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0631()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0632()  throws Throwable  {
      Integer integer0 = new Integer(3233);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0633()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ",#PBrH", (String) null, (String) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0634()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0635()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0636()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0637()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0638()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0639()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1787), (-76), 0, 1769);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0640()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1041, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0641()  throws Throwable  {
      Integer integer0 = new Integer((-322));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0642()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2764));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0643()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(5279);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0644()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0645()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0646()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0647()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, (-4346), 0);
      assertNotNull(boolean0);
      
      String string0 = BooleanUtils.toString(boolean0, "", "The Integer did not match any specified value", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0648()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(97, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0649()  throws Throwable  {
      Integer integer0 = new Integer((-154));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-154), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0650()  throws Throwable  {
      Integer integer0 = new Integer(2137);
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertEquals(2137, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0651()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-16602921), (-16602921), (-322), (-16602921));
      Integer integer0 = new Integer((-322));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-322), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0652()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1841), (-1841));
      assertEquals((-1841), int0);
  }

  @Test(timeout = 4000)
  public void test_0653()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-212), 1);
      assertEquals((-212), int0);
  }

  @Test(timeout = 4000)
  public void test_0654()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "t4s2h.&w2Y", "t4s2h.&w2Y");
      assertEquals("t4s2h.&w2Y", string0);
  }

  @Test(timeout = 4000)
  public void test_0655()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0656()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = booleanArray0[0];
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      String string0 = BooleanUtils.toString(boolean1, "4XlHnb97&", "#eeu", "#eeu");
      assertEquals("#eeu", string0);
  }

  @Test(timeout = 4000)
  public void test_0657()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 2590);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "yes", "A blank string is not a valid number");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0658()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, ".?K/,k<9`m_K", "on", "no");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0659()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0660()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.FALSE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0661()  throws Throwable  {
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
  public void test_0662()  throws Throwable  {
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
  public void test_0663()  throws Throwable  {
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
  public void test_0664()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0665()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0666()  throws Throwable  {
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
  public void test_0667()  throws Throwable  {
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
  public void test_0668()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0669()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0670()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0671()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("*F", "Array element ", "Array element ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0672()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("O`*", "O`*", "O`*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0673()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, ")Cm8.[d/", ")Cm8.[d/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0674()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0675()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "no", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0676()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false", "%D", "false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0677()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0678()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0679()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0680()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0681()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "oo", "oo", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0682()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "no", "on", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0683()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("~gl", "(D? }OumJ", "yes", "}%2HMfuvVlU)+DMo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0684()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "e'|t3o", "e'|t3o", ";I#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0685()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "no", "no", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0686()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0687()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "{}", (String) null, "{}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0688()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0689()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0690()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0691()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0692()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0693()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("~gl");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0694()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Integer integer0 = new Integer(0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean1, (Integer) null, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0695()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0696()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0697()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0698()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      int int0 = BooleanUtils.toInteger(boolean0, 1, 1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0699()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2777, 45, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0700()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0701()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 2818, 2590);
      assertEquals(2818, int0);
  }

  @Test(timeout = 4000)
  public void test_0702()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-1828), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0703()  throws Throwable  {
      Integer integer0 = new Integer(45);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0704()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0705()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0706()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0707()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0708()  throws Throwable  {
      Integer integer0 = new Integer((-1715));
      Integer integer1 = new Integer(1150);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0709()  throws Throwable  {
      Integer integer0 = new Integer(45);
      Integer integer1 = new Integer(1259);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0710()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0711()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
      
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0712()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0713()  throws Throwable  {
      Integer integer0 = new Integer(48);
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
  public void test_0714()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2666, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0715()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-306), 0, 0, (-306));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0716()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(2516, 45, 2516, (-213));
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0717()  throws Throwable  {
      Integer integer0 = new Integer((-3352));
      Integer integer1 = new Integer(124);
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
  public void test_0718()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(861);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0719()  throws Throwable  {
      Integer integer0 = new Integer(1424);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0720()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0721()  throws Throwable  {
      Integer integer0 = Integer.getInteger("no", (-1449));
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
  public void test_0722()  throws Throwable  {
      Integer integer0 = new Integer((-3361));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0723()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-105443127), (-1144825957), 102);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0724()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0725()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, 97, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0726()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0727()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0728()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0729()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0730()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0731()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2934));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0732()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0733()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0734()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("b9Pz5lp3d)A6", "b9Pz5lp3d)A6", "b9Pz5lp3d)A6", "b9Pz5lp3d)A6");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0735()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0736()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 2590);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0737()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0738()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0739()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[1] = true;
      Boolean boolean0 = BooleanUtils.negate((Boolean) booleanArray0[1]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0740()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0741()  throws Throwable  {
      Integer integer0 = new Integer(97);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0742()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0743()  throws Throwable  {
      Integer integer0 = new Integer(45);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0744()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0745()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0746()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }
@Test(timeout = 4000)
  public void test_0747()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1608), (-1), 48, 48);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0748()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(3625, (-805), (-805), (-805));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0749()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1262), 1616, 1732);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0750()  throws Throwable  {
      Integer integer0 = new Integer(1135);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0751()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(111);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0752()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1135);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0753()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0754()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0755()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "%1");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0756()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("");
      String string0 = BooleanUtils.toString((Boolean) boolean0, "", "", "yes");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0757()  throws Throwable  {
      Integer integer0 = new Integer(1004);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(1004, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0758()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0759()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1789));
      Integer integer2 = BooleanUtils.toIntegerObject(false, integer0, integer1);
      assertEquals((-1789), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0760()  throws Throwable  {
      Integer integer0 = new Integer(1478);
      Boolean boolean0 = Boolean.valueOf("a6$~");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0761()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      Integer integer0 = new Integer(1004);
      Integer integer1 = new Integer((-898));
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer0, integer0);
      assertEquals((-898), (int)integer2);
  }

  @Test(timeout = 4000)
  public void test_0762()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 1135);
      assertEquals(1135, int0);
  }

  @Test(timeout = 4000)
  public void test_0763()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-95), (-1527));
      assertEquals((-95), int0);
  }

  @Test(timeout = 4000)
  public void test_0764()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(" is not a valid number.");
      int int0 = BooleanUtils.toInteger(boolean0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0765()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "no");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0766()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0767()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      String string0 = BooleanUtils.toString(boolean0, (String) null, (String) null, "i&;k");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0768()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("'0d[KsH:l[7=]xYP&a", "'0d[KsH:l[7=]xYP&a", "'0d[KsH:l[7=]xYP&a", "'0d[KsH:l[7=]xYP&a");
      String string0 = BooleanUtils.toString(boolean0, "'0d[KsH:l[7=]xYP&a", "org.apache.commons.lang.math.NumberUtils", (String) null);
      assertEquals("'0d[KsH:l[7=]xYP&a", string0);
  }

  @Test(timeout = 4000)
  public void test_0769()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "off", "The Integer did not match any specified value", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0770()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0771()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(53, 53, (-2458), 53);
      assertNotNull(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[4];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0772()  throws Throwable  {
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
  public void test_0773()  throws Throwable  {
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
  public void test_0774()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
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
  public void test_0775()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0776()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0777()  throws Throwable  {
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
  public void test_0778()  throws Throwable  {
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
  public void test_0779()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0780()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertNotNull(string0);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_0781()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0782()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(",N&%t<{A]s", (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0783()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("w0#!'", "", "w0#!'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0784()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "org.apache.commons.lang.ArrayUtils", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0785()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0786()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "YgN", "YgN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0787()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0788()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0789()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0790()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "-0x", "iF:9K{AwS^H", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0791()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("ygn", "T&c>x )I_\"a#a", "ygn", "ygn");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0792()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("f", "--", "X>yyfpAsm/z%@4yF", ".LoR:?;*j|;qpa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0793()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "The String did not match any specified value", "The String did not match any specified value", "The String did not match any specified value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0794()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "org.apache.commons.lang.math.NumberUtils", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0795()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "", "08wdfG[\"\"F5.L=;hN", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0796()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0797()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0798()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0799()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0800()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0801()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0802()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("qEM", "qEM", "MuFE", "qEM");
      Integer integer0 = new Integer(2904);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(2904, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0803()  throws Throwable  {
      Integer integer0 = new Integer(879);
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals(879, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0804()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0805()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0806()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-846), 2147483645, 80);
      assertEquals((-846), int0);
  }

  @Test(timeout = 4000)
  public void test_0807()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1291), 3735, 3735);
      assertEquals(3735, int0);
  }

  @Test(timeout = 4000)
  public void test_0808()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0809()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0810()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(53, 53, (-2458), 53);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(1, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_0811()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0812()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0813()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0814()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer(2329);
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
  public void test_0815()  throws Throwable  {
      Integer integer0 = new Integer((-1174));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0816()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0817()  throws Throwable  {
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
  public void test_0818()  throws Throwable  {
      Integer integer0 = new Integer((-2095240979));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0819()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0820()  throws Throwable  {
      Integer integer0 = new Integer((-52735939));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0821()  throws Throwable  {
      Integer integer0 = new Integer(481);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, (Integer) null);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0822()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-2084511944), (-1078925003), 1, (-2084511944));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0823()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 101, 1, (-3654));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0824()  throws Throwable  {
      Integer integer0 = new Integer(3359);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0825()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = Integer.getInteger("PL&=Z7<qgy)", 987);
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
  public void test_0826()  throws Throwable  {
      Integer integer0 = new Integer(3359);
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
  public void test_0827()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0828()  throws Throwable  {
      Integer integer0 = new Integer(481);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0829()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0830()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(3985, 26, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0831()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1929, 1929, 1929);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0832()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1135, (-2021297452), 1135);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0833()  throws Throwable  {
      Integer integer0 = new Integer((-1729));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0834()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0835()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0836()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0837()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1781));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0838()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0839()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1747));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0840()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0841()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0842()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0843()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0844()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0845()  throws Throwable  {
      Boolean boolean0 = new Boolean("p");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0846()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0847()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0848()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0849()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("", "", "on");
      Boolean boolean1 = BooleanUtils.negate((Boolean) boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0850()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0851()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0852()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(53, 53, (-2458), 53);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0853()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0854()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0855()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }
@Test(timeout = 4000)
  public void test_0856()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-3007), 0, 866, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0857()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1482), 1690, 673, (-1482));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0858()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((-1138475625), (-1), (-803));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0859()  throws Throwable  {
      Integer integer0 = new Integer((-1626199938));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0860()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-4868));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0861()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2024161511));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0862()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0863()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0864()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0865()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0866()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "no", "off");
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0867()  throws Throwable  {
      Integer integer0 = new Integer(1577);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, (String) null, "", ",20U");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0868()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3700), (-3700), (-3700), (-1255));
      String string0 = BooleanUtils.toString(boolean0, "", "", (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0869()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0870()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0871()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0872()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(647);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(647, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0873()  throws Throwable  {
      Integer integer0 = new Integer(1577);
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, (Integer) null, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0874()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, (-4848), 108);
      assertEquals(108, int0);
  }

  @Test(timeout = 4000)
  public void test_0875()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[9];
      Boolean boolean0 = BooleanUtils.negate(booleanArray0[1]);
      int int0 = BooleanUtils.toInteger(boolean0, (-1133393384), 1583, 1583);
      assertEquals(1583, int0);
  }

  @Test(timeout = 4000)
  public void test_0876()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0877()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0878()  throws Throwable  {
      Integer integer0 = new Integer(1577);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "6|/K,<S:-de%h5", "0}_`", ")ke+m &Z[k");
      assertEquals("0}_`", string0);
  }

  @Test(timeout = 4000)
  public void test_0879()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "+V`]s<m)[Us=2", (String) null, "+V`]s<m)[Us=2");
      assertEquals("+V`]s<m)[Us=2", string0);
  }

  @Test(timeout = 4000)
  public void test_0880()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[3];
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      
      booleanArray0[1] = boolean1;
      booleanArray0[2] = boolean1;
      Boolean boolean2 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test_0881()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 706, 0, (-385));
      assertFalse(boolean0);
      
      Boolean[] booleanArray0 = new Boolean[7];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = boolean0;
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0882()  throws Throwable  {
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
  public void test_0883()  throws Throwable  {
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
  public void test_0884()  throws Throwable  {
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
  public void test_0885()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0886()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[5] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0887()  throws Throwable  {
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
  public void test_0888()  throws Throwable  {
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
  public void test_0889()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0890()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off", "{}", "off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0891()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("oKL)[sT/E=:;)e", "oKL)[sT/E=:;)e", "oKL)[sT/E=:;)e");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0892()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "fvnQtqDfY", "fvnQtqDfY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0893()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "F PX#\"", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0894()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0895()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("yes", "", "{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0896()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0897()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0898()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0899()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0900()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "]%wJ=p", "]%wJ=p", "");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0901()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("--", "Mb", "--", "no");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0902()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("on", "no", "no", "no");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0903()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, ".re#+s6`m7nN2Zz'TR;", ".re#+s6`m7nN2Zz'TR;", ".re#+s6`m7nN2Zz'TR;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0904()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "@X5ad7M;#3SCj<[", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0905()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0906()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Q[uA54!", "Q[uA54!", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0907()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("=dz%;&$`D1Vhw.rb}", "=dz%;&$`D1Vhw.rb}", "{}", "oh|hno)g~%{uth}ez");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0908()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0909()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0910()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0911()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0912()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0913()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("+zxQT^kG_\"L.}}");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0914()  throws Throwable  {
      Integer integer0 = new Integer((-1102959292));
      Boolean boolean0 = Boolean.TRUE;
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1102959292), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0915()  throws Throwable  {
      Integer integer0 = new Integer((-1385));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1385), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0916()  throws Throwable  {
      Integer integer0 = new Integer((-1133393384));
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals((-1133393384), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0917()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-1255), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0918()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-1952430418), (-1101));
      assertEquals((-1952430418), int0);
  }

  @Test(timeout = 4000)
  public void test_0919()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0920()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_0921()  throws Throwable  {
      Integer integer0 = new Integer((-1385));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0922()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0923()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0924()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0925()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0926()  throws Throwable  {
      Integer integer0 = new Integer(1583);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, (Integer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0927()  throws Throwable  {
      Integer integer0 = new Integer((-437));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0928()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(3);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0929()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0930()  throws Throwable  {
      Integer integer0 = new Integer((-439));
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
  public void test_0931()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0932()  throws Throwable  {
      Integer integer0 = Integer.getInteger("oo", 1457);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0933()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(70, (-2080688361), (-2080688361), (-2080688361));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0934()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 100);
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-1564), (-1936));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0935()  throws Throwable  {
      Integer integer0 = new Integer((-3436));
      Integer integer1 = new Integer((-970));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0936()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1108068574));
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
  public void test_0937()  throws Throwable  {
      Integer integer0 = new Integer(1577);
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
  public void test_0938()  throws Throwable  {
      Integer integer0 = new Integer(1577);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0939()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0940()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0941()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-1), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0942()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(76, 76, 76);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0943()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(Integer.MAX_VALUE, (-1), 4593);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0944()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      int int0 = BooleanUtils.toInteger(boolean0, 0, (-1564), (-1936));
      assertEquals((-1564), int0);
  }

  @Test(timeout = 4000)
  public void test_0945()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0946()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0947()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0948()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(1583);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0949()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(")qa");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0950()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0951()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0952()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0953()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0954()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0955()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_0956()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertNotNull(boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0957()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = BooleanUtils.toIntegerObject(boolean1);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_0958()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0959()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test_0960()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0961()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test_0962()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_0963()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(true);
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0964()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
@Test(timeout = 4000)
  public void test_0965()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(1, 1559, (-2785), 237);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0966()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(613, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0967()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0, (-2388), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0968()  throws Throwable  {
      Integer integer0 = new Integer(65);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0969()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0970()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2081));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0971()  throws Throwable  {
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
  public void test_0972()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0973()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0974()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0975()  throws Throwable  {
      Integer integer0 = new Integer((-5642));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      String string0 = BooleanUtils.toString(boolean0, "", "*59n", "t$]gc");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0976()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0977()  throws Throwable  {
      Integer integer0 = new Integer((-1774));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1774), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0978()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1768);
      assertTrue(boolean0);
      
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0979()  throws Throwable  {
      Boolean boolean0 = new Boolean("yes");
      Integer integer0 = new Integer(68);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, (Integer) null);
      assertEquals(68, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_0980()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, (-3450), (-1750));
      assertEquals((-3450), int0);
  }

  @Test(timeout = 4000)
  public void test_0981()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      int int0 = BooleanUtils.toInteger(boolean0, 2125, 2125, 2125);
      assertEquals(2125, int0);
  }

  @Test(timeout = 4000)
  public void test_0982()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0983()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0984()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0985()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0986()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "yes", "*u*0,yIE`'q!?6hJ;");
      assertEquals("yes", string0);
  }

  @Test(timeout = 4000)
  public void test_0987()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(70);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      String string0 = BooleanUtils.toString(boolean1, "P@!!3Pg_pF@cyoKIQo{", "3|a/m", "P@!!3Pg_pF@cyoKIQo{");
      assertEquals("3|a/m", string0);
  }

  @Test(timeout = 4000)
  public void test_0988()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "c?)q]@DCX}Hmp", "yes", "c?)q]@DCX}Hmp");
      assertEquals("c?)q]@DCX}Hmp", string0);
  }

  @Test(timeout = 4000)
  public void test_0989()  throws Throwable  {
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
  public void test_0990()  throws Throwable  {
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
  public void test_0991()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0992()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[2];
      Boolean boolean0 = new Boolean(false);
      booleanArray0[0] = boolean0;
      booleanArray0[1] = booleanArray0[0];
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_0993()  throws Throwable  {
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
  public void test_0994()  throws Throwable  {
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
  public void test_0995()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(true);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test_0996()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0997()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("-0x", "z", "-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0998()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("!/y\"X\" 6cg\u0003w=4K", "on", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0999()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "[Q{7Lqw8#*{a", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1000()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "The Array must not be null");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1001()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1002()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("YseW|!0%9?J~z", "YseW|!0%9?J~z", "Cg#PV#KZHkVC");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1003()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1004()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1005()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1006()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Array is empty");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1007()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("The Integer did not match any specified value", (String) null, "The array must not contain any null elements", "A blank string is not a valid number");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1008()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true", "Array element ", "nv_t#NX&U@`AcJ", "true");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1009()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("!n&kfXF", "!n&kfXF", "!n&kfXF", "!n&kfXF");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1010()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, ", '", ", '", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1011()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "false", (String) null, (String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1012()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, "true", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1013()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "IXv6{?}$x`tg*h~B>O", "J!d}#r>wQP9q^'m", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1014()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("", "D]&YpW~", "", "");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1016()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1017()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1018()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1019()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1020()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1021()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1022()  throws Throwable  {
      Integer integer0 = new Integer((-1084530373));
      Boolean boolean0 = Boolean.valueOf(true);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1084530373), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1023()  throws Throwable  {
      Integer integer0 = new Integer((-1816));
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer0);
      assertEquals((-1816), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1024()  throws Throwable  {
      Integer integer0 = new Integer(2420);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(2420, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1025()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_1026()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, (Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
      
      int int0 = BooleanUtils.toInteger(boolean0, (-513), (-513), 43);
      assertEquals((-513), int0);
  }

  @Test(timeout = 4000)
  public void test_1027()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, (-130115571), (-130115571), (-130115571));
      assertEquals((-130115571), int0);
  }

  @Test(timeout = 4000)
  public void test_1028()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      int int0 = BooleanUtils.toInteger(boolean0, (-1103541282), 0, (-925));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1029()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1, (-1929051920));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1030()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1031()  throws Throwable  {
      Integer integer0 = Integer.getInteger("D]&YpW~", 0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test_1032()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test_1033()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      Integer integer0 = BooleanUtils.toIntegerObject(booleanArray0[0]);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_1034()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test_1035()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_1036()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_1037()  throws Throwable  {
      Integer integer0 = new Integer((-394));
      Integer integer1 = new Integer(70);
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
  public void test_1038()  throws Throwable  {
      Integer integer0 = new Integer((-1088585600));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, (Integer) null, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1039()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Integer integer1 = Integer.getInteger("true", 206);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1040()  throws Throwable  {
      Integer integer0 = new Integer(1);
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
  public void test_1041()  throws Throwable  {
      Integer integer0 = new Integer((-4491));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, (Integer) null, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1042()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1043()  throws Throwable  {
      Integer integer0 = Integer.getInteger("D]&YpW~", 0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1044()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((-1755), 0, (-4116), (-3270));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1045()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1, 100, 1, 100);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1046()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-3270), (-3270), (-3270), (-3270));
      String string0 = BooleanUtils.toString(boolean0, (String) null, "}*A.0", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_1047()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-698), (-1236), 927, (-698));
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1048()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      Integer integer1 = new Integer((-2103));
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
  public void test_1049()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, (Integer) null, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1050()  throws Throwable  {
      Integer integer0 = new Integer(70);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1052()  throws Throwable  {
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
  public void test_1053()  throws Throwable  {
      Integer integer0 = new Integer((-3270));
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1054()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-2447), 76, (-2447));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1055()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(70, 70, 70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1056()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(70, 120, 120);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_1057()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1058()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1059()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1060()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(2686);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1061()  throws Throwable  {
      Integer integer0 = Integer.getInteger("D]&YpW~", 0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertNotNull(boolean0);
      
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1062()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1063()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[4];
      Boolean boolean0 = Boolean.TRUE;
      booleanArray0[0] = boolean0;
      booleanArray0[1] = booleanArray0[0];
      booleanArray0[2] = booleanArray0[1];
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(booleanArray0[2], false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1064()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1065()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1066()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(70);
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      Integer integer0 = new Integer((-3391));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test_1068()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1069()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test_1070()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test_1071()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertEquals("off", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_1072()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(false);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test_1073()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("false", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test_1074()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test_1075()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test_1076()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("no", string0);
      assertNotNull(string0);
  }
}
