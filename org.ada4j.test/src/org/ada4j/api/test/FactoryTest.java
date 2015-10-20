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
import org.ada4j.internal.model.Package;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private ICompilationUnit sut;

	class ClassHierarchyMembershipPredicate implements Predicate<IDeclaration> {

		private Object parent;

		public ClassHierarchyMembershipPredicate(Object parent) {
			this.parent = parent;
		}

		@Override
		public boolean test(IDeclaration t) {
			return !t.getClass().isAssignableFrom(this.parent.getClass());
		}
	}

	private List<IDeclaration> getDeclarationsOfType(Object declaration) {
		ArrayList<IDeclaration> matchingDeclarations = new ArrayList<IDeclaration>(
				this.sut.getDeclarations());

		matchingDeclarations.removeIf(new ClassHierarchyMembershipPredicate(
				declaration));

		return matchingDeclarations;
	}

	@Before
	public void createSut() {
		this.sut = Factory.Create_Compilation_Unit(new File("res",
				"example.ads").toPath());
	}

	@Test
	public void testPackages() {

		List<IDeclaration> packageDeclarations = this
				.getDeclarationsOfType(new Package("Test"));

		assertEquals(3, packageDeclarations.size());

		IPackage examplePackage = (IPackage) packageDeclarations.get(0);
		assertEquals("Example", examplePackage.getName());
		assertNull(examplePackage.getParent());

		IPackage innerPkgPackage = (IPackage) packageDeclarations.get(1);
		assertEquals("Inner_Pkg", innerPkgPackage.getName());
		assertEquals("Example", innerPkgPackage.getParent().getName());

		IPackage deeplyNestedPackage = (IPackage) packageDeclarations.get(2);
		assertEquals("Deeply_Nested", deeplyNestedPackage.getName());
		assertEquals("Inner_Pkg", deeplyNestedPackage.getParent().getName());
	}
}
