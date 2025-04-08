insert into user_details(id,birth_date,name)
values
(10002, current_date(), 'John'),
(10003, current_date(), 'Aamir'),
(10004, current_date(), 'Huberman');

insert into post(id,description,user_id)
values
(20001, 'AWS', '10002'),
(20002, 'REST', '10002'),
(20003, 'Java', '10003'),
(20004, 'Docker', '10003');