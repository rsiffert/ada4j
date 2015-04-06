-- B43102A.ADA

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
-- OBJECTIVE:
--     CHECK THAT IN A RECORD AGGREGATE, THE EXPRESSION GIVING THE
--     VALUE OF A DISCRIMINANT WHICH GOVERNS A VARIANT PART MUST BE
--     STATIC.

-- HISTORY:
--     DHH 06/16/88 CREATED ORIGINAL TEST.

PROCEDURE B43102A IS

     SUBTYPE SMALL IS INTEGER RANGE 1 .. 3;

     TYPE VAR_REC(DIS : SMALL) IS
          RECORD
               CHAR : CHARACTER;
               CASE DIS IS
                    WHEN 1 =>
                         BOOL : BOOLEAN;
                    WHEN 2 =>
                         T : CHARACTER;
                    WHEN 3 =>
                         I : INTEGER;
               END CASE;
          END RECORD;

     X : SMALL := 2;

     SUBTYPE SMALL2 IS SMALL RANGE 1..X;

     Y : CONSTANT SMALL2 := 1;

     A : VAR_REC(1) :=
                   (Y,                             -- ERROR: NOT STATIC.
                    'T',
                    TRUE);

     B2 : VAR_REC(2);

     C : VAR_REC(3);

BEGIN

     C := (3 * SMALL2'FIRST,                       -- ERROR: NOT STATIC.
          'T',
          7);

END B43102A;
