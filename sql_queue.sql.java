CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    dob DATE,
    email_id VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15) NOT NULL UNIQUE,
    address VARCHAR(255)
);

INSERT INTO students VALUES
(1, 'Neethu', 20, '2005-05-15', 'neethu@gmail.com', '9876543210', 'Bangalore'),
(2, 'Rekha', 21, '2004-08-20', 'rekha@gmail.com', '9876543211', 'Mysore'),
(3, 'Anu', 19, '2006-02-10', 'anu@gmail.com', '9876543212', 'Chennai');
