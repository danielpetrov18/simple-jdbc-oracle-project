CREATE OR REPLACE TRIGGER emp_change_salary
AFTER UPDATE ON Employee
FOR EACH ROW
BEGIN
	IF :NEW.salary < :OLD.salary * 0.5 THEN
		RAISE_APPLICATION_ERROR(-20500, 'Cannot decrease employees salary with 50 or more percent!');
	END IF;
END;
-------------------------------------------------------------------------------------------
DROP TRIGGER emp_change_salary;