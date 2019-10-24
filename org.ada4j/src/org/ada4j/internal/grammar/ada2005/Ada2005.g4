grammar Ada2005;

@lexer::members {
private Token last;

@Override
public void emit(Token token) { 
  this.last = token;
  super.emit(token);
}

protected boolean previousTokenIs(int tokenType) {
  return last != null && last.getType() == tokenType;
}
 
}

numeric_literal
: 
    DECIMAL_LITERAL 
    | BASED_LITERAL
;

pragma
:
    PRAGMA IDENTIFIER
    (
        LPAR pragma_argument_association
        (
            COMMA pragma_argument_association
        )* RPAR
    )? SEMI_COLON
;

pragma_argument_association
:
    (
        IDENTIFIER RARROW
    )? expression
; // alternative name supprim�e car redondante 

basic_declaration
:
    type_declaration
    | subtype_declaration
    | object_declaration
    | number_declaration
    | subprogram_declaration
    | abstract_subprogram_declaration
    | null_procedure_declaration
    | package_declaration
    | renaming_declaration
    | exception_declaration
    | generic_declaration
    | generic_instantiation
    | pragma
;

defining_identifier
:
    IDENTIFIER
;

type_declaration
:
    full_type_declaration
    | incomplete_type_declaration
    | private_type_declaration
    | private_extension_declaration
;

full_type_declaration
:
    TYPE defining_identifier known_discriminant_part?
     IS type_definition SEMI_COLON 
| task_type_declaration
    | protected_type_declaration
;

type_definition
:
    enumeration_type_definition
    | integer_type_definition
    | real_type_definition
    | array_type_definition
    | record_type_definition
    | access_type_definition
    | derived_type_definition
    | interface_type_definition
;

subtype_declaration
:
    SUBTYPE defining_identifier IS subtype_indication SEMI_COLON
;

subtype_indication
: null_exclusion? subtype_mark constraint?
    
;

subtype_mark
:
    name
;

constraint
:
    scalar_constraint
    | composite_constraint
;

scalar_constraint
:
    range_constraint
    | digits_constraint
    | delta_constraint
;

composite_constraint
:
    index_constraint
    | discriminant_constraint
;

object_declaration
:
    defining_identifier_list COLON
    
        ALIASED?
    
    
        CONSTANT?
     subtype_access_or_array_type_definition
    (
        AFFECTATION_SIGN expression
    )? SEMI_COLON
    | single_task_declaration
    | single_protected_declaration
;

subtype_access_or_array_type_definition
:
    subtype_indication
    | access_definition
    | array_type_definition
;

defining_identifier_list
:
    defining_identifier
    (
        COMMA defining_identifier
    )*
;

number_declaration
:
    defining_identifier_list COLON CONSTANT AFFECTATION_SIGN expression
    SEMI_COLON
;

derived_type_definition
:
    
        ABSTRACT?
    
    
        LIMITED?
     NEW subtype_indication
    
        interface_and_record_extension_specification?
    
;

interface_and_record_extension_specification
:
    (
        AND interface_list
    )? record_extension_part
;

range_constraint
:
    RANGE range
;

range
:
    range_attribute_reference
    | simple_expression RANGE_SEPARATOR simple_expression
;

enumeration_type_definition
:
    LPAR enumeration_literal_specification
    (
        COMMA enumeration_literal_specification
    )* RPAR
;

enumeration_literal_specification
:
    defining_identifier
    | defining_character_literal
;

defining_character_literal
:
    CHARACTER_LITERAL
;

integer_type_definition
:
    signed_integer_type_definition
    | modular_type_definition
;

signed_integer_type_definition
:
    RANGE simple_expression RANGE_SEPARATOR simple_expression
;

modular_type_definition
:
    MOD expression
;

real_type_definition
:
    floating_point_definition
    | fixed_point_definition
;

floating_point_definition
:
    DIGITS expression
    
        real_range_specification?
    
;

real_range_specification
:
    RANGE simple_expression RANGE_SEPARATOR simple_expression
;

fixed_point_definition
:
    ordinary_fixed_point_definition
    | decimal_fixed_point_definition
;

ordinary_fixed_point_definition
:
    DELTA expression real_range_specification
;

decimal_fixed_point_definition
:
    DELTA expression DIGITS expression
    
        real_range_specification?
    
;

digits_constraint
:
    DIGITS expression
    
        range_constraint?
    
;

array_type_definition
:
    unconstrained_array_definition
    | constrained_array_definition
;

unconstrained_array_definition
:
    ARRAY LPAR index_subtype_definition
    (
        COMMA index_subtype_definition
    )* RPAR OF component_definition
;

index_subtype_definition
:
    subtype_mark RANGE BOX
;

constrained_array_definition
:
    ARRAY LPAR discrete_subtype_definition
    (
        COMMA discrete_subtype_definition
    )* RPAR OF component_definition
;

discrete_subtype_definition
:
    subtype_indication |
     range
;

component_definition
:
    
        ALIASED?
     subtype_indication
    |
    
        ALIASED?
     access_definition
;

index_constraint
:
    LPAR discrete_range
    (
        COMMA discrete_range
    )* RPAR
;

discrete_range
:
    subtype_indication | range
;

discriminant_part
:
    unknown_discriminant_part
    | known_discriminant_part
;

unknown_discriminant_part
:
    LPAR BOX RPAR
;

known_discriminant_part
:
    LPAR discriminant_specification_list RPAR
;

discriminant_specification_list
:
    discriminant_specification
    (
        SEMI_COLON discriminant_specification
    )*
;

discriminant_specification
:
    defining_identifier_list COLON
    
        null_exclusion?
     subtype_mark
    
        discriminant_specification_default?
    
    | defining_identifier_list COLON access_definition
    
        discriminant_specification_default?
    
;

discriminant_specification_default
:
    AFFECTATION_SIGN default_expression
;

default_expression
:
    expression
;

discriminant_constraint
:
    LPAR discriminant_association
    (
        COMMA discriminant_association
    )* RPAR
;

discriminant_association
:
    (
        selector_name
        (
            PIPE selector_name
        )* RARROW
    )? expression
;

record_type_definition
:
    (
        
            ABSTRACT?
         TAGGED)?
    
    
        LIMITED?
     record_definition
;

record_definition
:
    RECORD component_list END RECORD
    | NULL RECORD
;

component_list
:
    component_item+
    | component_item* variant_part
    | NULL SEMI_COLON
;

component_item
:
    component_declaration
    | aspect_clause
    | pragma
;

component_declaration
:
    defining_identifier_list COLON component_definition
    
        component_declaration_default?
     SEMI_COLON
;

component_declaration_default
:
    AFFECTATION_SIGN default_expression
;

variant_part
:
    CASE direct_name IS
    (
        variant
    )+ END CASE SEMI_COLON
;

variant
:
    WHEN discrete_choice_list RARROW component_list
;

discrete_choice_list
:
    discrete_choice
    (
        PIPE discrete_choice
    )*
;

discrete_choice
:
    expression
    | discrete_range
    | OTHERS
;

record_extension_part
:
    WITH record_definition
;

abstract_subprogram_declaration
:
    
        overriding_indicator?
     subprogram_specification IS ABSTRACT SEMI_COLON
;

interface_type_definition
:
    
        interface_type_definition_modifier?
     INTERFACE
    
        interface_type_definition_list?
    
;

interface_type_definition_modifier
:
    LIMITED
    | TASK
    | PROTECTED
    | SYNCHRONIZED
;

interface_type_definition_list
:
    AND interface_list
;

interface_list
:
    subtype_mark
    (
        AND subtype_mark
    )*
;

access_type_definition
:
    
        null_exclusion?
     access_to_object_definition
    |
    
        null_exclusion?
     access_to_subprogram_definition
;

access_to_object_definition
:
    ACCESS
    
        general_access_modifier?
     subtype_indication
;

general_access_modifier
:
    ALL
    | CONSTANT
;

access_to_subprogram_definition
:
    ACCESS
    
        PROTECTED?
     PROCEDURE parameter_profile
    | ACCESS
    
        PROTECTED?
     FUNCTION parameter_and_result_profile
;

null_exclusion
:
    NOT NULL
;

access_definition
:
    
        null_exclusion?
     ACCESS
    
       CONSTANT?
     subtype_mark
    |
    
        null_exclusion?
     ACCESS
    
        PROTECTED?
     PROCEDURE parameter_profile
    |
    
        null_exclusion?
     ACCESS
    
        PROTECTED?
     FUNCTION parameter_and_result_profile
;

incomplete_type_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
    
    
        (IS TAGGED)?
     SEMI_COLON
;

declarative_part
:
    declarative_item*
;

declarative_item
:
    basic_declarative_item
    | body
;

basic_declarative_item
:
    basic_declaration
    | aspect_clause
    | use_clause
;

body
:
    proper_body
    | body_stub
;

proper_body
:
    subprogram_body
    | package_body
    | task_body
    | protected_body
;

name : direct_name name_component* | CHARACTER_LITERAL;

name_component :
                   explicit_dereference_component
               | indexed_slice_type_conv_or_function_call_component
               | selected_component_component
               | attribute_reference_component;

explicit_dereference_component : DOT ALL;

indexed_slice_type_conv_or_function_call_component:
                                                      LPAR index_or_parameter_value (COMMA index_or_parameter_value)* RPAR;

index_or_parameter_value: expression | discrete_range | parameter_association;

selected_component_component:
                                DOT selector_name;

attribute_reference_component:
                                 APOSTROPHE attribute_designator;

direct_name
:
    IDENTIFIER
    | operator_symbol
;

prefix
:
    name
;

explicit_dereference
:
    name DOT ALL
;

indexed_component
:
    prefix LPAR expression
    (
        COMMA expression
    )* RPAR
;

slice
:
    prefix LPAR discrete_range RPAR
;

selected_component
:
    prefix DOT selector_name
;

selector_name
:
    (
        IDENTIFIER
        | CHARACTER_LITERAL        
    )
    | operator_symbol
;

attribute_reference
:
    prefix APOSTROPHE attribute_designator
;

attribute_designator
:
    (IDENTIFIER
    (
        LPAR expression RPAR
    )?)
    |
    (
        ACCESS
        | DELTA
        | DIGITS
    )
;

range_attribute_reference
:
    prefix APOSTROPHE range_attribute_designator
;

range_attribute_designator
:
    RANGE
    (
        LPAR expression RPAR
    )?
;

aggregate
:
    record_aggregate
    | extension_aggregate
    | array_aggregate
;

record_aggregate
:
    LPAR record_component_association_list RPAR
;

record_component_association_list
:
    record_component_association
    (
        COMMA record_component_association
    )*
    | NULL RECORD
;

record_component_association
:
    (
        component_choice_list RARROW
    )? expression
    | component_choice_list RARROW BOX
;

component_choice_list
:
    selector_name
    (
        PIPE selector_name
    )*
    | OTHERS
;

extension_aggregate
:
    LPAR ancestor_part WITH record_component_association_list RPAR
;

ancestor_part
:
    expression
    | subtype_mark
;

array_aggregate
:
    positional_array_aggregate
    | named_array_aggregate
;

positional_array_aggregate
:
    LPAR expression COMMA expression
    (
        COMMA expression
    )* RPAR
    | LPAR expression
    (
        COMMA expression
    )* COMMA OTHERS RARROW expression RPAR
    | LPAR expression
    (
        COMMA expression
    )* COMMA OTHERS RARROW BOX RPAR
;

named_array_aggregate
:
    LPAR array_component_association
    (
        COMMA array_component_association
    )* RPAR
;

array_component_association
:
    discrete_choice_list RARROW expression
    | discrete_choice_list RARROW BOX
;

expression
:
    relation
    (
        AND relation
    )*
    | relation
    (
        AND THEN relation
    )*
    | relation
    (
        OR relation
    )*
    | relation
    (
        OR ELSE relation
    )*
    | relation
    (
        XOR relation
    )*
;

relation
:
    simple_expression
    
        (relational_operator simple_expression)?
    
    | simple_expression
    
        NOT?
     IN range
    | simple_expression
    
        NOT?
     IN subtype_mark
;

simple_expression
:
    
        unary_adding_operator?
     term
    (binary_adding_operator term)*
;

term
:
    factor
    (multiplying_operator factor)*
;

factor
:
    primary
    (
        POWER primary
    )?
    | ABS primary
    | NOT primary
;

primary
:
    numeric_literal
    |
    (NULL |
         STRING_LITERAL)
   | aggregate
    | name
    | qualified_expression
    | allocator
    | LPAR expression RPAR
;

logical_operator
:
    AND
    | OR
    | XOR
;

relational_operator
:
    EQUAL
    | NEQUAL
    | LT
    | LEQT
    | GT
    | GEQT
;

binary_adding_operator
:
    PLUS
    | MINUS
    | AMPERSAND
;

unary_adding_operator
:
    PLUS
    | MINUS
;

multiplying_operator
:
    ASTERISK
    | SLASH
    | MOD
    | REM
;

highest_precedence_operator
:
    POWER
    | ABS
    | NOT
;

type_conversion
:
    subtype_mark LPAR expression RPAR;
    // | subtype_mark LPAR name RPAR 
    // alternative supprim�e car redondante 

qualified_expression
:
    subtype_mark APOSTROPHE LPAR expression RPAR
    | subtype_mark APOSTROPHE aggregate
;

allocator
:
    NEW subtype_indication
    | NEW qualified_expression
;

sequence_of_statements
:
    statement+
;

statement
:
    (
        label
    )* simple_statement
    |
    (
        label
    )* compound_statement
;

simple_statement
:
    null_statement
    | assignment_statement
    | exit_statement
    | goto_statement
    | procedure_call_statement
    | simple_return_statement
    | entry_call_statement
    | requeue_statement
    | delay_statement
    | abort_statement
    | raise_statement
    | code_statement
    | pragma
;

compound_statement
:
    if_statement
    | case_statement
    | loop_statement
    | block_statement
    | extended_return_statement
    | accept_statement
    | select_statement
;

null_statement
:
    NULL SEMI_COLON
;

label
:
    RWND statement_identifier FFWD
;

statement_identifier
:
    direct_name
;

assignment_statement
:
    name AFFECTATION_SIGN expression SEMI_COLON
;

if_statement
:
    IF condition THEN sequence_of_statements
    (
        ELSIF condition THEN sequence_of_statements
    )*
    (
        ELSE sequence_of_statements
    )? END IF SEMI_COLON
;

condition
:
    expression
;

case_statement
:
    CASE expression IS (case_statement_alternative)+ END CASE SEMI_COLON
;

case_statement_alternative
:
    WHEN discrete_choice_list RARROW sequence_of_statements
;

loop_statement
:
    (
        statement_identifier COLON
    )?
    
        iteration_scheme?
     LOOP sequence_of_statements END LOOP
    
        IDENTIFIER?
     SEMI_COLON
;

iteration_scheme
:
    WHILE condition
    | FOR loop_parameter_specification
;

loop_parameter_specification
:
    defining_identifier IN
    
        REVERSE?
     discrete_subtype_definition
;

block_statement
:
    (
        statement_identifier COLON
    )?
    (
        DECLARE declarative_part
    )? BEGIN handled_sequence_of_statements END
    
       IDENTIFIER?
     SEMI_COLON
;

exit_statement
:
    EXIT
    
        name?
    
    (
        WHEN condition
    )? SEMI_COLON
;

goto_statement
:
    GOTO name SEMI_COLON
;

subprogram_declaration
:
    
        overriding_indicator?
     subprogram_specification SEMI_COLON
;

subprogram_specification
:
    procedure_specification
    | function_specification
;

procedure_specification
:
    PROCEDURE defining_program_unit_name parameter_profile
;

function_specification
:
    FUNCTION defining_designator parameter_and_result_profile
;

designator
:
    (
        parent_unit_name DOT
    )? IDENTIFIER
    | operator_symbol
;

defining_designator
:
    defining_program_unit_name
    | defining_operator_symbol
;

defining_program_unit_name
:
    (
        parent_unit_name DOT
    )? defining_identifier
;

operator_symbol
:
    STRING_LITERAL
;

defining_operator_symbol
:
    operator_symbol
;

parameter_profile
:
    
        formal_part?
    
;

parameter_and_result_profile
:
    
        formal_part?
     RETURN
    
        null_exclusion?
     subtype_mark
    |
    
        formal_part?
     RETURN access_definition
;

formal_part
:
    LPAR parameter_specification
    (
        SEMI_COLON parameter_specification
    )* RPAR
;

parameter_specification
:
    defining_identifier_list COLON parameter_type_specification
;

parameter_type_specification
:
    param_mode
    
        null_exclusion?
     subtype_mark
    
        parameter_specification_default?
    
    | access_definition
    
        parameter_specification_default?
    
;

parameter_specification_default
:
    AFFECTATION_SIGN default_expression
;

param_mode
:
    
        IN?
    
    | IN OUT
    | OUT
;

subprogram_body
:
    
        overriding_indicator?
     subprogram_specification IS declarative_part BEGIN
    handled_sequence_of_statements END
    
        designator?
     SEMI_COLON
;

procedure_call_statement
:
    prefix actual_parameter_part SEMI_COLON;
    // | name SEMI_COLON
    // alternative supprim�e car redondante 

function_call
:
    prefix actual_parameter_part
;

actual_parameter_part
:
    LPAR parameter_association
    (
        COMMA parameter_association
    )* RPAR
;

parameter_association
:
    (
        selector_name RARROW
    )? explicit_actual_parameter
;

explicit_actual_parameter
:
    expression;
    // | name
    //alternative supprim�e car redondante

simple_return_statement
:
    RETURN
    
       expression?
     SEMI_COLON
;

extended_return_statement
:
    RETURN defining_identifier COLON
    
        ALIASED?
     return_subtype_indication
    (
        AFFECTATION_SIGN expression
    )?
    (
        DO handled_sequence_of_statements END RETURN
    )? SEMI_COLON
;

return_subtype_indication
:
    subtype_indication
    | access_definition
;

null_procedure_declaration
:
    
        overriding_indicator?
     procedure_specification IS NULL SEMI_COLON
;

package_declaration   
: 
    package_specification SEMI_COLON
;

private_part:

        PRIVATE
        (
            basic_declarative_item
        )*;
    


package_specification
:
    PACKAGE defining_program_unit_name IS
    (
        basic_declarative_item
    )*
    private_part? END
    (
        (
            parent_unit_name DOT
        )? IDENTIFIER
    )?
;

package_body
:
    PACKAGE BODY defining_program_unit_name IS declarative_part
    (
        BEGIN handled_sequence_of_statements
    )? END
    (
        (
            parent_unit_name DOT
        )? IDENTIFIER
    )? SEMI_COLON
;

private_type_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
     IS
    
        (
            ABSTRACT?
         TAGGED)?
    
    
        LIMITED?
     PRIVATE SEMI_COLON
;

private_extension_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
     IS
    
        ABSTRACT?
    
    (
        LIMITED
        | SYNCHRONIZED
    )? NEW subtype_indication
    (
        AND interface_list
    )? WITH PRIVATE SEMI_COLON
;

overriding_indicator
:
    
        NOT?
     OVERRIDING
;

use_clause
:
    use_package_clause
    | use_type_clause
;

use_package_clause
:
    USE name
    (
        COMMA name
    )* SEMI_COLON
;

use_type_clause
:
    USE TYPE subtype_mark
    (
        COMMA subtype_mark
    )* SEMI_COLON
;

renaming_declaration
:
    object_renaming_declaration
    | exception_renaming_declaration
    | package_renaming_declaration
    | subprogram_renaming_declaration
    | generic_renaming_declaration
;

object_renaming_declaration
:
    defining_identifier COLON
    
        null_exclusion?
     subtype_mark RENAMES name SEMI_COLON
    | defining_identifier COLON access_definition RENAMES name SEMI_COLON
;

exception_renaming_declaration
:
    defining_identifier COLON EXCEPTION RENAMES name SEMI_COLON
;

package_renaming_declaration
:
    PACKAGE defining_program_unit_name RENAMES name SEMI_COLON
;

subprogram_renaming_declaration
:
    
        overriding_indicator?
     subprogram_specification RENAMES name SEMI_COLON
;

generic_renaming_declaration
:
    GENERIC PACKAGE defining_program_unit_name RENAMES name SEMI_COLON
    | GENERIC PROCEDURE defining_program_unit_name RENAMES name SEMI_COLON
    | GENERIC FUNCTION defining_program_unit_name RENAMES name SEMI_COLON
;

task_type_declaration
:
    TASK TYPE defining_identifier
    
        known_discriminant_part?
    
    
        task_type_declaration_definition?
     SEMI_COLON
;

task_type_declaration_definition
:
    IS
    (
        NEW interface_list WITH
    )? task_definition
;

single_task_declaration
:
    TASK defining_identifier
    
        task_type_declaration_definition?
     SEMI_COLON
;

task_definition
:
    (
        task_item
    )*
    (
        PRIVATE
        (
            task_item
        )*
    )? END
    
        IDENTIFIER?
    
;

task_item
:
    entry_declaration
    | aspect_clause
    | pragma
;

task_body
:
    TASK BODY defining_identifier IS declarative_part BEGIN
    handled_sequence_of_statements END
    
        IDENTIFIER?
     SEMI_COLON
;

protected_type_declaration
:
    PROTECTED TYPE defining_identifier
    
        known_discriminant_part?
     IS
    (
        NEW interface_list WITH
    )? protected_definition SEMI_COLON
;

single_protected_declaration
:
    PROTECTED defining_identifier IS
    (
        NEW interface_list WITH
    )? protected_definition SEMI_COLON
;

protected_definition
:
    (
        protected_operation_declaration
    )*
    (
        PRIVATE
        (
            protected_element_declaration
        )*
    )? END
    
        IDENTIFIER?
    
;

protected_operation_declaration
:
    subprogram_declaration
    | entry_declaration
    | aspect_clause
    | pragma
;

protected_element_declaration
:
    protected_operation_declaration
    | component_declaration
;

protected_body
:
    PROTECTED BODY defining_identifier IS
    (
        protected_operation_item
    )* END
    
        IDENTIFIER?
     SEMI_COLON
;

protected_operation_item
:
    subprogram_declaration
    | subprogram_body
    | entry_body
    | aspect_clause
;

entry_declaration
:
    
        overriding_indicator?
     ENTRY defining_identifier
    (
        LPAR discrete_subtype_definition RPAR
    )? parameter_profile SEMI_COLON
;

accept_statement
:
    ACCEPT direct_name
    (
        LPAR entry_index RPAR
    )? parameter_profile
    (
        DO handled_sequence_of_statements END
        
            IDENTIFIER?
        
    )? SEMI_COLON
;

entry_index
:
    expression
;

entry_body
:
    ENTRY defining_identifier entry_body_formal_part entry_barrier IS
    declarative_part BEGIN handled_sequence_of_statements END
    
        IDENTIFIER?
     SEMI_COLON
;

entry_body_formal_part
:
    (
        LPAR entry_index_specification RPAR
    )? parameter_profile
;

entry_barrier
:
    WHEN condition
;

entry_index_specification
:
    FOR defining_identifier IN discrete_subtype_definition
;

entry_call_statement
:
    name
    
        actual_parameter_part?
     SEMI_COLON
;

requeue_statement
:
    REQUEUE name
    (
        WITH ABORT
    )? SEMI_COLON
;

delay_statement
:
    delay_until_statement
    | delay_relative_statement
;

delay_until_statement
:
    DELAY UNTIL expression SEMI_COLON
;

delay_relative_statement
:
    DELAY expression SEMI_COLON
;

select_statement
:
    selective_accept
    | timed_entry_call
    | conditional_entry_call
    | asynchronous_select
;

selective_accept
:
    SELECT
    
        guard?
     select_alternative
    (
        OR
        
            guard?
         select_alternative
    )*
    (
        ELSE sequence_of_statements
    )? END SELECT SEMI_COLON
;

guard
:
    WHEN condition RARROW
;

select_alternative
:
    accept_alternative
    | delay_alternative
    | terminate_alternative
;

accept_alternative
:
    accept_statement
    
        sequence_of_statements?
    
;

delay_alternative
:
    delay_statement
    
        sequence_of_statements?
    
;

terminate_alternative
:
    TERMINATE SEMI_COLON
;

timed_entry_call
:
    SELECT entry_call_alternative OR delay_alternative END SELECT SEMI_COLON
;

entry_call_alternative
:
    procedure_or_entry_call
    
        sequence_of_statements?
    
;

procedure_or_entry_call
:
    procedure_call_statement
    | entry_call_statement
;

conditional_entry_call
:
    SELECT entry_call_alternative ELSE sequence_of_statements END SELECT
    SEMI_COLON
;

asynchronous_select
:
    SELECT triggering_alternative THEN ABORT abortable_part END SELECT
    SEMI_COLON
;

triggering_alternative
:
    triggering_statement
    
        sequence_of_statements?
    
;

triggering_statement
:
    procedure_or_entry_call
    | delay_statement
;

abortable_part
:
    sequence_of_statements
;

abort_statement
:
    ABORT name
    (
        COMMA name
    )* SEMI_COLON
;

compilation
:
    compilation_unit*
;

compilation_unit
:
    context_clause library_item
    | context_clause subunit
    | pragma
;

library_item
:
    
        (PRIVATE?
     library_unit_declaration)
    | library_unit_body
    |
    
        (PRIVATE?
     library_unit_renaming_declaration)
;

library_unit_declaration
:
    subprogram_declaration
    | package_declaration
    | generic_declaration
    | generic_instantiation
    | pragma
;

library_unit_renaming_declaration
:
    package_renaming_declaration
    | generic_renaming_declaration
    | subprogram_renaming_declaration
    | pragma
;

library_unit_body
:
    subprogram_body
    | package_body
;

parent_unit_name
:
    name
;

context_clause
:
    context_item*
;

context_item
:
    with_clause
    | use_clause
;

with_clause
:
    limited_with_clause
    | nonlimited_with_clause
;

limited_with_clause
:
    LIMITED
    
        PRIVATE?
     WITH name
    (
        COMMA name
    )* SEMI_COLON
;

nonlimited_with_clause
:
    PRIVATE? WITH name
    (
        COMMA name
    )* SEMI_COLON
;

body_stub
:
    subprogram_body_stub
    | package_body_stub
    | task_body_stub
    | protected_body_stub
;

subprogram_body_stub
:
    
        overriding_indicator?
     subprogram_specification IS SEPARATE SEMI_COLON
;

package_body_stub
:
    PACKAGE BODY defining_identifier IS SEPARATE SEMI_COLON
;

task_body_stub
:
    TASK BODY defining_identifier IS SEPARATE SEMI_COLON
;

protected_body_stub
:
    PROTECTED BODY defining_identifier IS SEPARATE SEMI_COLON
;

subunit
:
    SEPARATE LPAR parent_unit_name RPAR proper_body
;

exception_declaration
:
    defining_identifier_list COLON EXCEPTION SEMI_COLON
;

handled_sequence_of_statements
:
    sequence_of_statements
    (
        EXCEPTION exception_handler+
        
    )?
;

exception_handler
:
    WHEN
    (
        choice_parameter_specification COLON
    )? exception_choice
    (
        PIPE exception_choice
    )* RARROW sequence_of_statements
;

choice_parameter_specification
:
    defining_identifier
;

exception_choice
:
    name
    | OTHERS
;

raise_statement
:
    RAISE SEMI_COLON
    | RAISE name
    (
        WITH expression
    )? SEMI_COLON
;

generic_declaration
:
    generic_subprogram_declaration
    | generic_package_declaration
;

generic_subprogram_declaration
:
    generic_formal_part subprogram_specification SEMI_COLON
;

generic_package_declaration
:
    generic_formal_part package_specification SEMI_COLON
;

generic_formal_part
:
    GENERIC
    (
        generic_formal_parameter_declaration | use_clause | pragma
    )*
;

generic_formal_parameter_declaration
:
    formal_object_declaration
    | formal_type_declaration
    | formal_subprogram_declaration
    | formal_package_declaration
;

generic_instantiation
:
    PACKAGE defining_program_unit_name IS generic_instantiation_clause
    |
    
        overriding_indicator?
     PROCEDURE defining_program_unit_name IS generic_instantiation_clause
    |
    
        overriding_indicator?
     FUNCTION defining_designator IS generic_instantiation_clause
;

generic_instantiation_clause
:
    NEW name
    
        generic_actual_part?
     SEMI_COLON
;

generic_actual_part
:
    LPAR generic_association
    (
        COMMA generic_association
    )* RPAR
;

generic_association
:
    (
        selector_name RARROW
    )? explicit_generic_actual_parameter
;

explicit_generic_actual_parameter
:
    expression
    | name
    | subtype_mark
;

formal_object_declaration
:
    defining_identifier_list COLON param_mode
    
        null_exclusion?
     subtype_mark
    
        formal_object_declaration_default?
     SEMI_COLON
    | defining_identifier_list COLON param_mode access_definition
    
        formal_object_declaration_default?
     SEMI_COLON
;

formal_object_declaration_default
:
    AFFECTATION_SIGN default_expression
;

formal_type_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
     IS formal_type_definition SEMI_COLON
;

formal_type_definition
:
    formal_private_type_definition
    | formal_derived_type_definition
    | formal_discrete_type_definition
    | formal_signed_integer_type_definition
    | formal_modular_type_definition
    | formal_floating_point_definition
    | formal_ordinary_fixed_point_definition
    | formal_decimal_fixed_point_definition
    | formal_array_type_definition
    | formal_access_type_definition
    | formal_interface_type_definition
;

formal_private_type_definition
:
    (
        
            ABSTRACT?
         TAGGED
    )?
    
        LIMITED?
     PRIVATE
;

formal_derived_type_definition
:
    
        ABSTRACT?
    
    
        (LIMITED
        | SYNCHRONIZED)?
    NEW subtype_mark
    (
        (
            AND interface_list
        )? WITH PRIVATE
    )?
;

formal_discrete_type_definition
:
    LPAR BOX RPAR
;

formal_signed_integer_type_definition
:
    RANGE BOX
;

formal_modular_type_definition
:
    MOD BOX
;

formal_floating_point_definition
:
    DIGITS BOX
;

formal_ordinary_fixed_point_definition
:
    DELTA BOX
;

formal_decimal_fixed_point_definition
:
    DELTA BOX DIGITS BOX
;

formal_array_type_definition
:
    array_type_definition
;

formal_access_type_definition
:
    access_type_definition
;

formal_interface_type_definition
:
    interface_type_definition
;

formal_subprogram_declaration
:
    formal_concrete_subprogram_declaration
    | formal_abstract_subprogram_declaration
;

formal_concrete_subprogram_declaration
:
    WITH subprogram_specification
    (
        IS subprogram_default
    )? SEMI_COLON
;

formal_abstract_subprogram_declaration
:
    WITH subprogram_specification IS ABSTRACT
    
        subprogram_default?
     SEMI_COLON
;

subprogram_default
:
    default_name
    |
    (
        BOX
        | NULL
    )
;

default_name
:
    name
;

formal_package_declaration
:
    WITH PACKAGE defining_identifier IS NEW name formal_package_actual_part
    SEMI_COLON
;

formal_package_actual_part
:
    LPAR
    (
        OTHERS RARROW
    )? BOX RPAR
    |
    
        generic_actual_part?
    
    | LPAR formal_package_association
    (
        COMMA formal_package_association
    )*
    (
        COMMA OTHERS RARROW BOX
    )? RPAR
;

formal_package_association
:
    generic_association
    | selector_name RARROW BOX
;

aspect_clause
:
    attribute_definition_clause
    | enumeration_representation_clause
    | record_representation_clause
    | at_clause
;

local_name
:
    direct_name
    | direct_name APOSTROPHE attribute_designator
    | name
;

attribute_definition_clause
:
    FOR local_name APOSTROPHE attribute_designator USE expression SEMI_COLON;
   //FOR local_name APOSTROPHE attribute_designator USE name SEMI_COLON
   //alternative supprim�e car redondante

enumeration_representation_clause
:
    FOR local_name USE enumeration_aggregate SEMI_COLON
;

enumeration_aggregate
:
    array_aggregate
;

record_representation_clause
:
    FOR local_name USE RECORD
    
        mod_clause?
    
    (
        component_clause
    )* END RECORD SEMI_COLON
;

component_clause
:
    local_name AT position RANGE first_bit RANGE_SEPARATOR last_bit SEMI_COLON
;

position
:
    expression
;

first_bit
:
    simple_expression
;

last_bit
:
    simple_expression
;

code_statement
:
    qualified_expression SEMI_COLON
;

restriction
:
    IDENTIFIER
    (
        RARROW restriction_parameter_argument
    )?
;

restriction_parameter_argument
:
    //name |
    // alternative supprim�e car redondante
    expression;

delta_constraint
:
    DELTA expression
    
        range_constraint?
    
;

at_clause
:
    FOR direct_name USE AT expression SEMI_COLON
;

mod_clause
:
    AT MOD expression SEMI_COLON
;

BASED_LITERAL
:
    NUMERAL (SHARP | COLON) BASED_NUMERAL
    (
        DOT BASED_NUMERAL
    )? (SHARP | COLON) EXPONENT?
;

fragment BASED_NUMERAL
:
    EXTENDED_DIGIT
    (
             UNDERLINE?
         EXTENDED_DIGIT
    )*
;

DECIMAL_LITERAL
:
    NUMERAL
    (
        DOT NUMERAL
    )?
        EXPONENT?
;

NUMERAL
:
    DIGIT
    
        
            (UNDERLINE?
         DIGIT)*
;

fragment DIGIT
: [0-9];

fragment A
:
    (
        'a'
        | 'A'
    )
;

fragment B
:
    (
        'b'
        | 'B'
    )
;

fragment C
:
    (
        'c'
        | 'C'
    )
;

fragment D
:
    (
        'd'
        | 'D'
    )
;

fragment E
:
    (
        'e'
        | 'E'
    )
;

fragment F
:
    (
        'f'
        | 'F'
    )
;

fragment SPACE : ' ';

fragment CHARACTER : ~('\u0000'..'\u001F' | '\u007F');

CHARACTER_LITERAL
:
    {!previousTokenIs(IDENTIFIER) && !previousTokenIs(ALL) && !previousTokenIs(RPAR) 
     && !previousTokenIs(DECIMAL_LITERAL) && !previousTokenIs(BASED_LITERAL)
     && !previousTokenIs(CHARACTER_LITERAL) && !previousTokenIs(STRING_LITERAL)}?
    '\''
  CHARACTER
  '\''
;

APOSTROPHE
:
    '\''
;

STRING_LITERAL
:
    (DOUBLE_QUOTE
    (STRING_ELEMENT | EMPTY_STRING)*
    DOUBLE_QUOTE)
    | PERCENT STRING_ELEMENT* PERCENT
;

WS
:
    (
        SPACE
        | TAB
        | '\r'
        | '\b'
        | '\n'
        | '\f'
        | '\u000B' // vertical tab
    )+ -> channel(HIDDEN)
;

COMMENT
:
    '--' ~( '\n' | '\r' | '\f' )* -> channel(HIDDEN)
;

LBRACKET
:
    '['
;

RBRACKET
:
    ']'
;

LPAR
:
    '('
;

RPAR
:
    ')'
;

COMMA
:
    ','
;

COLON
:
    ':'
;

SEMI_COLON
:
    ';'
;

AFFECTATION_SIGN
:
    ':='
;

RARROW
:
    '=>'
;

RANGE_SEPARATOR
:
    '..'
;

BOX
:
    '<>'
;

PIPE
:
    '|' | '!'
;

EXCL_MARK
:
    '!'
;

DOT
:
    '.'
;

EQUAL
:
    '='
;

NEQUAL
:
    '/='
;

LT
:
    '<'
;

LEQT
:
    '<='
;

GT
:
    '>'
;

GEQT
:
    '>='
;

PLUS
:
    '+'
;

MINUS
:
    '-'
;

AMPERSAND
:
    '&'
;

ASTERISK
:
    '*'
;

POWER
:
    '**'
;

SLASH
:
    '/'
;

FFWD
:
    '>>'
;

RWND
:
    '<<'
;

UNDERLINE
:
    '_'
;

SHARP
:
    '#'
;

PRAGMA
:
    P R A G M A
;

TYPE
:
    T Y P E
;

IS
:
    I S
;

SUBTYPE
:
    S U B T Y P E
;

ALIASED
:
    A L I A S E D
;

CONSTANT
:
    C O N S T A N T
;

ABSTRACT
:
    A B S T R A C T
;

LIMITED
:
    L I M I T E D
;

NEW
:
    N E W
;

AND
:
    A N D
;

RANGE
:
    R A N G E
;

MOD
:
    M O D
;

DIGITS
:
    D I G I T S
;

DELTA
:
    D E L T A
;

ARRAY
:
    A R R A Y
;

OF
:
    O F
;

TAGGED
:
    T A G G E D
;

RECORD
:
    R E C O R D
;

END
:
    E N D
;

NULL
:
    N U L L
;

CASE
:
    C A S E
;

WHEN
:
    W H E N
;

OTHERS
:
    O T H E R S
;

WITH
:
    W I T H
;

INTERFACE
:
    I N T E R F A C E
;

TASK
:
    T A S K
;

PROTECTED
:
    P R O T E C T E D
;

SYNCHRONIZED
:
    S Y N C H R O N I Z E D
;

ACCESS
:
    A C C E S S
;

ALL
:
    A L L
;

PROCEDURE
:
    P R O C E D U R E
;

FUNCTION
:
    F U N C T I O N
;

NOT
:
    N O T
;

THEN
:
    T H E N
;

OR
:
    O R
;

ELSE
:
    E L S E
;

XOR
:
    X O R
;

IN
:
    I N
;

ABS
:
    A B S
;

IF
:
    I F
;

ELSIF
:
    E L S I F
;

REM
:
    R E M
;

LOOP
:
    L O O P
;

WHILE
:
    W H I L E
;

FOR
:
    F O R
;

REVERSE
:
    R E V E R S E
;

BEGIN
:
    B E G I N
;

DECLARE
:
    D E C L A R E
;

EXIT
:
    E X I T
;

GOTO
:
    G O T O
;

RETURN
:
    R E T U R N
;

OUT
:
    O U T
;

DO
:
    D O
;

PACKAGE
:
    P A C K A G E
;

PRIVATE
:
    P R I V A T E
;

BODY
:
    B O D Y
;

OVERRIDING
:
    O V E R R I D I N G
;

USE
:
    U S E
;

RENAMES
:
    R E N A M E S
;

EXCEPTION
:
    E X C E P T I O N
;

GENERIC
:
    G E N E R I C
;

ENTRY
:
    E N T R Y
;

ACCEPT
:
    A C C E P T
;

REQUEUE
:
    R E Q U E U E
;

ABORT
:
    A B O R T
;

DELAY
:
    D E L A Y
;

UNTIL
:
    U N T I L
;

SELECT
:
    S E L E C T
;

TERMINATE
:
    T E R M I N A T E
;

SEPARATE
:
    S E P A R A T E
;

RAISE
:
    R A I S E
;

AT
:
    A T
;

IDENTIFIER
:
    IDENTIFIER_START
    (
        IDENTIFIER_START | IDENTIFIER_EXTEND
    )*
;

fragment EXPONENT
:
    E
    (PLUS? | MINUS) NUMERAL
;

EXTENDED_DIGIT
:
    DIGIT
    | A 
    | B
    | C
    | D
    | E
    | F
;

fragment EMPTY_STRING :
                          DOUBLE_QUOTE DOUBLE_QUOTE;

fragment STRING_ELEMENT
:
 ~( '"' | '\u0000'..'\u001F' | '\u007F')
;

fragment LETTER_UPPERCASE
:
    [\p{Lu}]
;

fragment LETTER_LOWERCASE
:
    [\p{Ll}]
;

fragment LETTER_TITLECASE
:
    [\p{Lt}]
;

fragment LETTER_MODIFIER
:
    [\p{Lm}]
;

fragment LETTER_OTHER
:
    [\p{Lo}]
;

fragment NUMBER_LETTER
:
    [\p{Nl}]
;

fragment MARK_NON_SPACING
:
    [\p{Mn}]
;

fragment MARK_SPACING_COMBINING
:
    [\p{Mc}]
;

fragment NUMBER_DECIMAL
:
    [\p{Nd}]
;

fragment PUNCTUATION_CONNECTOR
:
    [\p{Pc}]
;

fragment OTHER_FORMAT
:
    [\p{Cf}]
;

fragment IDENTIFIER_START
:
LETTER_UPPERCASE | LETTER_LOWERCASE | LETTER_TITLECASE | LETTER_MODIFIER | LETTER_OTHER | NUMBER_LETTER
;

fragment IDENTIFIER_EXTEND
:
MARK_NON_SPACING | MARK_SPACING_COMBINING | NUMBER_DECIMAL | PUNCTUATION_CONNECTOR | OTHER_FORMAT
;


fragment
TAB
:
    '\t'
;

DOUBLE_QUOTE : '"';

PERCENT : '%';

fragment
G
:
    (
        'g'
        | 'G'
    )
;

fragment
H
:
    (
        'h'
        | 'H'
    )
;

fragment
I
:
    (
        'i'
        | 'I'
    )
;

fragment
J
:
    (
        'j'
        | 'J'
    )
;

fragment
K
:
    (
        'k'
        | 'K'
    )
;

fragment
L
:
    (
        'l'
        | 'L'
    )
;

fragment
M
:
    (
        'm'
        | 'M'
    )
;

fragment
N
:
    (
        'n'
        | 'N'
    )
;

fragment
O
:
    (
        'o'
        | 'O'
    )
;

fragment
P
:
    (
        'p'
        | 'P'
    )
;

fragment
Q
:
    (
        'q'
        | 'Q'
    )
;

fragment
R
:
    (
        'r'
        | 'R'
    )
;

fragment
S
:
    (
        's'
        | 'S'
    )
;

fragment
T
:
    (
        't'
        | 'T'
    )
;

fragment
U
:
    (
        'u'
        | 'U'
    )
;

fragment
V
:
    (
        'v'
        | 'V'
    )
;

fragment
W
:
    (
        'w'
        | 'W'
    )
;

fragment
X
:
    (
        'x'
        | 'X'
    )
;

fragment
Y
:
    (
        'y'
        | 'Y'
    )
;

fragment
Z
:
    (
        'z'
        | 'Z'
    )
;

GARBAGE :
            .+? -> channel(HIDDEN);
