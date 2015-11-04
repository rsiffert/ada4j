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

	@Before
	public void createSuts() {
		this.exampleSpec = Factory.Create_Compilation_Unit(
				new File("res", "example.ads").toPath());
		this.exampleBody = Factory.Create_Compilation_Unit(
				new File("res", "example.adb").toPath());
		this.mainSut = Factory
				.Create_Compilation_Unit(new File("res", "main.ads").toPath());
	}

	private void testPackagesFor(ICompilationUnit example) {
		List<IPackage> packageDeclarations = example.getPackages();

		assertEquals(1, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0), "Example",
				null);

		packageDeclarations = packageDeclarations.get(0).getPackages();
		assertEquals(1, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0), "Inner_Pkg",
				"Example");

		packageDeclarations = packageDeclarations.get(0).getPackages();
		assertEquals(1, packageDeclarations.size());
		this.checkPackage((IPackage) packageDeclarations.get(0),
				"Deeply_Nested", "Inner_Pkg");
	}

	@Test
	public void testPackagesDeclarations() {
		this.testPackagesFor(this.exampleSpec);
	}

	@Test
	public void testPackagesBodies() {
		this.testPackagesFor(this.exampleBody);
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
		 List<IPackage> packageDeclarations = this.exampleSpec.getPackages();
		
		 // Example package
		 List<ISubprogram> subprogramDeclarations = packageDeclarations.get(0)
		 .getSubprograms();
		
		 assertEquals(3, subprogramDeclarations.size());
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
		 "Procedure1", ISubprogram.PROCEDURE, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
		 "Function2", ISubprogram.FUNCTION, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(2),
		 "Private_Func", ISubprogram.FUNCTION, false, true);
		
		 // Inner_Pkg package
		 packageDeclarations = packageDeclarations.get(0).getPackages();
		 subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		 assertEquals(2, subprogramDeclarations.size());
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
		 "Procedure2", ISubprogram.PROCEDURE, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
		 "Function1", ISubprogram.FUNCTION, false, false);
		
		 // Deeply_Nested package
		 packageDeclarations = packageDeclarations.get(0).getPackages();
		 subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		 assertEquals(1, subprogramDeclarations.size());
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
		 "Deep_Inside", ISubprogram.PROCEDURE, true, false);

	}

	@Test
	public void testSubprogramsBodies() {
		 List<IPackage> packageDeclarations = this.exampleBody.getPackages();
			
		 // Example package
		 List<ISubprogram> subprogramDeclarations = packageDeclarations.get(0)
		 .getSubprograms();
		
		 assertEquals(3, subprogramDeclarations.size());
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
		 "Procedure1", ISubprogram.PROCEDURE, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
		 "Function2", ISubprogram.FUNCTION, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(2),
		 "Private_Func", ISubprogram.FUNCTION, false, false);
		
		 // Inner_Pkg package
		 packageDeclarations = packageDeclarations.get(0).getPackages();
		 subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		 assertEquals(2, subprogramDeclarations.size());
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(0),
		 "Procedure2", ISubprogram.PROCEDURE, false, false);
		 this.checkSubprogram((ISubprogram) subprogramDeclarations.get(1),
		 "Function1", ISubprogram.FUNCTION, false, false);
		
		 // Deeply_Nested package
		 packageDeclarations = packageDeclarations.get(0).getPackages();
		 subprogramDeclarations = packageDeclarations.get(0).getSubprograms();
		 assertEquals(0, subprogramDeclarations.size());
	}

	@Test
	public void testProcedureOutsidePackage() {
		List<ISubprogram> subprogramDecls = this.mainSut.getSubprograms();
		assertEquals(1, subprogramDecls.size());
		this.checkSubprogram((ISubprogram) subprogramDecls.get(0), "Main",
				ISubprogram.PROCEDURE, false, false);
	}

	@Test
	public void testCompilationUnits() {
		assertEquals("main", this.mainSut.getName());
		assertEquals("example", this.exampleSpec.getName());
	}
}
