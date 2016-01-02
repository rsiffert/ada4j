package body Example is

    procedure Procedure1
    is
    begin
        null;
    end;
    
    package body Empty is
    
    end Empty;
    
    package body Inner_Pkg is
    
        procedure Procedure2
        is
        begin
            null;
        end;
        
        function Function1 return Boolean
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
    
    function Private_Func return Integer
    is
    begin
        return 0;
    end;    
    

end Example;