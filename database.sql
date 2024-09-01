create database fresher

 USE fresher;

 CREATE TABLE Center (
    center_id INT,
	name VARCHAR(100) NOT NULL,
    address VARCHAR(255) NOT NULL,
	PRIMARY KEY (`center_id`)
);

CREATE TABLE Fresher (
    fresher_id INT PRIMARY KEY,
	username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,  
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone VARCHAR(20),
    programming_language VARCHAR(50),
    center_id INT,
    FOREIGN KEY (center_id) REFERENCES Center(center_id)
); 

CREATE TABLE Project (
    project_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    center_id INT,
    manager VARCHAR(100),
    start_date DATE,
    end_date DATE,
    language VARCHAR(50),
    status ENUM('NOT_START', 'ONGOING', 'CANCELED', 'CLOSED') NOT NULL,
    FOREIGN KEY (center_id) REFERENCES Center(center_id)
); 

CREATE TABLE Scores (
    score_id INT AUTO_INCREMENT PRIMARY KEY,
    fresher_id INT,
    assignment1 FLOAT CHECK(assignment1 BETWEEN 0 AND 10),
    assignment2 FLOAT CHECK(assignment2 BETWEEN 0 AND 10),
    assignment3 FLOAT CHECK(assignment3 BETWEEN 0 AND 10),
    final_score FLOAT AS ((assignment1 + assignment2 + assignment3) / 3),
    FOREIGN KEY (fresher_id) REFERENCES Fresher(fresher_id)
);
