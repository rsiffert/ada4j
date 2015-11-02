package org.ada4j.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.ada4j.api.Factory;
import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IDeclaration;
import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;
import org.ada4j.internal.model.Package;
import org.ada4j.internal.model.Subprogram;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private ICompilationUnit exampleSut;
	private ICompilationUnit mainSut;

	class ClassHierarchyMembershipPredicate implements Predicate<IDeclaration> {

		private Class<? extends Object> parent;

		public ClassHierarchyMembershipPredicate(
				Class<? extends Object> parent) {
			this.parent = parent;
		}

		@Override
		public boolean test(IDeclaration t) {
			return !t.getClass().isAssignableFrom(this.parent);
		}
	}

	private List<IDeclaration> getCompilationUnitDeclarationsOfType(
			Class<? extends Object> declaration,
			ICompilationUnit compilationUnit) {
		ArrayList<IDeclaration> matchingDeclarations = new ArrayList<IDeclaration>(
				compilationUnit.getDeclarations());

		matchingDeclarations
				.removeIf(new ClassHierarchyMembershipPredicate(declaration));

		return matchingDeclarations;
	}

	private List<IDeclaration> getPackagePublicDeclarationsOfType(
			IPackage parentPackage, Class<? extends Object> declaration) {
		ArrayList<IDeclaration> matchingDeclarations = new ArrayList<IDeclaration>(
				parentPackage.getPublicDeclarations());

		matchingDeclarations
				.removeIf(new ClassHierarchyMembershipPredicate(declaration));

		return matchingDeclarations;
	}

	private List<IDeclaration> getPackagePrivateDeclarationsOfType(
			IPackage parentPackage, Class<? extends Object> declaration) {
		ArrayList<IDeclaration> matchingDeclarations = new ArrayList<IDeclaration>(
				parentPackage.getPrivateDeclarations());

		matchingDeclarations
				.removeIf(new ClassHierarchyMembershipPredicate(declaration));

		return matchingDeclarations;
	}

	@Before
	public void createSuts() {
		this.exampleSut = Factory.Create_Compilation_Unit(
				new File("res", "example.ads").toPath());
		this.mainSut = Factory
				.Create_Compilation_Unit(new File("res", "main.ads").toPath());
	}

	@Test
	public void testPackages() {

		List<IDeclaration> packageDeclarations = this
				.getCompilationUnitDeclarationsOfType(Package.class,
						this.exampleSut);

		assertEquals(3, packageDeclarations.size());

		this.checkPackage((IPackage) packageDeclarations.get(0), "Example",
				null);
		this.checkPackage((IPackage) packageDeclarations.get(1), "Inner_Pkg",
				"Example");
		this.checkPackage((IPackage) packageDeclarations.get(2),
				"Deeply_Nested", "Inner_Pkg");
	}

	private void checkPackage(IPackage packageToTest, String name,
			String parentName) {
		assertEquals(name, packageToTest.getName());
		if (parentName != null) {
			assertEquals(parentName, packageToTest.getParent().getName());
		} else {
			assertNull(packageToTest.getParent());
		}

	}

	private void checkSubprogram(ISubprogram subprogToTest, String name,
			int type, boolean isAbstract) {
		assertEquals(name, subprogToTest.getName());
		assertEquals(type, subprogToTest.getType());
		assertEquals(isAbstract, subprogToTest.isAbstract());
	}

	@Test
	public void testSubprograms() {
		List<IDeclaration> packageDeclarations = this
				.getCompilationUnitDeclarationsOfType(Package.class,
						this.exampleSut);

		// Example package
		List<IDeclaration> subprogramDeclarations = this
				.getPackagePublicDeclarationsOfType(
						(IPackage) packageDeclarations.get(0),
						Subprogram.class);

		assertEquals(2, subprogramDeclarations.size());
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
				"Procedure1", ISubprogram.PROCEDURE, false);
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
				"Function2", ISubprogram.FUNCTION, false);

		subprogramDeclarations = this.getPackagePrivateDeclarationsOfType(
				(IPackage) packageDeclarations.get(0), Subprogram.class);
		assertEquals(1, subprogramDeclarations.size());
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
				"Private_Func", ISubprogram.FUNCTION, false);

		// Inner_Pkg package
		subprogramDeclarations = this.getPackagePublicDeclarationsOfType(
				(IPackage) packageDeclarations.get(1), Subprogram.class);
		assertEquals(2, subprogramDeclarations.size());
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
				"Procedure2", ISubprogram.PROCEDURE, false);
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
				"Function1", ISubprogram.FUNCTION, false);

		// Deeply_Nested package
		subprogramDeclarations = this.getPackagePublicDeclarationsOfType(
				(IPackage) packageDeclarations.get(2), Subprogram.class);
		assertEquals(1, subprogramDeclarations.size());
		this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
				"Deep_Inside", ISubprogram.PROCEDURE, true);

	}

	@Test
	public void testProcedureOutsidePackage() {
		List<IDeclaration> subprogramDecls = this
				.getCompilationUnitDeclarationsOfType(Subprogram.class,
						this.mainSut);
		assertEquals(1, subprogramDecls.size());
		this.checkSubprogram((ISubprogram) subprogramDecls.get(0), "Main",
				ISubprogram.PROCEDURE, false);
	}

	@Test
	public void testCompilationUnits() {
		assertEquals("main", this.mainSut.getName());
		assertEquals("example", this.exampleSut.getName());
	}
}
