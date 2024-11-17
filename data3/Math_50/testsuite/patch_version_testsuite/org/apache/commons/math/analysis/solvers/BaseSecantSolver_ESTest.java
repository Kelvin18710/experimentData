package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.Ulp;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Acosh;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(185, (UnivariateRealFunction) sin0, (-5.3771632070188025), (-4.9E-324), (-4.9E-324), allowedSolution0);
      assertEquals((-4.9E-324), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.5E-323), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1756.971967800472), (-1756.971967800472), (-1756.971967800472));
      Asinh asinh0 = new Asinh();
      double double0 = illinoisSolver0.solve(2867, (UnivariateRealFunction) asinh0, (-1756.971967800472), (double) 2867, (double) 2867);
      assertEquals(2867.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.1549264725936));
      Asinh asinh0 = new Asinh();
      double double0 = illinoisSolver0.solve(2873, (UnivariateRealFunction) asinh0, (-1733.1549264725936), (double) 2873, (double) 2873);
      assertEquals(2873.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4.892235655852999E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.20529902));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(2836, (UnivariateRealFunction) asinh0, (-0.7853981633974483), (double) 2836, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1417.6073009183012, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.16666666666666666);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(2836, (UnivariateRealFunction) asinh0, (-0.7853981633974483), 0.16666666666666666, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-0.3093657483653908), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.869585846858926E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.16666666666666666);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(2836, (UnivariateRealFunction) asinh0, (-977.75950682034), 1.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-488.37975341017), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.007278663633050408), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(636358579, (UnivariateRealFunction) sinh0, (-47.6407916164), (double) 636358579, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.20529902));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-54), (UnivariateRealFunction) asinh0, 1.032956837, (double) 2836, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-54) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(16.0);
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2147478997, (UnivariateRealFunction) asinh0, 0.19999999999923582, (-0.7853981633974483), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.2, -0.785]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1789036151, (UnivariateRealFunction) null, (double) 1789036151, (double) 1789036151, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2782, (UnivariateRealFunction) asinh0, (-1733.20529902), 7.730836871165916E-29, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-23), (UnivariateRealFunction) signum0, (double) (-23), (double) (-23), 21.37755832643195, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-23) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2, (UnivariateRealFunction) exp0, (double) 2, (double) 2, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2414), (UnivariateRealFunction) null, (double) (-2414), (double) (-2414), (double) (-2414), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.423853763024));
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(215, (UnivariateRealFunction) asinh0, (-1486.2542480243965), 1845.9, 3188.43991, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.20529902), (-1733.20529902), (-1733.20529902));
      Tan tan0 = new Tan();
      // Undeclared exception!
      illinoisSolver0.solve(2131112601, (UnivariateRealFunction) tan0, (-1733.20529902), (double) 187, (double) 2131112601);
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1428), (UnivariateRealFunction) asinh0, (double) (-1428), (double) (-1428), (double) (-1428));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,428) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      Tan tan0 = new Tan();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-564.17723), 11.109815480015858);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2147475990, (UnivariateRealFunction) tan0, (-564.17723), (-564.17723), 12.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-564.177, -564.177]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3937, (UnivariateRealFunction) tan0, 8.808337321317083E-14, 1462.2249708, (-1651.7822));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 1,462.225], values: [0, 5.302]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1299.440038195704, 1523415);
      Cos cos0 = new Cos();
      pegasusSolver0.setup(1523415, cos0, 3.1011162729684284E-15, 3.1011162729684284E-15, 1299.440038195704);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Gaussian gaussian0 = new Gaussian((-1228.795144061873), (-1228.795144061873), 873.66970143);
      illinoisSolver0.setup(134, gaussian0, 134, 873.66970143, Double.NaN);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [134, 873.67], values: [-364.024, -67.913]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      Tan tan0 = new Tan();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(285, (UnivariateRealFunction) tan0, (-564.17723), (double) 285, (double) 285, allowedSolution0);
      assertEquals(285.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(76.96902037569839, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      Tan tan0 = new Tan();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(285, (UnivariateRealFunction) tan0, (-564.17723), 11.109815480015858, (double) 285, allowedSolution0);
      assertEquals(285.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.712388615013339), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(143, univariateRealFunction0, (-41.466964710174), 1.3459792909881345E-4, allowedSolution0);
      assertEquals((-20.73341505612245), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.1136848294473833E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Tan tan0 = new Tan();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(285, (UnivariateRealFunction) tan0, (-558.034507091099), (double) 285, (double) 285, allowedSolution0);
      assertEquals(285.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.5707961670742738), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1023, (UnivariateRealFunction) tan0, (double) 1023, 1578.30402, allowedSolution0);
      assertEquals(1300.65201, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1419.9998794225867, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1523431, (UnivariateRealFunction) tan0, 1522563.4547843323, (double) 1523431, 1522563.4547843323, allowedSolution0);
      assertEquals(1522563.4547843323, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1522563.4547843323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      double double0 = illinoisSolver0.solve(1523431, (UnivariateRealFunction) tan0, (double) (-19), (double) 1523431, (double) (-19));
      assertEquals((-19.0), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1522563.4547843323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.20529902));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2782, (UnivariateRealFunction) asinh0, (-17.78604293667677), (double) 2782, allowedSolution0);
      assertEquals(1382.1069785316618, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(7.730836871165916E-29, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.7332009655086));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1956, (UnivariateRealFunction) asinh0, (-1733.7332009655086), (double) 1956, allowedSolution0);
      assertEquals(111.1333995172456, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.3881317890172014E-21), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.1549264725936));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2873, (UnivariateRealFunction) asinh0, (-1733.1549264725936), (double) 2873, allowedSolution0);
      assertEquals(569.9225367637032, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-4.892235655852999E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.1549264725936));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2873, (UnivariateRealFunction) asinh0, (-1733.1549264725936), (double) 2873, allowedSolution0);
      assertEquals(569.9225367637032, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(6.018531076210112E-36, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1733.7474284140035));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2848, (UnivariateRealFunction) asinh0, (-1733.7474284140035), (double) 2848, allowedSolution0);
      assertEquals(557.1262857929983, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-12.22275088879468));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2142494904, (UnivariateRealFunction) asinh0, (-1.0), (double) 2142494904, 0.0, allowedSolution0);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.16666666666666666);
      Rint rint0 = new Rint();
      double double0 = illinoisSolver0.solve(1160, (UnivariateRealFunction) rint0, (double) 1160, 1.0E-6, 0.16666666666666666);
      assertEquals(0.16666666666666666, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = illinoisSolver0.solve(79, (UnivariateRealFunction) gaussian0, (double) 79, (double) 79, (-3986.6736073));
      assertEquals(79.0, illinoisSolver0.getMax(), 0.01);
      assertEquals(79.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      pegasusSolver0.solve(2809, (UnivariateRealFunction) asinh0, (-1733.20529902), 311.059827717863, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-2530.218));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-1.0), 0.0, (-1924.0), allowedSolution0);
      assertEquals((-1924.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(14.247593488299662, (-2530.218));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(141144870, (UnivariateRealFunction) tanh0, (-6.807752591124136E-6), 5.580689172446363E-7, 2646.618476273562, allowedSolution0);
      assertEquals(2646.618476273562, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.212165282867174E-31, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3371.46375), 834.02);
      double double0 = regulaFalsiSolver0.solve(268, (UnivariateRealFunction) tanh0, (-1467.9280438020382), 2241.421, 1.0E-6);
      assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-76.92215237627397), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(76, (UnivariateRealFunction) log1p0, 0.0, (double) 76, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(38.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(14.247593488299662, (-2530.218));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(141144870, (UnivariateRealFunction) tanh0, (-6.807752591124136E-6), 0.5, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.24999659612370442, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.580689172446363E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      pegasusSolver0.solve(94944292, (UnivariateRealFunction) expm1_0, (-3123.9313561599606), (double) 94944292, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-41), (UnivariateRealFunction) tanh0, (double) (-41), (double) (-41), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-41) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-4049.41), (-4049.41));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(832, (UnivariateRealFunction) null, 0.0, (double) 832, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1232, (UnivariateRealFunction) tanh0, (-3123.9313561599606), (double) 1232, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(94944287, (UnivariateRealFunction) sinh0, (-1619.466994), 1532.967632940578, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1030), (UnivariateRealFunction) gaussian0, (double) (-1030), (double) (-1030), (double) (-1030), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,030) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1683, (UnivariateRealFunction) minus0, (double) 1683, (double) 1683, (double) 1683, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,683, 1,683]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1467.9280438020382), (-2530.218));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(209, (UnivariateRealFunction) tanh0, (double) 268, 2241.421, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [268, 2,241.421], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      // Undeclared exception!
      illinoisSolver0.solve(2124013514, univariateRealFunction0, 1.0, 4.5202099898550685, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2314), (UnivariateRealFunction) ulp0, (double) (-2314), (double) (-2314), (double) (-2314));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,314) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian(252, 252);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(252, (UnivariateRealFunction) gaussian0, (double) 252, (double) 252, (double) 252);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [252, 252]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2530.218));
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2146815970, (UnivariateRealFunction) tanh0, 19.97575607292502, 76.81187178082064, 19.97575607292502);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [19.976, 76.812], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      regulaFalsiSolver0.setup(2610, floor0, 2610, 2610, 2610);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,610, 2,610]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ulp ulp0 = new Ulp();
      regulaFalsiSolver0.setup(1754, ulp0, 950.0489366243, 1754, 1754);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [950.049, 1,754], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver(268);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-0.7792528013913433), 1.969351602365592E-26, 0.6199965724775598, allowedSolution0);
      assertEquals(0.6199965724775598, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.833624814016425E-27), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(180, (UnivariateRealFunction) tanh0, (-3135.1859147763066), (double) 180, allowedSolution0);
      assertEquals((-1477.5929573881533), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.8077141086142168E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1220, (UnivariateRealFunction) tanh0, (-2287.0), (double) 1220, allowedSolution0);
      assertEquals((-533.5), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.338953190704116E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1255, (UnivariateRealFunction) tanh0, (-3124.4017167123498), (double) 1255, allowedSolution0);
      assertEquals((-934.7008583561751), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.6043592534683517E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver(268);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-6.322171273885964E-8), 2825.274815456466, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1412.6374076966222, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-6.322171273885964E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1220, (UnivariateRealFunction) tanh0, (-3124.018847513384), (double) 1220, allowedSolution0);
      assertEquals((-952.0094237566923), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-8.821105751053772E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-3124.018847513384), (double) 268, allowedSolution0);
      assertEquals((-1428.009423756692), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.0376592726220823E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-3124.018847513384), (double) 268, allowedSolution0);
      assertEquals((-1428.009423756692), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.866553564399274E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1220, (UnivariateRealFunction) tanh0, (-3123.9313561599606), (double) 1220, allowedSolution0);
      assertEquals((-951.9656780799801), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(6.659248569986106E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(561, (UnivariateRealFunction) tanh0, (-3124.018847513384), (double) 561, allowedSolution0);
      assertEquals((-1281.509423756692), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.405043496640848E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      double double0 = illinoisSolver0.solve(109, (UnivariateRealFunction) signum0, (-2844.5202), 1.0E-6, 1.0E-6);
      assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.379099192870357E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-2530.218));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(268, (UnivariateRealFunction) tanh0, (-3697.721501594), 3217.9501375513487, allowedSolution0);
      assertEquals((-239.88568202132592), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-2530.218));
      Tanh tanh0 = new Tanh();
      double double0 = pegasusSolver0.solve(1004, (UnivariateRealFunction) tanh0, 0.0, 0.0, (-1.0));
      assertEquals((-1.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1220, (UnivariateRealFunction) tanh0, (-9.100457893719949E-5), (double) 1220, allowedSolution0);
      assertEquals(609.9999544977105, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.569532869054565E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(753, (UnivariateRealFunction) log1p0, (double) 753, (double) 753, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [753, 753]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1133, (UnivariateRealFunction) sinh0, 0.0, (-1923.109965836603), allowedSolution0);
      assertEquals((-961.5549829183014), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1133, (UnivariateRealFunction) sinh0, (-1.0), 11.310252378530324, 11.310252378530324, allowedSolution0);
      assertEquals(11.310252378530324, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double double0 = pegasusSolver0.solve(64, (UnivariateRealFunction) inverse0, (-1683.0), 1087.000832, 1087.000832);
      assertEquals(1087.000832, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.378983341222984E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      pegasusSolver0.solve(1133, (UnivariateRealFunction) sinh0, 0.0, 2893.0349209568, 2893.0349209568);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(2893.0349209568, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      pegasusSolver0.solve(587, (UnivariateRealFunction) cos0, (-13.455020292339324), (double) 587, (double) 587);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-13.455020292339324), pegasusSolver0.getMin(), 0.01);
      assertEquals(58.119464091411174, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver(84, 234.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(62, (UnivariateRealFunction) inverse0, (-1650.0278448185356), (double) 62, (-1043.99795041815), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1043.99795041815), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1588.0278448185356), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3123, (UnivariateRealFunction) tan0, (double) 3123, (double) 3123, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,123, 3,123]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(176600891, (UnivariateRealFunction) null, (double) 176600891, (double) 176600891, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0081()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3467, (UnivariateRealFunction) sinh0, (-13.45502029), 4424.993704, 2.356194490192345, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1133, (UnivariateRealFunction) sinh0, (double) 1133, (double) 1133, 1.0E-15, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,133, 1,133]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1581, (UnivariateRealFunction) null, (double) 1581, (double) 1581, (double) 1581, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1639.549387993995), (-1639.549387993995), (-1879.4409));
      // Undeclared exception!
      pegasusSolver0.solve(1420431, (UnivariateRealFunction) inverse0, (-1879.4409), 804.597125207, 1490.774937);
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3464), (UnivariateRealFunction) tan0, (double) (-3464), (double) (-3464), (double) (-3464));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,464) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver(42, 234.0);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(111, (UnivariateRealFunction) inverse0, 92.0, 1.0000000000420004, (-5.874423133524649E-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [92, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-295), (UnivariateRealFunction) null, (double) (-295), (double) (-295), (-1000.23782993));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0088()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0089()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      regulaFalsiSolver0.setup(345, asin0, 345, 345, 345);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [345, 345]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sqrt sqrt0 = new Sqrt();
      regulaFalsiSolver0.setup(82, sqrt0, (-1.0), 82, (-1.0));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1, 82], values: [\uFFFD, 9.055]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(407, (UnivariateRealFunction) inverse0, (-1.0), 4.5220814611145, (double) 407, allowedSolution0);
      assertEquals(407.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.116373244947242E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3030, (UnivariateRealFunction) sin0, (-259.95), (double) 3030, allowedSolution0);
      assertEquals(1385.0249999999999, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1608.495438637974, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(587, (UnivariateRealFunction) cos0, (double) 587, 497226.60357791407, 497226.60357791407, allowedSolution0);
      assertEquals(497226.60357791407, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(39224.35507639537, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(575, (UnivariateRealFunction) cos0, (-1086.6118639), (double) 575, 1768.1111, allowedSolution0);
      assertEquals(1768.1111, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-978.6061115932608), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(556, (UnivariateRealFunction) cos0, 1.0, 4797.75, allowedSolution0);
      assertEquals(2399.375, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3444.7563446562876, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1472, (UnivariateRealFunction) cos0, (-725.4239607501003), 12.36807724828, 7.842623738385819E-7, allowedSolution0);
      assertEquals(7.842623738385819E-7, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-215.19909677086903), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(605, (UnivariateRealFunction) sin0, (-0.1666666567325592), (double) 605, 707.68197, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (605) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1692, (UnivariateRealFunction) cos0, 1.0, (double) 575, 1.0, allowedSolution0);
      assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(45.553093477052, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1112, (UnivariateRealFunction) sinh0, (-1.0), 1.2675934823758863E-8, 1.2675934823758863E-8, allowedSolution0);
      assertEquals(1.2675934823758863E-8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.0623582230345026E-21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(587, (UnivariateRealFunction) cos0, (-13.455020292339324), (double) 587, allowedSolution0);
      assertEquals(286.77248985383034, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(58.119464091411174, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1133, (UnivariateRealFunction) sinh0, (-1.0), 1.2675934823758863E-8, 1.2675934823758863E-8, allowedSolution0);
      assertEquals(1.2675934823758863E-8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(5.0623582230345026E-21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(147, (UnivariateRealFunction) atan0, (-1222.17820994772), (double) 147, allowedSolution0);
      assertEquals((-537.58910497386), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-5.427325562506005E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(107, (UnivariateRealFunction) inverse0, (-1.7976931348623157E308), 943.0160098594, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (107) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(262, (UnivariateRealFunction) sinh0, (-1872.8404902643), (double) 262, (-1872.8404902643), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (262) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(270687, (UnivariateRealFunction) sigmoid0, (double) 270687, (-1959.175), (-1959.175), allowedSolution0);
      assertEquals(270687.0, illinoisSolver0.getMin(), 0.01);
      assertEquals((-1959.175), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(199, (UnivariateRealFunction) cos0, 1.0E-6, 45.553093477052, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-803.8539));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1604, (UnivariateRealFunction) tanh0, (-90.37090508469718), 0.0, (-1.0), allowedSolution0);
      assertEquals((-1.0), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(63, (UnivariateRealFunction) asinh0, 0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Sqrt sqrt0 = new Sqrt();
      illinoisSolver0.setup(2359, sqrt0, 2359, 0.0, 0.0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(491.90118, 1259.20033053);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(380, (UnivariateRealFunction) expm1_0, (-1.0), (double) 380, (double) 21, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(21.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(380.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.5707963267948966), (-1.5707963267948966), 2271.510703);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(446, (UnivariateRealFunction) expm1_0, (-802.5608), (double) 446, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (446) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1108, (UnivariateRealFunction) asinh0, 0.5, (-1.3188156872145126E9), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -1,318,815,687.215]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-861.0670188));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(984486611, (UnivariateRealFunction) null, 2435.395247091455, (double) 452, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1259.20033053, 1259.20033053);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(2025854533, (UnivariateRealFunction) expm1_0, (-1.0), 1259.20033053, 1259.20033053, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) expm1_0, 1065.710598639728, 0.00787098921042606, (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(491.90118, 1259.20033053);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(393, (UnivariateRealFunction) expm1_0, 0.9586129683191618, 0.1666666505023083, 0.9586129683191618, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.959, 0.167]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-326), (UnivariateRealFunction) null, (double) (-326), (double) (-326), (double) (-326), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-861.0670188), (-861.0670188));
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-789), (UnivariateRealFunction) asinh0, 1.4456468917292502E-16, 4508.136529, 1.4456468917292502E-16);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-789) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5, (-459.66752977), 0.0);
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2634, (UnivariateRealFunction) acosh0, 0.058823529411764705, 0.058823529411764705, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.059, 0.059]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2231), (UnivariateRealFunction) null, (double) (-2231), (double) (-2231), (double) (-2231));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit();
      pegasusSolver0.setup(2072601131, logit0, 2072601131, 2072601131, 2072601131);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,072,601,131 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2032802953, (UnivariateRealFunction) asinh0, (-861.0670188), (double) 2032802953, allowedSolution0);
      assertEquals(1.0164010459664906E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.5120800129792694E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1254, (UnivariateRealFunction) asinh0, (-861.0670188), (double) 1254, allowedSolution0);
      assertEquals(196.46649059999993, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.4005777000773644E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1658309060, (UnivariateRealFunction) asinh0, (-2466.0979240335337), (double) 1658309060, allowedSolution0);
      assertEquals(8.29153296951038E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.1020053650807795E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0126()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1658309060, (UnivariateRealFunction) asinh0, (-2479.832942), (double) 1658309060, allowedSolution0);
      assertEquals(8.29153290083529E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.104225936361959E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-1547.473601), (double) 8388669, allowedSolution0);
      assertEquals(4193560.7631995003, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(4.366550134302484E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(8388629, (UnivariateRealFunction) asinh0, (-294.87), (double) 8388629, allowedSolution0);
      assertEquals(4194167.0649999995, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.20361732796654E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(1108, (UnivariateRealFunction) asinh0, (-2255.2), (double) 24, 1675.4057625772623);
      assertEquals(1675.4057625772623, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(9.363013260489574E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-861.0670188), (-861.0670188));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(8388649, (UnivariateRealFunction) asinh0, (-861.0670188), (double) 8388649, allowedSolution0);
      assertEquals(4193893.9664906, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.8656476787420563E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-881.6174229479773), (-881.6174229479773));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-881.6174229479773), (double) 8388669, allowedSolution0);
      assertEquals(4193893.6912885257, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.99987435285881E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-861.0670188), (double) 8388669, allowedSolution0);
      assertEquals(4193903.9664906, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.8611038399279833E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1084, (UnivariateRealFunction) asinh0, (-860.8705158138849), (double) 1084, allowedSolution0);
      assertEquals(111.56474209305759, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-8.028777876622783E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-850.2806138793093), (double) 8388669, allowedSolution0);
      assertEquals(4193909.35969306, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.6476809699802046E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-803.8539));
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(1604, (UnivariateRealFunction) tanh0, (-90.37090508469718), 0.6321205588285577, 2338.577427563681);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(2338.577427563681, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-9.951047392498279E-21), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.1098514046777932E-4));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(8388650, (UnivariateRealFunction) asinh0, (-1.1098514046777932E-4), (double) 8388650, allowedSolution0);
      assertEquals(4194324.999944508, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2, (UnivariateRealFunction) gaussian0, (double) 2, (-3646.2597509), (-3646.2597509), allowedSolution0);
      assertEquals(2.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals((-3646.2597509), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1861086983, (UnivariateRealFunction) inverse0, (-209.46633401172284), (double) 1861086983, (-209.46633401172284));
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-861.0670188), (-861.0670188), (-861.0670188));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-861.0670188), 2.2250738585072014E-308, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(8388669, (UnivariateRealFunction) asinh0, (-861.0670188), (double) 8388669, allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2908, (UnivariateRealFunction) floor0, 0.0, 1363.7911907627704, allowedSolution0);
      assertEquals(681.8955953813852, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(8388607, (UnivariateRealFunction) atan0, 1262.9745777939, 0.0, 0.0, allowedSolution0);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      double double0 = pegasusSolver0.solve(649, (UnivariateRealFunction) inverse0, (-1792.9), 610.7193271599944, (-1963.6700442056));
      assertEquals((-1963.6700442056), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.8320204728874423E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2051.68669386), (-6.032174644509064E-23), 0.003067216819612694);
      double double0 = pegasusSolver0.solve(1643, (UnivariateRealFunction) inverse0, (-4985.399327516838), (double) 1643, (-4985.399327516838));
      assertEquals((-4985.399327516838), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3342.3993275168377), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(23264, (UnivariateRealFunction) inverse0, (-8.0E298), 1360.8101088260948, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-762), (UnivariateRealFunction) inverse0, (-3332.9663658873214), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-762) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0), 311.269510705509, 311.269510705509);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(649, (UnivariateRealFunction) atan0, (-1.0), (-1963.6700442056), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1, -1,963.67]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1643, (UnivariateRealFunction) inverse0, 6.143250507394684E-4, (double) 1643, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.001, 1,643], values: [1,627.803, 0.001]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, (-1536.59941153), (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(3216891, (UnivariateRealFunction) inverse0, (-1536.59941153), (double) 3216891, 1.2958646899018938E-9, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      Signum signum0 = new Signum();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-6.663542893624021E-14));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2699), (UnivariateRealFunction) signum0, (-2112.6570641540893), 0.0, 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,699) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian(67, 67, 67);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(67, (UnivariateRealFunction) gaussian0, (double) 67, (double) 67, (double) 67, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [67, 67]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2, (UnivariateRealFunction) null, (double) 2, (double) 2, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      pegasusSolver0.solve(1333283, (UnivariateRealFunction) inverse0, (-6.032174644509064E-23), 0.0, (-6.032174644509064E-23));
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-206.6555289055));
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-530), (UnivariateRealFunction) sinc0, (double) (-530), (-206.6555289055), (double) (-530));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-530) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3722, (UnivariateRealFunction) expm1_0, (double) 3722, (double) 3722, (double) 3722);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,722, 3,722]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1646, (UnivariateRealFunction) acosh0, (-1.5702018068059431), 6.776263578034403E-21, 6.776263578034403E-21);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1.57, 0], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(515.7057, 0.008333333333329196, (-6.032174644509064E-23));
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid(199, 1.0);
      pegasusSolver0.setup(199, sigmoid0, 199, 199, 1570.4);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [199, 199]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log1p log1p0 = new Log1p();
      illinoisSolver0.setup(3, log1p0, 1.0, 530.5787983330594, 530.5787983330594);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1, 530.579], values: [0.693, 6.276]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1646, (UnivariateRealFunction) inverse0, (-6.032174644509064E-23), (double) 1646, allowedSolution0);
      assertEquals(823.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(6.776263578034403E-21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(820, (UnivariateRealFunction) inverse0, (-2113.254149143941), (double) 820, allowedSolution0);
      assertEquals((-646.6270745719705), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.834069341223722E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1643, (UnivariateRealFunction) inverse0, (-6.032174644509064E-23), (double) 1643, allowedSolution0);
      assertEquals(821.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(6.776263578034403E-21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0163()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(3216891, (UnivariateRealFunction) tanh0, (-1963.4353910970815), (double) 2147448558, allowedSolution0);
      assertEquals(1.0737232972823045E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.100855260634426E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2145906710, (UnivariateRealFunction) tanh0, (-254.676), 982.5689465, 982.5689465, allowedSolution0);
      assertEquals(982.5689465, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.1226453914539064E-19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2147448558, (UnivariateRealFunction) expm1_0, (-2.100855260634426E-11), 6.120352229939198E-4, allowedSolution0);
      assertEquals(3.0601760099268363E-4, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.966985537075497E-18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5, 748.53379);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(157, (UnivariateRealFunction) inverse0, (-2342.628819758), (double) 1636, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(929.3711802419998, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1587, 1587, 748.53379);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(157, (UnivariateRealFunction) inverse0, (-2342.628819758), (double) 1587, (-1.0), allowedSolution0);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1587.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(3216891, (UnivariateRealFunction) tanh0, (-1.0), (double) 2147448558, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1.0737242785E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.0247799468095496E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1643, (UnivariateRealFunction) inverse0, (-6.032174644509064E-23), (double) 1643, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1963.4353910970815));
      illinoisSolver0.solve(2147448558, (UnivariateRealFunction) tanh0, (-1963.4353910970815), (double) 2147448558);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(1.0737232972823045E9, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Asin asin0 = new Asin();
      double double0 = illinoisSolver0.solve(886, (UnivariateRealFunction) asin0, 0.0, 0.0, (double) 886);
      assertEquals(886.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2100453, (UnivariateRealFunction) tanh0, (-1.0061296508748014E-11), (double) 2100453, allowedSolution0);
      assertEquals(1050226.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-5.030647055067998E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-329.59442279442), (-329.59442279442));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(125, (UnivariateRealFunction) expm1_0, (-329.59442279442), 1.0, 1.0, allowedSolution0);
      assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.0142857974969681E-25), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(45, (UnivariateRealFunction) asinh0, (-1718.552939), 3.766827720087547E-7, allowedSolution0);
      regulaFalsiSolver0.doSolve();
  }
@Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1444.0), 1.0E-6, 1266.139048773);
      double double0 = regulaFalsiSolver0.solve(1275, (UnivariateRealFunction) identity0, 0.0, (double) 2403, 0.0, allowedSolution0);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1377530972);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(72, (UnivariateRealFunction) cbrt0, (double) (-2590), 0.49999999999999994, 1.0, allowedSolution0);
      assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.49999999999999994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(8.045591371445522E-9, (-2.957007209750105E-8), 8.045591371445522E-9);
      Cbrt cbrt0 = new Cbrt();
      double double0 = regulaFalsiSolver0.solve(1377530972, (UnivariateRealFunction) cbrt0, (-2004.2), 3717.2072679017792, (-2004.2));
      assertEquals((-2004.2), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.844783660616629E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      Identity identity0 = new Identity();
      PegasusSolver pegasusSolver0 = new PegasusSolver(2403, (-1444.0), 1797.0);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1275, (UnivariateRealFunction) identity0, (-3.141592653589793), 1.0E-6, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1.5707958267948965), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      Sigmoid sigmoid0 = new Sigmoid();
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(23, 2736.107148372719);
      illinoisSolver0.solve(23, univariateRealFunction0, 1626.9358328096, 171.84929644585, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(899.392564627725, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1626.9358328096, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-334.8), 1797.0, (-1763.181735));
      Signum signum0 = new Signum();
      regulaFalsiSolver0.setup(1924, signum0, (-3742.58), 2095890.6181640625, 416.2);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-666.9454323768621), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(71763, (UnivariateRealFunction) cos0, 1.0E-6, (double) 71763, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Cbrt cbrt0 = new Cbrt();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1154), (UnivariateRealFunction) cbrt0, 0.49999999999999994, (-1664.2994444782), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,154) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2130825182, (UnivariateRealFunction) sin0, (double) 2130825182, (double) 2130825182, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,130,825,182, 2,130,825,182]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) null, (double) 5, (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3284, (UnivariateRealFunction) asinh0, (-3615.14575435), (double) 3284, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(71763, (UnivariateRealFunction) cos0, 1.0E-6, (double) 71763, (double) 71763, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2550), (UnivariateRealFunction) tanh0, (double) (-2550), (double) (-2550), (double) (-2550), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,550) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1336721235, (UnivariateRealFunction) ceil0, (double) 1336721235, (double) 1336721235, (double) 1336721235, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,336,721,235, 1,336,721,235]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1796, (UnivariateRealFunction) null, (double) 1796, (double) 1796, (double) 1796, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Logit logit0 = new Logit(34955772, (-1776.30896185));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      // Undeclared exception!
      regulaFalsiSolver0.solve(34955772, univariateRealFunction0, 550.8195552294346, (double) 34955772, 1.0);
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1514.0072, 0.8839932995595482, 1514.0072);
      Cbrt cbrt0 = new Cbrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) cbrt0, (double) 1377530972, 1.97834E-319, 0.8839932995595482);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Power power0 = new Power(123);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(123, (UnivariateRealFunction) power0, (double) 123, (double) 123, (double) 123);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [123, 123]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(13.0, 13.0);
      Logistic logistic0 = new Logistic(2.737136408959471E-6, 1.0E-6, (-2717.0099909357823), 2.737136408959471E-6, (-2717.0099909357823), 2.737136408959471E-6);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1566740, (UnivariateRealFunction) logistic0, (double) 1566740, (double) 2146607402, 2.737136408959471E-6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [1,566,740, 2,146,607,402], values: [-2,717.01, -2,717.01]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3167.341128006, 3167.341128006);
      Log log0 = new Log();
      pegasusSolver0.setup(798, log0, 3167.341128006, 798, 1876.68753);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,167.341, 798]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.1102230246251565E-16, 1.1102230246251565E-16, 2472.3127049);
      regulaFalsiSolver0.setup(2139, harmonicOscillator0, 2139, 2472.3127049, 1842.71327904198);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [2,139, 2,472.313], values: [-0, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(13.0, 13.0);
      Logistic logistic0 = new Logistic(2.737136408959471E-6, 1.0E-6, (-2717.0099909357823), 2.737136408959471E-6, (-2717.0099909357823), 2.737136408959471E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2146607402, (UnivariateRealFunction) logistic0, (-2717.0099909357823), 0.031, 0.031, allowedSolution0);
      assertEquals(0.031, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2717.0099881986143), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3293, (UnivariateRealFunction) asinh0, (-1356.997), (double) 3293, allowedSolution0);
      assertEquals(968.0015000000001, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.416497375213726E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(3247, (UnivariateRealFunction) asinh0, (-1356.997), (double) 3247, allowedSolution0);
      assertEquals(945.0015000000001, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.329158592764882E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(294, (UnivariateRealFunction) asinh0, (-3455.368105318078), (double) 294, allowedSolution0);
      assertEquals((-1580.684052659039), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(4.395208419293903E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0201()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3278, (UnivariateRealFunction) asinh0, (-85.08476613851069), (double) 3278, allowedSolution0);
      assertEquals(1596.4576169307445, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.7241450680851585E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(3284, (UnivariateRealFunction) asinh0, (-1356.997), (double) 3284, allowedSolution0);
      assertEquals(963.5015000000001, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.8785852541381406E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3247, (UnivariateRealFunction) asinh0, (-833.19213), (double) 3247, allowedSolution0);
      assertEquals(1206.9039349999998, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.148569170691424E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3282, (UnivariateRealFunction) asinh0, (-1356.997), (double) 3282, allowedSolution0);
      assertEquals(962.5015000000001, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0560879578260521E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1566, (UnivariateRealFunction) asinh0, (-890.9174999947626), (double) 1566, allowedSolution0);
      assertEquals(337.54125000261877, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.509450946724691E-25), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1566, (UnivariateRealFunction) asinh0, (-890.9174999947626), (double) 1566, allowedSolution0);
      assertEquals(337.54125000261877, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(8.261788321920242E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(3284, (UnivariateRealFunction) asinh0, (-1356.997), (double) 3284, allowedSolution0);
      assertEquals(963.5015000000001, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-3.8785852541381406E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0, 1.0, 1.0);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(13673286, (UnivariateRealFunction) tanh0, (-2449.7797816030684), (double) 13673286, allowedSolution0);
      assertEquals(6835418.110109198, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2359.4930200015524), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(1985, (UnivariateRealFunction) expm1_0, (-1.0819342839810142), 0.5, allowedSolution0);
      assertEquals((-0.2909671419905071), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Floor floor0 = new Floor();
      double double0 = regulaFalsiSolver0.solve(1068, (UnivariateRealFunction) floor0, (double) 1068, (double) 0, (double) 1068);
      assertEquals(1068.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0, 1.0);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(13673286, (UnivariateRealFunction) tanh0, (-2449.7797816030684), (double) 13673286, allowedSolution0);
      assertEquals(6835418.110109198, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0010165180603038948, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.solve(487, (UnivariateRealFunction) tanh0, (-858.87), 6.496314565125843E-30, 6.496314565125843E-30);
  }
@Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6931470632553101, (-1366.6));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2995, (UnivariateRealFunction) tanh0, (-308.52704728555165), 277.583667783045, allowedSolution0);
      assertEquals((-15.471689751253336), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(2005, (UnivariateRealFunction) tanh0, (-1.966073684275146E-23), (double) 2005, 244.24584);
      assertEquals(244.24584, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ceil ceil0 = new Ceil();
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) ceil0, (double) 4, (-0.0013888888689039883), (-0.0013888888689039883));
      assertEquals((-0.0013888888689039883), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-0.0013888888689039883), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logistic logistic0 = new Logistic((-947.72666237), 1853.486563152, (-947.72666237), (-947.72666237), (-642.166595), 4);
      UnivariateRealFunction univariateRealFunction0 = logistic0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(4, univariateRealFunction0, 1853.486563152, 2.6857943652410184E-264, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(926.743281576, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.6857943652410184E-264, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      Cos cos0 = new Cos();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1302.251008487214);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(35, (UnivariateRealFunction) cos0, (-3652.85598986), 717.066389, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1467.89480043), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1505.003679960139), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1073741824, (UnivariateRealFunction) expm1_0, (-618.15), (double) 1073741824, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(0, (UnivariateRealFunction) sigmoid0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      Log10 log10_0 = new Log10();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1302.251008487214, 1302.251008487214, 1302.251008487214);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(574088110, (UnivariateRealFunction) log10_0, 1725.107212355, 1302.251008487214, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,725.107, 1,302.251]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1497, (UnivariateRealFunction) null, (double) 1497, (double) 1497, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.4474161969436822E-265);
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1228, (UnivariateRealFunction) signum0, (-650.088458157959), 1.4474161969436822E-265, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1302.251008487214);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-816), (UnivariateRealFunction) gaussian0, (-213.0), (-538.374011550521), 3.7592526571405476E-258, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-816) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6931470632553101, (-1366.6));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1013578632, (UnivariateRealFunction) tanh0, 1.5707963267948966, (-739.2273719), (double) 1013578632, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1.571, -739.227]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1216, (UnivariateRealFunction) null, 1743.9134738370199, (double) 1216, (double) 1216, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(750336953, (UnivariateRealFunction) tanh0, (-7.990368959193004), (double) 750336953, (double) 2330, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Ulp ulp0 = new Ulp();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1, (UnivariateRealFunction) ulp0, (double) 1, (double) 1, (double) 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1228, (UnivariateRealFunction) tanh0, 1788.2689238543, (-0.11015634282091956), (-4.152938546709856E-11));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,788.269, -0.11]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(4130, (UnivariateRealFunction) null, (double) 4130, (double) 4130, (double) 4130);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power(1543);
      illinoisSolver0.setup(1543, power0, 1543, 1543, 1543);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,543, 1,543]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sqrt sqrt0 = new Sqrt();
      illinoisSolver0.setup(152, sqrt0, 152, 3915.8250172677, 3915.8250172677);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [152, 3,915.825], values: [12.329, 62.577]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(10864, (UnivariateRealFunction) tan0, (-1247.719539816172), (double) 10864, 0.2881203682351974, allowedSolution0);
      assertEquals(0.2881203682351974, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4391.946529718535, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2995, (UnivariateRealFunction) tanh0, (-1366.6), (double) 1216, allowedSolution0);
      assertEquals((-75.29999999999995), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.7433932712299894E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0235()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1228, (UnivariateRealFunction) tanh0, (-1343.5818135139732), (double) 1228, (-1343.5818135139732), allowedSolution0);
      assertEquals((-1343.5818135139732), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.263514002366485E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2995, (UnivariateRealFunction) tanh0, (-1366.6), (double) 1216, allowedSolution0);
      assertEquals((-75.29999999999995), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.7433932712299894E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      double double0 = illinoisSolver0.solve(1413004, (UnivariateRealFunction) cbrt0, (-3018.323628446), (double) 1413004, (-3018.323628446));
      assertEquals((-3018.323628446), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(5.457109150498656E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2356, (UnivariateRealFunction) tanh0, (-250.7128053622), (double) 2356, (-250.7128053622), allowedSolution0);
      assertEquals((-250.7128053622), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.8723359827169079E-19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2330, (UnivariateRealFunction) tanh0, (-0.0014685928333538134), (double) 2330, (-0.0014685928333538134), allowedSolution0);
      assertEquals((-0.0014685928333538134), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4376150943686643E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(2340, (UnivariateRealFunction) tanh0, (-0.0014685928333538134), (double) 2340, (-0.0014685928333538134), allowedSolution0);
      assertEquals((-0.0014685928333538134), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(6.822296915766357E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(2357, (UnivariateRealFunction) tanh0, (-0.0014685928333538134), (double) 2357, (-0.0014685928333538134), allowedSolution0);
      assertEquals((-0.0014685928333538134), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.6597746000574532E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(2338, (UnivariateRealFunction) tanh0, (-1483.781), (double) 2338, 1.7184507792310417E-4, allowedSolution0);
      assertEquals(1.7184507792310417E-4, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.9040853456562536E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(2356, (UnivariateRealFunction) tanh0, (-250.7128053622), (double) 2356, (-250.7128053622), allowedSolution0);
      assertEquals((-250.7128053622), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-7.559819625499713E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1228, (UnivariateRealFunction) tanh0, (-1343.5818135139732), 880.7752, (double) 1228, allowedSolution0);
      assertEquals(1228.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.383999817661149E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1216, (UnivariateRealFunction) tanh0, (-1366.6), 1658.521761, (-1366.6), allowedSolution0);
      assertEquals((-1366.6), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.5131396569750821E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-0.20074942569322565), 0.04541433931286249, 1.5131396569750821E-16);
      // Undeclared exception!
      pegasusSolver0.solve(4874, (UnivariateRealFunction) tanh0, (-1.0), Double.POSITIVE_INFINITY, (-0.04541433931286249), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6931470632553101, (-1366.6));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(471756353, (UnivariateRealFunction) tanh0, (-1.3425685351614458E-9), 9.768511693649451, 0.11113807559013367, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(0.11113807559013367, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1302.251008487214);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(4, (UnivariateRealFunction) gaussian0, (double) 574088110, 1.1132443795258105, allowedSolution0);
      assertEquals(1.1132443795258105, pegasusSolver0.getMax(), 0.01);
      assertEquals(5.7408811E8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(1190, (UnivariateRealFunction) tanh0, (-1343.5818135139732), (double) 1190, (-1343.5818135139732));
  }
@Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9), (-7.800414592973399E-9));
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(186, (UnivariateRealFunction) expm1_0, (-1.0), 0.14285714285714285, 0.14285714285714285);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (186) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(86, (UnivariateRealFunction) signum0, 902.45, 0.0, (-1.6299582825774341E-6), allowedSolution0);
      assertEquals((-1.6299582825774341E-6), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1947.77401418));
      Expm1 expm1_0 = new Expm1();
      double double0 = pegasusSolver0.solve(1437, (UnivariateRealFunction) expm1_0, (double) 0, 1006.599, 0.3845837657211012);
      assertEquals(0.3845837657211012, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9));
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(174, (UnivariateRealFunction) expm1_0, (-7.800414592973399E-9), 0.5, 2161.413671506312);
      assertEquals(2161.413671506312, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.171040043382114E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      Signum signum0 = new Signum();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(764.497780523, 0.0, (-1836.793242238));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(5307690, (UnivariateRealFunction) signum0, (-1836.793242238), 0.0, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-918.396621119), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      Signum signum0 = new Signum();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2.3523272614031043E-29), 3381.93, 3381.93);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      illinoisSolver0.solve(1789569706, (UnivariateRealFunction) signum0, (-113.604), 887.726, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(387.06100000000004, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(387.061, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Signum signum0 = new Signum();
      pegasusSolver0.solve(74, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 902.45, (-0.1428571423679182), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-0.1428571423679182), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.6299582825774341E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2622.972130808));
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1209880476, univariateRealFunction0, 0.0, 668.8431993922134, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2144905636), (UnivariateRealFunction) signum0, (-0.1428571423679182), (-6.663542893624021E-14), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,144,905,636) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-829.362237), 74);
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1713, (UnivariateRealFunction) log1p0, 1.080827965807403E166, (-6.663542893624021E-14), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [10,808,279,658,074,030,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-372), (UnivariateRealFunction) null, (-7.800414592973399E-9), (-7.800414592973399E-9), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9));
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(19759, (UnivariateRealFunction) expm1_0, (-7.800414592973399E-9), (double) 75, 3118.84816, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2.3523272614031043E-29), 3381.93, 3381.93);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-288), (UnivariateRealFunction) cosh0, (-113.604), 533.1636947239977, 887.726, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-288) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(913.2406338866689, 913.2406338866689, 913.2406338866689);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (-1.6299582825774341E-6);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(67, (UnivariateRealFunction) polynomialFunction0, (-2162.0), (-2162.0), 913.2406338866689, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-2,162, -2,162]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      Cosh cosh0 = new Cosh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-6.663542893624021E-14), 301.4088566628468, 0.008336750013465571);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(74, (UnivariateRealFunction) cosh0, (-215.0), 74.0, 301.4088566628468, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-215, 74], values: [1,181,091,689,051,541,700,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, 68,669,148,977,008,805,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45);
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(74, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 902.45, (-0.1428571423679182), (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9));
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      regulaFalsiSolver0.solve(37694536, (UnivariateRealFunction) sinh0, (-7.800414592973399E-9), (double) 37694536, (double) 37694536);
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Constant constant0 = new Constant(593);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(593, (UnivariateRealFunction) constant0, (double) 593, (double) 593, (double) 593);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [593, 593]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(29.352390210896747, 29.352390210896747, 29.352390210896747);
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1324, (UnivariateRealFunction) expm1_0, 29.352390210896747, (double) 1324, 29.352390210896747);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [29.352, 1,324], values: [5,592,179,450,363.438, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-7.800414592973399E-9), (-7.800414592973399E-9));
      Exp exp0 = new Exp();
      regulaFalsiSolver0.setup(3, exp0, 0.15, 0.15, (-7.800414592973399E-9));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.15, 0.15]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Exp exp0 = new Exp();
      pegasusSolver0.setup(260, exp0, 260, 309.64398087, 0.3333333333333333);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [260, 309.644], values: [82,521,154,418,138,900,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, 299,689,996,319,828,830,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(170, (UnivariateRealFunction) signum0, (-0.1428571423679182), 1.0E-9, (-0.1428571423679182), allowedSolution0);
      assertEquals((-0.1428571423679182), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.0714285706839591), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0272()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(67, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 902.45, (double) 67, allowedSolution0);
      assertEquals(67.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(451.22499918502086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(86, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 1.4405899214557231E-12, 38.50145116007853, allowedSolution0);
      assertEquals(38.50145116007853, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-8.149784209937564E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.017);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1525, (UnivariateRealFunction) sinc0, (-594.5587005743547), 0.017, allowedSolution0);
      assertEquals((-297.2708502871773), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-593.7610115208411), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(59, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 902.45, (double) 59, allowedSolution0);
      assertEquals(59.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.6299582825774341E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1562, (UnivariateRealFunction) sinc0, (-184.7), (double) 1562, allowedSolution0);
      assertEquals(688.6500000000001, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1435.7078426909388, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(5, (UnivariateRealFunction) signum0, (-2482.37564914), (double) 5, (double) 5, allowedSolution0);
      assertEquals(5.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1238.68782457), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5, 3785.3133);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(43432870, (UnivariateRealFunction) sinc0, 0.5, (double) 43432870, allowedSolution0);
      assertEquals(2.171643525E7, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(4.343284772289714E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-7.800414592973399E-9), (-7.800414592973399E-9), 2161.78662211932);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Tanh tanh0 = new Tanh();
      double double0 = pegasusSolver0.solve(59, (UnivariateRealFunction) tanh0, (-7.800414592973399E-9), 0.036, 0.036, allowedSolution0);
      assertEquals(0.036, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3.1537270595542863E-22), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(902.45, 902.45, 902.45);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Signum signum0 = new Signum();
      double double0 = pegasusSolver0.solve(67, (UnivariateRealFunction) signum0, (-1.6299582825774341E-6), 902.45, (double) 67, allowedSolution0);
      assertEquals(67.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.6299582825774341E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(1525, (UnivariateRealFunction) sinc0, (-0.7101637307893459), (double) 1525, (-0.7101637307893459));
      assertEquals((-0.7101637307893459), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1523.6724369910498, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      doubleArray0[0] = (-1.6299582825774341E-6);
      doubleArray0[1] = (-0.1428571423679182);
      doubleArray0[2] = (-0.1428571423679182);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(57, (UnivariateRealFunction) polynomialFunction0, (-0.1428571423679182), (-1.6299582825774341E-6), (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1474.12527), (-1474.12527), (-1474.12527));
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(136, (UnivariateRealFunction) floor0, (-1474.12527), (double) 136, allowedSolution0);
      assertEquals((-669.062635), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.07384436995653232, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.017);
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(1525, (UnivariateRealFunction) sinc0, 0.017, (double) 1525, 0.017);
      assertEquals(0.017, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1523.6724368209243, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3.0635291868136657E-4, 3.0635291868136657E-4);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(709, (UnivariateRealFunction) log10_0, 0.02064250050224555, (double) 709, (double) 709, allowedSolution0);
      assertEquals(709.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.000000000565598, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(913.2406338866689, 913.2406338866689, 913.2406338866689);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double[] doubleArray0 = new double[14];
      doubleArray0[1] = (-0.1428571423679182);
      doubleArray0[2] = (-0.1428571423679182);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      pegasusSolver0.solve(57, (UnivariateRealFunction) polynomialFunction0, (-2162.0), (-0.1428571423679182), (-1.6299582825774341E-6), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(602.12708461789);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(3, (UnivariateRealFunction) inverse0, (-2029.7612439103523), 6.271061458479197E293, allowedSolution0);
      assertEquals(3.1355307292395984E293, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(6.271061458479197E293, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(5, (UnivariateRealFunction) atan0, 0.0, (-0.9911751382148669), (-7.44321345601866E-11), allowedSolution0);
      assertEquals((-7.44321345601866E-11), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1592.3312134, 1592.3312134, 1592.3312134);
      Gaussian gaussian0 = new Gaussian();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(3171, (UnivariateRealFunction) gaussian0, 2616.704155, (-710.0752574), (-3383.134), allowedSolution0);
      assertEquals((-3383.134), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2616.704155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(87, (UnivariateRealFunction) tanh0, (-3441.171334), 2005.692963925, 1.1959435664170408E294, allowedSolution0);
      assertEquals(1.1959435664170408E294, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.06291378037085094), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, 0.0, (double) 1027, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(513.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, (-2068.202742604151), 1.7976931348623157E308, allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(8.988465674311579E307, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, (-2068.202742604151), (-731.0), allowedSolution0);
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1399.6013713020754), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2068.202742604151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(1840828219, (UnivariateRealFunction) expm1_0, (-768.485), (double) 1840828219, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(602.12708461789);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-3105), (UnivariateRealFunction) inverse0, (-2029.7612439103523), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,105) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1656, (UnivariateRealFunction) cos0, 0.0, (-2658.676007984523), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -2,658.676]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(283, (UnivariateRealFunction) null, (double) 283, (double) 283, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(602.12708461789);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2632), (UnivariateRealFunction) inverse0, (-264.71544093157), 1.0E-6, (-365.0), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,632) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) log10_0, (double) 5, (double) 5, (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-18749226), (UnivariateRealFunction) null, (double) (-18749226), (double) (-18749226), (double) (-18749226), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1), (UnivariateRealFunction) sqrt0, (double) (-1), (double) (-1), (double) (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acosh acosh0 = new Acosh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(123, (UnivariateRealFunction) acosh0, (double) 123, (double) 123, (double) 123);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [123, 123]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1289, (UnivariateRealFunction) null, (double) 1289, (double) 1289, (double) 1289);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0306()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      illinoisSolver0.setup(1027, cos0, 1027, 0.5366493527962225, 1027);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,027, 0.537]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      illinoisSolver0.setup(1361, inverse0, 1.0E-6, 5.2504571022929874E296, 0.6592141178253557);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 525,045,710,229,298,740,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000], values: [1,000,000, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit(786224166, 1.1356888330448546E294);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(786224166, (UnivariateRealFunction) logit0, (double) 786224166, 1.1356888330448546E294, 3.75986510483, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0309()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(981305269, (UnivariateRealFunction) cos0, (double) 981305269, 1.7976931348623157E308, allowedSolution0);
      assertEquals(8.988465674311579E307, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.795906924605676E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(305, (UnivariateRealFunction) log10_0, 1.0E-6, (double) 305, allowedSolution0);
      assertEquals(152.5000005, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.9999999922662414, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Asinh asinh0 = new Asinh();
      double double0 = illinoisSolver0.solve(981305296, (UnivariateRealFunction) asinh0, (-2822.178437), (double) 981305296, allowedSolution0);
      assertEquals(4.906512369107815E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.312603233911581E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, (-30.922541820824122), (double) 1027, allowedSolution0);
      assertEquals(498.03872908958795, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(476.6116950827919, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1027, 1027, 1027);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, (-2068.202742604151), (double) 1027, allowedSolution0);
      assertEquals((-520.6013713020754), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2068.202742604151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Asinh asinh0 = new Asinh();
      double double0 = illinoisSolver0.solve(981305269, (UnivariateRealFunction) asinh0, (-2822.178437), (double) 981305269, allowedSolution0);
      assertEquals(4.906512234107815E8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.312196663412849E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(191, (UnivariateRealFunction) asinh0, (-1991.6), (double) 191, (-1991.6));
      assertEquals((-1991.6), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.594132009816628E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      Cos cos0 = new Cos();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1027, (UnivariateRealFunction) cos0, 23.62314316182803, (double) 1027, allowedSolution0);
      assertEquals(525.311571580914, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(83.25220532013765, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Floor floor0 = new Floor();
      double double0 = pegasusSolver0.solve(2330, (UnivariateRealFunction) floor0, (-630.9739), (double) 2330, (-1853.0));
      assertEquals((-1853.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.02053799392115252, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      double double0 = pegasusSolver0.solve(278, (UnivariateRealFunction) asinh0, (double) 278, 0.0, 0.0);
      assertEquals(278.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1009, 1009, 1009);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1009, (UnivariateRealFunction) cos0, (-2067.76303227035), (double) 1009, allowedSolution0);
      assertEquals(1009.0, illinoisSolver0.getMax(), 0.01);
      assertEquals(1009.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      pegasusSolver0.solve(217, (UnivariateRealFunction) asinh0, (-1972.1154209056147), (double) 217, (-1972.1154209056147));
  }
@Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(48.85693400122443, 1.0E-6);
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(383, (UnivariateRealFunction) sinc0, (-1219.692849), 131.22332365497533, allowedSolution0);
      assertEquals((-544.2347626725124), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1219.692849), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Ceil ceil0 = new Ceil();
      double double0 = regulaFalsiSolver0.solve(1091, (UnivariateRealFunction) ceil0, 1.0, (double) 0, 1.0);
      assertEquals(1.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2190.0754097062036), (-2190.0754097062036));
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(108, (UnivariateRealFunction) sinc0, (-1.0), (double) 1405, (double) 1053);
      assertEquals(1053.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1404.2919161546376, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2190.0754097062036), (-2190.0754097062036));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(1053, (UnivariateRealFunction) sinc0, (-377.47), 2988.20555, (-1.0), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2767.743127812608, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(3689.3);
      Sigmoid sigmoid0 = new Sigmoid();
      pegasusSolver0.solve(291, (UnivariateRealFunction) sigmoid0, (-3232.091), (-3369.2393188601), (-285.613990384));
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-3232.091), pegasusSolver0.getMin(), 0.01);
      assertEquals((-3232.091), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-228.54482828271), (-228.54482828271));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1271880146, (UnivariateRealFunction) tan0, (-228.54482828271), (double) 671, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(48.85693400122443, 459.7040562);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Cosh cosh0 = new Cosh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-638), (UnivariateRealFunction) cosh0, (-20.0), (-20.0), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-638) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(87, (UnivariateRealFunction) ceil0, (double) 87, (double) 87, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [87, 87]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.25);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1684, (UnivariateRealFunction) tan0, 0.25, (double) 1684, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.25, 1,684], values: [0.255, 0.107]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.25);
      Tan tan0 = new Tan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1689, (UnivariateRealFunction) tan0, 0.25, (double) 1689, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      regulaFalsiSolver0.solve(3957, (UnivariateRealFunction) tan0, 618.5785345201353, 2211.863221, 4.545129676576609, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(48.85693400122443, 459.7040562);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Cosh cosh0 = new Cosh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1540), (UnivariateRealFunction) cosh0, 0.52, 9.575644760614026, 1.8322548088050215, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,540) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2190.0754097062036), (-2190.0754097062036));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1053, (UnivariateRealFunction) sinc0, 2767.743127812608, (-377.47), 261.657, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,767.743, -377.47]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-37.01760771372142), 24.91102060845583);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Cosh cosh0 = new Cosh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1215, (UnivariateRealFunction) cosh0, (-1708.059236842), 300.273332, (-3459.37496406), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,708.059, 300.273], values: [\u221E, 12,765,009,861,153,909,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.75);
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(5, (UnivariateRealFunction) log10_0, 1.1368683772161603E-13, 67910.40439258567, (double) 72);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (5) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Sigmoid sigmoid0 = new Sigmoid((-37.01760771372142), 939.45070690982);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) sigmoid0, (-1.0), (-1.0), (-37.01760771372142));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1888, (UnivariateRealFunction) null, (double) 1888, (double) 1888, (double) 1888);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2190.0754097062036), (-2190.0754097062036));
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      pegasusSolver0.setup(5884, signum0, 5884, 5884, 690.6901220162683);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5,884, 5,884]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      Tan tan0 = new Tan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(36, (-1.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(3, (UnivariateRealFunction) tan0, 1195.71, 1982.7271263811915, 1982.7271263811915, allowedSolution0);
      assertEquals(1982.7271263811915, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1886.4001220162684, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.757277099790742, 0.757277099790742, 0.757277099790742);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(671, (UnivariateRealFunction) tan0, 0.757277099790742, (double) 671, allowedSolution0);
      assertEquals(335.8786385498954, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(671.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.25);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1689, (UnivariateRealFunction) tan0, 0.25, (double) 1689, allowedSolution0);
      assertEquals(844.625, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(4.746165551389144, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.25);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1689, (UnivariateRealFunction) tan0, 0.25, (double) 1689, allowedSolution0);
      assertEquals(844.625, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(4.545129676576609, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.20491587349445256, 0.20491587349445256, 0.20491587349445256);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(671, (UnivariateRealFunction) tan0, 0.20491587349445256, (double) 671, allowedSolution0);
      assertEquals(335.6024579367472, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.220976509130313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
      Tan tan0 = new Tan();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(188, (UnivariateRealFunction) tan0, (-625.95696685016), 3.739996292428726E-8, (double) 1689, allowedSolution0);
      assertEquals(1689.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-9.921E-320), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0347()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(7.773116925340408, 7.773116925340408, 7.773116925340408);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(671, (UnivariateRealFunction) tan0, 7.773116925340408, (double) 671, allowedSolution0);
      assertEquals(339.38655846267017, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(520.7651686522881, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(6.718554528397192, 6.718554528397192, 6.718554528397192);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(650, (UnivariateRealFunction) tan0, 6.718554528397192, (double) 650, allowedSolution0);
      assertEquals(328.3592772641986, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(387.8285914461477, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(7.7731, 7.7731, 7.7731);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(650, (UnivariateRealFunction) tan0, 7.7731, (double) 650, allowedSolution0);
      assertEquals(328.88655, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(7.7731, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(7.0, 7.0, 7.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(650, (UnivariateRealFunction) tan0, 7.0, (double) 650, allowedSolution0);
      assertEquals(328.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(7.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0));
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(36, (UnivariateRealFunction) tan0, (-7.44321345601866E-11), 0.10526403784751892, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0526320188865434, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = regulaFalsiSolver0.solve(1689, (UnivariateRealFunction) tan0, 0.0, (-625.95696685016), 1.6978589272089247E-7, allowedSolution0);
      assertEquals(1.6978589272089247E-7, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Log10 log10_0 = new Log10();
      // Undeclared exception!
      illinoisSolver0.solve(2141205238, (UnivariateRealFunction) log10_0, 0.0, 2625.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2190.0754097062036), (-2190.0754097062036));
      Sinc sinc0 = new Sinc();
      regulaFalsiSolver0.setup(8094249, sinc0, 9.08073616301408E-12, 692.954032151, 9.08073616301408E-12);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 692.954], values: [1, 0.001]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.20491587349445256, 0.20491587349445256, 0.20491587349445256);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(671, (UnivariateRealFunction) tan0, 0.20491587349445256, (double) 671, allowedSolution0);
      assertEquals(335.6024579367472, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(8.220976509130313, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.25);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(671, (UnivariateRealFunction) tan0, 0.25, (double) 671, allowedSolution0);
  }
}
