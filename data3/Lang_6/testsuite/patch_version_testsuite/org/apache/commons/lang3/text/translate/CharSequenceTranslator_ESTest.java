package org.apache.commons.lang3.text.translate;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.io.IOException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharSequenceTranslator_ESTest extends CharSequenceTranslator_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(331);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(0, 331);
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-3266), (-3266));
      String string0 = unicodeEscaper0.translate((CharSequence) "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(3025);
      assertEquals("BD1", string0);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2356);
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(2319);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(16);
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter(16);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "2B4", 692, (Writer) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 1, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2165);
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2, 3172);
      StringWriter stringWriter0 = new StringWriter(35);
      unicodeEscaper0.translate((CharSequence) "BD1", (Writer) stringWriter0);
      assertEquals("\\u0042\\u0044\\u0031", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      octalUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-3266), (-3266));
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(65535, 65535);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0);
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(692);
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2990);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(2990, 2990);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      // Undeclared exception!
      try { 
        unicodeEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }
@Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(Integer.MAX_VALUE);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(2244, 2244);
      StringWriter stringWriter0 = new StringWriter(2203);
      int int0 = numericEntityEscaper0.translate((CharSequence) "1F", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(377);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[7];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      String string0 = aggregateTranslator0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "A", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) stringBuffer0, 2154, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(3302);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, 3302, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(97);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 97, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(1249);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(2169);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "879", (Writer) stringWriter0);
      assertEquals("879", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "879", (Writer) stringWriter0);
      assertEquals("\\u0038\\u0037\\u0039", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(31);
      assertEquals("1F", string0);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(2244, 2244);
      String string0 = numericEntityEscaper0.translate((CharSequence) "1F");
      assertEquals("1F", string0);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(3983);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }
@Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[4];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTIONArray0[1];
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      char[] charArray0 = new char[8];
      charArray0[0] = '\\';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      int int0 = numericEntityEscaper0.translate((CharSequence) "4FB", 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = unicodeEscaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "32");
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "FFFFF34E", (-3250), (Writer) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) null, 943, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(24);
      StringWriter stringWriter0 = new StringWriter(24);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 24, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "36");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("&#0;&#0;&#0;&#0;&#0;&#0;&#0;&#0;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(2405, 1275);
      numericEntityEscaper0.translate((CharSequence) "4FB", (Writer) stringWriter0);
      assertEquals("4FB", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(4572);
      assertEquals("11DC", string0);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(2405);
      String string0 = unicodeEscaper0.translate((CharSequence) "4FB");
      assertEquals("4FB", string0);
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2365);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }
@Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-3362));
      StringWriter stringWriter0 = new StringWriter();
      int int0 = numericEntityEscaper0.translate((CharSequence) "FFFFF2DE", 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 11, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(672);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 672, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      CharBuffer charBuffer0 = CharBuffer.allocate(988);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(2, 2);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringWriter0.write("t2k8S.");
      unicodeEscaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
      assertEquals(42, stringBuffer0.length());
      assertEquals("t2k8S.\\u0074\\u0032\\u006B\\u0038\\u0053\\u002E", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1006);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[0];
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityEscaper0;
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      aggregateTranslator0.translate((CharSequence) "0", (Writer) stringWriter0);
      assertEquals("0", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "0", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-152));
      assertEquals("FFFFFF68", string0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      String string0 = unicodeUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2194);
      CharBuffer charBuffer0 = CharBuffer.allocate(2194);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }
@Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharSequenceTranslator charSequenceTranslator0 = aggregateTranslator0.with(charSequenceTranslatorArray0);
      assertNotSame(charSequenceTranslator0, aggregateTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[10];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      int int0 = octalUnescaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(0);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = octalUnescaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) stringBuffer0, 255, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (-324), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(525);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) charBuffer0, 525, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(3461);
      String string0 = octalUnescaper0.translate((CharSequence) charBuffer0);
      String string1 = numericEntityEscaper0.translate((CharSequence) string0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "75");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2014, 2014);
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[10];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      unicodeEscaper0.translate((CharSequence) "6F6", (Writer) stringWriter0);
      assertEquals("\\u0036\\u0046\\u0036", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-555));
      assertEquals("FFFFFDD5", string0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "1", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }
@Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      int int0 = unicodeUnescaper0.translate((CharSequence) "4", 0, (Writer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(4);
      int int0 = numericEntityEscaper0.translate((CharSequence) "&#52;", 4, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-56), 0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      unicodeUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter(671);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "29F", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "2AD", 685, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 1277, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(65535);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 65535, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1532);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      numericEntityEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "619");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(4);
      CharBuffer charBuffer0 = CharBuffer.allocate(48);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) "FFFFEF4B");
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(4, 2606);
      char[] charArray0 = new char[3];
      charArray0[1] = 'd';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(2606);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("\u0000&#100;\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(4, 2606);
      char[] charArray0 = new char[3];
      charArray0[0] = '^';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(2606);
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals("&#94;\u0000\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[3];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharSequenceTranslator charSequenceTranslator0 = aggregateTranslator0.with(charSequenceTranslatorArray0);
      assertNotSame(charSequenceTranslator0, aggregateTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(4);
      assertEquals("4", string0);
  }
@Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][8];
      CharSequence[] charSequenceArray1 = new CharSequence[3];
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      StringWriter stringWriter0 = new StringWriter();
      charSequenceArray0[0] = charSequenceArray1;
      charSequenceArray0[1] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      int int0 = lookupTranslator0.translate(charSequenceArray1[0], 2, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[7];
      charArray0[0] = 'n';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter(253);
      int int0 = numericEntityEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(0);
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(3263);
      CharBuffer charBuffer0 = CharBuffer.allocate(3263);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter(3263);
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter(45);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "3C", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) "&#48;");
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(51);
      StringWriter stringWriter0 = new StringWriter(51);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "33", 51, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) null, 1262, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.OctalUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(33);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 33, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(2603);
      String string0 = unicodeUnescaper0.translate((CharSequence) charBuffer0);
      String string1 = unicodeUnescaper0.translate((CharSequence) string0);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "3C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.get(charArray0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      numericEntityEscaper0.translate((CharSequence) "&#110;&#43;&#95;&#48;&#89;&#48;\u0000", (Writer) stringWriter0);
      assertEquals("&#38;&#35;&#49;&#49;&#48;&#59;&#38;&#35;&#52;&#51;&#59;&#38;&#35;&#57;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#56;&#57;&#59;&#38;&#35;&#52;&#56;&#59;\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(60);
      String string0 = unicodeEscaper0.translate((CharSequence) "3C");
      assertEquals("\\u0033C", string0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(33);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      try { 
        octalUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(502);
      String string0 = unicodeEscaper0.translate((CharSequence) "1F6");
      assertNotNull(string0);
      assertEquals("\\u0031\\u0046\\u0036", string0);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(502);
      assertEquals("1F6", string0);
  }
@Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(7);
      CharBuffer charBuffer0 = CharBuffer.allocate(7);
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringWriter stringWriter2 = stringWriter1.append('C');
      StringBuffer stringBuffer0 = stringWriter2.getBuffer();
      int int0 = octalUnescaper0.translate((CharSequence) stringBuffer0, 7, (Writer) stringWriter1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(456, 456);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "0", 0, (Writer) stringWriter0);
      assertEquals("\\u0030", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "FFFFFDF5", (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(21, 21);
      StringWriter stringWriter0 = new StringWriter(21);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) "15", 21, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (-3064), (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer0, 1, (Writer) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      CharSequence[] charSequenceArray0 = new CharSequence[4];
      CharBuffer charBuffer0 = CharBuffer.allocate(2680);
      charSequenceArray0[0] = (CharSequence) charBuffer0;
      numericEntityEscaper0.translate(charSequenceArray0[0]);
      // Undeclared exception!
      numericEntityEscaper0.translate(charSequenceArray0[0]);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "FFFFFE72");
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(456, 456);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) "1C8", (Writer) stringWriter0);
      assertEquals("\\u0031\\u0043\\u0038", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(2032, 27);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(2032);
      CharBuffer charBuffer0 = CharBuffer.allocate(4270);
      String string0 = numericEntityEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      String string0 = numericEntityEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(456);
      assertEquals("1C8", string0);
  }
@Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[8];
      CharSequenceTranslator charSequenceTranslator0 = octalUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2);
      char[] charArray0 = new char[9];
      charArray0[0] = 'r';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) charBuffer0, 0, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(539);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(539);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, 528, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(3653, 102);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      String string0 = numericEntityEscaper0.translate((CharSequence) stringBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2614);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2614);
      unicodeEscaper0.translate((CharSequence) charBuffer0);
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter(117);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) stringBuffer0, 117, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(1390, 1390);
      StringWriter stringWriter0 = new StringWriter(4);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) null, 4, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(472);
      StringWriter stringWriter0 = new StringWriter(472);
      // Undeclared exception!
      try { 
        octalUnescaper0.translate((CharSequence) charBuffer0, 472, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "FFFFF4D8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(3);
      CharBuffer charBuffer0 = CharBuffer.allocate(255);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      char[] charArray0 = new char[3];
      charBuffer0.put(charArray0);
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate((CharSequence) charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1066);
      StringWriter stringWriter0 = new StringWriter();
      numericEntityEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(1066, charBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2614);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(2614);
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
      assertEquals(0, charBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex((-2866));
      assertEquals("FFFFF4CE", string0);
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      octalUnescaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(4277, 4277);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) "10B5", (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      String string0 = octalUnescaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      // Undeclared exception!
      try { 
        octalUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2614);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(2614, 2614);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }
@Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][0];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[0];
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(76);
      StringWriter stringWriter0 = new StringWriter();
      int int0 = unicodeEscaper0.translate((CharSequence) "91E", 2, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(966, 966);
      StringWriter stringWriter0 = new StringWriter(25);
      unicodeEscaper0.translate((CharSequence) "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 42, (Writer) stringWriter0);
      assertEquals("\\u0000", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) "75", 117, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      StringWriter stringWriter0 = new StringWriter(1172);
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, 1172, (Writer) stringWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.UnicodeUnescaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      CharBuffer charBuffer0 = CharBuffer.allocate(43);
      StringWriter stringWriter0 = new StringWriter(43);
      // Undeclared exception!
      try { 
        unicodeEscaper0.translate((CharSequence) charBuffer0, 43, (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(3696);
      CharBuffer charBuffer0 = CharBuffer.allocate(3696);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      // Undeclared exception!
      unicodeEscaper0.translate((CharSequence) string0);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator((CharSequenceTranslator[]) null);
      // Undeclared exception!
      try { 
        aggregateTranslator0.translate((CharSequence) "1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.AggregateTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf(8, (-2326));
      StringWriter stringWriter0 = new StringWriter(8);
      unicodeEscaper0.translate((CharSequence) "91E", (Writer) stringWriter0);
      assertEquals("\\u0039\\u0031\\u0045", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(1297);
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(1297);
      String string0 = unicodeEscaper0.translate((CharSequence) charBuffer0);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(104);
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.translate((CharSequence) null, (Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper();
      // Undeclared exception!
      try { 
        unicodeUnescaper0.with((CharSequenceTranslator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.CharSequenceTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(1297);
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(104);
      numericEntityEscaper0.translate((CharSequence) string0, (Writer) stringWriter0);
      assertEquals("511", stringWriter0.toString());
  }
  
  @Test(timeout = 4000)
    public void test_translate() throws Throwable {
        // 创建一个自定义翻译器，假设它将表情符号替换为文本
        CharSequenceTranslator customTranslator = new CharSequenceTranslator() {
            @Override
            public int translate(CharSequence input, int index, Writer out) throws IOException {
                int codePoint = Character.codePointAt(input, index);
                // 假设将表情符号替换为 "[emoji]"
                if (codePoint == 0x1F60A) {  // 😊的Unicode code point
                    out.write("[emoji]");
                    return Character.charCount(codePoint); // 处理表情符号的代理对
                }
                out.write(input.charAt(index));  // 默认处理普通字符
                return 1;
            }
        };

        // 测试输入：包含表情符号和普通字符
        CharSequence input = "Hello 😊 World!";
        StringWriter writer = new StringWriter(); // 用于捕获翻译结果

        // 调用 translate 方法
        customTranslator.translate(input, writer);

        // 获取翻译结果
        String result = writer.toString();

        // 验证输出结果是否符合预期
        assertNotNull(result); // 确保结果不为空
        assertFalse(result.isEmpty()); // 确保结果不是空字符串
        assertEquals("Hello [emoji] World!", result); // 验证翻译结果是否正确
    }
}
