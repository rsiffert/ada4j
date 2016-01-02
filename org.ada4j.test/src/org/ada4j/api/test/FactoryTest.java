package org.ada4j.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.List;

import org.ada4j.api.Factory;
import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private ICompilationUnit exampleSpec;
	private ICompilationUnit exampleBody;
	private ICompilationUnit mainSut;
	private ICompilationUnit renamedPackage;
	private ICompilationUnit genericDec;
	private ICompilationUnit genericInst;

	@Before
	public void createSuts() {
		this.exampleSpec = Factory.Create_Compilation_Unit(
				new File("res", "example.ads").toPath());
		this.exampleBody = Factory.Create_Compilation_Unit(
				new File("res", "example.adb").toPath());
		this.mainSut = Factory
				.Create_Compilation_Unit(new File("res", "main.ads").toPath());
		this.renamedPackage = Factory.Create_Compilation_Unit(
				new File("res", "renaming.ads").toPath());
		this.genericInst = Factory.Create_Compilation_Unit(
				new File("res", "generic_inst.ads").toPath());
		this.genericDec = Factory.Create_Compilation_Unit(
				new File("res", "generic_dec.ads").toPath());
	}

	@Test
	public void testPackagesDeclarations() {
		IPackage rootPackage = this.exampleSpec.getRootPackage();
		assertNull(this.exampleSpec.getMainSubprogram());

		this.checkPackage(rootPackage, "Example", null);

		List<IPackage> packageDeclarations = rootPackage.getPackages();
		assertEquals(3, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0), "Empty",
				"Example");
		this.checkPackage((IPackage) packageDeclarations.get(1), "Still_Empty",
				"Example");

		this.checkPackage((IPackage) packageDeclarations.get(2), "Inner_Pkg",
				"Example");

		packageDeclarations = packageDeclarations.get(2).getPackages();
		assertEquals(1, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0),
				"Deeply_Nested", "Inner_Pkg");

		// Renamed package
		assertEquals("Renaming",
				this.renamedPackage.getRootPackage().getName());

		// Generic package declaration
		assertEquals("Generic_Dec", this.genericDec.getRootPackage().getName());

		// Generic package instantiation
		assertEquals("Generic_Inst",
				this.genericInst.getRootPackage().getName());
	}

	@Test
	public void testPackagesBodies() {
		IPackage rootPackage = this.exampleBody.getRootPackage();
		assertNull(this.exampleBody.getMainSubprogram());

		this.checkPackage(rootPackage, "Example", null);

		List<IPackage> packageDeclarations = rootPackage.getPackages();
		assertEquals(2, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0), "Empty",
				"Example");

		this.checkPackage((IPackage) packageDeclarations.get(1), "Inner_Pkg",
				"Example");

		packageDeclarations = packageDeclarations.get(1).getPackages();
		assertEquals(1, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0),
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
			int type, boolean isAbstract, boolean isPrivate) {
		assertEquals(name, subprogToTest.getName());
		assertEquals(type, subprogToTest.getType());
		assertEquals(isAbstract, subprogToTest.isAbstract());
		assertEquals(isPrivate, subprogToTest.isPrivate());
	}

	@Test
	public void testSubprogramsDeclarations() {
		IPackage rootPackage = this.exampleSpec.getRootPackage();
		List<ISubprogram> subprogramDeclarations;

		// Example package
		subprogramDeclarations = rootPackage.getSubprograms();

		assertEquals(3, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure1",
				ISubprogram.PROCEDURE, false, false);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function2",
				ISubprogram.FUNCTION, false, false);
		this.checkSubprogram(subprogramDeclarations.get(2), "Private_Func",
				ISubprogram.FUNCTION, false, true);

		// Empty package
		IPackage emptyPackage = rootPackage.getPackages().get(0);
		subprogramDeclarations = emptyPackage.getSubprograms();
		assertEquals(0, subprogramDeclarations.size());

		// Still_Empty package
		IPackage stillEmptyPackage = rootPackage.getPackages().get(1);
		subprogramDeclarations = stillEmptyPackage.getSubprograms();
		assertEquals(0, subprogramDeclarations.size());

		// Inner_Pkg package
		IPackage innerPkgPackage = rootPackage.getPackages().get(2);
		subprogramDeclarations = innerPkgPackage.getSubprograms();
		assertEquals(2, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure2",
				ISubprogram.PROCEDURE, false, false);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function1",
				ISubprogram.FUNCTION, false, false);

		// Deeply_Nested package
		IPackage deeplyNestedPackage = innerPkgPackage.getPackages().get(0);
		subprogramDeclarations = deeplyNestedPackage.getSubprograms();
		assertEquals(1, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Deep_Inside",
				ISubprogram.PROCEDURE, true, false);

	}

	@Test
	public void testSubprogramsBodies() {
		IPackage rootPackage = this.exampleBody.getRootPackage();

		// Example package
		List<ISubprogram> subprogramDeclarations = rootPackage.getSubprograms();

		assertEquals(3, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure1",
				ISubprogram.PROCEDURE, false, false);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function2",
				ISubprogram.FUNCTION, false, false);
		this.checkSubprogram(subprogramDeclarations.get(2), "Private_Func",
				ISubprogram.FUNCTION, false, false);

		// Inner_Pkg package
		List<IPackage> packageDeclarations = rootPackage.getPackages();
		subprogramDeclarations = packageDeclarations.get(1).getSubprograms();
		assertEquals(2, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure2",
				ISubprogram.PROCEDURE, false, false);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function1",
				ISubprogram.FUNCTION, false, false);

		// Deeply_Nested package
		packageDeclarations = packageDeclarations.get(1).getPackages();
		subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		assertEquals(0, subprogramDeclarations.size());
	}

	@Test
	public void testProcedureOutsidePackage() {
		ISubprogram mainSubprogram = this.mainSut.getMainSubprogram();
		assertNull(this.mainSut.getRootPackage());
		this.checkSubprogram(mainSubprogram, "Main", ISubprogram.PROCEDURE,
				false, false);
	}

	@Test
	public void testCompilationUnits() {
		assertEquals("main", this.mainSut.getName());
		assertEquals("example", this.exampleSpec.getName());
	}
}
