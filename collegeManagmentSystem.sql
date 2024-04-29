-- Create the College Management System database
CREATE DATABASE CollegeManagementSystem;

-- Switch to the newly created database
USE CollegeManagementSystem;

-- Create a table to store student information
CREATE TABLE Students (
    StudentID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Address VARCHAR(255)
);

-- Create a table to store course information
CREATE TABLE Courses (
    CourseID INT AUTO_INCREMENT PRIMARY KEY,
    CourseName VARCHAR(100),
    Department VARCHAR(50),
    Credits INT
);

-- Create a table to manage student enrollments
CREATE TABLE Enrollments (
    EnrollmentID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    EnrollmentDate DATE,
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Create a table to store instructor information
CREATE TABLE Instructors (
    InstructorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Department VARCHAR(50)
);

-- Create a table to manage instructor assignments
CREATE TABLE InstructorAssignments (
    AssignmentID INT AUTO_INCREMENT PRIMARY KEY,
    InstructorID INT,
    CourseID INT,
    FOREIGN KEY (InstructorID) REFERENCES Instructors(InstructorID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Create a table to store examination results
CREATE TABLE ExamResults (
    ResultID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    ExamDate DATE,
    Score DECIMAL(5, 2),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);



-- Insert sample data into the Students table
INSERT INTO Students (FirstName, LastName, DateOfBirth, Email, Phone, Address)
VALUES
    ('John', 'Doe', '1995-03-15', 'john.doe@example.com', '+1234567890', '123 Main St'),
    ('Jane', 'Smith', '1998-07-21', 'jane.smith@example.com', '+9876543210', '456 Elm St'),
    ('Alice', 'Johnson', '1999-05-12', 'alice.j@example.com', '+1111111111', '789 Oak Ave'),
    ('Bob', 'Williams', '1997-09-30', 'bob.w@example.com', '+2222222222', '567 Pine Rd'),
    ('Eva', 'Brown', '1996-02-18', 'eva.b@example.com', '+3333333333', '101 Cedar Ln'),
    ('Michael', 'Lee', '2000-11-08', 'michael.lee@example.com', '+4444444444', '222 Birch St'),
    ('Sophia', 'Anderson', '1994-08-03', 'sophia.a@example.com', '+5555555555', '333 Redwood Rd'),
    ('Oliver', 'Garcia', '1993-04-27', 'oliver.g@example.com', '+6666666666', '444 Maple Dr'),
    ('Ava', 'Martinez', '1998-12-14', 'ava.m@example.com', '+7777777777', '999 Willow Ave'),
    ('Liam', 'Taylor', '1992-06-06', 'liam.t@example.com', '+8888888888', '777 Pine Rd');

-- Insert sample data into the Courses table
INSERT INTO Courses (CourseName, Department, Credits)
VALUES
    ('Introduction to Computer Science', 'Computer Science', 3),
    ('Calculus I', 'Mathematics', 4),
    ('History of Art', 'Art', 3),
    ('Introduction to Physics', 'Physics', 4),
    ('English Composition', 'English', 3),
    ('Chemistry Fundamentals', 'Chemistry', 4),
    ('Introduction to Psychology', 'Psychology', 3),
    ('Economics 101', 'Economics', 3),
    ('Digital Marketing', 'Marketing', 3),
    ('Sociology of Culture', 'Sociology', 3);

-- Continue to insert sample data into the other tables (Enrollments, Instructors, InstructorAssignments, ExamResults) similarly.

-- Insert sample data into the Enrollments table
INSERT INTO Enrollments (StudentID, CourseID, EnrollmentDate)
VALUES
    (1, 1, '2023-09-01'),
    (2, 2, '2023-09-02'),
    (3, 3, '2023-09-03'),
    (4, 4, '2023-09-04'),
    (5, 5, '2023-09-05'),
    (6, 6, '2023-09-06'),
    (7, 7, '2023-09-07'),
    (8, 8, '2023-09-08'),
    (9, 9, '2023-09-09'),
    (10, 10, '2023-09-10');

-- Insert sample data into the Instructors table
INSERT INTO Instructors (FirstName, LastName, Email, Phone, Department)
VALUES
    ('Professor', 'Johnson', 'prof.johnson@example.com', '+1111111111', 'Computer Science'),
    ('Professor', 'Smith', 'prof.smith@example.com', '+2222222222', 'Mathematics'),
    ('Professor', 'Brown', 'prof.brown@example.com', '+3333333333', 'History'),
    ('Professor', 'Davis', 'prof.davis@example.com', '+4444444444', 'Physics'),
    ('Professor', 'Wilson', 'prof.wilson@example.com', '+5555555555', 'English'),
    ('Professor', 'Garcia', 'prof.garcia@example.com', '+6666666666', 'Chemistry'),
    ('Professor', 'Martinez', 'prof.martinez@example.com', '+7777777777', 'Psychology'),
    ('Professor', 'Lee', 'prof.lee@example.com', '+8888888888', 'Economics'),
    ('Professor', 'Taylor', 'prof.taylor@example.com', '+9999999999', 'Marketing'),
    ('Professor', 'Anderson', 'prof.anderson@example.com', '+1010101010', 'Sociology');

-- Insert sample data into the InstructorAssignments table
INSERT INTO InstructorAssignments (InstructorID, CourseID)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10);

-- Insert sample data into the ExamResults table
INSERT INTO ExamResults (StudentID, CourseID, ExamDate, Score)
VALUES
    (1, 1, '2023-09-15', 92.5),
    (2, 2, '2023-09-16', 87.0),
    (3, 3, '2023-09-17', 78.5),
    (4, 4, '2023-09-18', 95.0),
    (5, 5, '2023-09-19', 88.5),
    (6, 6, '2023-09-20', 76.0),
    (7, 7, '2023-09-21', 91.5),
    (8, 8, '2023-09-22', 83.0),
    (9, 9, '2023-09-23', 89.5),
    (10, 10, '2023-09-24', 94.0);