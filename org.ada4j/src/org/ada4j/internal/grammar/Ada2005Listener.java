// Generated from D:\Users\RS\workspace_ada\ada4j\org.ada4j\src\org\ada4j\internal\grammar\Ada2005.g4 by ANTLR 4.1
package org.ada4j.internal.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ada2005Parser}.
 */
public interface Ada2005Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(@NotNull Ada2005Parser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(@NotNull Ada2005Parser.Exception_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#array_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterArray_aggregate(@NotNull Ada2005Parser.Array_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#array_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitArray_aggregate(@NotNull Ada2005Parser.Array_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_and_result_profile}.
	 * @param ctx the parse tree
	 */
	void enterParameter_and_result_profile(@NotNull Ada2005Parser.Parameter_and_result_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_and_result_profile}.
	 * @param ctx the parse tree
	 */
	void exitParameter_and_result_profile(@NotNull Ada2005Parser.Parameter_and_result_profileContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#library_item}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_item(@NotNull Ada2005Parser.Library_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#library_item}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_item(@NotNull Ada2005Parser.Library_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull Ada2005Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull Ada2005Parser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#signed_integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterSigned_integer_type_definition(@NotNull Ada2005Parser.Signed_integer_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#signed_integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitSigned_integer_type_definition(@NotNull Ada2005Parser.Signed_integer_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#procedure_or_entry_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_or_entry_call(@NotNull Ada2005Parser.Procedure_or_entry_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#procedure_or_entry_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_or_entry_call(@NotNull Ada2005Parser.Procedure_or_entry_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstrained_array_definition(@NotNull Ada2005Parser.Constrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#constrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstrained_array_definition(@NotNull Ada2005Parser.Constrained_array_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_declaration_default}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration_default(@NotNull Ada2005Parser.Component_declaration_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_declaration_default}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration_default(@NotNull Ada2005Parser.Component_declaration_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#declarative_part}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_part(@NotNull Ada2005Parser.Declarative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#declarative_part}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_part(@NotNull Ada2005Parser.Declarative_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#explicit_dereference}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_dereference(@NotNull Ada2005Parser.Explicit_dereferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#explicit_dereference}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_dereference(@NotNull Ada2005Parser.Explicit_dereferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#extended_return_statement}.
	 * @param ctx the parse tree
	 */
	void enterExtended_return_statement(@NotNull Ada2005Parser.Extended_return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#extended_return_statement}.
	 * @param ctx the parse tree
	 */
	void exitExtended_return_statement(@NotNull Ada2005Parser.Extended_return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subtype_mark}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_mark(@NotNull Ada2005Parser.Subtype_markContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subtype_mark}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_mark(@NotNull Ada2005Parser.Subtype_markContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#derived_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterDerived_type_definition(@NotNull Ada2005Parser.Derived_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#derived_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitDerived_type_definition(@NotNull Ada2005Parser.Derived_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_declaration(@NotNull Ada2005Parser.Generic_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_declaration(@NotNull Ada2005Parser.Generic_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#select_alternative}.
	 * @param ctx the parse tree
	 */
	void enterSelect_alternative(@NotNull Ada2005Parser.Select_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#select_alternative}.
	 * @param ctx the parse tree
	 */
	void exitSelect_alternative(@NotNull Ada2005Parser.Select_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#conditional_entry_call}.
	 * @param ctx the parse tree
	 */
	void enterConditional_entry_call(@NotNull Ada2005Parser.Conditional_entry_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#conditional_entry_call}.
	 * @param ctx the parse tree
	 */
	void exitConditional_entry_call(@NotNull Ada2005Parser.Conditional_entry_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void enterObject_declaration(@NotNull Ada2005Parser.Object_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#object_declaration}.
	 * @param ctx the parse tree
	 */
	void exitObject_declaration(@NotNull Ada2005Parser.Object_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterOrdinary_fixed_point_definition(@NotNull Ada2005Parser.Ordinary_fixed_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitOrdinary_fixed_point_definition(@NotNull Ada2005Parser.Ordinary_fixed_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#positional_array_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterPositional_array_aggregate(@NotNull Ada2005Parser.Positional_array_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#positional_array_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitPositional_array_aggregate(@NotNull Ada2005Parser.Positional_array_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#range_attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterRange_attribute_designator(@NotNull Ada2005Parser.Range_attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#range_attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitRange_attribute_designator(@NotNull Ada2005Parser.Range_attribute_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(@NotNull Ada2005Parser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(@NotNull Ada2005Parser.Numeric_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#accept_statement}.
	 * @param ctx the parse tree
	 */
	void enterAccept_statement(@NotNull Ada2005Parser.Accept_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#accept_statement}.
	 * @param ctx the parse tree
	 */
	void exitAccept_statement(@NotNull Ada2005Parser.Accept_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#package_body_stub}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_stub(@NotNull Ada2005Parser.Package_body_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#package_body_stub}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_stub(@NotNull Ada2005Parser.Package_body_stubContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#enumeration_representation_clause}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_representation_clause(@NotNull Ada2005Parser.Enumeration_representation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#enumeration_representation_clause}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_representation_clause(@NotNull Ada2005Parser.Enumeration_representation_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#private_extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_extension_declaration(@NotNull Ada2005Parser.Private_extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#private_extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_extension_declaration(@NotNull Ada2005Parser.Private_extension_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_renaming_declaration(@NotNull Ada2005Parser.Subprogram_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_renaming_declaration(@NotNull Ada2005Parser.Subprogram_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subtype_access_or_array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_access_or_array_type_definition(@NotNull Ada2005Parser.Subtype_access_or_array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subtype_access_or_array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_access_or_array_type_definition(@NotNull Ada2005Parser.Subtype_access_or_array_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_operator_symbol}.
	 * @param ctx the parse tree
	 */
	void enterDefining_operator_symbol(@NotNull Ada2005Parser.Defining_operator_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_operator_symbol}.
	 * @param ctx the parse tree
	 */
	void exitDefining_operator_symbol(@NotNull Ada2005Parser.Defining_operator_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_element_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtected_element_declaration(@NotNull Ada2005Parser.Protected_element_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_element_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtected_element_declaration(@NotNull Ada2005Parser.Protected_element_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#mod_clause}.
	 * @param ctx the parse tree
	 */
	void enterMod_clause(@NotNull Ada2005Parser.Mod_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#mod_clause}.
	 * @param ctx the parse tree
	 */
	void exitMod_clause(@NotNull Ada2005Parser.Mod_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#composite_constraint}.
	 * @param ctx the parse tree
	 */
	void enterComposite_constraint(@NotNull Ada2005Parser.Composite_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#composite_constraint}.
	 * @param ctx the parse tree
	 */
	void exitComposite_constraint(@NotNull Ada2005Parser.Composite_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_type_definition(@NotNull Ada2005Parser.Access_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#access_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_type_definition(@NotNull Ada2005Parser.Access_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_package_actual_part}.
	 * @param ctx the parse tree
	 */
	void enterFormal_package_actual_part(@NotNull Ada2005Parser.Formal_package_actual_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_package_actual_part}.
	 * @param ctx the parse tree
	 */
	void exitFormal_package_actual_part(@NotNull Ada2005Parser.Formal_package_actual_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_call_alternative}.
	 * @param ctx the parse tree
	 */
	void enterEntry_call_alternative(@NotNull Ada2005Parser.Entry_call_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_call_alternative}.
	 * @param ctx the parse tree
	 */
	void exitEntry_call_alternative(@NotNull Ada2005Parser.Entry_call_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_designator}.
	 * @param ctx the parse tree
	 */
	void enterDefining_designator(@NotNull Ada2005Parser.Defining_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_designator}.
	 * @param ctx the parse tree
	 */
	void exitDefining_designator(@NotNull Ada2005Parser.Defining_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(@NotNull Ada2005Parser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(@NotNull Ada2005Parser.Goto_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#real_range_specification}.
	 * @param ctx the parse tree
	 */
	void enterReal_range_specification(@NotNull Ada2005Parser.Real_range_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#real_range_specification}.
	 * @param ctx the parse tree
	 */
	void exitReal_range_specification(@NotNull Ada2005Parser.Real_range_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_type_declaration_definition}.
	 * @param ctx the parse tree
	 */
	void enterTask_type_declaration_definition(@NotNull Ada2005Parser.Task_type_declaration_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_type_declaration_definition}.
	 * @param ctx the parse tree
	 */
	void exitTask_type_declaration_definition(@NotNull Ada2005Parser.Task_type_declaration_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_fixed_point_definition(@NotNull Ada2005Parser.Decimal_fixed_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_fixed_point_definition(@NotNull Ada2005Parser.Decimal_fixed_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(@NotNull Ada2005Parser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(@NotNull Ada2005Parser.Select_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#full_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFull_type_declaration(@NotNull Ada2005Parser.Full_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#full_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFull_type_declaration(@NotNull Ada2005Parser.Full_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull Ada2005Parser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull Ada2005Parser.DesignatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#requeue_statement}.
	 * @param ctx the parse tree
	 */
	void enterRequeue_statement(@NotNull Ada2005Parser.Requeue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#requeue_statement}.
	 * @param ctx the parse tree
	 */
	void exitRequeue_statement(@NotNull Ada2005Parser.Requeue_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#explicit_dereference_component}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_dereference_component(@NotNull Ada2005Parser.Explicit_dereference_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#explicit_dereference_component}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_dereference_component(@NotNull Ada2005Parser.Explicit_dereference_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#nonlimited_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterNonlimited_with_clause(@NotNull Ada2005Parser.Nonlimited_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#nonlimited_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitNonlimited_with_clause(@NotNull Ada2005Parser.Nonlimited_with_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_type_definition(@NotNull Ada2005Parser.Enumeration_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_type_definition(@NotNull Ada2005Parser.Enumeration_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_subtype_definition(@NotNull Ada2005Parser.Discrete_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_subtype_definition(@NotNull Ada2005Parser.Discrete_subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_specification_default}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_specification_default(@NotNull Ada2005Parser.Discriminant_specification_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_specification_default}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_specification_default(@NotNull Ada2005Parser.Discriminant_specification_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull Ada2005Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull Ada2005Parser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#selected_component}.
	 * @param ctx the parse tree
	 */
	void enterSelected_component(@NotNull Ada2005Parser.Selected_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#selected_component}.
	 * @param ctx the parse tree
	 */
	void exitSelected_component(@NotNull Ada2005Parser.Selected_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplying_operator(@NotNull Ada2005Parser.Multiplying_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#multiplying_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplying_operator(@NotNull Ada2005Parser.Multiplying_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull Ada2005Parser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull Ada2005Parser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull Ada2005Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Ada2005Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#access_to_object_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_to_object_definition(@NotNull Ada2005Parser.Access_to_object_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#access_to_object_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_to_object_definition(@NotNull Ada2005Parser.Access_to_object_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parent_unit_name}.
	 * @param ctx the parse tree
	 */
	void enterParent_unit_name(@NotNull Ada2005Parser.Parent_unit_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parent_unit_name}.
	 * @param ctx the parse tree
	 */
	void exitParent_unit_name(@NotNull Ada2005Parser.Parent_unit_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#handled_sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterHandled_sequence_of_statements(@NotNull Ada2005Parser.Handled_sequence_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#handled_sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitHandled_sequence_of_statements(@NotNull Ada2005Parser.Handled_sequence_of_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_formal_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_formal_parameter_declaration(@NotNull Ada2005Parser.Generic_formal_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_formal_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_formal_parameter_declaration(@NotNull Ada2005Parser.Generic_formal_parameter_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#pragma_argument_association}.
	 * @param ctx the parse tree
	 */
	void enterPragma_argument_association(@NotNull Ada2005Parser.Pragma_argument_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#pragma_argument_association}.
	 * @param ctx the parse tree
	 */
	void exitPragma_argument_association(@NotNull Ada2005Parser.Pragma_argument_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_type_definition(@NotNull Ada2005Parser.Formal_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_type_definition(@NotNull Ada2005Parser.Formal_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_profile}.
	 * @param ctx the parse tree
	 */
	void enterParameter_profile(@NotNull Ada2005Parser.Parameter_profileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_profile}.
	 * @param ctx the parse tree
	 */
	void exitParameter_profile(@NotNull Ada2005Parser.Parameter_profileContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subtype_definition(@NotNull Ada2005Parser.Index_subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#index_subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subtype_definition(@NotNull Ada2005Parser.Index_subtype_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterDefining_identifier_list(@NotNull Ada2005Parser.Defining_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitDefining_identifier_list(@NotNull Ada2005Parser.Defining_identifier_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#use_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_type_clause(@NotNull Ada2005Parser.Use_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#use_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_type_clause(@NotNull Ada2005Parser.Use_type_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(@NotNull Ada2005Parser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(@NotNull Ada2005Parser.Type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_instantiation(@NotNull Ada2005Parser.Generic_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_instantiation(@NotNull Ada2005Parser.Generic_instantiationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSequence_of_statements(@NotNull Ada2005Parser.Sequence_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#sequence_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSequence_of_statements(@NotNull Ada2005Parser.Sequence_of_statementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_subprogram_declaration(@NotNull Ada2005Parser.Formal_subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_subprogram_declaration(@NotNull Ada2005Parser.Formal_subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#proper_body}.
	 * @param ctx the parse tree
	 */
	void enterProper_body(@NotNull Ada2005Parser.Proper_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#proper_body}.
	 * @param ctx the parse tree
	 */
	void exitProper_body(@NotNull Ada2005Parser.Proper_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#private_part}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_part(@NotNull Ada2005Parser.Private_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#private_part}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_part(@NotNull Ada2005Parser.Private_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_body_stub}.
	 * @param ctx the parse tree
	 */
	void enterTask_body_stub(@NotNull Ada2005Parser.Task_body_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_body_stub}.
	 * @param ctx the parse tree
	 */
	void exitTask_body_stub(@NotNull Ada2005Parser.Task_body_stubContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_body_stub}.
	 * @param ctx the parse tree
	 */
	void enterProtected_body_stub(@NotNull Ada2005Parser.Protected_body_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_body_stub}.
	 * @param ctx the parse tree
	 */
	void exitProtected_body_stub(@NotNull Ada2005Parser.Protected_body_stubContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#selective_accept}.
	 * @param ctx the parse tree
	 */
	void enterSelective_accept(@NotNull Ada2005Parser.Selective_acceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#selective_accept}.
	 * @param ctx the parse tree
	 */
	void exitSelective_accept(@NotNull Ada2005Parser.Selective_acceptContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#at_clause}.
	 * @param ctx the parse tree
	 */
	void enterAt_clause(@NotNull Ada2005Parser.At_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#at_clause}.
	 * @param ctx the parse tree
	 */
	void exitAt_clause(@NotNull Ada2005Parser.At_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(@NotNull Ada2005Parser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(@NotNull Ada2005Parser.Package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(@NotNull Ada2005Parser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(@NotNull Ada2005Parser.Logical_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(@NotNull Ada2005Parser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(@NotNull Ada2005Parser.VariantContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#triggering_alternative}.
	 * @param ctx the parse tree
	 */
	void enterTriggering_alternative(@NotNull Ada2005Parser.Triggering_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#triggering_alternative}.
	 * @param ctx the parse tree
	 */
	void exitTriggering_alternative(@NotNull Ada2005Parser.Triggering_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull Ada2005Parser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull Ada2005Parser.Block_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_concrete_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_concrete_subprogram_declaration(@NotNull Ada2005Parser.Formal_concrete_subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_concrete_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_concrete_subprogram_declaration(@NotNull Ada2005Parser.Formal_concrete_subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#variant_part}.
	 * @param ctx the parse tree
	 */
	void enterVariant_part(@NotNull Ada2005Parser.Variant_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#variant_part}.
	 * @param ctx the parse tree
	 */
	void exitVariant_part(@NotNull Ada2005Parser.Variant_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#attribute_reference_component}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference_component(@NotNull Ada2005Parser.Attribute_reference_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#attribute_reference_component}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference_component(@NotNull Ada2005Parser.Attribute_reference_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(@NotNull Ada2005Parser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(@NotNull Ada2005Parser.Raise_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtected_type_declaration(@NotNull Ada2005Parser.Protected_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtected_type_declaration(@NotNull Ada2005Parser.Protected_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_association}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_association(@NotNull Ada2005Parser.Generic_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_association}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_association(@NotNull Ada2005Parser.Generic_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#statement_identifier}.
	 * @param ctx the parse tree
	 */
	void enterStatement_identifier(@NotNull Ada2005Parser.Statement_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#statement_identifier}.
	 * @param ctx the parse tree
	 */
	void exitStatement_identifier(@NotNull Ada2005Parser.Statement_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_declaration(@NotNull Ada2005Parser.Subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_declaration(@NotNull Ada2005Parser.Subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_index_specification}.
	 * @param ctx the parse tree
	 */
	void enterEntry_index_specification(@NotNull Ada2005Parser.Entry_index_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_index_specification}.
	 * @param ctx the parse tree
	 */
	void exitEntry_index_specification(@NotNull Ada2005Parser.Entry_index_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(@NotNull Ada2005Parser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(@NotNull Ada2005Parser.PragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#floating_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_definition(@NotNull Ada2005Parser.Floating_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#floating_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_definition(@NotNull Ada2005Parser.Floating_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#abort_statement}.
	 * @param ctx the parse tree
	 */
	void enterAbort_statement(@NotNull Ada2005Parser.Abort_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#abort_statement}.
	 * @param ctx the parse tree
	 */
	void exitAbort_statement(@NotNull Ada2005Parser.Abort_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_indication(@NotNull Ada2005Parser.Subtype_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subtype_indication}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_indication(@NotNull Ada2005Parser.Subtype_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_definition}.
	 * @param ctx the parse tree
	 */
	void enterTask_definition(@NotNull Ada2005Parser.Task_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_definition}.
	 * @param ctx the parse tree
	 */
	void exitTask_definition(@NotNull Ada2005Parser.Task_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_range(@NotNull Ada2005Parser.Discrete_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discrete_range}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_range(@NotNull Ada2005Parser.Discrete_rangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification(@NotNull Ada2005Parser.Parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification(@NotNull Ada2005Parser.Parameter_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull Ada2005Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull Ada2005Parser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_program_unit_name}.
	 * @param ctx the parse tree
	 */
	void enterDefining_program_unit_name(@NotNull Ada2005Parser.Defining_program_unit_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_program_unit_name}.
	 * @param ctx the parse tree
	 */
	void exitDefining_program_unit_name(@NotNull Ada2005Parser.Defining_program_unit_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#real_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterReal_type_definition(@NotNull Ada2005Parser.Real_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#real_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitReal_type_definition(@NotNull Ada2005Parser.Real_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#overriding_indicator}.
	 * @param ctx the parse tree
	 */
	void enterOverriding_indicator(@NotNull Ada2005Parser.Overriding_indicatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#overriding_indicator}.
	 * @param ctx the parse tree
	 */
	void exitOverriding_indicator(@NotNull Ada2005Parser.Overriding_indicatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_item}.
	 * @param ctx the parse tree
	 */
	void enterComponent_item(@NotNull Ada2005Parser.Component_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_item}.
	 * @param ctx the parse tree
	 */
	void exitComponent_item(@NotNull Ada2005Parser.Component_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_subprogram_declaration(@NotNull Ada2005Parser.Abstract_subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_subprogram_declaration(@NotNull Ada2005Parser.Abstract_subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#simple_return_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_return_statement(@NotNull Ada2005Parser.Simple_return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#simple_return_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_return_statement(@NotNull Ada2005Parser.Simple_return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterEntry_call_statement(@NotNull Ada2005Parser.Entry_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitEntry_call_statement(@NotNull Ada2005Parser.Entry_call_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#delay_relative_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelay_relative_statement(@NotNull Ada2005Parser.Delay_relative_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#delay_relative_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelay_relative_statement(@NotNull Ada2005Parser.Delay_relative_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#restriction_parameter_argument}.
	 * @param ctx the parse tree
	 */
	void enterRestriction_parameter_argument(@NotNull Ada2005Parser.Restriction_parameter_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#restriction_parameter_argument}.
	 * @param ctx the parse tree
	 */
	void exitRestriction_parameter_argument(@NotNull Ada2005Parser.Restriction_parameter_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#digits_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDigits_constraint(@NotNull Ada2005Parser.Digits_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#digits_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDigits_constraint(@NotNull Ada2005Parser.Digits_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_definition}.
	 * @param ctx the parse tree
	 */
	void enterComponent_definition(@NotNull Ada2005Parser.Component_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_definition}.
	 * @param ctx the parse tree
	 */
	void exitComponent_definition(@NotNull Ada2005Parser.Component_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#unknown_discriminant_part}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_discriminant_part(@NotNull Ada2005Parser.Unknown_discriminant_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#unknown_discriminant_part}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_discriminant_part(@NotNull Ada2005Parser.Unknown_discriminant_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#terminate_alternative}.
	 * @param ctx the parse tree
	 */
	void enterTerminate_alternative(@NotNull Ada2005Parser.Terminate_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#terminate_alternative}.
	 * @param ctx the parse tree
	 */
	void exitTerminate_alternative(@NotNull Ada2005Parser.Terminate_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#known_discriminant_part}.
	 * @param ctx the parse tree
	 */
	void enterKnown_discriminant_part(@NotNull Ada2005Parser.Known_discriminant_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#known_discriminant_part}.
	 * @param ctx the parse tree
	 */
	void exitKnown_discriminant_part(@NotNull Ada2005Parser.Known_discriminant_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_component_association_list}.
	 * @param ctx the parse tree
	 */
	void enterRecord_component_association_list(@NotNull Ada2005Parser.Record_component_association_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_component_association_list}.
	 * @param ctx the parse tree
	 */
	void exitRecord_component_association_list(@NotNull Ada2005Parser.Record_component_association_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_discrete_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_discrete_type_definition(@NotNull Ada2005Parser.Formal_discrete_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_discrete_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_discrete_type_definition(@NotNull Ada2005Parser.Formal_discrete_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_access_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_access_type_definition(@NotNull Ada2005Parser.Formal_access_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_access_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_access_type_definition(@NotNull Ada2005Parser.Formal_access_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_extension_part}.
	 * @param ctx the parse tree
	 */
	void enterRecord_extension_part(@NotNull Ada2005Parser.Record_extension_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_extension_part}.
	 * @param ctx the parse tree
	 */
	void exitRecord_extension_part(@NotNull Ada2005Parser.Record_extension_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRenaming_declaration(@NotNull Ada2005Parser.Renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRenaming_declaration(@NotNull Ada2005Parser.Renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_part(@NotNull Ada2005Parser.Actual_parameter_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#actual_parameter_part}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_part(@NotNull Ada2005Parser.Actual_parameter_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_part}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_part(@NotNull Ada2005Parser.Discriminant_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_part}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_part(@NotNull Ada2005Parser.Discriminant_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call_statement(@NotNull Ada2005Parser.Procedure_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#procedure_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call_statement(@NotNull Ada2005Parser.Procedure_call_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#interface_and_record_extension_specification}.
	 * @param ctx the parse tree
	 */
	void enterInterface_and_record_extension_specification(@NotNull Ada2005Parser.Interface_and_record_extension_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#interface_and_record_extension_specification}.
	 * @param ctx the parse tree
	 */
	void exitInterface_and_record_extension_specification(@NotNull Ada2005Parser.Interface_and_record_extension_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_modular_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_modular_type_definition(@NotNull Ada2005Parser.Formal_modular_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_modular_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_modular_type_definition(@NotNull Ada2005Parser.Formal_modular_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Ada2005Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Ada2005Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull Ada2005Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull Ada2005Parser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_body}.
	 * @param ctx the parse tree
	 */
	void enterTask_body(@NotNull Ada2005Parser.Task_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_body}.
	 * @param ctx the parse tree
	 */
	void exitTask_body(@NotNull Ada2005Parser.Task_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#use_package_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_package_clause(@NotNull Ada2005Parser.Use_package_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#use_package_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_package_clause(@NotNull Ada2005Parser.Use_package_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_character_literal}.
	 * @param ctx the parse tree
	 */
	void enterDefining_character_literal(@NotNull Ada2005Parser.Defining_character_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_character_literal}.
	 * @param ctx the parse tree
	 */
	void exitDefining_character_literal(@NotNull Ada2005Parser.Defining_character_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(@NotNull Ada2005Parser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(@NotNull Ada2005Parser.Context_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_subprogram_declaration(@NotNull Ada2005Parser.Generic_subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_subprogram_declaration(@NotNull Ada2005Parser.Generic_subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_specification_default}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specification_default(@NotNull Ada2005Parser.Parameter_specification_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_specification_default}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specification_default(@NotNull Ada2005Parser.Parameter_specification_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_specification(@NotNull Ada2005Parser.Subprogram_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_specification}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_specification(@NotNull Ada2005Parser.Subprogram_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#unary_adding_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_adding_operator(@NotNull Ada2005Parser.Unary_adding_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#unary_adding_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_adding_operator(@NotNull Ada2005Parser.Unary_adding_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_formal_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_formal_part(@NotNull Ada2005Parser.Generic_formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_formal_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_formal_part(@NotNull Ada2005Parser.Generic_formal_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull Ada2005Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull Ada2005Parser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#triggering_statement}.
	 * @param ctx the parse tree
	 */
	void enterTriggering_statement(@NotNull Ada2005Parser.Triggering_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#triggering_statement}.
	 * @param ctx the parse tree
	 */
	void exitTriggering_statement(@NotNull Ada2005Parser.Triggering_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#last_bit}.
	 * @param ctx the parse tree
	 */
	void enterLast_bit(@NotNull Ada2005Parser.Last_bitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#last_bit}.
	 * @param ctx the parse tree
	 */
	void exitLast_bit(@NotNull Ada2005Parser.Last_bitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#interface_type_definition_modifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_definition_modifier(@NotNull Ada2005Parser.Interface_type_definition_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#interface_type_definition_modifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_definition_modifier(@NotNull Ada2005Parser.Interface_type_definition_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_aggregate(@NotNull Ada2005Parser.Enumeration_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_aggregate(@NotNull Ada2005Parser.Enumeration_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#interface_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_definition(@NotNull Ada2005Parser.Interface_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#interface_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_definition(@NotNull Ada2005Parser.Interface_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#default_name}.
	 * @param ctx the parse tree
	 */
	void enterDefault_name(@NotNull Ada2005Parser.Default_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#default_name}.
	 * @param ctx the parse tree
	 */
	void exitDefault_name(@NotNull Ada2005Parser.Default_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_body}.
	 * @param ctx the parse tree
	 */
	void enterProtected_body(@NotNull Ada2005Parser.Protected_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_body}.
	 * @param ctx the parse tree
	 */
	void exitProtected_body(@NotNull Ada2005Parser.Protected_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_package_declaration(@NotNull Ada2005Parser.Generic_package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_package_declaration(@NotNull Ada2005Parser.Generic_package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_body_stub}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_body_stub(@NotNull Ada2005Parser.Subprogram_body_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_body_stub}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_body_stub(@NotNull Ada2005Parser.Subprogram_body_stubContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(@NotNull Ada2005Parser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(@NotNull Ada2005Parser.Loop_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#private_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_type_declaration(@NotNull Ada2005Parser.Private_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#private_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_type_declaration(@NotNull Ada2005Parser.Private_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(@NotNull Ada2005Parser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(@NotNull Ada2005Parser.Subtype_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntry_declaration(@NotNull Ada2005Parser.Entry_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntry_declaration(@NotNull Ada2005Parser.Entry_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull Ada2005Parser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull Ada2005Parser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_part}.
	 * @param ctx the parse tree
	 */
	void enterFormal_part(@NotNull Ada2005Parser.Formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_part}.
	 * @param ctx the parse tree
	 */
	void exitFormal_part(@NotNull Ada2005Parser.Formal_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_object_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_object_declaration(@NotNull Ada2005Parser.Formal_object_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_object_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_object_declaration(@NotNull Ada2005Parser.Formal_object_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(@NotNull Ada2005Parser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(@NotNull Ada2005Parser.PrefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#library_unit_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_unit_renaming_declaration(@NotNull Ada2005Parser.Library_unit_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#library_unit_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_unit_renaming_declaration(@NotNull Ada2005Parser.Library_unit_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_list}.
	 * @param ctx the parse tree
	 */
	void enterComponent_list(@NotNull Ada2005Parser.Component_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_list}.
	 * @param ctx the parse tree
	 */
	void exitComponent_list(@NotNull Ada2005Parser.Component_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_operation_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtected_operation_declaration(@NotNull Ada2005Parser.Protected_operation_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_operation_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtected_operation_declaration(@NotNull Ada2005Parser.Protected_operation_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#first_bit}.
	 * @param ctx the parse tree
	 */
	void enterFirst_bit(@NotNull Ada2005Parser.First_bitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#first_bit}.
	 * @param ctx the parse tree
	 */
	void exitFirst_bit(@NotNull Ada2005Parser.First_bitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#direct_name}.
	 * @param ctx the parse tree
	 */
	void enterDirect_name(@NotNull Ada2005Parser.Direct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#direct_name}.
	 * @param ctx the parse tree
	 */
	void exitDirect_name(@NotNull Ada2005Parser.Direct_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(@NotNull Ada2005Parser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(@NotNull Ada2005Parser.RelationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#allocator}.
	 * @param ctx the parse tree
	 */
	void enterAllocator(@NotNull Ada2005Parser.AllocatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#allocator}.
	 * @param ctx the parse tree
	 */
	void exitAllocator(@NotNull Ada2005Parser.AllocatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(@NotNull Ada2005Parser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(@NotNull Ada2005Parser.SliceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#param_mode}.
	 * @param ctx the parse tree
	 */
	void enterParam_mode(@NotNull Ada2005Parser.Param_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#param_mode}.
	 * @param ctx the parse tree
	 */
	void exitParam_mode(@NotNull Ada2005Parser.Param_modeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#indexed_component}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_component(@NotNull Ada2005Parser.Indexed_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#indexed_component}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_component(@NotNull Ada2005Parser.Indexed_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_specification}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_specification(@NotNull Ada2005Parser.Discriminant_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_specification}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_specification(@NotNull Ada2005Parser.Discriminant_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_choice_list(@NotNull Ada2005Parser.Discrete_choice_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_choice_list(@NotNull Ada2005Parser.Discrete_choice_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(@NotNull Ada2005Parser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(@NotNull Ada2005Parser.Exception_handlerContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(@NotNull Ada2005Parser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(@NotNull Ada2005Parser.Null_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#ancestor_part}.
	 * @param ctx the parse tree
	 */
	void enterAncestor_part(@NotNull Ada2005Parser.Ancestor_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#ancestor_part}.
	 * @param ctx the parse tree
	 */
	void exitAncestor_part(@NotNull Ada2005Parser.Ancestor_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#procedure_specification}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_specification(@NotNull Ada2005Parser.Procedure_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#procedure_specification}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_specification(@NotNull Ada2005Parser.Procedure_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration_literal_specification(@NotNull Ada2005Parser.Enumeration_literal_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration_literal_specification(@NotNull Ada2005Parser.Enumeration_literal_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#context_item}.
	 * @param ctx the parse tree
	 */
	void enterContext_item(@NotNull Ada2005Parser.Context_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#context_item}.
	 * @param ctx the parse tree
	 */
	void exitContext_item(@NotNull Ada2005Parser.Context_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_type_declaration(@NotNull Ada2005Parser.Formal_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_type_declaration(@NotNull Ada2005Parser.Formal_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_association}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_association(@NotNull Ada2005Parser.Discriminant_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_association}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_association(@NotNull Ada2005Parser.Discriminant_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#restriction}.
	 * @param ctx the parse tree
	 */
	void enterRestriction(@NotNull Ada2005Parser.RestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#restriction}.
	 * @param ctx the parse tree
	 */
	void exitRestriction(@NotNull Ada2005Parser.RestrictionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull Ada2005Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull Ada2005Parser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_default}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_default(@NotNull Ada2005Parser.Subprogram_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_default}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_default(@NotNull Ada2005Parser.Subprogram_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#return_subtype_indication}.
	 * @param ctx the parse tree
	 */
	void enterReturn_subtype_indication(@NotNull Ada2005Parser.Return_subtype_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#return_subtype_indication}.
	 * @param ctx the parse tree
	 */
	void exitReturn_subtype_indication(@NotNull Ada2005Parser.Return_subtype_indicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_type_definition(@NotNull Ada2005Parser.Array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_type_definition(@NotNull Ada2005Parser.Array_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#package_specification}.
	 * @param ctx the parse tree
	 */
	void enterPackage_specification(@NotNull Ada2005Parser.Package_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#package_specification}.
	 * @param ctx the parse tree
	 */
	void exitPackage_specification(@NotNull Ada2005Parser.Package_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_item(@NotNull Ada2005Parser.Declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_item(@NotNull Ada2005Parser.Declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 */
	void enterEntry_body_formal_part(@NotNull Ada2005Parser.Entry_body_formal_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 */
	void exitEntry_body_formal_part(@NotNull Ada2005Parser.Entry_body_formal_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#access_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_definition(@NotNull Ada2005Parser.Access_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#access_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_definition(@NotNull Ada2005Parser.Access_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull Ada2005Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull Ada2005Parser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_index}.
	 * @param ctx the parse tree
	 */
	void enterEntry_index(@NotNull Ada2005Parser.Entry_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_index}.
	 * @param ctx the parse tree
	 */
	void exitEntry_index(@NotNull Ada2005Parser.Entry_indexContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#object_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterObject_renaming_declaration(@NotNull Ada2005Parser.Object_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#object_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitObject_renaming_declaration(@NotNull Ada2005Parser.Object_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(@NotNull Ada2005Parser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(@NotNull Ada2005Parser.GuardContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_actual_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_actual_part(@NotNull Ada2005Parser.Generic_actual_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_actual_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_actual_part(@NotNull Ada2005Parser.Generic_actual_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull Ada2005Parser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull Ada2005Parser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(@NotNull Ada2005Parser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(@NotNull Ada2005Parser.Simple_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(@NotNull Ada2005Parser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(@NotNull Ada2005Parser.Case_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#interface_type_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_definition_list(@NotNull Ada2005Parser.Interface_type_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#interface_type_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_definition_list(@NotNull Ada2005Parser.Interface_type_definition_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_item}.
	 * @param ctx the parse tree
	 */
	void enterTask_item(@NotNull Ada2005Parser.Task_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_item}.
	 * @param ctx the parse tree
	 */
	void exitTask_item(@NotNull Ada2005Parser.Task_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_body(@NotNull Ada2005Parser.Subprogram_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subprogram_body}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_body(@NotNull Ada2005Parser.Subprogram_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#aspect_clause}.
	 * @param ctx the parse tree
	 */
	void enterAspect_clause(@NotNull Ada2005Parser.Aspect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#aspect_clause}.
	 * @param ctx the parse tree
	 */
	void exitAspect_clause(@NotNull Ada2005Parser.Aspect_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_representation_clause}.
	 * @param ctx the parse tree
	 */
	void enterRecord_representation_clause(@NotNull Ada2005Parser.Record_representation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_representation_clause}.
	 * @param ctx the parse tree
	 */
	void exitRecord_representation_clause(@NotNull Ada2005Parser.Record_representation_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_constraint(@NotNull Ada2005Parser.Index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_constraint(@NotNull Ada2005Parser.Index_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#delay_alternative}.
	 * @param ctx the parse tree
	 */
	void enterDelay_alternative(@NotNull Ada2005Parser.Delay_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#delay_alternative}.
	 * @param ctx the parse tree
	 */
	void exitDelay_alternative(@NotNull Ada2005Parser.Delay_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(@NotNull Ada2005Parser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(@NotNull Ada2005Parser.Compilation_unitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#explicit_generic_actual_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_generic_actual_parameter(@NotNull Ada2005Parser.Explicit_generic_actual_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#explicit_generic_actual_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_generic_actual_parameter(@NotNull Ada2005Parser.Explicit_generic_actual_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#index_or_parameter_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_or_parameter_value(@NotNull Ada2005Parser.Index_or_parameter_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#index_or_parameter_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_or_parameter_value(@NotNull Ada2005Parser.Index_or_parameter_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#highest_precedence_operator}.
	 * @param ctx the parse tree
	 */
	void enterHighest_precedence_operator(@NotNull Ada2005Parser.Highest_precedence_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#highest_precedence_operator}.
	 * @param ctx the parse tree
	 */
	void exitHighest_precedence_operator(@NotNull Ada2005Parser.Highest_precedence_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_definition(@NotNull Ada2005Parser.Record_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_definition(@NotNull Ada2005Parser.Record_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#selector_name}.
	 * @param ctx the parse tree
	 */
	void enterSelector_name(@NotNull Ada2005Parser.Selector_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#selector_name}.
	 * @param ctx the parse tree
	 */
	void exitSelector_name(@NotNull Ada2005Parser.Selector_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(@NotNull Ada2005Parser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(@NotNull Ada2005Parser.Attribute_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#timed_entry_call}.
	 * @param ctx the parse tree
	 */
	void enterTimed_entry_call(@NotNull Ada2005Parser.Timed_entry_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#timed_entry_call}.
	 * @param ctx the parse tree
	 */
	void exitTimed_entry_call(@NotNull Ada2005Parser.Timed_entry_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#delay_until_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelay_until_statement(@NotNull Ada2005Parser.Delay_until_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#delay_until_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelay_until_statement(@NotNull Ada2005Parser.Delay_until_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_package_association}.
	 * @param ctx the parse tree
	 */
	void enterFormal_package_association(@NotNull Ada2005Parser.Formal_package_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_package_association}.
	 * @param ctx the parse tree
	 */
	void exitFormal_package_association(@NotNull Ada2005Parser.Formal_package_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_object_declaration_default}.
	 * @param ctx the parse tree
	 */
	void enterFormal_object_declaration_default(@NotNull Ada2005Parser.Formal_object_declaration_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_object_declaration_default}.
	 * @param ctx the parse tree
	 */
	void exitFormal_object_declaration_default(@NotNull Ada2005Parser.Formal_object_declaration_defaultContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_component_association}.
	 * @param ctx the parse tree
	 */
	void enterRecord_component_association(@NotNull Ada2005Parser.Record_component_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_component_association}.
	 * @param ctx the parse tree
	 */
	void exitRecord_component_association(@NotNull Ada2005Parser.Record_component_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(@NotNull Ada2005Parser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(@NotNull Ada2005Parser.Type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_specification_list}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_specification_list(@NotNull Ada2005Parser.Discriminant_specification_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_specification_list}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_specification_list(@NotNull Ada2005Parser.Discriminant_specification_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#default_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefault_expression(@NotNull Ada2005Parser.Default_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#default_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefault_expression(@NotNull Ada2005Parser.Default_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#basic_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBasic_declaration(@NotNull Ada2005Parser.Basic_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#basic_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBasic_declaration(@NotNull Ada2005Parser.Basic_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(@NotNull Ada2005Parser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(@NotNull Ada2005Parser.Record_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#type_conversion}.
	 * @param ctx the parse tree
	 */
	void enterType_conversion(@NotNull Ada2005Parser.Type_conversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#type_conversion}.
	 * @param ctx the parse tree
	 */
	void exitType_conversion(@NotNull Ada2005Parser.Type_conversionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(@NotNull Ada2005Parser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(@NotNull Ada2005Parser.Assignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#choice_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterChoice_parameter_specification(@NotNull Ada2005Parser.Choice_parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#choice_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitChoice_parameter_specification(@NotNull Ada2005Parser.Choice_parameter_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#subunit}.
	 * @param ctx the parse tree
	 */
	void enterSubunit(@NotNull Ada2005Parser.SubunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#subunit}.
	 * @param ctx the parse tree
	 */
	void exitSubunit(@NotNull Ada2005Parser.SubunitContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#record_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterRecord_aggregate(@NotNull Ada2005Parser.Record_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#record_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitRecord_aggregate(@NotNull Ada2005Parser.Record_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#local_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_name(@NotNull Ada2005Parser.Local_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#local_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_name(@NotNull Ada2005Parser.Local_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#delay_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelay_statement(@NotNull Ada2005Parser.Delay_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#delay_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelay_statement(@NotNull Ada2005Parser.Delay_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#null_exclusion}.
	 * @param ctx the parse tree
	 */
	void enterNull_exclusion(@NotNull Ada2005Parser.Null_exclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#null_exclusion}.
	 * @param ctx the parse tree
	 */
	void exitNull_exclusion(@NotNull Ada2005Parser.Null_exclusionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_clause}.
	 * @param ctx the parse tree
	 */
	void enterComponent_clause(@NotNull Ada2005Parser.Component_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_clause}.
	 * @param ctx the parse tree
	 */
	void exitComponent_clause(@NotNull Ada2005Parser.Component_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_choice_list}.
	 * @param ctx the parse tree
	 */
	void enterComponent_choice_list(@NotNull Ada2005Parser.Component_choice_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_choice_list}.
	 * @param ctx the parse tree
	 */
	void exitComponent_choice_list(@NotNull Ada2005Parser.Component_choice_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#array_component_association}.
	 * @param ctx the parse tree
	 */
	void enterArray_component_association(@NotNull Ada2005Parser.Array_component_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#array_component_association}.
	 * @param ctx the parse tree
	 */
	void exitArray_component_association(@NotNull Ada2005Parser.Array_component_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_operation_item}.
	 * @param ctx the parse tree
	 */
	void enterProtected_operation_item(@NotNull Ada2005Parser.Protected_operation_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_operation_item}.
	 * @param ctx the parse tree
	 */
	void exitProtected_operation_item(@NotNull Ada2005Parser.Protected_operation_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(@NotNull Ada2005Parser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(@NotNull Ada2005Parser.ConstraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#extension_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterExtension_aggregate(@NotNull Ada2005Parser.Extension_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#extension_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitExtension_aggregate(@NotNull Ada2005Parser.Extension_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQualified_expression(@NotNull Ada2005Parser.Qualified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#qualified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQualified_expression(@NotNull Ada2005Parser.Qualified_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(@NotNull Ada2005Parser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(@NotNull Ada2005Parser.Component_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#accept_alternative}.
	 * @param ctx the parse tree
	 */
	void enterAccept_alternative(@NotNull Ada2005Parser.Accept_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#accept_alternative}.
	 * @param ctx the parse tree
	 */
	void exitAccept_alternative(@NotNull Ada2005Parser.Accept_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#exception_choice}.
	 * @param ctx the parse tree
	 */
	void enterException_choice(@NotNull Ada2005Parser.Exception_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#exception_choice}.
	 * @param ctx the parse tree
	 */
	void exitException_choice(@NotNull Ada2005Parser.Exception_choiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_barrier}.
	 * @param ctx the parse tree
	 */
	void enterEntry_barrier(@NotNull Ada2005Parser.Entry_barrierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_barrier}.
	 * @param ctx the parse tree
	 */
	void exitEntry_barrier(@NotNull Ada2005Parser.Entry_barrierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(@NotNull Ada2005Parser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(@NotNull Ada2005Parser.Use_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#body_stub}.
	 * @param ctx the parse tree
	 */
	void enterBody_stub(@NotNull Ada2005Parser.Body_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#body_stub}.
	 * @param ctx the parse tree
	 */
	void exitBody_stub(@NotNull Ada2005Parser.Body_stubContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#library_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_unit_declaration(@NotNull Ada2005Parser.Library_unit_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#library_unit_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_unit_declaration(@NotNull Ada2005Parser.Library_unit_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_signed_integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_signed_integer_type_definition(@NotNull Ada2005Parser.Formal_signed_integer_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_signed_integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_signed_integer_type_definition(@NotNull Ada2005Parser.Formal_signed_integer_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(@NotNull Ada2005Parser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(@NotNull Ada2005Parser.Simple_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull Ada2005Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull Ada2005Parser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_alternative(@NotNull Ada2005Parser.Case_statement_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#case_statement_alternative}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_alternative(@NotNull Ada2005Parser.Case_statement_alternativeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#asynchronous_select}.
	 * @param ctx the parse tree
	 */
	void enterAsynchronous_select(@NotNull Ada2005Parser.Asynchronous_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#asynchronous_select}.
	 * @param ctx the parse tree
	 */
	void exitAsynchronous_select(@NotNull Ada2005Parser.Asynchronous_selectContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#modular_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterModular_type_definition(@NotNull Ada2005Parser.Modular_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#modular_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitModular_type_definition(@NotNull Ada2005Parser.Modular_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discrete_choice}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_choice(@NotNull Ada2005Parser.Discrete_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discrete_choice}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_choice(@NotNull Ada2005Parser.Discrete_choiceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#exception_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_renaming_declaration(@NotNull Ada2005Parser.Exception_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#exception_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_renaming_declaration(@NotNull Ada2005Parser.Exception_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#delta_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDelta_constraint(@NotNull Ada2005Parser.Delta_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#delta_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDelta_constraint(@NotNull Ada2005Parser.Delta_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_ordinary_fixed_point_definition(@NotNull Ada2005Parser.Formal_ordinary_fixed_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_ordinary_fixed_point_definition(@NotNull Ada2005Parser.Formal_ordinary_fixed_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_package_declaration(@NotNull Ada2005Parser.Formal_package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_package_declaration(@NotNull Ada2005Parser.Formal_package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#access_to_subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void enterAccess_to_subprogram_definition(@NotNull Ada2005Parser.Access_to_subprogram_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#access_to_subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void exitAccess_to_subprogram_definition(@NotNull Ada2005Parser.Access_to_subprogram_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_designator(@NotNull Ada2005Parser.Attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_designator(@NotNull Ada2005Parser.Attribute_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_derived_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_derived_type_definition(@NotNull Ada2005Parser.Formal_derived_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_derived_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_derived_type_definition(@NotNull Ada2005Parser.Formal_derived_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#defining_identifier}.
	 * @param ctx the parse tree
	 */
	void enterDefining_identifier(@NotNull Ada2005Parser.Defining_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#defining_identifier}.
	 * @param ctx the parse tree
	 */
	void exitDefining_identifier(@NotNull Ada2005Parser.Defining_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#indexed_slice_type_conv_or_function_call_component}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_slice_type_conv_or_function_call_component(@NotNull Ada2005Parser.Indexed_slice_type_conv_or_function_call_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#indexed_slice_type_conv_or_function_call_component}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_slice_type_conv_or_function_call_component(@NotNull Ada2005Parser.Indexed_slice_type_conv_or_function_call_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#entry_body}.
	 * @param ctx the parse tree
	 */
	void enterEntry_body(@NotNull Ada2005Parser.Entry_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#entry_body}.
	 * @param ctx the parse tree
	 */
	void exitEntry_body(@NotNull Ada2005Parser.Entry_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type_definition(@NotNull Ada2005Parser.Integer_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#integer_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type_definition(@NotNull Ada2005Parser.Integer_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_renaming_declaration(@NotNull Ada2005Parser.Generic_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_renaming_declaration(@NotNull Ada2005Parser.Generic_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_type_specification}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_specification(@NotNull Ada2005Parser.Parameter_type_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_type_specification}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_specification(@NotNull Ada2005Parser.Parameter_type_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_private_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_private_type_definition(@NotNull Ada2005Parser.Formal_private_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_private_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_private_type_definition(@NotNull Ada2005Parser.Formal_private_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#scalar_constraint}.
	 * @param ctx the parse tree
	 */
	void enterScalar_constraint(@NotNull Ada2005Parser.Scalar_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#scalar_constraint}.
	 * @param ctx the parse tree
	 */
	void exitScalar_constraint(@NotNull Ada2005Parser.Scalar_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void enterRange_constraint(@NotNull Ada2005Parser.Range_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#range_constraint}.
	 * @param ctx the parse tree
	 */
	void exitRange_constraint(@NotNull Ada2005Parser.Range_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#named_array_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterNamed_array_aggregate(@NotNull Ada2005Parser.Named_array_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#named_array_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitNamed_array_aggregate(@NotNull Ada2005Parser.Named_array_aggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#explicit_actual_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_actual_parameter(@NotNull Ada2005Parser.Explicit_actual_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#explicit_actual_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_actual_parameter(@NotNull Ada2005Parser.Explicit_actual_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull Ada2005Parser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull Ada2005Parser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#general_access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_access_modifier(@NotNull Ada2005Parser.General_access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#general_access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_access_modifier(@NotNull Ada2005Parser.General_access_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void enterIteration_scheme(@NotNull Ada2005Parser.Iteration_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#iteration_scheme}.
	 * @param ctx the parse tree
	 */
	void exitIteration_scheme(@NotNull Ada2005Parser.Iteration_schemeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#code_statement}.
	 * @param ctx the parse tree
	 */
	void enterCode_statement(@NotNull Ada2005Parser.Code_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#code_statement}.
	 * @param ctx the parse tree
	 */
	void exitCode_statement(@NotNull Ada2005Parser.Code_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull Ada2005Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull Ada2005Parser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#limited_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimited_with_clause(@NotNull Ada2005Parser.Limited_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#limited_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimited_with_clause(@NotNull Ada2005Parser.Limited_with_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#range_attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterRange_attribute_reference(@NotNull Ada2005Parser.Range_attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#range_attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitRange_attribute_reference(@NotNull Ada2005Parser.Range_attribute_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(@NotNull Ada2005Parser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(@NotNull Ada2005Parser.PositionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_interface_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_interface_type_definition(@NotNull Ada2005Parser.Formal_interface_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_interface_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_interface_type_definition(@NotNull Ada2005Parser.Formal_interface_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#single_task_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_task_declaration(@NotNull Ada2005Parser.Single_task_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#single_task_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_task_declaration(@NotNull Ada2005Parser.Single_task_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_decimal_fixed_point_definition(@NotNull Ada2005Parser.Formal_decimal_fixed_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_decimal_fixed_point_definition(@NotNull Ada2005Parser.Formal_decimal_fixed_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#number_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNumber_declaration(@NotNull Ada2005Parser.Number_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#number_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNumber_declaration(@NotNull Ada2005Parser.Number_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#protected_definition}.
	 * @param ctx the parse tree
	 */
	void enterProtected_definition(@NotNull Ada2005Parser.Protected_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#protected_definition}.
	 * @param ctx the parse tree
	 */
	void exitProtected_definition(@NotNull Ada2005Parser.Protected_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(@NotNull Ada2005Parser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(@NotNull Ada2005Parser.AggregateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#parameter_association}.
	 * @param ctx the parse tree
	 */
	void enterParameter_association(@NotNull Ada2005Parser.Parameter_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#parameter_association}.
	 * @param ctx the parse tree
	 */
	void exitParameter_association(@NotNull Ada2005Parser.Parameter_associationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#library_unit_body}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_unit_body(@NotNull Ada2005Parser.Library_unit_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#library_unit_body}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_unit_body(@NotNull Ada2005Parser.Library_unit_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void enterUnconstrained_array_definition(@NotNull Ada2005Parser.Unconstrained_array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 */
	void exitUnconstrained_array_definition(@NotNull Ada2005Parser.Unconstrained_array_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#task_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_type_declaration(@NotNull Ada2005Parser.Task_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#task_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_type_declaration(@NotNull Ada2005Parser.Task_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_array_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_array_type_definition(@NotNull Ada2005Parser.Formal_array_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_array_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_array_type_definition(@NotNull Ada2005Parser.Formal_array_type_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_floating_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterFormal_floating_point_definition(@NotNull Ada2005Parser.Formal_floating_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_floating_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitFormal_floating_point_definition(@NotNull Ada2005Parser.Formal_floating_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#basic_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterBasic_declarative_item(@NotNull Ada2005Parser.Basic_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#basic_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitBasic_declarative_item(@NotNull Ada2005Parser.Basic_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#binary_adding_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_adding_operator(@NotNull Ada2005Parser.Binary_adding_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#binary_adding_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_adding_operator(@NotNull Ada2005Parser.Binary_adding_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#package_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_renaming_declaration(@NotNull Ada2005Parser.Package_renaming_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#package_renaming_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_renaming_declaration(@NotNull Ada2005Parser.Package_renaming_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#generic_instantiation_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_instantiation_clause(@NotNull Ada2005Parser.Generic_instantiation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#generic_instantiation_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_instantiation_clause(@NotNull Ada2005Parser.Generic_instantiation_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#formal_abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFormal_abstract_subprogram_declaration(@NotNull Ada2005Parser.Formal_abstract_subprogram_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#formal_abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFormal_abstract_subprogram_declaration(@NotNull Ada2005Parser.Formal_abstract_subprogram_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#incomplete_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIncomplete_type_declaration(@NotNull Ada2005Parser.Incomplete_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#incomplete_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIncomplete_type_declaration(@NotNull Ada2005Parser.Incomplete_type_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#selected_component_component}.
	 * @param ctx the parse tree
	 */
	void enterSelected_component_component(@NotNull Ada2005Parser.Selected_component_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#selected_component_component}.
	 * @param ctx the parse tree
	 */
	void exitSelected_component_component(@NotNull Ada2005Parser.Selected_component_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#null_procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNull_procedure_declaration(@NotNull Ada2005Parser.Null_procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#null_procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNull_procedure_declaration(@NotNull Ada2005Parser.Null_procedure_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#single_protected_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSingle_protected_declaration(@NotNull Ada2005Parser.Single_protected_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#single_protected_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSingle_protected_declaration(@NotNull Ada2005Parser.Single_protected_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#name_component}.
	 * @param ctx the parse tree
	 */
	void enterName_component(@NotNull Ada2005Parser.Name_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#name_component}.
	 * @param ctx the parse tree
	 */
	void exitName_component(@NotNull Ada2005Parser.Name_componentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#abortable_part}.
	 * @param ctx the parse tree
	 */
	void enterAbortable_part(@NotNull Ada2005Parser.Abortable_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#abortable_part}.
	 * @param ctx the parse tree
	 */
	void exitAbortable_part(@NotNull Ada2005Parser.Abortable_partContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(@NotNull Ada2005Parser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(@NotNull Ada2005Parser.Package_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(@NotNull Ada2005Parser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(@NotNull Ada2005Parser.Exit_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void enterOperator_symbol(@NotNull Ada2005Parser.Operator_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void exitOperator_symbol(@NotNull Ada2005Parser.Operator_symbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#attribute_definition_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition_clause(@NotNull Ada2005Parser.Attribute_definition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#attribute_definition_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition_clause(@NotNull Ada2005Parser.Attribute_definition_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#loop_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void enterLoop_parameter_specification(@NotNull Ada2005Parser.Loop_parameter_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#loop_parameter_specification}.
	 * @param ctx the parse tree
	 */
	void exitLoop_parameter_specification(@NotNull Ada2005Parser.Loop_parameter_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void enterFixed_point_definition(@NotNull Ada2005Parser.Fixed_point_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#fixed_point_definition}.
	 * @param ctx the parse tree
	 */
	void exitFixed_point_definition(@NotNull Ada2005Parser.Fixed_point_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#compilation}.
	 * @param ctx the parse tree
	 */
	void enterCompilation(@NotNull Ada2005Parser.CompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#compilation}.
	 * @param ctx the parse tree
	 */
	void exitCompilation(@NotNull Ada2005Parser.CompilationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#interface_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_list(@NotNull Ada2005Parser.Interface_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#interface_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_list(@NotNull Ada2005Parser.Interface_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#discriminant_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDiscriminant_constraint(@NotNull Ada2005Parser.Discriminant_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#discriminant_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDiscriminant_constraint(@NotNull Ada2005Parser.Discriminant_constraintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Ada2005Parser#function_specification}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specification(@NotNull Ada2005Parser.Function_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ada2005Parser#function_specification}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specification(@NotNull Ada2005Parser.Function_specificationContext ctx);
}