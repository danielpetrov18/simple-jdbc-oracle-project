CREATE OR REPLACE PROCEDURE decreaseSalary (
	in_id IN employee.eID%TYPE,
	in_percent IN NUMBER,
	nrows OUT INTEGER
) 
AS
	BEGIN 
		UPDATE Employee
		SET salary = salary - salary * in_percent / 100
		WHERE Employee.eID = in_id;
		
		nrows := SQL%ROWCOUNT;
		IF (nrows > 0)
		THEN
			COMMIT;
		ELSE
			ROLLBACK;
		END IF;
		EXCEPTION
		WHEN OTHERS
		THEN
			nrows := SQLCODE;
	END decreaseSalary; 
/
------------------------------------------------------------------------
-- Beispiel
DECLARE
    nrows NUMBER;
BEGIN
    --decreaseSalary(501, 25 , :nrows);
END;
------------------------------------------------------------------------
DROP PROCEDURE decreaseSalary;