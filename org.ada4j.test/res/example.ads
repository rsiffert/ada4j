package Example is

    procedure Procedure1(Arg1 : in Integer);
    
    type T_Toto is tagged private;
    
    type T_Inteface is limited interface;
    
    package Empty is
    
    end Empty;
    
    package Still_Empty renames Empty;
    
    package Inner_Pkg is
    
        subtype T_Titi is Boolean;
    
        procedure Procedure2(Toto : in T_Toto; Arg2 : out Boolean);
        
        function Function1 return Boolean;
        
        package Deeply_Nested is
        
            procedure Deep_Inside is abstract;
        
        end Deeply_Nested;
        
        
    end Inner_Pkg;
    
    function Function2 return Positive;
    
private

    type T_Toto is tagged null record;
    
    type T_Other is new Integer;
    
    function Private_Func return Integer;    
    

end Example;