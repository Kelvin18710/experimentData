package org.apache.commons.math.analysis.solvers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Abs;
import org.apache.commons.math.analysis.function.Asinh;
import org.apache.commons.math.analysis.function.Atan;
import org.apache.commons.math.analysis.function.Ceil;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Sqrt;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Identity;
import org.apache.commons.math.analysis.function.Power;
import org.apache.commons.math.analysis.function.Cbrt;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Log10;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Asin;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log10;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.analysis.function.Sinc;
import org.apache.commons.math.analysis.function.Sinh;
import org.apache.commons.math.analysis.function.Tanh;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2850, (UnivariateRealFunction) tan0, 0.0, (double) 2850, allowedSolution0);
      assertEquals(1425.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0, 0.0);
      Ceil ceil0 = new Ceil();
      double double0 = illinoisSolver0.solve(1697, (UnivariateRealFunction) ceil0, 0.0, 0.0, 1304.48);
      assertEquals(1304.48, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(291.28577764934, 291.28577764934);
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(1824, (UnivariateRealFunction) sinh0, (-187.3), 1.0E-6, (double) 1740, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1740.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(291.28577764934, (-1245.2652), 291.28577764934);
      Atan atan0 = new Atan();
      pegasusSolver0.solve(314, (UnivariateRealFunction) atan0, (-1245.2652), 4.023927705880499E10, 4.023927705880499E10, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(4.023927705880499E10, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1245.2652), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.2047093), (-0.2047093));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(87532083, (UnivariateRealFunction) sinh0, (-546.897154), 2.177046670087819, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1301), (UnivariateRealFunction) sqrt0, (double) (-1301), (double) (-1301), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,301) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(214, (UnivariateRealFunction) tan0, (double) 214, (double) 214, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [214, 214]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1354), (UnivariateRealFunction) null, (double) (-1354), (double) (-1354), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.2047093));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(87532118, (UnivariateRealFunction) sinh0, (-0.2047093), 2.177046670087819, 2.177046670087819, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1363.49549250547), 2108.5487666007, 849);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-130350257), (UnivariateRealFunction) harmonicOscillator0, 1.0E-6, 3087.25566, 1000.110446381644, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-130,350,257) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Abs abs0 = new Abs();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2607, (UnivariateRealFunction) abs0, (double) 2607, (double) 2607, (double) 2607, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,607, 2,607]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(99842464, (UnivariateRealFunction) asinh0, 330.98900524, 3087.25566, 221.4965612, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [330.989, 3,087.256], values: [6.495, 8.728]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-826.208061331642), (-826.208061331642));
      // Undeclared exception!
      illinoisSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) inverse0, (-2278.0117992), (double) Integer.MAX_VALUE, (-826.208061331642));
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-516), (UnivariateRealFunction) inverse0, (double) (-516), (double) (-516), (double) (-516));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-516) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-6.174511554924624), (-6.174511554924624), 0.0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-6.174511554924624);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(62, (UnivariateRealFunction) polynomialFunction0, 1.0000000000003333E-6, (-0.16624879837036133), (-4288.046525544528));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -0.166]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(307, (UnivariateRealFunction) null, (double) 307, (double) 307, (double) 307);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(253, 0.0, 0.14982303977012634);
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
  public void test_0017()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit();
      illinoisSolver0.setup(278, logit0, 278, 278, 278);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 278 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1047.1326, 1047.1326, 0.058669637073672745);
      Gaussian gaussian0 = new Gaussian(2111192667, 1.304E19);
      regulaFalsiSolver0.setup(2111192667, gaussian0, 0.058669637073672745, 1.304E19, 2111192667);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.059, 13,040,000,000,000,000,000], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 253);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(253, (UnivariateRealFunction) inverse0, (-2155.2967146), 1328.89368, 87.26, allowedSolution0);
      assertEquals(87.26, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(33.244123199994704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(291.28577764934, 291.28577764934);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(314, (UnivariateRealFunction) atan0, (-1245.2652), 291.28577764934, (-0.23221148785097773), allowedSolution0);
      assertEquals((-0.23221148785097773), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-476.34567720748436), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(813, (UnivariateRealFunction) cos0, (-3189.4389638), (-1.0), allowedSolution0);
      assertEquals((-1595.2194819), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-667.5884388878302), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2507, (UnivariateRealFunction) log0, 0.5, 16.0, (-8.304823211164851E-7), allowedSolution0);
      assertEquals((-8.304823211164851E-7), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.9999999999998991, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(242, (UnivariateRealFunction) inverse0, (-826.208061331642), (double) 242, (-826.208061331642), allowedSolution0);
      assertEquals((-826.208061331642), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3.1682026649474635E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2147401494, (UnivariateRealFunction) asinh0, (-1.0), (double) 2147401494, allowedSolution0);
      assertEquals(1.0737007465E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(9.632526935120051E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-0.9995670181338424));
      double double0 = pegasusSolver0.solve(2147401499, (UnivariateRealFunction) asinh0, (-1.0), 1.0E-6, allowedSolution0);
      assertEquals((-0.49999950000000004), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.717604522399606E-35), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(4.691399432520901, (-1245.2652), 291.28577764934);
      Atan atan0 = new Atan();
      double double0 = pegasusSolver0.solve(314, (UnivariateRealFunction) atan0, (-1880.0), 0.5, (-774.59418), allowedSolution0);
      assertEquals((-774.59418), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2147401468, (UnivariateRealFunction) asinh0, (-2157.2892513706292), (double) 2147401468, allowedSolution0);
      assertEquals(1.0736996553553743E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-9.529439735069823E-27), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2147401468, (UnivariateRealFunction) asinh0, (-1.0), (double) 2147401468, allowedSolution0);
      assertEquals(1.0737007335E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(9.632528093172909E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Inverse inverse0 = new Inverse();
      double double0 = illinoisSolver0.solve(264, (UnivariateRealFunction) inverse0, (-1092.0), (double) 264, (double) 264);
      assertEquals(264.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.7256036888753537E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.20470930348026098));
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2196, (UnivariateRealFunction) sinh0, (-0.0013888888689039883), 0.5, 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(291.28577764934, 291.28577764934);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Atan atan0 = new Atan();
      pegasusSolver0.solve(1717, (UnivariateRealFunction) atan0, (double) 314, 0.0, 25.37194224095377, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(25.37194224095377, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(217, (UnivariateRealFunction) gaussian0, (double) 217, (double) 217, 933.7091);
      assertEquals(217.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(217.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2147401494, (UnivariateRealFunction) asinh0, (-1.0), (double) 2147401494, allowedSolution0);
      assertEquals(1.0737007465E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.2581248277454375E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      pegasusSolver0.solve(1241, (UnivariateRealFunction) asinh0, (-2476.765), 1.8257003861648792E8, (-2476.765));
  }
@Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(683, (UnivariateRealFunction) sin0, (-2277.0), 2.2250738585072014E-308, 395.0, allowedSolution0);
      assertEquals(395.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-8.318498382798985E-305), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 0.0, (-1871.1435106557183));
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1661, (UnivariateRealFunction) harmonicOscillator0, 0.0, 1.1228462666550452E-21, allowedSolution0);
      assertEquals(5.614231333275226E-22, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(677.0, (-1871.1435106557183), (-1871.1435106557183));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(677.0, 1.0, 2001.0997);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(1891327410, (UnivariateRealFunction) harmonicOscillator0, 4.035807498442655E-16, 32.11746731019224, (double) (-1638), allowedSolution0);
      assertEquals((-1638.0), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.035807498442655E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver0.solve(127, (UnivariateRealFunction) tan0, -0.0, -0.0, 0.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(-0.0, double0, 0.01);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 0.0, 5.650007086920087E-9);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1544.9957391);
      illinoisSolver0.solve(1634, (UnivariateRealFunction) harmonicOscillator0, 1.7029898543501842E-8, (-241180.25145183955), (-1338.1286));
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-1338.1286), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.7029898543501842E-8, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(923.78172);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0, 496, 923.78172);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(496, (UnivariateRealFunction) harmonicOscillator0, (-267.220316), 546.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(139.389842, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-267.220316), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1312), (UnivariateRealFunction) rint0, (double) (-1312), (double) (-1312), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,312) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(677.0, (-1871.1435106557183), (-1871.1435106557183));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1891327410, (UnivariateRealFunction) harmonicOscillator0, (-1743.8293116546), (-3280.98299180114), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1,743.829, -3,280.983]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(4, (UnivariateRealFunction) null, (double) 4, (double) 4, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3410, (UnivariateRealFunction) sinh0, (-1.0), (double) 3410, 1.3245471311735498E-8, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(677.0, 1.0, 2001.0997);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Sigmoid sigmoid0 = new Sigmoid(67, 677.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2090547673), (UnivariateRealFunction) sigmoid0, 1.2958646899018938E-9, 1.0, 32.11746731019224, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,090,547,673) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 3686.7214515977125);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1.0, 1.0, 2204.8906808617);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(1354, (UnivariateRealFunction) harmonicOscillator0, 1.7666830501175982E-13, (-20.0), 1.375, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -20]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1011), (UnivariateRealFunction) null, (double) (-1011), (double) (-1011), (double) (-1011), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, (-1870.8815863805207), (-1.0436948905247493E11));
      // Undeclared exception!
      regulaFalsiSolver0.solve(2147481903, (UnivariateRealFunction) inverse0, (-1870.8815863805207), 1.1430250008909141E-8, 1.1430250008909141E-8);
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Exp exp0 = new Exp();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-4238), (UnivariateRealFunction) exp0, (double) (-4238), (double) (-4238), (double) (-4238));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-4,238) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit(2626, 2626);
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2626, (UnivariateRealFunction) logit0, (double) 2626, (double) 2626, (double) 2626);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,626, 2,626]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-400954507), (UnivariateRealFunction) null, (double) (-400954507), (double) (-400954507), (double) (-400954507));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
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
  public void test_0053()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      regulaFalsiSolver0.setup(724, sinh0, 724, 724, 724);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [724, 724]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      pegasusSolver0.setup(2, asinh0, 2, 1692.0830406613823, 934.029);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [2, 1,692.083], values: [1.444, 8.127]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1863.4058662445966));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1863.4058662445966), (-1863.4058662445966), (-1863.4058662445966));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(156, (UnivariateRealFunction) harmonicOscillator0, (-1863.4058662445966), (double) 156, allowedSolution0);
      assertEquals((-853.7029331222983), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-569.5254923081525), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.8815863805207));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1870.8815863805207), (-1870.8815863805207), (-1870.8815863805207));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, (-1870.8815863805207), (double) 722, allowedSolution0);
      assertEquals((-574.4407931902604), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(673.6850303545245, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1863.4058662445966));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1863.4058662445966), (-1863.4058662445966), (-1863.4058662445966));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, (-1863.4058662445966), (double) 722, allowedSolution0);
      assertEquals((-570.7029331222982), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(289.40083644387886, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1863.4058662445966));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator((-1863.4058662445966), (-1863.4058662445966), (-1863.4058662445966));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, (-1863.4058662445966), (double) 722, allowedSolution0);
      assertEquals((-570.7029331222982), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(289.4008364438788, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.8815863805207));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0036, (-1870.8815863805207), (-1870.8815863805207));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, 0.0036, (double) 722, allowedSolution0);
      assertEquals(361.0018, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(201.39870832840344, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.8815863805207));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0036, (-1870.8815863805207), (-1870.8815863805207));
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, 0.0036, (double) 722, allowedSolution0);
      assertEquals(361.0018, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(201.39870832840347, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.8815863805207));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0036, (-1870.8815863805207), (-1870.8815863805207));
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, 0.0036, (double) 722, allowedSolution0);
      assertEquals(361.0018, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(201.39870832840347, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.8815863805207));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0036, (-1870.8815863805207), (-1870.8815863805207));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(722, (UnivariateRealFunction) harmonicOscillator0, 0.0036, (double) 722, allowedSolution0);
      assertEquals(361.0018, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(201.39870832840344, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1882, (UnivariateRealFunction) tanh0, (-4188.751803), (double) 1882, allowedSolution0);
      assertEquals((-1153.3759015), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.5823544748139833E-23), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(731, (UnivariateRealFunction) tanh0, (-3262.3613451), 2061.09, allowedSolution0);
      assertEquals((-600.63567255), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-6.919559274734332E-8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      double double0 = pegasusSolver0.solve(750, (UnivariateRealFunction) tanh0, (-4188.751803), (double) 750, (-4188.751803));
      assertEquals((-4188.751803), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.9549767542837252E-20), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(741, (UnivariateRealFunction) tanh0, (-4188.751803), (double) 741, (double) 741, allowedSolution0);
      assertEquals(741.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-9.510184769206888E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Minus minus0 = new Minus();
      double double0 = pegasusSolver0.solve(3353, (UnivariateRealFunction) minus0, (-1271.87935686025), (double) 3353, (-3118.78));
      assertEquals((-3118.78), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Ceil ceil0 = new Ceil();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(35, (UnivariateRealFunction) ceil0, (double) 35, (-4.935041001513764E-19), allowedSolution0);
      assertEquals(35.0, pegasusSolver0.getMin(), 0.01);
      assertEquals((-4.935041001513764E-19), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0069()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1870.905358977136), (-1870.905358977136));
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(0.0036, (-1870.905358977136), 0.5);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3475, (UnivariateRealFunction) harmonicOscillator0, (-1870.905358977136), (double) 3475, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0070()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Tanh tanh0 = new Tanh();
      pegasusSolver0.solve(741, (UnivariateRealFunction) tanh0, (-4188.751803), (double) 741, (-4188.751803));
  }
@Test(timeout = 4000)
  public void test_0071()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) asinh0, 0.0, (double) Integer.MAX_VALUE, 1569.82539, allowedSolution0);
      assertEquals(1569.82539, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0072()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) asinh0, (-12.97468131575737), 1569.82539, 0.8813735870195429, allowedSolution0);
      assertEquals(0.8813735870195429, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-4.098519216797148E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0073()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 82.0);
      Sinh sinh0 = new Sinh();
      double double0 = pegasusSolver0.solve(996, (UnivariateRealFunction) sinh0, 0.0, 0.0, 0.0);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0074()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(117.199646107, (-7.800414592973399E-9));
      Gaussian gaussian0 = new Gaussian(117.199646107, 117.199646107, 1.0);
      double double0 = illinoisSolver0.solve(3655, (UnivariateRealFunction) gaussian0, (double) 3655, (-2338.2498083), (-509.7499));
      assertEquals((-509.7499), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(3655.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0075()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(303, (UnivariateRealFunction) cos0, 2930.264, 3349.2331, 3349.2331, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(3349.2331, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3158.871413431964, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0076()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      regulaFalsiSolver0.solve(1068, (UnivariateRealFunction) asinh0, (-567.7), (double) 72, (-701.5489));
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-701.5489), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-7.69946329279918E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0077()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4487, (UnivariateRealFunction) log1p0, (-1.0), 0.16666666666745392, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0078()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1406, (UnivariateRealFunction) sinh0, (-1.0), (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,406) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0079()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) asinh0, 2477.0, (double) 5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,477, 5]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0080()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-805), (UnivariateRealFunction) null, (double) (-805), (double) (-805), allowedSolution0);
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
      Log1p log1p0 = new Log1p();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1588413787, (UnivariateRealFunction) log1p0, (-0.6634966771908253), (double) 1588413787, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0082()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2445), (UnivariateRealFunction) log1p0, 1008.785734145506, 0.0, (-0.7486868820324006), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,445) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0083()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(287125119, (UnivariateRealFunction) exp0, (double) 287125119, (double) 287125119, (double) 287125119, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [287,125,119, 287,125,119]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0084()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(303, (UnivariateRealFunction) cos0, 0.5, (double) 303, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.5, 303], values: [0.878, 0.163]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0085()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cosh cosh0 = new Cosh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-521), (UnivariateRealFunction) cosh0, (double) (-521), 1.7371331394249225, 1.7371331394249225);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-521) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0086()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2711, (UnivariateRealFunction) sinh0, (double) 2711, 323.6706615, (double) 2711);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,711, 323.671]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0087()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2658, (UnivariateRealFunction) null, (double) 2658, (double) 2658, (double) 2658);
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
  public void test_0089()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cosh cosh0 = new Cosh();
      pegasusSolver0.setup(842695014, cosh0, (-521.107), (-0.07827201453686422), (-521.107));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-521.107, -0.078], values: [10,300,648,926,045,946,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, 1.003]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0090()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1588413787, (UnivariateRealFunction) log1p0, (-0.7486868820324006), (double) 1588413787, allowedSolution0);
      assertEquals(7.942068931256565E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.7341873245796878E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0091()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(294, (UnivariateRealFunction) cos0, (double) 294, 2930.26441866516, 2930.26441866516, allowedSolution0);
      assertEquals(2930.26441866516, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1779.7122386160306, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0092()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(249, (UnivariateRealFunction) log1p0, (-0.75), (double) 249, allowedSolution0);
      assertEquals(124.125, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(7.038079231620903E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0093()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(294, (UnivariateRealFunction) cos0, (double) 294, 2930.26441866516, 2930.26441866516, allowedSolution0);
      assertEquals(2930.26441866516, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1779.712238258615, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0094()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(249, (UnivariateRealFunction) log1p0, (-0.5468391143719917), (double) 249, allowedSolution0);
      assertEquals(124.22658044281401, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.092919095244622E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0095()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1588413787, (UnivariateRealFunction) log1p0, (-0.396036129710087), (double) 1588413787, allowedSolution0);
      assertEquals(7.942068933019819E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.799276429511415E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0096()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1588413818, (UnivariateRealFunction) log1p0, (-0.396036129710087), (double) 1588413818, allowedSolution0);
      assertEquals(7.942069088019819E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.4841550858394146E-44), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0097()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1588413818, (UnivariateRealFunction) log1p0, (-0.396036129710087), (double) 1588413818, allowedSolution0);
      assertEquals(7.942069088019819E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.7992766998960776E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0098()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1588413818, (UnivariateRealFunction) log1p0, (-0.396036129710087), (double) 1588413818, allowedSolution0);
      assertEquals(7.942069088019819E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-4.4841550858394146E-44), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0099()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) asinh0, (-3098.508645), 2152.307709720883, 193.4355257828671, allowedSolution0);
      assertEquals(193.4355257828671, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.96167744357296E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0100()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1588413787, (UnivariateRealFunction) log1p0, (-0.7486868820324006), (double) 1588413787, allowedSolution0);
      assertEquals(7.942068931256565E8, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0101()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(1588413787, (UnivariateRealFunction) log1p0, (-0.396036129710087), (double) 1588413787, allowedSolution0);
      assertEquals(7.942068933019819E8, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.799276429511415E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0102()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2.652390584807689E-4));
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(569446, (UnivariateRealFunction) inverse0, (-2.652390584807689E-4), (double) 569446, 0.5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0103()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1406, (UnivariateRealFunction) asinh0, (double) 1406, 0.0, allowedSolution0);
      assertEquals(1406.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0104()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) asinh0, 0.0, 0.0, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0105()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      regulaFalsiSolver0.solve(Integer.MAX_VALUE, (UnivariateRealFunction) sinh0, (-1.0), 521.2317315073, 0.0);
  }

  @Test(timeout = 4000)
  public void test_0106()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1409.0), (-1409.0), (-1409.0));
      Sinh sinh0 = new Sinh();
      pegasusSolver0.setup(1323, sinh0, 0.5141465951036259, (-1409.0), 0.5);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.514, -1,409]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
@Test(timeout = 4000)
  public void test_0107()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3629.541));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(15888, (UnivariateRealFunction) asinh0, (-8.742056109141876E11), (double) 15888, 55933.24345069885, allowedSolution0);
      assertEquals(55933.24345069885, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0108()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(3260, (UnivariateRealFunction) sinh0, (-0.7853981633974483), 1.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.10730091830127586, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0109()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      pegasusSolver0.solve(983, (UnivariateRealFunction) signum0, (-1619.1842076441696), (double) 983, 1.0000000000000422, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1.0000000000000422, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.16680420748184566, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0110()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(983, (UnivariateRealFunction) signum0, (-1619.1842076441696), 1.0E-6, (-1.0), allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1.0), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.17638072207452815), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0111()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3629.541));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Expm1 expm1_0 = new Expm1();
      // Undeclared exception!
      pegasusSolver0.solve(15888, (UnivariateRealFunction) expm1_0, (-1291.61333599), 713.82326784, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0112()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-2386), (UnivariateRealFunction) sin0, (double) (-2386), (double) (-2386), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,386) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0113()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(81038173, (UnivariateRealFunction) signum0, 0.5, (-1.0), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0.5, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0114()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(4, (UnivariateRealFunction) null, (double) 4, (double) 4, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0115()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3260, (UnivariateRealFunction) sinh0, (-0.7853981633974483), 1.0, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0116()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3396, (UnivariateRealFunction) sinh0, (-1.1634875961913511), 2.1924198650170532E10, 1.0E-15, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0117()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1271), (UnivariateRealFunction) sinh0, (-0.16624879837036133), 1556.34761, (-5.648697063487432E-16), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,271) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0118()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(235, (UnivariateRealFunction) asinh0, (double) 235, (double) 235, (double) 235, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [235, 235]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0119()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) null, (double) 0, (double) 0, (double) 0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0120()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3322, univariateRealFunction0, 0.49999999999999994, 1949.0751828886066, -0.0, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0121()  throws Throwable  {
      Sinh sinh0 = new Sinh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      regulaFalsiSolver0.solve(4421, (UnivariateRealFunction) sinh0, (-2204.3834361499107), (double) 3525, (-0.7853981633974483));
  }

  @Test(timeout = 4000)
  public void test_0122()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-545), (UnivariateRealFunction) asinh0, (double) (-545), (double) (-545), (double) (-545));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-545) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0123()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1916138529, (UnivariateRealFunction) signum0, (double) 983, 169.3847671658, 169.3847671658);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [983, 169.385]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0124()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.5, 0.5);
      Signum signum0 = new Signum();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1456, (UnivariateRealFunction) signum0, 0.5, 1026.96121762, 0.5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0.5, 1,026.961], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0125()  throws Throwable  {
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
  public void test_0126()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acos acos0 = new Acos();
      pegasusSolver0.setup(4, acos0, 4, 4, 4);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4, 4]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0127()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver(3578, (-1250.53822103));
      pegasusSolver0.setup(136, asinh0, (-1428.07667), (-1.6932110469663797E-26), (-1428.07667));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,428.077, -0], values: [-7.957, -0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0128()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(3541, (UnivariateRealFunction) asinh0, (-2204.7), 2.1255727223653257E-12, allowedSolution0);
      assertEquals((-1102.3499999999988), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-5.5632685606567E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0129()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(165, (UnivariateRealFunction) asinh0, (-2204.707830902), (double) 165, (-2204.707830902), allowedSolution0);
      assertEquals((-2204.707830902), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(8.687568361926405E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0130()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1604, (UnivariateRealFunction) cos0, 0.5, (double) 1604, allowedSolution0);
      assertEquals(802.25, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1496.9688994355363, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0131()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(14376216, (UnivariateRealFunction) asinh0, (-48.52036), 592.8743176453119, 592.8743176453119, allowedSolution0);
      assertEquals(592.8743176453119, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.163706723926385E-10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0132()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      double double0 = regulaFalsiSolver0.solve(3541, (UnivariateRealFunction) asinh0, (-2204.7), (double) 3541, (-2204.7));
      assertEquals((-2204.7), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.1255727223653257E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0133()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(9, (UnivariateRealFunction) sinh0, (-1.1634875961913511), 1.0, allowedSolution0);
      assertEquals((-0.08174379809567545), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.2685893097912553E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0134()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(3578, (UnivariateRealFunction) asinh0, (-1250.4029027672389), 81.39613157143046, allowedSolution0);
      assertEquals((-584.5033855979042), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1.0788083086568051E-24), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0135()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3629.541));
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(15888, (UnivariateRealFunction) asinh0, (-8.742056109134249E11), (double) 15888, 55933.24345069885, allowedSolution0);
      assertEquals(55933.24345069885, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.3684555315672042E-48), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0136()  throws Throwable  {
      Asinh asinh0 = new Asinh();
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.9999997615814209, 2065.34347);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2143404232, (UnivariateRealFunction) asinh0, (-2204.707830902), 4.9E-324, 558.19337941208, allowedSolution0);
      assertEquals(558.19337941208, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2204.707830902), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0137()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483611, (UnivariateRealFunction) asinh0, (-1250.538), 0.5, 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2.421429209757426E-11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0138()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(1933, (UnivariateRealFunction) sinc0, (-2.060256951109743E-5), (double) 1933, 1.1430250008909141E-8, allowedSolution0);
      assertEquals(1.1430250008909141E-8, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1932.079481957723, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0139()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      double double0 = regulaFalsiSolver0.solve(3568, (UnivariateRealFunction) asinh0, (double) 3568, 0.0, 0.0);
      assertEquals(3568.0, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0140()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      double double0 = regulaFalsiSolver0.solve(1682242519, (UnivariateRealFunction) asinh0, 0.0, (-7.800414592973399E-9), (double) 1682242519);
      assertEquals((-7.800414592973399E-9), regulaFalsiSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0141()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1585, (UnivariateRealFunction) cos0, 0.5, (double) 1585, allowedSolution0);
      assertEquals(0.5, pegasusSolver0.getMin(), 0.01);
      assertEquals(32.98672286269089, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0142()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(887.0, 887.0, 1.0);
      assertEquals(887.0, pegasusSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test_0143()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      regulaFalsiSolver0.solve(2147483611, (UnivariateRealFunction) asinh0, (-1250.538), (double) 2147483611, (-1250.538));
  }
@Test(timeout = 4000)
  public void test_0144()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.409396422049));
      Tanh tanh0 = new Tanh();
      double double0 = illinoisSolver0.solve(21020454, (UnivariateRealFunction) tanh0, (-1.0), 2.2250738585072014E-308, (-4354.445417379545));
      assertEquals((-4354.445417379545), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-6.96526630554901E-309), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0145()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.4093964220494));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(209, (UnivariateRealFunction) tanh0, (-431.48869), (double) 209, allowedSolution0);
      assertEquals((-111.24434500000001), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0146()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.4093964220494));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(209, (UnivariateRealFunction) tanh0, (-431.48869), 1.370555607917461E24, (-3913.0830408013535), allowedSolution0);
      assertEquals((-3913.0830408013535), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(6.476484922992089E-25, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0147()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-7.4093964220494), (-3912.3), (-3912.3));
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(209, (UnivariateRealFunction) tanh0, (-7.4093964220494), 1.370555607917461E24, (double) 209);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(209.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0148()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.4093964220494));
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(209, (UnivariateRealFunction) tanh0, (-7.4093964220494), 1.370555607917461E24, (double) 209);
      double double0 = illinoisSolver0.doSolve();
      assertEquals(209.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(2.988758930760351E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0149()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-7.4093964220494), (-45.41));
      Tanh tanh0 = new Tanh();
      illinoisSolver0.solve(216, (UnivariateRealFunction) tanh0, (-45.41), 7.215065841659424, (-985.06));
      double double0 = illinoisSolver0.doSolve();
      assertEquals((-985.06), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-3.942175378071749E-17), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0150()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinh sinh0 = new Sinh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(326425541, (UnivariateRealFunction) sinh0, (-3158.6799), 1.0E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0151()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-23), (UnivariateRealFunction) log0, (double) (-23), (double) (-23), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-23) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0152()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1860.44);
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2140949465, (UnivariateRealFunction) tanh0, (double) 2140949465, 209.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,140,949,465, 209]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0153()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(395, (UnivariateRealFunction) null, (double) 395, (double) 395, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0154()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2520, (UnivariateRealFunction) sinc0, 1173.853285270946, (double) 2520, 0.5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0155()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-3487), (UnivariateRealFunction) inverse0, (double) (-3487), (double) (-3487), (double) (-3487), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-3,487) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0156()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1380, (UnivariateRealFunction) atanh0, (double) 1380, (double) 1380, (double) 1380, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,380, 1,380]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0157()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1509, (UnivariateRealFunction) null, (double) 1509, (double) 1509, (double) 1509, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0158()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      // Undeclared exception!
      regulaFalsiSolver0.solve(3581, (UnivariateRealFunction) tan0, (-0.0021784065596131344), 1.5707955587637803, (-0.0021784065596131344));
  }

  @Test(timeout = 4000)
  public void test_0159()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Identity identity0 = new Identity();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(124, (UnivariateRealFunction) identity0, (-1.7976931348623157E308), (double) 124, (-2009.361883179608));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (124) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0160()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4075.66218), 0.0952233225107193);
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(3, (UnivariateRealFunction) log0, 0.0, (-1.0), 0.9772566688852888);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0161()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3, (UnivariateRealFunction) null, (double) 3, (double) 3, (double) 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0162()  throws Throwable  {
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
  public void test_0163()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      pegasusSolver0.setup(2024, signum0, 2024, 2024, 2024);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,024, 2,024]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0164()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      pegasusSolver0.setup(202, sigmoid0, (-0.9952305876446231), 202, (-1447.064708273));
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-0.995, 202], values: [0.27, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0165()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(415, (UnivariateRealFunction) tanh0, (-1.5733264369019836E-15), (double) 415, allowedSolution0);
      assertEquals(207.5, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(6.252776074688882E-13, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0166()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(415, (UnivariateRealFunction) tanh0, (-167.9549777), 0.5039018405998233, (-167.9549777), allowedSolution0);
      assertEquals((-167.9549777), illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.2244406929730718E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0167()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(150174, (UnivariateRealFunction) tanh0, (-176.00750328711618), (double) 150174, allowedSolution0);
      assertEquals(74998.99624835644, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.897585116393886E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0168()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1073739185, (UnivariateRealFunction) cos0, (double) 1073739185, 2.985951616230427E20, allowedSolution0);
      assertEquals(1.4929758081205823E20, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(2.6985199837172626E20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0169()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1192, (UnivariateRealFunction) cos0, (-2423.01423395155), 5.474379822345063E-8, 1.0E-6, allowedSolution0);
      assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2194.4024685324707), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0170()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = illinoisSolver0.solve(192, (UnivariateRealFunction) tanh0, (-135.60620212612912), 1.281327046827859E-26, allowedSolution0);
      assertEquals((-67.80310106306456), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.281327046827859E-26, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0171()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(395, (UnivariateRealFunction) tanh0, (-168.37215378761672), (double) 395, allowedSolution0);
      assertEquals(113.31392310619165, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-2.0609496129334303E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0172()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-178.1346308881836), (-178.1346308881836));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(41587, (UnivariateRealFunction) tanh0, (-1268.5594583841123), (double) 41587, allowedSolution0);
      assertEquals(20159.220270807946, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.2918237878049108E-22, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0173()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3912.3), (-7.4093964220494));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(40, (UnivariateRealFunction) tanh0, (-7.4093964220494), 0.875, (double) 40, allowedSolution0);
      assertEquals(40.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-9.860761315262648E-32), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0174()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(266, (UnivariateRealFunction) tanh0, (-0.029025058102246266), 1.2192733218899009E-18, allowedSolution0);
      assertEquals((-0.014512529051123133), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1.2192733218899009E-18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0175()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.4093964220494));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(209, (UnivariateRealFunction) tanh0, (-431.4886909350551), 1.370555607917461E24, (-3913.0830408013535), allowedSolution0);
      assertEquals((-3913.0830408013535), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0176()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(3425, (UnivariateRealFunction) inverse0, (-1.0), 1719.58, allowedSolution0);
      assertEquals(859.29, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-7.040867376798556E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0177()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      double double0 = regulaFalsiSolver0.solve(3581, (UnivariateRealFunction) tan0, 1.0E-6, (double) 3581, 1.0E-6);
      assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.5707955587637803, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0178()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3913.0830408013535), (-7.409396422049));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(198, (UnivariateRealFunction) tanh0, (-1270.8615), 0.0, 0.0952233225107193, allowedSolution0);
      assertEquals(0.0952233225107193, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0179()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      double double0 = pegasusSolver0.solve(187, (UnivariateRealFunction) gaussian0, (double) 187, (double) 187, (double) 187);
      assertEquals(187.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(187.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0180()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-178.1346308881836), (-178.1346308881836));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      illinoisSolver0.solve(2126, (UnivariateRealFunction) tanh0, (-178.1346308881836), 4.568512104112387E22, (-0.9474389266521964), allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0181()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Gaussian gaussian0 = new Gaussian(27.943713079520194, 27.943713079520194);
      UnivariateRealFunction univariateRealFunction0 = gaussian0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3234, univariateRealFunction0, 4.6782287317807635E-4, 883.701, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3,234) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0182()  throws Throwable  {
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(1599.2921171010607, 2432.89506);
      double double0 = pegasusSolver0.solve(2717, (UnivariateRealFunction) atanh0, 0.0, 0.0, (-1183.24132383728), allowedSolution0);
      assertEquals((-1183.24132383728), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0183()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, 1.3483683531054782, (double) 1601, (double) 1601, allowedSolution0);
      assertEquals(1601.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1599.0706606772048, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0184()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Expm1 expm1_0 = new Expm1();
      double double0 = pegasusSolver0.solve(275, (UnivariateRealFunction) expm1_0, 0.0, (-4667.98438), 1330.3);
      assertEquals(1330.3, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0185()  throws Throwable  {
      Expm1 expm1_0 = new Expm1();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2985.672326, 0.9999997615814209);
      double double0 = regulaFalsiSolver0.solve(1922, (UnivariateRealFunction) expm1_0, (-2458.29699721885), 429.238, (double) 2047);
      assertEquals(2047.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2458.29699721885), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0186()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(2047, (UnivariateRealFunction) expm1_0, 0.0, (double) 2047, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1023.5, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0187()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-968.0), 180.66043, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-393.66978500000005), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-929.9114254625788), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0188()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(872147, (UnivariateRealFunction) sinc0, 103.23507111829144, (double) 872147, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0189()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.1908952001192154E-9));
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(978, (UnivariateRealFunction) sinc0, (-968.0366), (-3095.19232), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-968.037, -3,095.192]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0190()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1120), (UnivariateRealFunction) null, (double) (-1120), (double) (-1120), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0191()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1613, (UnivariateRealFunction) sinc0, (-968.0), (double) 1613, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseSecantSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0192()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1352825, (UnivariateRealFunction) sinc0, (-4.313026610554234E-13), (double) 1352825, (-374.62114746308), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0193()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-989), (UnivariateRealFunction) inverse0, (double) (-989), (double) (-989), (double) (-989), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-989) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0194()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1565076809, (UnivariateRealFunction) asinh0, (double) 1565076809, (double) 1565076809, (double) 1565076809, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,565,076,809, 1,565,076,809]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0195()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-894468), (UnivariateRealFunction) null, (double) (-894468), (double) (-894468), (double) (-894468), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0196()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Power power0 = new Power(1281.0);
      // Undeclared exception!
      illinoisSolver0.solve(2145654324, (UnivariateRealFunction) power0, (-928.8152661135641), 1039.0, (-928.8152661135641));
  }

  @Test(timeout = 4000)
  public void test_0197()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1655), (UnivariateRealFunction) sqrt0, (double) (-1655), (double) (-1655), (double) (-1655));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,655) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0198()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3768, (UnivariateRealFunction) minus0, (double) 3768, (double) 3768, (double) 3768);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [3,768, 3,768]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0199()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(145, (UnivariateRealFunction) null, (double) 145, (double) 145, (double) 145);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0200()  throws Throwable  {
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
  public void test_0201()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atanh atanh0 = new Atanh();
      illinoisSolver0.setup(4086, atanh0, 4086, 4086, 4086);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [4,086, 4,086]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0202()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Atanh atanh0 = new Atanh();
      illinoisSolver0.setup(4086, atanh0, 4086, 4238.0, 4238.0);
      // Undeclared exception!
      try { 
        illinoisSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [4,086, 4,238], values: [\uFFFD, \uFFFD]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0203()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-2587.3925678), (-559.81286), (double) 1601, allowedSolution0);
      assertEquals(1601.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2170.8405236305475), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0204()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1601, (-968.0), (-968.0));
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-968.0), 1438.78419595812, allowedSolution0);
      assertEquals(235.39209797906005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1189.54798056483, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0205()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2981.28312491113, 1601);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-431.27520378111), 2245.791, allowedSolution0);
      assertEquals(907.2578981094451, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1984.548683835217, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0206()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1618, (UnivariateRealFunction) sinc0, 15.0, 156.1358, allowedSolution0);
      assertEquals(85.5679, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(153.93804002590338, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0207()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (double) 1601, 1912.258983644095, allowedSolution0);
      assertEquals(1756.6294918220474, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1740.4423300887086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0208()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-3174.24795324988), (double) 1601, allowedSolution0);
      assertEquals((-786.62397662494), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-2752.035164544659), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0209()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(1594, (UnivariateRealFunction) sinc0, (double) 1594, 2377.5, allowedSolution0);
      assertEquals(1985.75, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1778.141441704914, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0210()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-968.0), (double) 1601, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(316.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1178.0972450966806, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0211()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(299, (UnivariateRealFunction) sinc0, 1.0E-6, (double) 299, allowedSolution0);
      assertEquals(149.5000005, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(298.45130209103036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0212()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, (-1522.83164), (double) 1601, allowedSolution0);
      assertEquals(39.08418000000006, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1156.1060965233276), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0213()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1569, (UnivariateRealFunction) sinc0, (-968.0), (double) 1569, allowedSolution0);
      assertEquals(300.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1536.2388076044151, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0214()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinc sinc0 = new Sinc();
      double double0 = regulaFalsiSolver0.solve(1601, (UnivariateRealFunction) sinc0, 8.138710278176973E-4, (double) 1601, 0.42795);
      assertEquals(8.138710278176973E-4, regulaFalsiSolver0.getMin(), 0.01);
      assertEquals(1599.0706606772048, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0215()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Minus minus0 = new Minus();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(77, (UnivariateRealFunction) minus0, (-1381.7), (double) 77, allowedSolution0);
      assertEquals((-652.35), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0216()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(3, (UnivariateRealFunction) exp0, (double) 3, (-1576.0), allowedSolution0);
  }
@Test(timeout = 4000)
  public void test_0217()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Cbrt cbrt0 = new Cbrt();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(189658308, (UnivariateRealFunction) cbrt0, (-2985.50858695284), 5.631996371269961, allowedSolution0);
      assertEquals((-1489.938295290785), illinoisSolver0.getStartValue(), 0.01);
      assertEquals(4.533894870543728E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0218()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      double double0 = regulaFalsiSolver0.solve(3168, (UnivariateRealFunction) sigmoid0, (double) 3168, (-814.4358926109215), (-814.4358926109215));
      assertEquals((-814.4358926109215), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-814.4358926109215), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0219()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, (double) 1432, 0.0, 0.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0220()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      pegasusSolver0.solve(15, (UnivariateRealFunction) atan0, (-3119.1113397), 0.0032678567431425145, (-150.44041919));
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-150.44041919), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.3278347802280447E-19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0221()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1572824590, (UnivariateRealFunction) log0, 0.0, (double) 1572824590, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0222()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1, (UnivariateRealFunction) inverse0, (double) 1, (double) 1, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0223()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(39, (UnivariateRealFunction) atan0, (double) 1432, 6.223749669619085E-15, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1,432, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0224()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2, (UnivariateRealFunction) null, (double) 2, (double) 2, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0225()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.2365955043336987);
      Atan atan0 = new Atan();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, (-2022.5478090032545), (double) 1432, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0226()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Logit logit0 = new Logit(2060.6599810671764, 109204723);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(109204723, (UnivariateRealFunction) logit0, 2060.6599810671764, (double) 109204723, 960.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0227()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1669, (UnivariateRealFunction) atan0, 2561.0397, 9.219544613762692E-9, 0.0, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,561.04, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0228()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(132, (UnivariateRealFunction) null, (double) 132, (double) 132, (double) 132, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0229()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2437, (UnivariateRealFunction) log0, 1.0E-6, (double) 2437, (double) 2437, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0230()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-981.8348895));
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      illinoisSolver0.solve(117876, (UnivariateRealFunction) inverse0, (-1126.526773346919), 4.293292694377068, 4.293292694377068);
  }

  @Test(timeout = 4000)
  public void test_0231()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(3, (UnivariateRealFunction) sin0, (-981.6157), (double) 3, (-981.6157));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0232()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sqrt sqrt0 = new Sqrt();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(920459667, (UnivariateRealFunction) sqrt0, (double) 920459667, (double) 920459667, (double) 920459667);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [920,459,667, 920,459,667]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0233()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1242), (UnivariateRealFunction) null, (double) (-1242), (double) (-1242), (double) (-1242));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0234()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3.944304526105059E-28));
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
  public void test_0235()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.setup(37, tanh0, (-2502.2), (-2502.2), 4.503599627370496E15);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-2,502.2, -2,502.2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0236()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tanh tanh0 = new Tanh();
      regulaFalsiSolver0.setup(69, tanh0, 69, 1209.919548756, 1.0);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [69, 1,209.92], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0237()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(28, (UnivariateRealFunction) log0, 1.0E-6, (double) 28, (double) 28, allowedSolution0);
      assertEquals(28.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000033222363, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0238()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(2487, (UnivariateRealFunction) log0, 1.0E-6, (double) 2487, (double) 2487, allowedSolution0);
      assertEquals(2487.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.9999999994522553, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0239()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2487, (UnivariateRealFunction) log0, 1.0E-6, (double) 2487, (double) 2487, allowedSolution0);
      assertEquals(2487.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000009852348661, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0240()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2487, (UnivariateRealFunction) log0, 1.0E-6, (double) 2487, (double) 2487, allowedSolution0);
      assertEquals(2487.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.9999999994522553, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0241()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2414, (UnivariateRealFunction) log0, 0.6179403696271486, (double) 2414, (double) 2414, allowedSolution0);
      assertEquals(2414.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.000000000000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0242()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2457, (UnivariateRealFunction) log0, 1.0E-6, (double) 2457, (double) 2457, allowedSolution0);
      assertEquals(2457.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.9999999993826703, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0243()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(2414, (UnivariateRealFunction) log0, 0.4342944622039795, (double) 2414, (double) 2414, allowedSolution0);
      assertEquals(2414.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000013376, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0244()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-974.0398), 1142.0, 0.5);
      Logit logit0 = new Logit((-974.0398), (-551.281));
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(743, univariateRealFunction0, (-974.0398), (double) 743, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (743) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0245()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2464, (UnivariateRealFunction) log0, 1.0E-6, (double) 2464, (double) 2464, allowedSolution0);
      assertEquals(2464.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0246()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Sinh sinh0 = new Sinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(15, (UnivariateRealFunction) sinh0, (-1064.3370952042956), 4.9E-324, (-3840.0), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (15) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0247()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2470, (UnivariateRealFunction) log0, 1.0E-6, (double) 2470, (double) 2470, allowedSolution0);
      assertEquals(2470.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000000002, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0248()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, (-2023.02), 1.0, allowedSolution0);
      assertEquals((-1011.01), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.604067870690068E-27), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0249()  throws Throwable  {
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      double double0 = illinoisSolver0.solve(15, (UnivariateRealFunction) atan0, (-2904.35646127016), 0.19999999999923582, 4.415282115967699E-13, allowedSolution0);
      assertEquals(4.415282115967699E-13, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.58493594820108E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0250()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1466, (UnivariateRealFunction) atan0, (-17.256829418544157), (double) 1466, allowedSolution0);
      assertEquals(724.3715852907279, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0251()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, (-2023.02), 1.0, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-1011.01), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-5.604067870690068E-27), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0252()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, 0.0, 239.05, allowedSolution0);
      assertEquals(239.05, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0253()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
      Atan atan0 = new Atan();
      pegasusSolver0.solve(1432, (UnivariateRealFunction) atan0, (double) 1432, 0.0, (-150.44041919));
  }

  @Test(timeout = 4000)
  public void test_0254()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
  }
@Test(timeout = 4000)
  public void test_0255()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(12.353891158658513);
      Floor floor0 = new Floor();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(621, (UnivariateRealFunction) floor0, 0.008336750013465571, (double) 621, 0.008336750013465571, allowedSolution0);
      assertEquals(0.008336750013465571, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.008336750013465571, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0256()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Expm1 expm1_0 = new Expm1();
      double double0 = regulaFalsiSolver0.solve(4, (UnivariateRealFunction) expm1_0, (double) 97, 0.0, 1284.84188);
      assertEquals(1284.84188, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0257()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2827.957340648075, (-2013.763461782));
      Inverse inverse0 = new Inverse();
      double double0 = regulaFalsiSolver0.solve(102, (UnivariateRealFunction) inverse0, (-0.0017229437106962933), 6.124054076373698E-21, (-2013.763461782));
      assertEquals((-2013.763461782), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.0017229437106962933), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0258()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2013.763461782), (-2013.763461782), (-2013.763461782));
      Asinh asinh0 = new Asinh();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      regulaFalsiSolver0.solve(598, (UnivariateRealFunction) asinh0, (-1947.15869722), (double) 598, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-674.5793486099999), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0259()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0);
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      regulaFalsiSolver0.solve(1130, (UnivariateRealFunction) exp0, (-1019.70821195), (double) 1130, (-1.0), allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-1019.70821195), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0260()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-581.5678698867754), 1.6329052414118144E20, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0261()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, 7.825014696622778E54, 7.825014696622778E54, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [7,825,014,696,622,778,000,000,000,000,000,000,000,000,000,000,000,000,000, 7,825,014,696,622,778,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0262()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, 0.0, 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 0.5], values: [\u221E, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0263()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.7290018688885755, 0.7290018688885755);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(84, (UnivariateRealFunction) cos0, 3140.175619003288, 2.26173317233537E19, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0264()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1431.353919272);
      Exp exp0 = new Exp();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-2147483647), (UnivariateRealFunction) exp0, (double) (-2147483647), 1021.4257, 1021.4257, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,147,483,647) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0265()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Logit logit0 = new Logit();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2069103891, (UnivariateRealFunction) logit0, (double) 2069103891, (-2156.72802384375), (-2156.72802384375), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,069,103,891 out of [0, 1] range
         //
         verifyException("org.apache.commons.math.analysis.function.Logit", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0266()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1431.353919272, 0.8292331376166622);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1901, (UnivariateRealFunction) null, 0.8292331376166622, 22.485277736062315, 0.8292331376166622, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0267()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-2.5729705178112846E-167), 0.0, 5.147179607506404E169);
  }

  @Test(timeout = 4000)
  public void test_0268()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.7290018688885755, 0.7290018688885755);
      Cos cos0 = new Cos();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(0, (UnivariateRealFunction) cos0, 6.116270111490759E-21, 0.7290018688885755, (double) 0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0269()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2827.957340648075, (-2013.763461782));
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2700, (UnivariateRealFunction) inverse0, 6.124054076373698E-21, (-1201.09753539), (double) 102);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -1,201.098]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0270()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2823.3413105, (-2013.763461782));
      Inverse inverse0 = new Inverse();
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, 2823.3413105, 3711.424, 0.7249995199969751);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [2,823.341, 3,711.424], values: [0, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0271()  throws Throwable  {
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
  public void test_0272()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2147483637, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-2665.547555407), 0.5, allowedSolution0);
      assertEquals((-1332.5237777035), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0273()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2.147483646E9, (-1698.28));
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483613, (UnivariateRealFunction) inverse0, (-0.0011196111099723814), 1.1730463525082348E-7, allowedSolution0);
      assertEquals((-5.597469026685653E-4), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-0.0011194938053371306), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0274()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.7290018688885755, 0.7290018688885755);
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(84, (UnivariateRealFunction) cos0, 0.7290018688885755, 1.6164683740671394E20, allowedSolution0);
      assertEquals(8.082341870335697E19, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(2.26173317233537E19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0275()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1363106612, 1363106612, 1.633123935319537E16);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(1363106612, (UnivariateRealFunction) harmonicOscillator0, (double) 1363106612, 1.633123935319537E16, allowedSolution0);
      assertEquals(8.165620358150991E15, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.6107183360103448E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0276()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2147483637);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = regulaFalsiSolver0.solve(161, (UnivariateRealFunction) inverse0, (-856.62742), 1452.0499989, allowedSolution0);
      assertEquals(297.71128944999987, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(595.4225789000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0277()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2147483637, 2147483637);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-967.9), (double) 2147483637, allowedSolution0);
      assertEquals(1.0737413345500001E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-967.9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0278()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2147483637);
      double double0 = regulaFalsiSolver0.solve(3249, (UnivariateRealFunction) inverse0, (-2068.4), 0.0019986, allowedSolution0);
      assertEquals((-1034.1990007), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0019986, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0279()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(1363106612, 1363106612, 1.633123935319537E16);
      double double0 = regulaFalsiSolver0.solve(1363106612, (UnivariateRealFunction) harmonicOscillator0, (double) 1363106612, 1.633123935319537E16, (double) 1363106612);
      assertEquals(1.363106612E9, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.6107183360103448E16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0280()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, 1.0E-6, 0.5);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(816, (UnivariateRealFunction) inverse0, (-893.167271286), 1.0E-6, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (816) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0281()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2147483613, 1.6329052414118144E20, 0.07842259109020233);
      double double0 = regulaFalsiSolver0.solve(1395, (UnivariateRealFunction) inverse0, (-603.3976619243126), 0.07842259109020233, allowedSolution0);
      assertEquals((-301.6596196666112), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-603.3192393332224), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0282()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.1430250008909141E-8);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(575, (UnivariateRealFunction) inverse0, (-1.1325708393531485E15), 1.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (575) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0283()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(4.0, (-579.2571738384825), 926.0);
      double double0 = pegasusSolver0.solve(1421, (UnivariateRealFunction) inverse0, (-1888.046), 1.0E-6, allowedSolution0);
      assertEquals((-944.0229995), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1888.045999), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0284()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(221, (UnivariateRealFunction) asin0, (-0.24190577790565984), 1.1430250008909141E-8, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals((-0.12095288323770492), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.1068076653436948E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0285()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = regulaFalsiSolver0.solve(221, (UnivariateRealFunction) asin0, (-0.24190577790565984), 1.1430250008909141E-8, allowedSolution0);
      assertEquals((-0.12095288323770492), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0286()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6);
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2147316683, (UnivariateRealFunction) tan0, 0.5, (double) 2147316683, allowedSolution0);
      assertEquals(1.07365834175E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(442384.78213059413, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0287()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve(2934, (UnivariateRealFunction) inverse0, (-727.236636023), 0.0, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,934) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0288()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-2820.68), 1664.755893441433, 1.20147344311847347E18, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0289()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(211, (UnivariateRealFunction) asin0, (-0.24190577790565984), 1.1430250008909141E-8, allowedSolution0);
      assertEquals((-0.12095288323770492), regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0290()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.7290018688885755, 0.7290018688885755);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      Asin asin0 = new Asin();
      double double0 = regulaFalsiSolver0.solve(97, (UnivariateRealFunction) asin0, 3.750403833034931E-41, 0.0, 1.0, allowedSolution0);
      assertEquals(1.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0291()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-0.0017229437106962933), 7.825014696622778E54, allowedSolution0);
      assertEquals(3.912507348311389E54, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(7.825014696622778E54, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0292()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      Inverse inverse0 = new Inverse();
      regulaFalsiSolver0.solve(2147483637, (UnivariateRealFunction) inverse0, (-0.0017229437106962933), 7.825014696622778E54, 0.0);
  }
@Test(timeout = 4000)
  public void test_0293()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(3323, (UnivariateRealFunction) sin0, (-1994.886433), 2.2250738585072014E-308, (-1994.886433));
      assertEquals((-1994.886433), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-1.7826551160332744E-303), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0294()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(4, (UnivariateRealFunction) signum0, (double) 4, 0.0, allowedSolution0);
      assertEquals(2.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0295()  throws Throwable  {
      Signum signum0 = new Signum();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6, 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1999, (UnivariateRealFunction) signum0, (-4.143330154975313E-5), (double) 11686143, allowedSolution0);
      assertEquals(5843071.499979283, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.592035755045744E-7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0296()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(217, (UnivariateRealFunction) sin0, (-4049.5596331523902), (double) 217, allowedSolution0);
      assertEquals((-1916.2798165761951), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-3685.088182660828), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0297()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.0);
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(4, 1.0, 0.0);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      pegasusSolver0.solve(4, univariateRealFunction0, 0.0, 1413.8179, 0.0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0298()  throws Throwable  {
      Signum signum0 = new Signum();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-0.31157078293187174), 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-101), (UnivariateRealFunction) signum0, 8.0, (-3.940510424527919E-20), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-101) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0299()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(5, (UnivariateRealFunction) expm1_0, 1.8275902665898267E-6, 327.97772, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [0, 327.978], values: [0, 27,473,499,563,903,750,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0300()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1 expm1_0 = new Expm1();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(963393397, (UnivariateRealFunction) expm1_0, (-0.49781597080816653), (double) 963393397, (-6.663542893624021E-14), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0301()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Cos cos0 = new Cos();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-1064529155), (UnivariateRealFunction) cos0, (double) (-1064529155), (double) (-1064529155), (double) (-1064529155), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,064,529,155) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0302()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(104, (UnivariateRealFunction) sin0, 2041.165, 3.1415926535897936, 2041.165, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,041.165, 3.142]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0303()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve((-713740325), (UnivariateRealFunction) null, (double) (-713740325), (double) (-713740325), (double) (-713740325), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0304()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (-479.1131332545299), 957.564977, 957.564977, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0305()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(0, (UnivariateRealFunction) sigmoid0, (double) 247, (-149.4954586271272), (-600.04802));
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asinh asinh0 = new Asinh();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2, (UnivariateRealFunction) asinh0, (double) 2, (double) 2, (double) 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2, 2]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0307()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(358745085, (UnivariateRealFunction) sin0, (-1.0), (double) 358745085, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1, 358,745,085], values: [-0.841, -0.523]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0308()  throws Throwable  {
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
  public void test_0309()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-14, 1.0E-14);
      Minus minus0 = new Minus();
      pegasusSolver0.setup(5, minus0, 5, 1.0E-14, 0.028264361614181333);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [5, 0]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0310()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      pegasusSolver0.setup(3925, signum0, 66.21393413971339, 1821.8710179623, 5.6843418860808015E-14);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [66.214, 1,821.871], values: [1, 1]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0311()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(223, (UnivariateRealFunction) sin0, (double) 223, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1605.3538459843842, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0312()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(223, (UnivariateRealFunction) sin0, (double) 223, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1605.3538459843844, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0313()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(252, (UnivariateRealFunction) sin0, (double) 252, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(907.9202768978466, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0314()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(223, (UnivariateRealFunction) sin0, (double) 223, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1605.3538459843842, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0315()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (double) 247, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(298.45130209103036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0316()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(215, (UnivariateRealFunction) sin0, (double) 215, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1159.2476891746337, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0317()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (double) 247, 2041.165, 2041.165, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(298.4513020910304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0318()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (double) 247, 2041.165, (double) 247, allowedSolution0);
      assertEquals(247.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(298.45130209103036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0319()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(782, (UnivariateRealFunction) sin0, 3.190280110625565, 13.07, 3.190280110625565, allowedSolution0);
      assertEquals(3.190280110625565, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(12.56637061435964, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0320()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (double) 247, 2041.7636581047284, (double) 247, allowedSolution0);
      assertEquals(247.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(248.18581963359367, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0321()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (-1611.2), 1.0E-6, (-1611.2), allowedSolution0);
      assertEquals((-1611.2), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.413274007712074E-12), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0322()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      double double0 = pegasusSolver0.solve(244, (UnivariateRealFunction) sin0, 6.891696102684364E-10, (double) 244, (double) 244);
      assertEquals(244.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0323()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.5766609737810103);
      Inverse inverse0 = new Inverse();
      double double0 = illinoisSolver0.solve(2707, (UnivariateRealFunction) inverse0, (-5659.2897), (double) 2707, 2693.4519308);
      assertEquals(2693.4519308, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.02062120038969506, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0324()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(247, (UnivariateRealFunction) sin0, (double) 247, 2041.165, 2041.165, allowedSolution0);
      assertEquals(2041.165, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(298.4513020910304, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0325()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Identity identity0 = new Identity();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(2138646680, (UnivariateRealFunction) identity0, (-784.0), (double) 2138646680, (double) 2138646680, allowedSolution0);
      assertEquals(2.13864668E9, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0326()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sigmoid sigmoid0 = new Sigmoid();
      pegasusSolver0.solve(247, (UnivariateRealFunction) sigmoid0, 35.5635988, (-4701.0), (-2240.35506));
      double double0 = pegasusSolver0.doSolve();
      assertEquals(35.5635988, pegasusSolver0.getMin(), 0.01);
      assertEquals((-4701.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0327()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2757, (UnivariateRealFunction) sin0, 627.0, (-201.36998796768455), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [627, -201.37]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0328()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Power power0 = new Power(1337965437);
      // Undeclared exception!
      pegasusSolver0.solve(1337965437, (UnivariateRealFunction) power0, (-3233.626), 4310.695, (-2874.20786526));
  }
@Test(timeout = 4000)
  public void test_0329()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Asin asin0 = new Asin();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(905, (UnivariateRealFunction) asin0, (double) 905, 0.0, allowedSolution0);
      assertEquals(905.0, pegasusSolver0.getMin(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0330()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-893.39624053848), (-893.39624053848));
      Sin sin0 = new Sin();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = illinoisSolver0.solve(15, (UnivariateRealFunction) sin0, 0.0, (-0.010714690733195933), (double) 15, allowedSolution0);
      assertEquals(15.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0331()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(204, (UnivariateRealFunction) signum0, (-2212.01), (double) 204, (double) 204, allowedSolution0);
      assertEquals(204.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals((-1.4794721346072764E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0332()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Sinh sinh0 = new Sinh();
      regulaFalsiSolver0.solve(1358, (UnivariateRealFunction) sinh0, 0.0, (-27.54962462117), 1019.523290466);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1019.523290466, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0333()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 1.0000000000005973, 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      regulaFalsiSolver0.solve(2764, (UnivariateRealFunction) log0, 1.0E-6, (double) 2764, 1.0000000000005973, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(1.0000000000005973, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0000009522892834, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0334()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-86.4215401754), (-12.943955253113723), 4713.983875305776);
      Log10 log10_0 = new Log10();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1765, (UnivariateRealFunction) log10_0, 2.686739719592843E-14, 4713.983875305776, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0335()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Sinc sinc0 = new Sinc();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(473933351, (UnivariateRealFunction) sinc0, (double) 473933351, (double) 473933351, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [473,933,351, 473,933,351]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0336()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-1380), (UnivariateRealFunction) null, (double) (-1380), (double) (-1380), allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0337()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(4900, (UnivariateRealFunction) log0, 1.0E-6, (double) 4900, 1.0E-6, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test_0338()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(1507, (UnivariateRealFunction) sinc0, (-726.685998187155), 1.0, (-726.685998187155), allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,507) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0339()  throws Throwable  {
      Tanh tanh0 = new Tanh();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 2752);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(2752, (UnivariateRealFunction) tanh0, 1.0, (-2.356194490192345), 0.5, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [1, -2.356]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0340()  throws Throwable  {
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5, 3583.986881762);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(968424, (UnivariateRealFunction) log0, (-1.0), 1655.813209990205, 0.5000000000137776, allowedSolution0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1, 1,655.813], values: [\uFFFD, 7.412]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0341()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(306, (UnivariateRealFunction) log0, 0.1, (double) 306, (double) 306, (AllowedSolution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0342()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5);
      // Undeclared exception!
      regulaFalsiSolver0.solve(4854, (UnivariateRealFunction) log0, 1.3703748480642375E-5, 1068.1, (double) 4854);
  }

  @Test(timeout = 4000)
  public void test_0343()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Gaussian gaussian0 = new Gaussian();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(1, (UnivariateRealFunction) gaussian0, (double) 1, (double) 1, (double) 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0344()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      // Undeclared exception!
      try { 
        pegasusSolver0.solve(2752, (UnivariateRealFunction) log0, (-1.5707963267948966), (-1530.89), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [-1.571, -1,530.89]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0345()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      try { 
        illinoisSolver0.solve((-2294), (UnivariateRealFunction) null, (double) (-2294), (double) (-2294), (double) (-2294));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0346()  throws Throwable  {
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
  public void test_0347()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Acos acos0 = new Acos();
      pegasusSolver0.setup(2622, acos0, 2622, 2622, 2622);
      // Undeclared exception!
      try { 
        pegasusSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [2,622, 2,622]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0348()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(306, (UnivariateRealFunction) log0, 0.058823529411764705, (double) 306, (double) 306, allowedSolution0);
      assertEquals(306.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000003084, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0349()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(2312, (UnivariateRealFunction) log0, 0.058823529411764705, (double) 2312, (double) 2312, allowedSolution0);
      assertEquals(2312.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(1.000000000015932, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0350()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Log log0 = new Log();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(2312, (UnivariateRealFunction) log0, 0.058823529411764705, (double) 2312, (double) 2312, allowedSolution0);
      assertEquals(2312.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.9999996196136562, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0351()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4862);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(4862, (UnivariateRealFunction) log0, 0.5, (double) 4862, 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0352()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1507, (-1634.077566989));
      pegasusSolver0.solve(1507, (UnivariateRealFunction) sinc0, (-1634.077566989), (double) 1507, (double) 1507);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1507.0, pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-604.6007999947515), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0353()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = regulaFalsiSolver0.solve(4862, (UnivariateRealFunction) log0, 0.5, (double) 4862, 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0354()  throws Throwable  {
      Log log0 = new Log();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(4862, (UnivariateRealFunction) log0, 0.5, (double) 4862, 0.5, allowedSolution0);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1.0000000000000009, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0355()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(37, (UnivariateRealFunction) sinc0, (-1634.077566989), 2381.0488781446, allowedSolution0);
      assertEquals((-1634.077566989), pegasusSolver0.getMin(), 0.01);
      assertEquals(1077.566280181299, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0356()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(4.263360973824, 4.263360973824, 4.263360973824);
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(179894, (UnivariateRealFunction) sinc0, 4.263360973824, (double) 179894, 1745.3572355, allowedSolution0);
      assertEquals(4.263360973824, pegasusSolver0.getMin(), 0.01);
      assertEquals(179894.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0357()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(721, (UnivariateRealFunction) sinc0, 9.658940314238395E-14, (double) 721, allowedSolution0);
      assertEquals(9.658940314238395E-14, pegasusSolver0.getMin(), 0.01);
      assertEquals(719.4247176720627, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0358()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(3737, (UnivariateRealFunction) sinc0, (-1642.3091253157475), (double) 3737, allowedSolution0);
      assertEquals((-1642.3091253157475), illinoisSolver0.getMin(), 0.01);
      assertEquals(1724.7343666612262, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0359()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = regulaFalsiSolver0.solve(225, (UnivariateRealFunction) sinc0, 0.19999954120254515, (double) 1507, (double) 225, allowedSolution0);
      assertEquals(225.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(1504.8228810699068, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0360()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(4, 0.0, 1347.396391314283);
      UnivariateRealFunction univariateRealFunction0 = harmonicOscillator0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1.0E-6), 2.784553847210324, allowedSolution0);
      assertEquals(2.784553847210324, pegasusSolver0.getMax(), 0.01);
      assertEquals((-1.0E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0361()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3.8632305434015434E-7));
      Log1p log1p0 = new Log1p();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve(3322, (UnivariateRealFunction) log1p0, (-3.8632305434015434E-7), (double) 3322, allowedSolution0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (3,322) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0362()  throws Throwable  {
      Sinc sinc0 = new Sinc();
      PegasusSolver pegasusSolver0 = new PegasusSolver(4.263360973824, 4.263360973824, 4.263360973824);
      double double0 = pegasusSolver0.solve(179894, (UnivariateRealFunction) sinc0, 4.263360973824, (double) 179894, (double) 179894);
      assertEquals(4.263360973824, pegasusSolver0.getMin(), 0.01);
      assertEquals(179893.42657110604, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test_0363()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Exp exp0 = new Exp();
      regulaFalsiSolver0.setup(788, exp0, 788, 2349.98695, 0.500000000103074);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.doSolve();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [788, 2,349.987], values: [\u221E, \u221E]
         //
         verifyException("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils", e);
      }
  }
}
