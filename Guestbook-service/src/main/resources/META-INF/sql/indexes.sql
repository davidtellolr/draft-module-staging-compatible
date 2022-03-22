create index IX_21BEF49A on dxp_guestbook_guestbook (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FCFD99C on dxp_guestbook_guestbook (uuid_[$COLUMN_LENGTH:75$], groupId);