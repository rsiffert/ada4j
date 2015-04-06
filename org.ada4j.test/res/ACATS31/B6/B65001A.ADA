-- B65001A.ADA

--                             Grant of Unlimited Rights
--
--     Under contracts F33600-87-D-0337, F33600-84-D-0280, MDA903-79-C-0687,
--     F08630-91-C-0015, and DCA100-97-D-0025, the U.S. Government obtained 
--     unlimited rights in the software and documentation contained herein.
--     Unlimited rights are defined in DFAR 252.227-7013(a)(19).  By making 
--     this public release, the Government intends to confer upon all 
--     recipients unlimited rights  equal to those held by the Government.  
--     These rights include rights to use, duplicate, release or disclose the 
--     released technical data and computer software in whole or in part, in 
--     any manner and for any purpose whatsoever, and to have or permit others 
--     to do so.
--
--                                    DISCLAIMER
--
--     ALL MATERIALS OR INFORMATION HEREIN RELEASED, MADE AVAILABLE OR
--     DISCLOSED ARE AS IS.  THE GOVERNMENT MAKES NO EXPRESS OR IMPLIED 
--     WARRANTY AS TO ANY MATTER WHATSOEVER, INCLUDING THE CONDITIONS OF THE
--     SOFTWARE, DOCUMENTATION OR OTHER INFORMATION RELEASED, MADE AVAILABLE 
--     OR DISCLOSED, OR THE OWNERSHIP, MERCHANTABILITY, OR FITNESS FOR A
--     PARTICULAR PURPOSE OF SAID MATERIAL.
--*
-- CHECK THAT IN OUT AND OUT PARAMETERS CANNOT BE SPECIFIED FOR
-- FUNCTIONS.

-- DAS 2/2/81

PROCEDURE B65001A IS

     TYPE T IS NEW INTEGER RANGE 0 .. 100;

     FUNCTION F1 (I : IN T; J : IN OUT T) RETURN T IS  -- ERROR: IN OUT.
     BEGIN
          RETURN 1;
     END F1;

     FUNCTION F2 (J : OUT T) RETURN T IS               -- ERROR: OUT.
     BEGIN
          RETURN 2;
     END F2;

     FUNCTION "+" (I : IN OUT T; J : IN T) RETURN T IS -- ERROR: IN OUT.
     BEGIN
          RETURN 3;
     END "+";

     FUNCTION "-" (I : OUT T) RETURN T IS              -- ERROR: OUT.
     BEGIN
          RETURN 4;
     END "-";

BEGIN
     NULL;
END B65001A;
