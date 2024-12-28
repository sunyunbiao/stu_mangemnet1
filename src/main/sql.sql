create table stu
(
    id     int auto_increment comment '序号'
        primary key,
    sno    varchar(60) null comment '学号',
    sname  varchar(40) not null comment '姓名',
    major  varchar(50) null comment '专业',
    grades double      null comment '绩点',
    email  varchar(60) null comment '邮箱',
    tel    varchar(60) null comment '电话'
);