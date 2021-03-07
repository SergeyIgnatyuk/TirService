-- INSERT DEPARTMENTS
insert into departments (name, description, phone_number, date_of_formation)
values ('Logistics Department', 'logistics, expedition, planning', '+375336446244', '2008-03-15');
insert into departments (name, description, phone_number, date_of_formation)
values ('Transport Service', 'tire fitting, car wash, drivers', '+375336333140', '2020-09-01');


-- INSERT EMPLOYEES
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Sergey Ignatuk', '1989-08-07', '+375295326531', 's.ignatyuk@yuridan.by', 'scheduler', '2012-11-14', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Natasha Ignatuk', '1989-04-04', '+375336718108', 'info@yuridan.by', 'forwarder', '2013-09-20', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Ivanovskaya Yulia', '1988-07-31', '+375295202152', 'info@yuridan.by', 'forwarder', '2014-10-31', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Kuzavka Elena', '1983-04-10', '+375297237228', 'info@yuridan.by', 'forwarder', '2016-04-01', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Kuzmich Alesya', '1989-04-07', '+375296446244', 'info@yuridan.by', 'forwarder', '2019-03-06', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Kuriga Olga', '1989-10-20', '+375295814472', 'info@yuridan.by', 'forwarder', '2012-03-07', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Kuzmich Alesya', '1989-04-07', '+375296446244', 'info@yuridan.by', 'forwarder', '2019-03-06', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Tarasov Vladimir', '1985-09-07', '+375339007755', 'info@yuridan.by', 'chief mechanical engineer', '2013-11-29',
        2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Kolcov Sergey', '1985-06-02', '+375292228840', 'info@yuridan.by', 'su chief mechanic', '2018-02-12', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Glazovsky Oleg', '1985-06-11', '+375298024239', 'info@yuridan.by', 'master', '2018-10-01', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Savchuk Alexandr', '1985-11-26', '+375298102912', 'info@yuridan.by', 'master', '2019-04-11', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Bobkov Evgeny', '1994-01-26', '+375298502341', 'info@yuridan.by', 'driver', '2020-04-14', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Bonushko Pavel', '1993-08-03', '+375333516571', 'info@yuridan.by', 'driver', '2019-06-06', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Brishtel Alexandr', '1985-06-13', '+375336088684', 'info@yuridan.by', 'driver', '2019-07-18', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Valushko Alexei', '1988-05-13', '+375298337408', 'info@yuridan.by', 'driver', '2020-11-25', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment,
                       department_id)
values ('Venzelev Alexander', '1976-08-02', '+375333718378', 'info@yuridan.by', 'driver', '2018-12-13', 2);

-- INSERT VEHICLES
insert into vehicles (model, number, vin, year_of_issue, employee_id)
values ('DAF FT XF 105.460', 'AK 0595-1', 'XLRTE47MS0E995531', 2013, 12);
insert into vehicles (model, number, vin, year_of_issue, employee_id)
values ('DAF FT XF 105.460', 'AK 5261-1', 'XLRTE47MS0G029427', 2014, 13);
insert into vehicles (model, number, vin, year_of_issue, employee_id)
values ('DAF FT XF 105.460', 'AK 9427-1', 'XLRTE47MS0G076924', 2015, 14);

-- INSERT ORDERS
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('tire fitting', '2020-04-01T08:30', '2020-04-01T09:30', 1, 10);
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('car wash', '2020-04-01T09:30', '2020-04-01T10:30', 1, 11);
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('tire fitting', '2020-04-01T09:30', '2020-04-01T10:30', 2, 10);
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('car wash', '2020-04-01T08:30', '2020-04-01T09:30', 2, 11);
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('tire fitting', '2020-04-01T10:30', '2020-04-01T11:30', 3, 10);
insert into orders (service_name, start_time, end_time, vehicle_id, employee_id)
values ('car wash', '2020-04-01T11:30', '2020-04-01T12:30', 3, 11);