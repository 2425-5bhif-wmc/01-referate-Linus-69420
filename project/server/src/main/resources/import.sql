-- Insert Engines
INSERT INTO Engine (id, power, fuelType, cylinders, displacement, turbocharged)
VALUES
    (1, 450, 'PETROL', 6, 3.0, true),
    (2, 200, 'ELECTRIC', 0, 0.0, false),
    (3, 150, 'DIESEL', 4, 2.0, false),
    (4, 300, 'HYBRID', 4, 2.5, true),
    (5, 85, 'LPG', 3, 1.2, false),
    (6, 500, 'PETROL', 8, 4.0, true);

-- Insert Cars
INSERT INTO Car (id, brand, model, manufactureYear, color, vin, engine_id)
VALUES
    (1, 'Audi', 'RS5', 2022, 'Red', 'WAUZZZ8T1DA123456', 1),
    (2, 'Audi', 'S5', 2021, 'Grey', 'WAUZZZ8T1DA654321', 1),                -- same engine as RS5
    (3, 'Tesla', 'Model 3', 2023, 'White', '5YJ3E1EA7KF123456', 2),
    (4, 'Tesla', 'Model Y', 2023, 'Black', '5YJYGDEE7LF654321', 2),         -- same engine as Model 3
    (5, 'Volkswagen', 'Golf TDI', 2020, 'Blue', 'WVWZZZ1KZAW000001', 3),
    (6, 'Skoda', 'Octavia TDI', 2020, 'Silver', 'TMBZZZ1Z5JZ123456', 3),    -- same engine as Golf TDI
    (7, 'Toyota', 'Prius', 2021, 'Green', 'JTDKB20U093123456', 4),
    (8, 'Dacia', 'Logan LPG', 2019, 'Grey', 'UU1LSDAB548123456', 5),
    (9, 'Mercedes', 'AMG GT', 2023, 'Black', 'WDDYJ7KA1JA123456', 6);
