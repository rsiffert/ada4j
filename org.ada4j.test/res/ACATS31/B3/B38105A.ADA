-- B38105A.ADA

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
-- CHECK THAT AN INCOMPLETE TYPE CANNOT BE USED PRIOR TO ITS FULL
-- DECLARATION IN AN OBJECT DECLARATION, COMPONENT DECLARATION, OR
-- PARAMETER DECLARATION, SUBTYPE DECLARATION, OR AS THE COMPONENT TYPE
-- IN AN ARRAY DECLARATION.

-- CHECK THAT AN INCOMPLETE TYPE CANNOT BE USED IN AN ACCESS TYPE
-- DEFINITION WITH A RANGE CONSTRAINT, ACCURACY CONSTRAINT, OR INDEX
-- CONSTRAINT.

-- CHECK THAT AN ACCESS TYPE WHOSE DESIGNATED TYPE IS AN INCOMPLETE TYPE
-- CANNOT BE USED WITH INDEX CONSTRAINTS PRIOR TO THE FULL DECLARATION
-- OF THE TYPE.

-- JBG 04/27/83
-- JRL 06/07/96  Changed range of type INC3 to ensure that constraint on
--               type ACC7 is compatible with it.
-- RLB 03/16/07  Subtypes of incomplete types are legal if they have no
--               constraint.

PROCEDURE B38105A IS

     TYPE INC;
     TYPE INC1;
     TYPE INC2;
     TYPE INC3;
     TYPE INC4;
     V : INC;                           -- ERROR: INCOMPLETE TYPE.

     TYPE ARR IS ARRAY (1..2) OF INC;   -- ERROR: INCOMPLETE TYPE.

     TYPE REC IS
          RECORD
               A : INC;                      -- ERROR: INCOMPLETE TYPE.
          END RECORD;

     PROCEDURE P (X : INC);                  -- ERROR: INCOMPLETE TYPE.

     GENERIC
          X : INC;                           -- ERROR: INCOMPLETE TYPE.
     PACKAGE P1 IS END P1;

     SUBTYPE SINC IS INC;                    -- OK.

     TYPE ACC1 IS ACCESS INC1 RANGE 4..6;    -- ERROR: INCOMPLETE TYPE.

     TYPE ACC2 IS ACCESS
          INC2 DIGITS 1 RANGE 0.0 .. 0.0;    -- ERROR: INCOMPLETE TYPE.

     TYPE ACC3 IS ACCESS
          INC3 DELTA 1.0 RANGE -1.0 .. 1.0;  -- ERROR: INCOMPLETE TYPE.

     TYPE ACC4 IS ACCESS INC4(1..2);         -- ERROR: INCOMPLETE TYPE.

     TYPE A_INC IS ACCESS INC4;              -- OK.

     SUBTYPE SA_INC IS A_INC(1..2);          -- ERROR: INCOMPLETE TYPE.

     TYPE INC IS NEW INTEGER;
     TYPE INC1 IS NEW INTEGER;
     TYPE INC2 IS NEW FLOAT;
     TYPE INC3 IS DELTA 1.0 RANGE -2.0 .. 2.0;
     TYPE INC4 IS ARRAY (INTEGER RANGE <>) OF INTEGER;

     TYPE ACC5 IS ACCESS INC1 RANGE 4..6;
     TYPE ACC6 IS ACCESS INC2 DIGITS 1 RANGE 0.0 .. 0.0;
     TYPE ACC7 IS ACCESS INC3 DELTA 1.0 RANGE -1.0 .. 1.0;
     TYPE ACC8 IS ACCESS INC4(1..2);

     PROCEDURE P (X : INC) IS
     BEGIN
          NULL;
     END P;

BEGIN
          NULL;
END B38105A;
