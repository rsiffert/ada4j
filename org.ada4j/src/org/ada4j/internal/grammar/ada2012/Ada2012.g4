grammar Ada2012;

//Rules are numbered according to Annex P of Ada 2012 Reference Manual

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

@parser::members {
    private boolean parenthesizedContext = false;
}

//2.4
numeric_literal
: 
    DECIMAL_LITERAL 
    | BASED_LITERAL
;

//2.8
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

//2.8
pragma_argument_association
:
    (
        IDENTIFIER RARROW
    )? expression
    | aspect_mark RARROW expression
; // redundant "name" alternatives deleted

//3.1
basic_declaration
:
    type_declaration
    | subtype_declaration
    | object_declaration
    | number_declaration
    | subprogram_declaration
    | abstract_subprogram_declaration
    | null_procedure_declaration
    | expression_function_declaration
    | package_declaration
    | renaming_declaration
    | exception_declaration
    | generic_declaration
    | generic_instantiation
    | pragma
;

//3.1
defining_identifier
:
    IDENTIFIER
;

//3.2.1
type_declaration
:
    full_type_declaration
    | incomplete_type_declaration
    | private_type_declaration
    | private_extension_declaration
;

//3.2.1
full_type_declaration
:
    TYPE defining_identifier known_discriminant_part?
     IS type_definition aspect_specification? SEMI_COLON 
| task_type_declaration
    | protected_type_declaration
;

//3.2.1
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

//3.2.2
subtype_declaration
:
    SUBTYPE defining_identifier IS subtype_indication aspect_specification? SEMI_COLON
;

//3.2.2
subtype_indication
: null_exclusion? subtype_mark constraint?
    
;

//3.2.2
subtype_mark
:
    name
;

//3.2.2
constraint
:
    scalar_constraint
    | composite_constraint
;

//3.2.2
scalar_constraint
:
    range_constraint
    | digits_constraint
    | delta_constraint
;

//3.2.2
composite_constraint
:
    index_constraint
    | discriminant_constraint
;

//3.3.1
object_declaration
:
    defining_identifier_list COLON
    
        ALIASED?
    
    
        CONSTANT?
     subtype_access_or_array_type_definition
    (
        AFFECTATION_SIGN expression
    )? aspect_specification? SEMI_COLON
    | single_task_declaration
    | single_protected_declaration
;

//3.3.1
subtype_access_or_array_type_definition
:
    subtype_indication
    | access_definition
    | array_type_definition
;

//3.3.1
defining_identifier_list
:
    defining_identifier
    (
        COMMA defining_identifier
    )*
;

//3.3.2
number_declaration
:
    defining_identifier_list COLON CONSTANT AFFECTATION_SIGN expression
    SEMI_COLON
;

//3.4
derived_type_definition
:
    
        ABSTRACT?
    
    
        LIMITED?
     NEW subtype_indication
    
        interface_and_record_extension_specification?
    
;

//3.4
interface_and_record_extension_specification
:
    (
        AND interface_list
    )? record_extension_part
;

//3.5
range_constraint
:
    RANGE range
;

//3.5
range
:
    range_attribute_reference
    | simple_expression RANGE_SEPARATOR simple_expression
;

//3.5.1
enumeration_type_definition
:
    LPAR enumeration_literal_specification
    (
        COMMA enumeration_literal_specification
    )* RPAR
;

//3.5.1
enumeration_literal_specification
:
    defining_identifier
    | defining_character_literal
;

//3.5.1
defining_character_literal
:
    CHARACTER_LITERAL
;

//3.5.4
integer_type_definition
:
    signed_integer_type_definition
    | modular_type_definition
;

//3.5.4
signed_integer_type_definition
:
    RANGE simple_expression RANGE_SEPARATOR simple_expression
;

//3.5.4
modular_type_definition
:
    MOD expression
;

//3.5.6
real_type_definition
:
    floating_point_definition
    | fixed_point_definition
;

//3.5.7
floating_point_definition
:
    DIGITS expression
    
        real_range_specification?
    
;

//3.5.7
real_range_specification
:
    RANGE simple_expression RANGE_SEPARATOR simple_expression
;

//3.5.9
fixed_point_definition
:
    ordinary_fixed_point_definition
    | decimal_fixed_point_definition
;

//3.5.9
ordinary_fixed_point_definition
:
    DELTA expression real_range_specification
;

//3.5.9
decimal_fixed_point_definition
:
    DELTA expression DIGITS expression
    
        real_range_specification?
    
;

//3.5.9
digits_constraint
:
    DIGITS expression
    
        range_constraint?
    
;

//3.6
array_type_definition
:
    unconstrained_array_definition
    | constrained_array_definition
;

//3.6
unconstrained_array_definition
:
    ARRAY LPAR index_subtype_definition
    (
        COMMA index_subtype_definition
    )* RPAR OF component_definition
;

//3.6
index_subtype_definition
:
    subtype_mark RANGE BOX
;

//3.6
constrained_array_definition
:
    ARRAY LPAR discrete_subtype_definition
    (
        COMMA discrete_subtype_definition
    )* RPAR OF component_definition
;

//3.6
discrete_subtype_definition
:
    subtype_indication |
     range
;

//3.6
component_definition
:
    
        ALIASED?
     subtype_indication
    |
    
        ALIASED?
     access_definition
;

//3.6.1
index_constraint
:
    LPAR discrete_range
    (
        COMMA discrete_range
    )* RPAR
;

//3.6.1
discrete_range
:
    subtype_indication | range
;

//3.7
discriminant_part
:
    unknown_discriminant_part
    | known_discriminant_part
;

//3.7
unknown_discriminant_part
:
    LPAR BOX RPAR
;

//3.7
known_discriminant_part
:
    LPAR discriminant_specification_list RPAR
;

//3.7
discriminant_specification_list
:
    discriminant_specification
    (
        SEMI_COLON discriminant_specification
    )*
;

//3.7
discriminant_specification
:
    defining_identifier_list COLON
    
        null_exclusion?
     subtype_mark
    
        discriminant_specification_default?
    
    | defining_identifier_list COLON access_definition
    
        discriminant_specification_default?
    
;

//3.7
discriminant_specification_default
:
    AFFECTATION_SIGN default_expression
;

//3.7
default_expression
:
    expression
;

//3.7.1
discriminant_constraint
:
    LPAR discriminant_association
    (
        COMMA discriminant_association
    )* RPAR
;

//3.7.1
discriminant_association
:
    (
        selector_name
        (
            PIPE selector_name
        )* RARROW
    )? expression
;

//3.8
record_type_definition
:
    (
        
            ABSTRACT?
         TAGGED)?
    
    
        LIMITED?
     record_definition
;

//3.8
record_definition
:
    RECORD component_list END RECORD
    | NULL RECORD
;

//3.8
component_list
:
    component_item+
    | component_item* variant_part
    | NULL SEMI_COLON
;

//3.8
component_item
:
    component_declaration
    | aspect_clause
    | pragma
;

//3.8
component_declaration
:
    defining_identifier_list COLON component_definition
    
        component_declaration_default? aspect_specification?
     SEMI_COLON
;

//3.8
component_declaration_default
:
    AFFECTATION_SIGN default_expression
;

//3.8.1
variant_part
:
    CASE direct_name IS
    (
        variant
    )+ END CASE SEMI_COLON
;

//3.8.1
variant
:
    WHEN discrete_choice_list RARROW component_list
;

//3.8.1
discrete_choice_list
:
    discrete_choice
    (
        PIPE discrete_choice
    )*
;

//3.8.1
discrete_choice
:
    expression
    | subtype_indication
    | range
    | OTHERS
;

//3.9.1
record_extension_part
:
    WITH record_definition
;

//3.9.3
abstract_subprogram_declaration
:
    
        overriding_indicator?
     subprogram_specification IS ABSTRACT aspect_specification? SEMI_COLON
;

//3.9.4
interface_type_definition
:
    
        interface_type_definition_modifier?
     INTERFACE
    
        interface_type_definition_list?
    
;

//3.9.4
interface_type_definition_modifier
:
    LIMITED
    | TASK
    | PROTECTED
    | SYNCHRONIZED
;

//3.9.4
interface_type_definition_list
:
    AND interface_list
;

//3.9.4
interface_list
:
    subtype_mark
    (
        AND subtype_mark
    )*
;

//3.10
access_type_definition
:
    
        null_exclusion?
     access_to_object_definition
    |
    
        null_exclusion?
     access_to_subprogram_definition
;

//3.10
access_to_object_definition
:
    ACCESS
    
        general_access_modifier?
     subtype_indication
;

//3.10
general_access_modifier
:
    ALL
    | CONSTANT
;

//3.10
access_to_subprogram_definition
:
    ACCESS
    
        PROTECTED?
     PROCEDURE parameter_profile
    | ACCESS
    
        PROTECTED?
     FUNCTION parameter_and_result_profile
;

//3.10
null_exclusion
:
    NOT NULL
;

//3.10
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

//3.10.1
incomplete_type_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
    
    
        (IS TAGGED)?
     SEMI_COLON
;

//3.11
declarative_part
:
    declarative_item*
;

//3.11
declarative_item
:
    basic_declarative_item
    | body
;

//3.11
basic_declarative_item
:
    basic_declaration
    | aspect_clause
    | use_clause
;

//3.11
body
:
    proper_body
    | body_stub
;

//3.11
proper_body
:
    subprogram_body
    | package_body
    | task_body
    | protected_body
;

//4.1
name : direct_name name_component* | CHARACTER_LITERAL;

//4.1
name_component :
                   explicit_dereference_component
               | indexed_slice_type_conv_or_function_call_component
               | selected_component_component
               | attribute_reference_component
               | qualified_expression
               | generalized_indexing_component;

//4.1
explicit_dereference_component : DOT ALL;

//4.1
indexed_slice_type_conv_or_function_call_component:
                                                      LPAR index_or_parameter_value (COMMA index_or_parameter_value)* RPAR;

index_or_parameter_value: expression | discrete_range | parameter_association;

//4.1
selected_component_component:
                                DOT selector_name;

//4.1
attribute_reference_component:
                                 APOSTROPHE attribute_designator | CLASS_WIDE;

//4.1
direct_name
:
    IDENTIFIER
    | operator_symbol
;

//4.1
prefix
:
    name
;

//4.1
explicit_dereference
:
    name DOT ALL
;

//4.1.1
indexed_component
:
    prefix LPAR expression
    (
        COMMA expression
    )* RPAR
;

//4.1.2
slice
:
    prefix LPAR discrete_range RPAR
;

//4.1.3
selected_component
:
    prefix DOT selector_name
;

//4.1.3
selector_name
:
    (
        IDENTIFIER
        | CHARACTER_LITERAL        
    )
    | operator_symbol
;

//4.1.4
attribute_reference
:
    prefix APOSTROPHE attribute_designator
;

//4.1.4
attribute_designator
:
    IDENTIFIER
    (
        LPAR expression RPAR
    )?
    |
    (
        ACCESS
        | DELTA
        | DIGITS
        | MOD
    )
;

//4.1.4
range_attribute_reference
:
    prefix APOSTROPHE range_attribute_designator
;

//4.1.4
range_attribute_designator
:
    RANGE
    (
        LPAR expression RPAR
    )?
;

//4.1.6
generalized_indexing_component: 
                                 actual_parameter_part;

//4.3
aggregate
:
    record_aggregate
    | extension_aggregate
    | array_aggregate
;

//4.3.1
record_aggregate
:
    LPAR record_component_association_list RPAR
;

//4.3.1
record_component_association_list
:
    record_component_association
    (
        COMMA record_component_association
    )*
    | NULL RECORD
;

//4.3.1
record_component_association
:
    (
        component_choice_list RARROW
    )? expression
    | component_choice_list RARROW BOX
;

//4.3.1
component_choice_list
:
    selector_name
    (
        PIPE selector_name
    )*
    | OTHERS
;

//4.3.2
extension_aggregate
:
    LPAR ancestor_part WITH record_component_association_list RPAR
;

//4.3.2
ancestor_part
:
    expression
    | subtype_mark
;

//4.3.3
array_aggregate
:
    positional_array_aggregate
    | named_array_aggregate
;

//4.3.3
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

//4.3.3
named_array_aggregate
:
    LPAR array_component_association
    (
        COMMA array_component_association
    )* RPAR
;

//4.3.3
array_component_association
:
    discrete_choice_list RARROW expression
    | discrete_choice_list RARROW BOX
;

//4.4
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

//4.4
choice_expression :
                      choice_relation (AND choice_relation)*
                  | choice_relation (OR choice_relation)*
                  | choice_relation (XOR choice_relation)*
                  | choice_relation (AND THEN choice_relation)*
                  | choice_relation (OR ELSE choice_relation)*;
    
//4.4
choice_relation : simple_expression (relational_operator simple_expression)?;

//4.4
relation
:
    simple_expression
    
        (relational_operator simple_expression)?
    
    | simple_expression
    
        NOT?
     IN membership_choice_list
    | raise_expression;

//4.4
membership_choice_list : membership_choice (PIPE membership_choice)*;

//4.4 
membership_choice : choice_expression | range | subtype_mark;
                         
//4.4
simple_expression
:
    
        unary_adding_operator?
     term
    (binary_adding_operator term)*
;

//4.4
term
:
    factor
    (multiplying_operator factor)*
;

//4.4
factor
:
    primary
    (
        POWER primary
    )?
    | ABS primary
    | NOT primary
;

//4.4
primary
:
    numeric_literal
    |
    (NULL |
         STRING_LITERAL)
    | name
    | qualified_expression
    | allocator
    | LPAR expression RPAR
    | LPAR conditional_expression RPAR
    | {this.parenthesizedContext}? conditional_expression // parentheses may be omitted if the context already contains parentheses (expression function e.g.)
    | LPAR quantified_expression RPAR
    | {this.parenthesizedContext}? quantified_expression // parentheses may be omitted if the context already contains parentheses (expression function e.g.)
    | aggregate;


//4.5
logical_operator
:
    AND
    | OR
    | XOR
;

//4.5
relational_operator
:
    EQUAL
    | NEQUAL
    | LT
    | LEQT
    | GT
    | GEQT
;

//4.5
binary_adding_operator
:
    PLUS
    | MINUS
    | AMPERSAND
;

//4.5
unary_adding_operator
:
    PLUS
    | MINUS
;

//4.5
multiplying_operator
:
    ASTERISK
    | SLASH
    | MOD
    | REM
;

//4.5
highest_precedence_operator
:
    POWER
    | ABS
    | NOT
;

//4.5.7
conditional_expression : if_expression | case_expression;

//4.5.7
if_expression : 
                  IF condition THEN expression
                  (ELSIF condition THEN expression)*
                   (ELSE expression)?;

condition : expression;

//4.5.7
case_expression :
                    CASE expression IS
                    case_expression_alternative (COMMA case_expression_alternative)*;
                  
//4.5.7
case_expression_alternative :
                                WHEN discrete_choice_list RARROW
                                expression;

//4.5.8
quantified_expression : FOR quantifier loop_parameter_specification RARROW predicate
                      | FOR quantifier iterator_specification RARROW predicate;

//4.5.8
quantifier : ALL | SOME;

//4.5.8
predicate : expression;

//4.6
type_conversion
:
    subtype_mark LPAR expression RPAR;
    // redundant "name" alternative deleted

//4.7
qualified_expression
:
    subtype_mark APOSTROPHE LPAR expression RPAR
    | subtype_mark APOSTROPHE aggregate
;

//4.8
allocator
:
    NEW subpool_specification? subtype_indication
    | NEW subpool_specification? qualified_expression
;

//4.8
subpool_specification : LPAR name RPAR;

//5.1
sequence_of_statements
:
    statement+ label*
;

//5.1
statement
:
    
        label*
     simple_statement
    |
    
        label*
     compound_statement
;

//5.1
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

//5.1
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

//5.1
null_statement
:
    NULL SEMI_COLON
;

//5.1
label
:
    RWND statement_identifier FFWD
;

//5.1
statement_identifier
:
    direct_name
;

//5.2
assignment_statement
:
    name AFFECTATION_SIGN expression SEMI_COLON
;

//5.3
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

//5.4
case_statement
:
    CASE expression IS (case_statement_alternative)+ END CASE SEMI_COLON
;

//5.4
case_statement_alternative
:
    WHEN discrete_choice_list RARROW sequence_of_statements
;

//5.5
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

//5.5
iteration_scheme
:
    WHILE condition
    | FOR loop_parameter_specification
    | FOR iterator_specification
;

//5.5
loop_parameter_specification
:
    defining_identifier IN
    
        REVERSE?
     discrete_subtype_definition
;

//5.5.2
iterator_specification : defining_identifier IN REVERSE? name
                       | defining_identifier (COLON subtype_indication)? OF REVERSE? name;

//5.6
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

//5.7
exit_statement
:
    EXIT
    
        name?
    
    (
        WHEN condition
    )? SEMI_COLON
;

//5.8
goto_statement
:
    GOTO name SEMI_COLON
;

//6.1
subprogram_declaration
:
    
        overriding_indicator?
     subprogram_specification aspect_specification? SEMI_COLON
;

//6.1
subprogram_specification
:
    procedure_specification
    | function_specification
;

//6.1
procedure_specification
:
    PROCEDURE defining_program_unit_name parameter_profile
;

//6.1
function_specification
:
    FUNCTION defining_designator parameter_and_result_profile
;

//6.1
designator
:
    (
        parent_unit_name DOT
    )? IDENTIFIER
    | operator_symbol
;

//6.1
defining_designator
:
    defining_program_unit_name
    | defining_operator_symbol
;

//6.1
defining_program_unit_name
:
    (
        parent_unit_name DOT
    )? defining_identifier
;

//6.1
operator_symbol
:
    STRING_LITERAL
;

//6.1
defining_operator_symbol
:
    operator_symbol
;

//6.1
parameter_profile
:
    
        formal_part?
    
;

//6.1
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

//6.1
formal_part
:
    LPAR parameter_specification
    (
        SEMI_COLON parameter_specification
    )* RPAR
;

//6.1
parameter_specification
:
    defining_identifier_list COLON parameter_type_specification
;

//6.1
parameter_type_specification
:
    ALIASED? param_mode
    
        null_exclusion?
     subtype_mark
    
        parameter_specification_default?
    
    | access_definition
    
        parameter_specification_default?
    
;

//6.1
parameter_specification_default
:
    AFFECTATION_SIGN default_expression
;

//6.1
param_mode
:
    
        IN?
    
    | IN OUT
    | OUT
;

//6.3
subprogram_body
:
    
        overriding_indicator?
     subprogram_specification aspect_specification? IS declarative_part BEGIN
    handled_sequence_of_statements END
    
        designator?
     SEMI_COLON
;

//6.4
procedure_call_statement
:
    prefix actual_parameter_part SEMI_COLON;
    //redundant "name" alternative deleted

//6.4
function_call
:
    prefix actual_parameter_part
    //redundant "name" alternative deleted
;

//6.4
actual_parameter_part
:
    LPAR parameter_association
    (
        COMMA parameter_association
    )* RPAR
;

//6.4
parameter_association
:
    (
        selector_name RARROW
    )? explicit_actual_parameter
;

//6.4
explicit_actual_parameter
:
    expression;
    //redundant "name" alternative deleted

//6.5
simple_return_statement
:
    RETURN
    
       expression?
     SEMI_COLON
;

//6.5
extended_return_object_declaration :
                                       defining_identifier COLON ALIASED? CONSTANT? 
                                       return_subtype_indication (AFFECTATION_SIGN expression)?;

//6.5
extended_return_statement
:
    RETURN extended_return_object_declaration
    (
        DO handled_sequence_of_statements END RETURN
    )? SEMI_COLON
;

//6.5
return_subtype_indication
:
    subtype_indication
    | access_definition
;

//6.7
null_procedure_declaration
:
    
        overriding_indicator?
     procedure_specification IS NULL aspect_specification? SEMI_COLON
;

//6.8
expression_function_declaration 
@init {this.parenthesizedContext = true;}
@after {this.parenthesizedContext = false;}
    :
     overriding_indicator? function_specification IS LPAR expression RPAR aspect_specification? SEMI_COLON
     | overriding_indicator? function_specification IS aggregate aspect_specification? SEMI_COLON;

//7.1
package_declaration   
: 
    package_specification SEMI_COLON
;

//7.1
private_part:

        PRIVATE
        (
            basic_declarative_item
        )*;
    
//7.1
package_specification
:
    PACKAGE defining_program_unit_name aspect_specification? IS
    basic_declarative_item*
    private_part? END
    (
        (
            parent_unit_name DOT
        )? IDENTIFIER
    )?
;

//7.2
package_body
:
    PACKAGE BODY defining_program_unit_name aspect_specification? IS declarative_part
    (
        BEGIN handled_sequence_of_statements
    )? END
    (
        (
            parent_unit_name DOT
        )? IDENTIFIER
    )? SEMI_COLON
;

//7.3
private_type_declaration
:
    TYPE defining_identifier
    
        discriminant_part?
     IS
    
        (
            ABSTRACT?
         TAGGED)?
    
    
        LIMITED?
     PRIVATE aspect_specification? SEMI_COLON
;

//7.3
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
    )? WITH PRIVATE aspect_specification? SEMI_COLON
;

//8.3.1
overriding_indicator
:
    
        NOT?
     OVERRIDING
;

//8.4
use_clause
:
    use_package_clause
    | use_type_clause
;

//8.4
use_package_clause
:
    USE name
    (
        COMMA name
    )* SEMI_COLON
;

//8.4
use_type_clause
:
    USE ALL? TYPE subtype_mark
    (
        COMMA subtype_mark
    )* SEMI_COLON
;

//8.5
renaming_declaration
:
    object_renaming_declaration
    | exception_renaming_declaration
    | package_renaming_declaration
    | subprogram_renaming_declaration
    | generic_renaming_declaration
;

//8.5.1
object_renaming_declaration
:
    defining_identifier COLON
    
        null_exclusion?
     subtype_mark RENAMES name aspect_specification? SEMI_COLON
    | defining_identifier COLON access_definition RENAMES name aspect_specification? SEMI_COLON
;

//8.5.2
exception_renaming_declaration
:
    defining_identifier COLON EXCEPTION RENAMES name aspect_specification? SEMI_COLON
;

//8.5.3
package_renaming_declaration
:
    PACKAGE defining_program_unit_name RENAMES name aspect_specification? SEMI_COLON
;

//8.5.4
subprogram_renaming_declaration
:
    
        overriding_indicator?
     subprogram_specification RENAMES name aspect_specification? SEMI_COLON
;

//8.5.5
generic_renaming_declaration
:
    GENERIC PACKAGE defining_program_unit_name RENAMES name aspect_specification? SEMI_COLON
    | GENERIC PROCEDURE defining_program_unit_name RENAMES name aspect_specification? SEMI_COLON
    | GENERIC FUNCTION defining_program_unit_name RENAMES name aspect_specification? SEMI_COLON
;

//9.1
task_type_declaration
:
    TASK TYPE defining_identifier
    
        known_discriminant_part?
    aspect_specification?
    
        task_type_declaration_definition?
     SEMI_COLON
;

//9.1
task_type_declaration_definition
:
    IS
    (
        NEW interface_list WITH
    )? task_definition
;

//9.1
single_task_declaration
:
    TASK defining_identifier aspect_specification?
    
        task_type_declaration_definition?
     SEMI_COLON
;

//9.1
task_definition
:
    
        task_item*
    (
        PRIVATE
        task_item*
    )? END
    
        IDENTIFIER?
    
;

//9.1
task_item
:
    entry_declaration
    | aspect_clause
    | pragma
;

//9.1
task_body
:
    TASK BODY defining_identifier aspect_specification? IS declarative_part BEGIN
    handled_sequence_of_statements END
    
        IDENTIFIER?
     SEMI_COLON
;

//9.4
protected_type_declaration
:
    PROTECTED TYPE defining_identifier
    
        known_discriminant_part? aspect_specification?
     IS
    (
        NEW interface_list WITH
    )? protected_definition SEMI_COLON
;

//9.4
single_protected_declaration
:
    PROTECTED defining_identifier aspect_specification? IS
    (
        NEW interface_list WITH
    )? protected_definition SEMI_COLON
;

//9.4
protected_definition
:
        protected_operation_declaration*
    (
        PRIVATE
            protected_element_declaration*
    )? END
    
        IDENTIFIER?
    
;

//9.4
protected_operation_declaration
:
    subprogram_declaration
    | entry_declaration
    | aspect_clause
    | pragma
;

//9.4
protected_element_declaration
:
    protected_operation_declaration
    | component_declaration
;

//9.4
protected_body
:
    PROTECTED BODY defining_identifier aspect_specification? IS
    
        protected_operation_item*
     END
    
        IDENTIFIER?
     SEMI_COLON
;

//9.4
protected_operation_item
:
    subprogram_declaration
    | subprogram_body
    | entry_body
    | aspect_clause
;

//9.5
synchronization_kind : BY_ENTRY | BY_PROTECTED_PROCEDURE | OPTIONAL;

//9.5.2
entry_declaration
:
    
        overriding_indicator?
     ENTRY defining_identifier
    (
        LPAR discrete_subtype_definition RPAR
    )? parameter_profile aspect_specification? SEMI_COLON
;

//9.5.2
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

//9.5.2
entry_index
:
    expression
;

//9.5.2
entry_body
:
    ENTRY defining_identifier entry_body_formal_part entry_barrier IS
    declarative_part BEGIN handled_sequence_of_statements END
    
        IDENTIFIER?
     SEMI_COLON
;

//9.5.2
entry_body_formal_part
:
    (
        LPAR entry_index_specification RPAR
    )? parameter_profile
;

//9.5.2
entry_barrier
:
    WHEN condition
;

//9.5.2
entry_index_specification
:
    FOR defining_identifier IN discrete_subtype_definition
;

//9.5.3
entry_call_statement
:
    name
    
        actual_parameter_part?
     SEMI_COLON
;

//9.5.4
requeue_statement
:
    REQUEUE name
    (
        WITH ABORT
    )? SEMI_COLON
;

//9.6
delay_statement
:
    delay_until_statement
    | delay_relative_statement
;

//9.6
delay_until_statement
:
    DELAY UNTIL expression SEMI_COLON
;

//9.6
delay_relative_statement
:
    DELAY expression SEMI_COLON
;

//9.7
select_statement
:
    selective_accept
    | timed_entry_call
    | conditional_entry_call
    | asynchronous_select
;

//9.7.1
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

//9.7.1
guard
:
    WHEN condition RARROW
;

//9.7.1
select_alternative
:
    accept_alternative
    | delay_alternative
    | terminate_alternative
;

//9.7.1
accept_alternative
:
    accept_statement
    
        sequence_of_statements?
    
;

//9.7.1
delay_alternative
:
    delay_statement
    
        sequence_of_statements?
    
;

//9.7.1
terminate_alternative
:
    TERMINATE SEMI_COLON
;

//9.7.2
timed_entry_call
:
    SELECT entry_call_alternative OR delay_alternative END SELECT SEMI_COLON
;

//9.7.2
entry_call_alternative
:
    procedure_or_entry_call
    
        sequence_of_statements?
    
;

//9.7.2
procedure_or_entry_call
:
    procedure_call_statement
    | entry_call_statement
;

//9.7.2
conditional_entry_call
:
    SELECT entry_call_alternative ELSE sequence_of_statements END SELECT
    SEMI_COLON
;

//9.7.4
asynchronous_select
:
    SELECT triggering_alternative THEN ABORT abortable_part END SELECT
    SEMI_COLON
;

//9.7.4
triggering_alternative
:
    triggering_statement
    
        sequence_of_statements?
    
;

//9.7.4
triggering_statement
:
    procedure_or_entry_call
    | delay_statement
;

//9.7.4
abortable_part
:
    sequence_of_statements
;

//9.8
abort_statement
:
    ABORT name
    (
        COMMA name
    )* SEMI_COLON
;

//10.1.1
compilation
:
    compilation_unit*
;

//10.1.1
compilation_unit
:
    context_clause library_item
    | context_clause subunit
    | pragma
;

//10.1.1
library_item
:
    
        PRIVATE?
     library_unit_declaration
    | library_unit_body
    |
    
        PRIVATE?
     library_unit_renaming_declaration
;

//10.1.1
library_unit_declaration
:
    subprogram_declaration
    | package_declaration
    | generic_declaration
    | generic_instantiation
    | pragma
;

//10.1.1
library_unit_renaming_declaration
:
    package_renaming_declaration
    | generic_renaming_declaration
    | subprogram_renaming_declaration
    | pragma
;

//10.1.1
library_unit_body
:
    subprogram_body
    | package_body
;

//10.1.1
parent_unit_name
:
    name
;

//10.1.2
context_clause
:
    context_item*
;

//10.1.2
context_item
:
    with_clause
    | use_clause
;

//10.1.2
with_clause
:
    limited_with_clause
    | nonlimited_with_clause
;

//10.1.2
limited_with_clause
:
    LIMITED
    
        PRIVATE?
     WITH name
    (
        COMMA name
    )* SEMI_COLON
;

//10.1.2
nonlimited_with_clause
:
    PRIVATE? WITH name
    (
        COMMA name
    )* SEMI_COLON
;

//10.1.3
body_stub
:
    subprogram_body_stub
    | package_body_stub
    | task_body_stub
    | protected_body_stub
;

//10.1.3
subprogram_body_stub
:
    
        overriding_indicator?
     subprogram_specification IS SEPARATE aspect_specification? SEMI_COLON
;

//10.1.3
package_body_stub
:
    PACKAGE BODY defining_identifier IS SEPARATE aspect_specification? SEMI_COLON
;

//10.1.3
task_body_stub
:
    TASK BODY defining_identifier IS SEPARATE aspect_specification? SEMI_COLON
;

//10.1.3
protected_body_stub
:
    PROTECTED BODY defining_identifier IS SEPARATE aspect_specification? SEMI_COLON
;

//10.1.3
subunit
:
    SEPARATE LPAR parent_unit_name RPAR proper_body
;

//11.1
exception_declaration
:
    defining_identifier_list COLON EXCEPTION aspect_specification? SEMI_COLON
;

//11.2
handled_sequence_of_statements
:
    sequence_of_statements
    (
        EXCEPTION exception_handler+
        
    )?
;

//11.2
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

//11.2
choice_parameter_specification
:
    defining_identifier
;

//11.2
exception_choice
:
    name
    | OTHERS
;

//11.3
raise_statement
:
    RAISE SEMI_COLON
    | RAISE name
    (
        WITH expression
    )? SEMI_COLON
;

//11.3
raise_expression:
RAISE name (WITH simple_expression)?;

//12.1
generic_declaration
:
    generic_subprogram_declaration
    | generic_package_declaration
;

//12.1
generic_subprogram_declaration
:
    generic_formal_part subprogram_specification aspect_specification? SEMI_COLON
;

//12.1
generic_package_declaration
:
    generic_formal_part package_specification SEMI_COLON
;

//12.1
generic_formal_part
:
    GENERIC
    (
        generic_formal_parameter_declaration | use_clause | pragma
    )*
;

//12.1
generic_formal_parameter_declaration
:
    formal_object_declaration
    | formal_type_declaration
    | formal_subprogram_declaration
    | formal_package_declaration
;

//12.3
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

//12.3
generic_instantiation_clause
:
    NEW name
    
        generic_actual_part? aspect_specification?
     SEMI_COLON
;

//12.3
generic_actual_part
:
    LPAR generic_association
    (
        COMMA generic_association
    )* RPAR
;

//12.3
generic_association
:
    (
        selector_name RARROW
    )? explicit_generic_actual_parameter
;

//12.3
explicit_generic_actual_parameter
:
    expression
    | name
    | subtype_mark
;

//12.4
formal_object_declaration
:
    defining_identifier_list COLON param_mode
    
        null_exclusion?
     subtype_mark
    
        formal_object_declaration_default? aspect_specification?
     SEMI_COLON
    | defining_identifier_list COLON param_mode access_definition
    
        formal_object_declaration_default? aspect_specification?
     SEMI_COLON
;

//12.4
formal_object_declaration_default
:
    AFFECTATION_SIGN default_expression
;

//12.5
formal_type_declaration
:
    formal_complete_type_declaration | formal_incomplete_type_declaration;


//12.5
formal_complete_type_declaration :
                                     TYPE defining_identifier discriminant_part? IS formal_type_definition aspect_specification? SEMI_COLON;

//12.5
formal_incomplete_type_declaration :
                                       TYPE defining_identifier discriminant_part? (IS TAGGED)? SEMI_COLON;

//12.5
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

//12.5.1
formal_private_type_definition
:
    (
        
            ABSTRACT?
         TAGGED
    )?
    
        LIMITED?
     PRIVATE
;

//12.5.1
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

//12.5.2
formal_discrete_type_definition
:
    LPAR BOX RPAR
;

//12.5.2
formal_signed_integer_type_definition
:
    RANGE BOX
;

//12.5.2
formal_modular_type_definition
:
    MOD BOX
;

//12.5.2
formal_floating_point_definition
:
    DIGITS BOX
;

//12.5.2
formal_ordinary_fixed_point_definition
:
    DELTA BOX
;

//12.5.2
formal_decimal_fixed_point_definition
:
    DELTA BOX DIGITS BOX
;

//12.5.3
formal_array_type_definition
:
    array_type_definition
;

//12.5.4
formal_access_type_definition
:
    access_type_definition
;

//12.5.5
formal_interface_type_definition
:
    interface_type_definition
;

//12.6
formal_subprogram_declaration
:
    formal_concrete_subprogram_declaration
    | formal_abstract_subprogram_declaration
;

//12.6
formal_concrete_subprogram_declaration
:
    WITH subprogram_specification
    (
        IS subprogram_default
    )? aspect_specification? SEMI_COLON
;

//12.6
formal_abstract_subprogram_declaration
:
    WITH subprogram_specification IS ABSTRACT
    
        subprogram_default? aspect_specification?
     SEMI_COLON
;

//12.6
subprogram_default
:
    default_name
    |
    (
        BOX
        | NULL
    )
;

//12.6
default_name
:
    name
;

//12.7
formal_package_declaration
:
    WITH PACKAGE defining_identifier IS NEW name formal_package_actual_part 
    aspect_specification?
    SEMI_COLON
;

//12.7
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

//12.7
formal_package_association
:
    generic_association
    | selector_name RARROW BOX
;

//13.1
aspect_clause
:
    attribute_definition_clause
    | enumeration_representation_clause
    | record_representation_clause
    | at_clause
;

//13.1
local_name
:
    direct_name
    | direct_name APOSTROPHE attribute_designator
    | name
;

//13.1.1
aspect_specification : WITH aspect_mark (RARROW aspect_definition)? 
                       (COMMA aspect_mark (RARROW aspect_definition)?)*;

//13.1.1
aspect_mark : IDENTIFIER CLASS_WIDE?;

//13.1.1
aspect_definition : expression | IDENTIFIER | synchronization_kind; //redundant "name" alternative deleted + synchronization_kind alternative added (cf. RM �9.5)

//13.3
attribute_definition_clause
:
    FOR local_name APOSTROPHE attribute_designator USE expression SEMI_COLON;
   //redundant "name" alternative deleted

//13.4
enumeration_representation_clause
:
    FOR local_name USE enumeration_aggregate SEMI_COLON
;

//13.5.1
enumeration_aggregate
:
    array_aggregate
;

//13.5.1
record_representation_clause
:
    FOR local_name USE RECORD
    
        mod_clause?
    
    (
        component_clause
    )* END RECORD SEMI_COLON
;

//13.5.1
component_clause
:
    local_name AT position RANGE first_bit RANGE_SEPARATOR last_bit SEMI_COLON
;

//13.5.1
position
:
    expression
;

//13.5.1
first_bit
:
    simple_expression
;

//13.5.1
last_bit
:
    simple_expression
;

//13.8
code_statement
:
    qualified_expression SEMI_COLON
;

//13.11.3
storage_pool_indicator : name | NULL;

//13.12
restriction
:
    IDENTIFIER
    (
        RARROW restriction_parameter_argument
    )?
;

//13.12
restriction_parameter_argument
:
    //redundant "name" alternative deleted
    expression;

//J.3
delta_constraint
:
    DELTA expression
    
        range_constraint?
    
;

//J.7
at_clause
:
    FOR direct_name USE AT expression SEMI_COLON
;

//J.8
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

SOME :
         S O M E;

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

CLASS_WIDE : APOSTROPHE C L A S S;

BY_ENTRY : B Y UNDERLINE E N T R Y;

BY_PROTECTED_PROCEDURE : B Y UNDERLINE P R O T E C T E D UNDERLINE P R O C E D U R E;

OPTIONAL : O P T I O N A L;

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
