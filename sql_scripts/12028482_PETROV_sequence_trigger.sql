-- Sequence
CREATE SEQUENCE sequence_orders START WITH 1 INCREMENT BY 1 MINVALUE 1 CACHE 100;
----------------------------------------------------------------------------------
-- Trigger
CREATE OR REPLACE TRIGGER tri_seq_orders
  BEFORE INSERT
  ON Orders
  FOR EACH ROW
  BEGIN
    SELECT sequence_orders.nextval
    INTO :new.orderID
    FROM dual;
  END;