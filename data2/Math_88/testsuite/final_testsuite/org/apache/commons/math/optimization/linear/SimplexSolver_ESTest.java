package org.apache.commons.math.optimization.linear;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.DenseRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.AbstractLinearOptimizer;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.optimization.linear.Relationship;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.SimplexSolver;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = (-10);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      Double double0 = new Double(100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (double) double0);
      DenseRealMatrix denseRealMatrix0 = new DenseRealMatrix(1, 1);
      simplexTableau0.tableau = (RealMatrix) denseRealMatrix0;
      simplexTableau0.numArtificialVariables = (-1);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = (-10);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(1, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      Double[] doubleArray1 = new Double[7];
      Double double0 = new Double(1671.04579411);
      doubleArray1[0] = double0;
      Double double1 = new Double((-745.56659));
      doubleArray1[1] = double1;
      doubleArray1[2] = doubleArray1[1];
      doubleArray1[3] = doubleArray1[0];
      doubleArray1[4] = doubleArray1[0];
      Double double2 = new Double(0.0);
      doubleArray1[5] = double2;
      doubleArray1[6] = doubleArray1[2];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray1);
      RealMatrix realMatrix0 = realVectorImpl0.outerProduct((RealVector) realVectorImpl0);
      simplexTableau0.tableau = realMatrix0;
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      double[][] doubleArray1 = new double[2][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1, false);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      Double[] doubleArray1 = new Double[7];
      Double double0 = new Double(100);
      doubleArray1[0] = double0;
      Double double1 = new Double((-745.56659));
      doubleArray1[1] = double1;
      doubleArray1[2] = double0;
      doubleArray1[3] = doubleArray1[1];
      doubleArray1[4] = doubleArray1[0];
      doubleArray1[5] = doubleArray1[3];
      doubleArray1[6] = doubleArray1[3];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray1);
      RealMatrix realMatrix0 = realVectorImpl0.outerProduct((RealVector) realVectorImpl0);
      simplexTableau0.tableau = realMatrix0;
      simplexSolver0.doIteration(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 231.7);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(100.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      Double[] doubleArray1 = new Double[7];
      Double double0 = new Double(1671.04579411);
      doubleArray1[0] = double0;
      Double double1 = new Double((-745.56659));
      doubleArray1[1] = double1;
      doubleArray1[2] = double1;
      doubleArray1[3] = double1;
      simplexSolver0.setMaxIterations((-1));
      doubleArray1[4] = doubleArray1[3];
      doubleArray1[5] = double1;
      doubleArray1[6] = doubleArray1[5];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray1);
      RealMatrix realMatrix0 = realVectorImpl0.outerProduct((RealVector) realVectorImpl0);
      simplexTableau0.tableau = realMatrix0;
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2038));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-2,038) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-179.1556979943));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 20100.0);
      simplexTableau0.numArtificialVariables = 1;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1.7976931348623157E308;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.7976931348623157E308);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      Double[] doubleArray1 = new Double[7];
      Double double0 = new Double(1671.04579411);
      doubleArray1[0] = double0;
      Double double1 = new Double((-745.56659));
      doubleArray1[1] = double1;
      doubleArray1[2] = doubleArray1[0];
      doubleArray1[3] = doubleArray1[1];
      doubleArray1[4] = doubleArray1[3];
      doubleArray1[5] = doubleArray1[2];
      doubleArray1[6] = doubleArray1[1];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray1);
      RealMatrix realMatrix0 = realVectorImpl0.outerProduct((RealVector) realVectorImpl0);
      simplexTableau0.tableau = realMatrix0;
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(1, simplexSolver0.getIterations());
  }
@Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-589);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2707.13378));
      simplexTableau0.numArtificialVariables = 472;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-589);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 100;
      doubleArray1[1] = (double) (-589);
      doubleArray1[3] = (double) (-589);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-589);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 100;
      doubleArray1[1] = (double) (-589);
      doubleArray1[7] = (double) 100;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(1, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, (GoalType) null, false, 100);
      simplexTableau0.numArtificialVariables = 375;
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 100;
      doubleArray1[3] = (-193.97);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      simplexSolver0.doIteration(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[12];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 1334.15604911);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(1334.15604911, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-53.93));
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[16];
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      double[] doubleArray1 = new double[57];
      doubleArray1[0] = (double) 100;
      doubleArray1[5] = (-194.10395);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, (-194.10395));
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      // Undeclared exception!
      simplexSolver0.solvePhase1(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[15];
      simplexSolver0.setMaxIterations((-1));
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      double[] doubleArray1 = new double[28];
      doubleArray1[0] = (double) 100;
      doubleArray1[3] = (-194.10395403449962);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, (-194.10395403449962));
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 1;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 100;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0, doubleArray0);
      Relationship relationship0 = Relationship.GEQ;
      Relationship relationship1 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(realVectorImpl0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship1, relationship1, relationship0, relationship1).when(linearConstraint0).getRelationship();
      doReturn((double)100, (-0.49837754305479887)).when(linearConstraint0).getValue();
      linkedList0.offerFirst(linearConstraint0);
      simplexSolver0.setMaxIterations(1);
      doubleArray1[3] = (-193.97);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      simplexSolver0.solvePhase1(simplexTableau0);
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2259));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-2,259) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(824, 824);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-0.5155436407691911));
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 5;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 1);
      Relationship relationship0 = Relationship.EQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(openMapRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, relationship0, relationship0, relationship0, relationship0).when(linearConstraint0).getRelationship();
      doReturn(1.0, 0.015466309223075732).when(linearConstraint0).getValue();
      linkedList0.offerFirst(linearConstraint0);
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 1;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 100;
      doubleArray1[2] = (double) 1;
      doubleArray1[3] = (-193.97);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 0.0);
      OpenMapRealMatrix openMapRealMatrix0 = openMapRealVector0.outerproduct(openMapRealVector0);
      simplexTableau0.tableau = (RealMatrix) openMapRealMatrix0;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(1, simplexSolver0.getIterations());
  }
@Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-941);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 509.13507947770336);
      simplexTableau0.numArtificialVariables = 9;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = 3;
      simplexTableau0.numArtificialVariables = (-1290);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = 100;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(100);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(5, (-876.9926));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-876.9926));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      simplexSolver0.setMaxIterations((-2110));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-2,110) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      openMapRealVector0.set(100);
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 9;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1, 1);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-4112.073601546205));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-6.48194878314));
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[9];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1120.218204759801);
      simplexTableau0.numArtificialVariables = (-3492);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[9];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1120.218204759801);
      simplexTableau0.numArtificialVariables = (-3492);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(9, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[9];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0, false);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(100.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[9];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-151.4));
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals((-151.4), realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) 100;
      GoalType goalType0 = GoalType.MINIMIZE;
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      GoalType goalType1 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType1, false);
      simplexSolver0.goalType = goalType0;
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-824));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-824) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1120.218204759801);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[10];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = (double) 100;
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1120.218204759801);
      simplexTableau0.numArtificialVariables = 77;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1120.218204759801);
      simplexTableau0.numArtificialVariables = 77;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.numArtificialVariables = (-953);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1808.2394310826776));
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, (-1808.2394310826776));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      openMapRealVector0.mapInvToSelf();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[32];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      double[][] doubleArray1 = new double[5][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1, false);
      RealMatrix realMatrix0 = realMatrixImpl0.createMatrix(100, 1);
      simplexTableau0.tableau = realMatrix0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[31];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, (-3565.841134711114));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-1.0));
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals((-1.0), realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[24];
      doubleArray0[4] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-786));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-786) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[37];
      doubleArray0[24] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1811.414781002627));
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, (-1811.414781002627));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, (-1811.414781002627));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      simplexTableau0.numArtificialVariables = 100;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      simplexTableau0.numArtificialVariables = (-953);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[19];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[19];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = (-1);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2.0);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3533.579448433225);
      simplexTableau0.numArtificialVariables = 101;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[19];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = (-9);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1736.5590491);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = 100;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(151.0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(100.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      openMapRealVector0.mapLog10ToSelf();
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-5068));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-5,068) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 3717;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 2691;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 3.141592653589793);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3.141592653589793);
      simplexTableau0.numArtificialVariables = (-10);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 100.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 20;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[10];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      DenseRealMatrix denseRealMatrix0 = new DenseRealMatrix(100, 1);
      simplexTableau0.tableau = (RealMatrix) denseRealMatrix0;
      simplexTableau0.numArtificialVariables = 1;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      RealMatrix realMatrix0 = openMapRealVector0.outerProduct(doubleArray0);
      simplexTableau0.tableau = realMatrix0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0E-6);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(95);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-498.97074477114));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3893);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2473));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-2,473) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(realPointValuePair1, realPointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 1;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 1;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 3.141592653589793);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 3.141592653589793);
      simplexTableau0.numArtificialVariables = (-10);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[12];
      doubleArray0[0] = (double) 100;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 100.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-255.153783787));
      simplexTableau0.numArtificialVariables = (-838);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 1;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-815.771));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-255.153783787));
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-815.771));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-255.153783787));
      simplexTableau0.numArtificialVariables = (-911);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-815.771));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-255.153783787));
      simplexTableau0.numArtificialVariables = 100;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-966.358208));
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-966.358208));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals((-966.358208), realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      simplexSolver0.setMaxIterations((-3500));
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 1;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-3,500) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-833.6));
      SimplexSolver simplexSolver0 = new SimplexSolver((-833.6));
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = 1;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      double[][] doubleArray1 = new double[7][9];
      simplexTableau0.numArtificialVariables = 1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd((-4428.16105));
      simplexTableau0.tableau = realMatrix0;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = (-625);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 100;
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, simplexSolver0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(Double.NaN);
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations(0);
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = (-625);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(11, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexTableau0.numArtificialVariables = 100;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = (-5610);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[7];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100.0);
      simplexTableau0.numArtificialVariables = (-5610);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1468, 1);
      simplexTableau0.tableau = (RealMatrix) realMatrixImpl0;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-14);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = 100;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2451.8));
      simplexTableau0.numArtificialVariables = 100;
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[1];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0E-6);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
      assertEquals(1.0E-6, realPointValuePair0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl();
      GoalType goalType0 = GoalType.MINIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-1525.1050609910149));
      RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(realPointValuePair1.equals((Object)realPointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 100;
      simplexSolver0.setMaxIterations((-1));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1752.2594));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-6);
      simplexTableau0.numArtificialVariables = 6;
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.isOptimal((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(3057, 3057);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-3348.917874));
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1724.343198));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-15);
      SimplexSolver simplexSolver0 = new SimplexSolver(1489.0);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(3, simplexTableau0.getNumVariables());
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      RealVectorImpl realVectorImpl0 = new RealVectorImpl(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100);
      simplexTableau0.numArtificialVariables = 100;
      boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexTableau0.numArtificialVariables = (-14);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math.optimization.linear.SimplexSolver", e);
      }
  }
}
