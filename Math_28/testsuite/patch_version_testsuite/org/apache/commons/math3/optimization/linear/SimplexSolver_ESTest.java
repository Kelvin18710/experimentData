package org.apache.commons.math3.optimization.linear;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1353.27227434), (-717));
      double[] doubleArray0 = new double[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1353.27227434));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2608, (-1353.2723));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-717));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver(2608, 2608);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-497.0), 1064);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 2988);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 372.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3500);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 3500);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1619));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,619) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-2691.872), (-1));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2421.993019);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[20];
      doubleArray0[9] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 6.283185307179586, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(186.8813, (-569));
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-496));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-496) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(2.0, 0);
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1401.0643, 1);
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2096));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,096) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(794.33192694);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = double0;
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[4];
      doubleArray0[6] = doubleArray0[1];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 794.33192694);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2555, 0.0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 0.32341301441192627);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 516.0021005118);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[13];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(3342.310131023, (-1));
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.7853981633974483);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1448.3450512104262));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2155);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2155);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-1));
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2155);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2155);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, (-1262));
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-269.189), 189);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2390);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2390);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2440);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1489.3));
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-147.01821465), 100);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1023.679947043637);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(100.0, 1.0, (-0.010714690733195933), (-3231.3395)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      simplexSolver0.doOptimize();
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.0, 0.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2779.8475454784);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1023.679947043637);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(100.0, 1.0, (-672.38305067142), 0.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      simplexSolver0.doOptimize();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-53.27097861948), 100);
      simplexSolver0.doIteration(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), 0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.0, 0.0, (-0.010714690733195933), (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-0.010714690733195933));
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector((-3622), (-0.2211075032339591));
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(41.624466761265566, (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.0, 0.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-3182));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,182) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(0.0, 0.0, (-0.010714690733195933), (double)100).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, 100);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-5697));
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.7976931348623157E308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1809, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-5697));
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) (-5697);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), 2167);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, (-1.0));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2167);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12, 2167);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1364);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1364);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      openMapRealVector0.mapAddToSelf(100);
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
}
