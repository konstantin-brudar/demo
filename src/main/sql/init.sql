CREATE TABLE IF NOT EXISTS public.students_table
(
    student_id serial PRIMARY KEY,
    first_name varchar(255) NOT NULL,
    middle_name varchar(255),
    last_name varchar(255) NOT NULL,
    speciality varchar(255) NOT NULL,
    course integer NOT NULL
    );

ALTER TABLE public.students_table
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.professors_table
(
    professor_id serial PRIMARY KEY,
    first_name varchar(255) NOT NULL,
    middle_name varchar(255),
    last_name varchar(255) NOT NULL,
    chair varchar(255) NOT NULL
    );

ALTER TABLE public.professors_table
    OWNER to postgres;