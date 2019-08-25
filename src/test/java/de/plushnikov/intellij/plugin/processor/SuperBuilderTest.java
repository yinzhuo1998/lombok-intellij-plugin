package de.plushnikov.intellij.plugin.processor;

import de.plushnikov.intellij.plugin.AbstractLombokParsingTestCase;

/**
 * Unit tests for @SuperBuilder support
 */
public class SuperBuilderTest extends AbstractLombokParsingTestCase {

  @Override
  protected String annotationToComparePattern() {
    return "java.lang.Deprecated";
  }

  protected boolean shouldCompareCodeBlocks() {
    return false;
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // Add dummy classes, which are absent in mockJDK
    myFixture.addClass("package java.util;\n  public interface NavigableMap<K,V> extends java.util.SortedMap<K,V> {}");
  }

  public void testSuperbuilder$SuperBuilderSimple() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderAbstract() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderAbstractToBuilder() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderBasic() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderBasicToBuilder() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderCustomized() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderSingularAnnotatedTypes() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithCustomBuilderMethod() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithDefaults() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithGenerics() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithGenerics2() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithGenericsAndToBuilder() {
    doTest(true);
  }

  public void testSuperbuilder$SuperBuilderWithNonNull() {
    doTest(true);
  }

}
