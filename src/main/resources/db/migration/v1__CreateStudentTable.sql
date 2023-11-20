CREATE TABLE IF NOT EXISTS STUDENT(
    student_id VARCHAR(20) PRIMARY KEY  NOT NULL ,
    first_name VARCHAR(100) NOT NULL ,
    last_name VARCHAR(100) NOT NULL ,
    email VARCHAR(100) NOT NULL UNIQUE ,
    gender VARCHAR(6) NOT NULL
        CHECK(
            gender = 'MALE'     OR
            gender = 'male'     OR
            gender = 'FEMALE'   OR
            gender = 'female'
            )
);