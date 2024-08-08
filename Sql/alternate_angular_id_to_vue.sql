create table if not exists alternate_angular_id_to_vue(
angular_id varchar(255) not null,
vue_code varchar(255) null,
quality_grade varchar(255) null,
angular_id_to_vue_system varchar(255) null,
angular_id_to_vue_system_code varchar(255) null,
angular_id_to_vue_system_description varchar(255) null,
known_quality_issues varchar(255) null,
risk_level Integer null,
mitigation varchar(255) null,
approval_code varchar(255) null,
entity_state varchar(255) null,
constraint alternate_angular_id_to_vue_pk primary key(angular_id));