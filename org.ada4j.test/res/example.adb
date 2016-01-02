package body Example is

    procedure Procedure1(Arg1 : in Integer)
    is
    begin
        null;
    end;
    
    package body Empty is
    
    end Empty;
    
    package body Inner_Pkg is
    
        procedure Procedure2(Toto : in T_Toto; Arg2 : out Boolean)
        is
        begin
            null;
        end;
        
        function Function3(Pointer : not null access constant Integer) return access protected procedure
        is
        begin
            return False;
        end;
        
        package body Deeply_Nested is
        
        end Deeply_Nested;
        
        
    end Inner_Pkg;
    
    function Function2 return Positive
    is
    begin
        return 2;
    end;
    
    function Private_Func return not null access constant Integer
    is
    begin
        return new Integer'(0);
    end;    
    

end Example;