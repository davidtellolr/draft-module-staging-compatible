create table dxp_guestbook_guestbook (
	uuid_ VARCHAR(75) null,
	guestbookId LONG not null primary key,
	companyId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	groupId LONG,
	lastPublishDate DATE null,
	userId LONG,
	userName VARCHAR(75) null,
	titulo STRING null,
	descripcion STRING null
);