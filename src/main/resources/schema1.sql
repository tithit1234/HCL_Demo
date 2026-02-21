CREATE TABLE inventory (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    category VARCHAR(255),
    subcategory VARCHAR(255),
    manufacturing_date DATE,
    expiry_date DATE,
    specification VARCHAR(255),
    price DOUBLE,
    stock INT,
    model VARCHAR(255),
    seller VARCHAR(255),
    location VARCHAR(255)
);
