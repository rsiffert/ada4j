package Example is

    procedure Procedure1;
    
    type T_Toto is tagged private;
    
    package Inner_Pkg is
    
        subtype T_Titi is Boolean;
    
        procedure Procedure2;
        
        function Function1 return Boolean;
        
        package Deeply_Nested is
        
            procedure Deep_Inside;
        
        end Deeply_Nested;
        
        
    end Inner_Pkg;
    
    function Function2 return Positive;
    
private

    type T_Toto is null record;
    
    type T_Other is new Integer;
    
    function Private_Func return Integer;    
    

end Example;