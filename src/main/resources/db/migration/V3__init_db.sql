-- INSERT VEHICLES
insert into vehicles (model, number, vin, year_of_issue, driver_name, driver_phone)
values ('DAF FT XF 105.460', 'AK 0595-1', 'XLRTE47MS0E995531', 2013, 'Artiom', '+375295458354');
insert into vehicles (model, number, vin, year_of_issue, driver_name, driver_phone)
values ('DAF FT XF 105.460', 'AK 5261-1', 'XLRTE47MS0G029427', 2014, 'Alexandr', '+375292301620');
insert into vehicles (model, number, vin, year_of_issue, driver_name, driver_phone)
values ('DAF FT XF 105.460', 'AK 9427-1', 'XLRTE47MS0G076924', 2015, 'Denis', '+375336424389');

-- INSERT DEPARTMENTS
insert into departments (name, description, phone_number, date_of_formation)
values ('logistics Department', 'logistics, expedition, planning', '+375336446244', '2008-03-15');
insert into departments (name, description, phone_number, date_of_formation)
values ('TIR service', 'tire fitting, car wash', '+375336333140', '2020-09-01');

-- INSERT EMPLOYEES
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Sergey Ignatuk', '1989-08-07', '+375295326531', 's.ignatyuk@yuridan.by', 'scheduler', '2012-11-14', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Natasha Ignatuk', '1989-04-04', '+375336718108', 'info@yuridan.by', 'forwarder', '2013-09-20', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Ivanovskaya Yulia', '1988-07-31', '+375295202152', 'info@yuridan.by', 'forwarder', '2014-10-31', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Kuzavka Elena', '1983-04-10', '+375297237228', 'info@yuridan.by', 'forwarder', '2016-04-01', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Kuzmich Alesya', '1989-04-07', '+375296446244', 'info@yuridan.by', 'forwarder', '2019-03-06', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Kuriga Olga', '1989-10-20', '+375295814472', 'info@yuridan.by', 'forwarder', '2012-03-07', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Kuzmich Alesya', '1989-04-07', '+375296446244', 'info@yuridan.by', 'forwarder', '2019-03-06', 1);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Tarasov Vladimir', '1985-09-07', '+375339007755', 'info@yuridan.by', 'chief mechanical engineer', '2013-11-29', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Kolcov Sergey', '1985-06-02', '+375292228840', 'info@yuridan.by', 'su chief mechanic', '2018-02-12', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Glazovsky Oleg', '1985-06-11', '+375298024239', 'info@yuridan.by', 'master', '2018-10-01', 2);
insert into employees (full_name, date_of_birth, phone_number, email_address, position, date_of_employment, department_id)
values ('Savchuk Alexandr', '1985-11-26', '+375298102912', 'info@yuridan.by', 'master', '2019-04-11', 2);

-- INSERT CALENDAR
insert into calendar (start_time, end_time)
values ('2021-04-01T08:30', '2021-04-01T09:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T09:30', '2021-04-01T10:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T10:30', '2021-04-01T11:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T11:30', '2021-04-01T12:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T13:30', '2021-04-01T14:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T14:30', '2021-04-01T15:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T15:30', '2021-04-01T16:30');
insert into calendar (start_time, end_time)
values ('2021-04-01T16:30', '2021-04-01T17:30');

-- INSERT CALENDAR-EMPLOYEE
insert into calendar_employee (calendar_id, employee_id)
values (1, 8);
insert into calendar_employee (calendar_id, employee_id)
values (2, 8);
insert into calendar_employee (calendar_id, employee_id)
values (3, 8);
insert into calendar_employee (calendar_id, employee_id)
values (4, 8);
insert into calendar_employee (calendar_id, employee_id)
values (5, 8);
insert into calendar_employee (calendar_id, employee_id)
values (6, 8);
insert into calendar_employee (calendar_id, employee_id)
values (7, 8);
insert into calendar_employee (calendar_id, employee_id)
values (8, 8);
insert into calendar_employee (calendar_id, employee_id)
values (1, 9);
insert into calendar_employee (calendar_id, employee_id)
values (2, 9);
insert into calendar_employee (calendar_id, employee_id)
values (3, 9);
insert into calendar_employee (calendar_id, employee_id)
values (4, 9);
insert into calendar_employee (calendar_id, employee_id)
values (5, 9);
insert into calendar_employee (calendar_id, employee_id)
values (6, 9);
insert into calendar_employee (calendar_id, employee_id)
values (7, 9);
insert into calendar_employee (calendar_id, employee_id)
values (8, 9);
insert into calendar_employee (calendar_id, employee_id)
values (1, 10);
insert into calendar_employee (calendar_id, employee_id)
values (2, 10);
insert into calendar_employee (calendar_id, employee_id)
values (3, 10);
insert into calendar_employee (calendar_id, employee_id)
values (4, 10);
insert into calendar_employee (calendar_id, employee_id)
values (5, 10);
insert into calendar_employee (calendar_id, employee_id)
values (6, 10);
insert into calendar_employee (calendar_id, employee_id)
values (7, 10);
insert into calendar_employee (calendar_id, employee_id)
values (8, 10);
insert into calendar_employee (calendar_id, employee_id)
values (1, 11);
insert into calendar_employee (calendar_id, employee_id)
values (2, 11);
insert into calendar_employee (calendar_id, employee_id)
values (3, 11);
insert into calendar_employee (calendar_id, employee_id)
values (4, 11);
insert into calendar_employee (calendar_id, employee_id)
values (5, 11);
insert into calendar_employee (calendar_id, employee_id)
values (6, 11);
insert into calendar_employee (calendar_id, employee_id)
values (7, 11);
insert into calendar_employee (calendar_id, employee_id)
values (8, 11);

-- INSERT ORDERS
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('tire fitting', 1, 10, 1);
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('car wash', 1, 11, 2);
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('tire fitting', 2, 10, 2);
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('car wash', 2, 11, 1);
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('tire fitting', 2, 10, 4);
insert into orders (service, vehicle_id, employee_id, calendar_id)
values ('car wash', 2, 11, 3);