package org.ada4j.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.ada4j.api.Factory;
import org.ada4j.api.model.ICompilationUnit;
import org.ada4j.api.model.IPackage;
import org.ada4j.api.model.ISubprogram;
import org.ada4j.api.model.IType;
import org.ada4j.internal.model.Type;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private ICompilationUnit exampleSpec;
	private ICompilationUnit exampleBody;
	private ICompilationUnit mainSut;
	private ICompilationUnit renamedPkg;
	private ICompilationUnit genericDecPkg;
	private ICompilationUnit genericInstPkg;
	private ICompilationUnit renamedProc;
	private ICompilationUnit genericDecProc;
	private ICompilationUnit genericInstProc;

	@Before
	public void createSuts() {
		this.exampleSpec = Factory
				.CreateCompilationUnit(new File("res", "example.ads").toPath());
		this.exampleBody = Factory
				.CreateCompilationUnit(new File("res", "example.adb").toPath());
		this.mainSut = Factory
				.CreateCompilationUnit(new File("res", "main.ads").toPath());
		this.renamedPkg = Factory.CreateCompilationUnit(
				new File("res", "renaming_pkg.ads").toPath());
		this.genericInstPkg = Factory.CreateCompilationUnit(
				new File("res", "generic_inst_pkg.ads").toPath());
		this.genericDecPkg = Factory.CreateCompilationUnit(
				new File("res", "generic_dec_pkg.ads").toPath());
		this.renamedProc = Factory.CreateCompilationUnit(
				new File("res", "renaming_proc.ads").toPath());
		this.genericInstProc = Factory.CreateCompilationUnit(
				new File("res", "generic_inst_proc.ads").toPath());
		this.genericDecProc = Factory.CreateCompilationUnit(
				new File("res", "generic_dec_proc.ads").toPath());
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
		assertEquals("Renaming_Pkg",
				this.renamedPkg.getRootPackage().getName());

		// Generic package declaration
		assertEquals("Generic_Dec_Pkg",
				this.genericDecPkg.getRootPackage().getName());

		// Generic package instantiation
		assertEquals("Generic_Inst_Pkg",
				this.genericInstPkg.getRootPackage().getName());
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
			int type, boolean isAbstract, boolean isPrivate,
			String returnTypeName, List<IType> args) {
		assertEquals(name, subprogToTest.getName());
		assertEquals(type, subprogToTest.getType());
		assertEquals(args.size(), subprogToTest.getArguments().size());
		for (int argIdx = 0; argIdx < args.size(); argIdx++) {
			assertEquals(args.get(argIdx).getName(),
					subprogToTest.getArguments().get(argIdx).getName());
		}

		assertEquals(isAbstract, subprogToTest.isAbstract());
		assertEquals(isPrivate, subprogToTest.isPrivate());
		if (returnTypeName != null) {
			assertEquals(returnTypeName,
					subprogToTest.getReturnType().getName());
		} else {
			assertNull(subprogToTest.getReturnType());
		}
	}

	@Test
	public void testSubprogramsDeclarations() {
		IPackage rootPackage = this.exampleSpec.getRootPackage();
		List<ISubprogram> subprogramDeclarations;
		List<IType> expectedArgs;
		List<IType> noArgs = new ArrayList<IType>();

		// Example package
		subprogramDeclarations = rootPackage.getSubprograms();

		assertEquals(3, subprogramDeclarations.size());
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("Integer", false));
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure1",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function2",
				ISubprogram.FUNCTION, false, false, "Positive", noArgs);
		this.checkSubprogram(subprogramDeclarations.get(2), "Private_Func",
				ISubprogram.FUNCTION, false, true,
				"not null access constant Integer", noArgs);

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
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("T_Toto", false));
		expectedArgs.add(new Type("Boolean", false));
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure2",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function1",
				ISubprogram.FUNCTION, false, false, "access function Boolean",
				noArgs);

		// Deeply_Nested package
		IPackage deeplyNestedPackage = innerPkgPackage.getPackages().get(0);
		subprogramDeclarations = deeplyNestedPackage.getSubprograms();
		assertEquals(1, subprogramDeclarations.size());
		this.checkSubprogram(subprogramDeclarations.get(0), "Deep_Inside",
				ISubprogram.PROCEDURE, true, false, null, noArgs);

	}

	@Test
	public void testSubprogramsBodies() {
		IPackage rootPackage = this.exampleBody.getRootPackage();
		List<IType> expectedArgs;
		List<IType> noArgs = new ArrayList<IType>();

		// Example package
		List<ISubprogram> subprogramDeclarations = rootPackage.getSubprograms();

		assertEquals(3, subprogramDeclarations.size());
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("Integer", false));
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure1",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);
		this.checkSubprogram(subprogramDeclarations.get(1), "Function2",
				ISubprogram.FUNCTION, false, false, "Positive", noArgs);
		this.checkSubprogram(subprogramDeclarations.get(2), "Private_Func",
				ISubprogram.FUNCTION, false, false,
				"not null access constant Integer", noArgs);

		// Inner_Pkg package
		List<IPackage> packageDeclarations = rootPackage.getPackages();
		subprogramDeclarations = packageDeclarations.get(1).getSubprograms();
		assertEquals(2, subprogramDeclarations.size());
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("T_Toto", false));
		expectedArgs.add(new Type("Boolean", false));
		this.checkSubprogram(subprogramDeclarations.get(0), "Procedure2",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("not null access constant Integer", false));
		this.checkSubprogram(subprogramDeclarations.get(1), "Function3",
				ISubprogram.FUNCTION, false, false,
				"access protected procedure", expectedArgs);

		// Deeply_Nested package
		packageDeclarations = packageDeclarations.get(1).getPackages();
		subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		assertEquals(0, subprogramDeclarations.size());
	}

	@Test
	public void testMainSubprograms() {
		List<IType> expectedArgs;
		List<IType> noArgs = new ArrayList<IType>();

		ISubprogram mainSubprogram = this.mainSut.getMainSubprogram();
		assertNull(this.mainSut.getRootPackage());
		this.checkSubprogram(mainSubprogram, "Main", ISubprogram.PROCEDURE,
				false, false, null, noArgs);

		mainSubprogram = this.renamedProc.getMainSubprogram();
		assertNull(this.mainSut.getRootPackage());
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("Character", false));
		this.checkSubprogram(mainSubprogram, "Renaming_Proc",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);

		mainSubprogram = this.genericDecProc.getMainSubprogram();
		expectedArgs = new ArrayList<IType>();
		expectedArgs.add(new Type("Character", false));
		assertNull(this.mainSut.getRootPackage());
		this.checkSubprogram(mainSubprogram, "Generic_Dec_Proc",
				ISubprogram.PROCEDURE, false, false, null, expectedArgs);

		mainSubprogram = this.genericInstProc.getMainSubprogram();
		assertNull(this.mainSut.getRootPackage());
		this.checkSubprogram(mainSubprogram, "Generic_Inst_Proc",
				ISubprogram.PROCEDURE, false, false, null, noArgs);
	}

	@Test
	public void testCompilationUnits() {
		assertEquals("main", this.mainSut.getName());
		assertEquals("example", this.exampleSpec.getName());
	}
}
