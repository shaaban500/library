CREATE TABLE authors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    gender VARCHAR(10) CHECK (gender IN ('Male', 'Female', 'Other')),
    email VARCHAR(100) UNIQUE NOT NULL,
    salary DECIMAL(10, 2) NOT NULL CHECK (salary >= 0)
);

