// Generated from Ada2012.g4 by ANTLR 4.7.2
package org.ada4j.internal.grammar.ada2012;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Ada2012Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Ada2012Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(Ada2012Parser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(Ada2012Parser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#pragma_argument_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_argument_association(Ada2012Parser.Pragma_argument_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#basic_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_declaration(Ada2012Parser.Basic_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_identifier(Ada2012Parser.Defining_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(Ada2012Parser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#full_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_type_declaration(Ada2012Parser.Full_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(Ada2012Parser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(Ada2012Parser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subtype_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_indication(Ada2012Parser.Subtype_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subtype_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_mark(Ada2012Parser.Subtype_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(Ada2012Parser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#scalar_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_constraint(Ada2012Parser.Scalar_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#composite_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_constraint(Ada2012Parser.Composite_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#object_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_declaration(Ada2012Parser.Object_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subtype_access_or_array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_access_or_array_type_definition(Ada2012Parser.Subtype_access_or_array_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_identifier_list(Ada2012Parser.Defining_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#number_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_declaration(Ada2012Parser.Number_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#derived_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_type_definition(Ada2012Parser.Derived_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#interface_and_record_extension_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_and_record_extension_specification(Ada2012Parser.Interface_and_record_extension_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#range_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_constraint(Ada2012Parser.Range_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(Ada2012Parser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#enumeration_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_type_definition(Ada2012Parser.Enumeration_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#enumeration_literal_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_literal_specification(Ada2012Parser.Enumeration_literal_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_character_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_character_literal(Ada2012Parser.Defining_character_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#integer_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type_definition(Ada2012Parser.Integer_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#signed_integer_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_integer_type_definition(Ada2012Parser.Signed_integer_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#modular_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModular_type_definition(Ada2012Parser.Modular_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#real_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_type_definition(Ada2012Parser.Real_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#floating_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_definition(Ada2012Parser.Floating_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#real_range_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_range_specification(Ada2012Parser.Real_range_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#fixed_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed_point_definition(Ada2012Parser.Fixed_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinary_fixed_point_definition(Ada2012Parser.Ordinary_fixed_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_fixed_point_definition(Ada2012Parser.Decimal_fixed_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#digits_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits_constraint(Ada2012Parser.Digits_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type_definition(Ada2012Parser.Array_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#unconstrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnconstrained_array_definition(Ada2012Parser.Unconstrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#index_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subtype_definition(Ada2012Parser.Index_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#constrained_array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrained_array_definition(Ada2012Parser.Constrained_array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discrete_subtype_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_subtype_definition(Ada2012Parser.Discrete_subtype_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_definition(Ada2012Parser.Component_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_constraint(Ada2012Parser.Index_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discrete_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_range(Ada2012Parser.Discrete_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_part(Ada2012Parser.Discriminant_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#unknown_discriminant_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown_discriminant_part(Ada2012Parser.Unknown_discriminant_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#known_discriminant_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnown_discriminant_part(Ada2012Parser.Known_discriminant_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_specification_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_specification_list(Ada2012Parser.Discriminant_specification_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_specification(Ada2012Parser.Discriminant_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_specification_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_specification_default(Ada2012Parser.Discriminant_specification_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#default_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_expression(Ada2012Parser.Default_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_constraint(Ada2012Parser.Discriminant_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discriminant_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscriminant_association(Ada2012Parser.Discriminant_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_definition(Ada2012Parser.Record_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_definition(Ada2012Parser.Record_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_list(Ada2012Parser.Component_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_item(Ada2012Parser.Component_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(Ada2012Parser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_declaration_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration_default(Ada2012Parser.Component_declaration_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#variant_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_part(Ada2012Parser.Variant_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(Ada2012Parser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discrete_choice_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_choice_list(Ada2012Parser.Discrete_choice_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#discrete_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete_choice(Ada2012Parser.Discrete_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_extension_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_extension_part(Ada2012Parser.Record_extension_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_subprogram_declaration(Ada2012Parser.Abstract_subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#interface_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type_definition(Ada2012Parser.Interface_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#interface_type_definition_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type_definition_modifier(Ada2012Parser.Interface_type_definition_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#interface_type_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type_definition_list(Ada2012Parser.Interface_type_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#interface_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_list(Ada2012Parser.Interface_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#access_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_type_definition(Ada2012Parser.Access_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#access_to_object_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_to_object_definition(Ada2012Parser.Access_to_object_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#general_access_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_access_modifier(Ada2012Parser.General_access_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#access_to_subprogram_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_to_subprogram_definition(Ada2012Parser.Access_to_subprogram_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#null_exclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_exclusion(Ada2012Parser.Null_exclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#access_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_definition(Ada2012Parser.Access_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#incomplete_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncomplete_type_declaration(Ada2012Parser.Incomplete_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#declarative_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarative_part(Ada2012Parser.Declarative_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarative_item(Ada2012Parser.Declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#basic_declarative_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_declarative_item(Ada2012Parser.Basic_declarative_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Ada2012Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#proper_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProper_body(Ada2012Parser.Proper_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Ada2012Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#name_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_component(Ada2012Parser.Name_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#explicit_dereference_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_dereference_component(Ada2012Parser.Explicit_dereference_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#indexed_slice_type_conv_or_function_call_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_slice_type_conv_or_function_call_component(Ada2012Parser.Indexed_slice_type_conv_or_function_call_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#index_or_parameter_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_or_parameter_value(Ada2012Parser.Index_or_parameter_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#selected_component_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_component_component(Ada2012Parser.Selected_component_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#attribute_reference_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference_component(Ada2012Parser.Attribute_reference_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#direct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_name(Ada2012Parser.Direct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(Ada2012Parser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#explicit_dereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_dereference(Ada2012Parser.Explicit_dereferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#indexed_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_component(Ada2012Parser.Indexed_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(Ada2012Parser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#selected_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_component(Ada2012Parser.Selected_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#selector_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_name(Ada2012Parser.Selector_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference(Ada2012Parser.Attribute_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#attribute_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_designator(Ada2012Parser.Attribute_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#range_attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_attribute_reference(Ada2012Parser.Range_attribute_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#range_attribute_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_attribute_designator(Ada2012Parser.Range_attribute_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generalized_indexing_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralized_indexing_component(Ada2012Parser.Generalized_indexing_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(Ada2012Parser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_aggregate(Ada2012Parser.Record_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_component_association_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_component_association_list(Ada2012Parser.Record_component_association_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_component_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_component_association(Ada2012Parser.Record_component_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_choice_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_choice_list(Ada2012Parser.Component_choice_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#extension_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_aggregate(Ada2012Parser.Extension_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#ancestor_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAncestor_part(Ada2012Parser.Ancestor_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#array_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_aggregate(Ada2012Parser.Array_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#positional_array_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositional_array_aggregate(Ada2012Parser.Positional_array_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#named_array_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_array_aggregate(Ada2012Parser.Named_array_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#array_component_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_component_association(Ada2012Parser.Array_component_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Ada2012Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#choice_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_expression(Ada2012Parser.Choice_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#choice_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_relation(Ada2012Parser.Choice_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(Ada2012Parser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#membership_choice_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembership_choice_list(Ada2012Parser.Membership_choice_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#membership_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembership_choice(Ada2012Parser.Membership_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(Ada2012Parser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Ada2012Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Ada2012Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Ada2012Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(Ada2012Parser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(Ada2012Parser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#binary_adding_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_adding_operator(Ada2012Parser.Binary_adding_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#unary_adding_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_adding_operator(Ada2012Parser.Unary_adding_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#multiplying_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplying_operator(Ada2012Parser.Multiplying_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#highest_precedence_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighest_precedence_operator(Ada2012Parser.Highest_precedence_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(Ada2012Parser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(Ada2012Parser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Ada2012Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(Ada2012Parser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#case_expression_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression_alternative(Ada2012Parser.Case_expression_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(Ada2012Parser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(Ada2012Parser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(Ada2012Parser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#type_conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_conversion(Ada2012Parser.Type_conversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#qualified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_expression(Ada2012Parser.Qualified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#allocator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocator(Ada2012Parser.AllocatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subpool_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpool_specification(Ada2012Parser.Subpool_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#sequence_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_of_statements(Ada2012Parser.Sequence_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Ada2012Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(Ada2012Parser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(Ada2012Parser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(Ada2012Parser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(Ada2012Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#statement_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_identifier(Ada2012Parser.Statement_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(Ada2012Parser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Ada2012Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(Ada2012Parser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#case_statement_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_alternative(Ada2012Parser.Case_statement_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(Ada2012Parser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#iteration_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_scheme(Ada2012Parser.Iteration_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#loop_parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_parameter_specification(Ada2012Parser.Loop_parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#iterator_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator_specification(Ada2012Parser.Iterator_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(Ada2012Parser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(Ada2012Parser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(Ada2012Parser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_declaration(Ada2012Parser.Subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_specification(Ada2012Parser.Subprogram_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#procedure_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_specification(Ada2012Parser.Procedure_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#function_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_specification(Ada2012Parser.Function_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(Ada2012Parser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_designator(Ada2012Parser.Defining_designatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_program_unit_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_program_unit_name(Ada2012Parser.Defining_program_unit_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#operator_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_symbol(Ada2012Parser.Operator_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#defining_operator_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_operator_symbol(Ada2012Parser.Defining_operator_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_profile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_profile(Ada2012Parser.Parameter_profileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_and_result_profile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_and_result_profile(Ada2012Parser.Parameter_and_result_profileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_part(Ada2012Parser.Formal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification(Ada2012Parser.Parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_type_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_type_specification(Ada2012Parser.Parameter_type_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_specification_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specification_default(Ada2012Parser.Parameter_specification_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#param_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_mode(Ada2012Parser.Param_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_body(Ada2012Parser.Subprogram_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#procedure_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call_statement(Ada2012Parser.Procedure_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Ada2012Parser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#actual_parameter_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_parameter_part(Ada2012Parser.Actual_parameter_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parameter_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_association(Ada2012Parser.Parameter_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#explicit_actual_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_actual_parameter(Ada2012Parser.Explicit_actual_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#simple_return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_return_statement(Ada2012Parser.Simple_return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#extended_return_object_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_return_object_declaration(Ada2012Parser.Extended_return_object_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#extended_return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_return_statement(Ada2012Parser.Extended_return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#return_subtype_indication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_subtype_indication(Ada2012Parser.Return_subtype_indicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#null_procedure_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_procedure_declaration(Ada2012Parser.Null_procedure_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#expression_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_function_declaration(Ada2012Parser.Expression_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(Ada2012Parser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#private_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_part(Ada2012Parser.Private_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#package_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_specification(Ada2012Parser.Package_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(Ada2012Parser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#private_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_type_declaration(Ada2012Parser.Private_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#private_extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_extension_declaration(Ada2012Parser.Private_extension_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#overriding_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverriding_indicator(Ada2012Parser.Overriding_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(Ada2012Parser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#use_package_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_package_clause(Ada2012Parser.Use_package_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#use_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_type_clause(Ada2012Parser.Use_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenaming_declaration(Ada2012Parser.Renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#object_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_renaming_declaration(Ada2012Parser.Object_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#exception_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_renaming_declaration(Ada2012Parser.Exception_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#package_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_renaming_declaration(Ada2012Parser.Package_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_renaming_declaration(Ada2012Parser.Subprogram_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_renaming_declaration(Ada2012Parser.Generic_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_type_declaration(Ada2012Parser.Task_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_type_declaration_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_type_declaration_definition(Ada2012Parser.Task_type_declaration_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#single_task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_task_declaration(Ada2012Parser.Single_task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_definition(Ada2012Parser.Task_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item(Ada2012Parser.Task_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_body(Ada2012Parser.Task_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_type_declaration(Ada2012Parser.Protected_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#single_protected_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_protected_declaration(Ada2012Parser.Single_protected_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_definition(Ada2012Parser.Protected_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_operation_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_operation_declaration(Ada2012Parser.Protected_operation_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_element_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_element_declaration(Ada2012Parser.Protected_element_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_body(Ada2012Parser.Protected_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_operation_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_operation_item(Ada2012Parser.Protected_operation_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#synchronization_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronization_kind(Ada2012Parser.Synchronization_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_declaration(Ada2012Parser.Entry_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#accept_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept_statement(Ada2012Parser.Accept_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_index(Ada2012Parser.Entry_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_body(Ada2012Parser.Entry_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_body_formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_body_formal_part(Ada2012Parser.Entry_body_formal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_barrier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_barrier(Ada2012Parser.Entry_barrierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_index_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_index_specification(Ada2012Parser.Entry_index_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_call_statement(Ada2012Parser.Entry_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#requeue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequeue_statement(Ada2012Parser.Requeue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#delay_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_statement(Ada2012Parser.Delay_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#delay_until_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_until_statement(Ada2012Parser.Delay_until_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#delay_relative_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_relative_statement(Ada2012Parser.Delay_relative_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(Ada2012Parser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#selective_accept}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelective_accept(Ada2012Parser.Selective_acceptContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(Ada2012Parser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#select_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_alternative(Ada2012Parser.Select_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#accept_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept_alternative(Ada2012Parser.Accept_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#delay_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_alternative(Ada2012Parser.Delay_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#terminate_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminate_alternative(Ada2012Parser.Terminate_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#timed_entry_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimed_entry_call(Ada2012Parser.Timed_entry_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#entry_call_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry_call_alternative(Ada2012Parser.Entry_call_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#procedure_or_entry_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_or_entry_call(Ada2012Parser.Procedure_or_entry_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#conditional_entry_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_entry_call(Ada2012Parser.Conditional_entry_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#asynchronous_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsynchronous_select(Ada2012Parser.Asynchronous_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#triggering_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggering_alternative(Ada2012Parser.Triggering_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#triggering_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggering_statement(Ada2012Parser.Triggering_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#abortable_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbortable_part(Ada2012Parser.Abortable_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#abort_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_statement(Ada2012Parser.Abort_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#compilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation(Ada2012Parser.CompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(Ada2012Parser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#library_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_item(Ada2012Parser.Library_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#library_unit_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_unit_declaration(Ada2012Parser.Library_unit_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#library_unit_renaming_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_unit_renaming_declaration(Ada2012Parser.Library_unit_renaming_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#library_unit_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_unit_body(Ada2012Parser.Library_unit_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#parent_unit_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_unit_name(Ada2012Parser.Parent_unit_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#context_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_clause(Ada2012Parser.Context_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#context_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_item(Ada2012Parser.Context_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(Ada2012Parser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#limited_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimited_with_clause(Ada2012Parser.Limited_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#nonlimited_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlimited_with_clause(Ada2012Parser.Nonlimited_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#body_stub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stub(Ada2012Parser.Body_stubContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_body_stub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_body_stub(Ada2012Parser.Subprogram_body_stubContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#package_body_stub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_stub(Ada2012Parser.Package_body_stubContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#task_body_stub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_body_stub(Ada2012Parser.Task_body_stubContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#protected_body_stub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtected_body_stub(Ada2012Parser.Protected_body_stubContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubunit(Ada2012Parser.SubunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(Ada2012Parser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#handled_sequence_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandled_sequence_of_statements(Ada2012Parser.Handled_sequence_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(Ada2012Parser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#choice_parameter_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice_parameter_specification(Ada2012Parser.Choice_parameter_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#exception_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_choice(Ada2012Parser.Exception_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(Ada2012Parser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#raise_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_expression(Ada2012Parser.Raise_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_declaration(Ada2012Parser.Generic_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_subprogram_declaration(Ada2012Parser.Generic_subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_package_declaration(Ada2012Parser.Generic_package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_formal_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_formal_part(Ada2012Parser.Generic_formal_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_formal_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_formal_parameter_declaration(Ada2012Parser.Generic_formal_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_instantiation(Ada2012Parser.Generic_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_instantiation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_instantiation_clause(Ada2012Parser.Generic_instantiation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_actual_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_actual_part(Ada2012Parser.Generic_actual_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#generic_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_association(Ada2012Parser.Generic_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#explicit_generic_actual_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_generic_actual_parameter(Ada2012Parser.Explicit_generic_actual_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_object_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_object_declaration(Ada2012Parser.Formal_object_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_object_declaration_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_object_declaration_default(Ada2012Parser.Formal_object_declaration_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_type_declaration(Ada2012Parser.Formal_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_complete_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_complete_type_declaration(Ada2012Parser.Formal_complete_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_incomplete_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_incomplete_type_declaration(Ada2012Parser.Formal_incomplete_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_type_definition(Ada2012Parser.Formal_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_private_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_private_type_definition(Ada2012Parser.Formal_private_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_derived_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_derived_type_definition(Ada2012Parser.Formal_derived_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_discrete_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_discrete_type_definition(Ada2012Parser.Formal_discrete_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_signed_integer_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_signed_integer_type_definition(Ada2012Parser.Formal_signed_integer_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_modular_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_modular_type_definition(Ada2012Parser.Formal_modular_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_floating_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_floating_point_definition(Ada2012Parser.Formal_floating_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_ordinary_fixed_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_ordinary_fixed_point_definition(Ada2012Parser.Formal_ordinary_fixed_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_decimal_fixed_point_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_decimal_fixed_point_definition(Ada2012Parser.Formal_decimal_fixed_point_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_array_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_array_type_definition(Ada2012Parser.Formal_array_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_access_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_access_type_definition(Ada2012Parser.Formal_access_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_interface_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_interface_type_definition(Ada2012Parser.Formal_interface_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_subprogram_declaration(Ada2012Parser.Formal_subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_concrete_subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_concrete_subprogram_declaration(Ada2012Parser.Formal_concrete_subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_abstract_subprogram_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_abstract_subprogram_declaration(Ada2012Parser.Formal_abstract_subprogram_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#subprogram_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_default(Ada2012Parser.Subprogram_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#default_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_name(Ada2012Parser.Default_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_package_declaration(Ada2012Parser.Formal_package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_package_actual_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_package_actual_part(Ada2012Parser.Formal_package_actual_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#formal_package_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_package_association(Ada2012Parser.Formal_package_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#aspect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspect_clause(Ada2012Parser.Aspect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#local_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_name(Ada2012Parser.Local_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#aspect_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspect_specification(Ada2012Parser.Aspect_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#aspect_mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspect_mark(Ada2012Parser.Aspect_markContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#aspect_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspect_definition(Ada2012Parser.Aspect_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#attribute_definition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition_clause(Ada2012Parser.Attribute_definition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#enumeration_representation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_representation_clause(Ada2012Parser.Enumeration_representation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#enumeration_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration_aggregate(Ada2012Parser.Enumeration_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#record_representation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_representation_clause(Ada2012Parser.Record_representation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#component_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_clause(Ada2012Parser.Component_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(Ada2012Parser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#first_bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_bit(Ada2012Parser.First_bitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#last_bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_bit(Ada2012Parser.Last_bitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#code_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_statement(Ada2012Parser.Code_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#storage_pool_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_pool_indicator(Ada2012Parser.Storage_pool_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction(Ada2012Parser.RestrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#restriction_parameter_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriction_parameter_argument(Ada2012Parser.Restriction_parameter_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#delta_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelta_constraint(Ada2012Parser.Delta_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#at_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_clause(Ada2012Parser.At_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Ada2012Parser#mod_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_clause(Ada2012Parser.Mod_clauseContext ctx);
}