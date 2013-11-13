truncate vm_testcases;
truncate vm_subtests;
truncate log_queue;
truncate log_errors;
truncate log_failures;
truncate log_tests;
truncate vm_batch;
truncate vm_job;

truncate selenium_failures;
truncate sel_fail2os;
truncate sel_fail2browser;


/* vm_testcases lmp */
/* Accounts */
insert into vm_testcases (name, platform) values ('Accounts', 'lmp');
set @v1 := (select last_insert_id());
/* Accounts Classes */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Activities');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'AllFields');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Associations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'CustomerAllFields');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Modifications');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SubTasks');
/* -------------------------------------------------------------------------------- */
/* Admin */
insert into vm_testcases (name, platform) values ('Admin', 'lmp');
set @v1 := (select last_insert_id());
/*insert into vm_subtests (vm_testcase_id, name) values (@v1,'AutoIt');*/
/* ***** companySettings ***** */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageEmployees');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageProducts');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageZones');
/* ***** personalSettings ***** */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Email');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SetEmployeeRequiredFields');
/* ***** sitesettings ***** */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageCountries');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageCustomFields');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageDropdowns');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageScripts');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageSystemTimeout');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageTabs');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'WebPostTemplates');
/* ***** tools ***** */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'EmployeeQuota');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ImportAccounts');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Imports');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageACDs');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageC2CDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageIVRs');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManagePowerDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'RoutingRules');
/* -------------------------------------------------------------------------------- */
/* Billing */
insert into vm_testcases (name, platform) values ('Billing', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Billing');
/* -------------------------------------------------------------------------------- */
/* Campaigns */
insert into vm_testcases (name, platform) values ('Campaigns', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Campaigns');
/* -------------------------------------------------------------------------------- */
/* Cases */
insert into vm_testcases (name, platform) values ('Cases', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Associations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Cases');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SubTasks');
/* -------------------------------------------------------------------------------- */
/* Console */
insert into vm_testcases (name, platform) values ('Console', 'lmp');
set @v1 := (select last_insert_id());
/* insert into vm_subtests (vm_testcase_id, name) values (@v1,'LMPAdminLinks'); */
insert into vm_subtests (vm_testcase_id, name) values (@v1,'LMPLogin');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'LMPTabs');
/* -------------------------------------------------------------------------------- */
/* Contacts */
insert into vm_testcases (name, platform) values ('Contacts', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Activities');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Associations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ContactGroups');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'FullContact');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Modifications');
/* -------------------------------------------------------------------------------- */
/* Deals */
insert into vm_testcases (name, platform) values ('Deals', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Deals');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SubTasks');
/* -------------------------------------------------------------------------------- */
/*insert into vm_testcases (name, platform) values ('Elf', 'lmp');*/
/*set @v1 := (select last_insert_id());*/
/* Elf 
insert into vm_subtests (vm_testcase_id, name) values (@v1,'CaseElfActions');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'CaseElfBasics');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'DealElfActions');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'DealElfBasics');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'LeadElfActions');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'LeadElfBasics');
*/
/* -------------------------------------------------------------------------------- */
/* Events */
insert into vm_testcases (name, platform) values ('Events', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'BasicOperations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'CreatorViews');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'EventViews');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ModifyComponents');
/* -------------------------------------------------------------------------------- */
/* Files */
insert into vm_testcases (name, platform) values ('Files', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'FileHandler');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'FolderHandler');
/* -------------------------------------------------------------------------------- */
/* JabberDogs */
insert into vm_testcases (name, platform) values ('JabberDog', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1, 'JabberDogTest');
/* -------------------------------------------------------------------------------- */
/* Leads */
insert into vm_testcases (name, platform) values ('Leads', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Activities');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Associations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Modifications');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SubTasks');
/* -------------------------------------------------------------------------------- */
/* Tasks */
insert into vm_testcases (name, platform) values ('Tasks', 'lmp');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'BasicOperations');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'CreatorViews');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'TaskViews');
/* -------------------------------------------------------------------------------- */
/* vm_testcases sf */
/* AdditionalSettings */ 
insert into vm_testcases (name, platform) values ('AdditionalSettings', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'DialerPanelAllButtons');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageC2CDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageCompanySettings');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManagePowerDialerPanels');
/* -------------------------------------------------------------------------------- */
/* CallMonitoring */
insert into vm_testcases (name, platform) values ('CallMonitoring', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'FileHandler');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'FolderHandler');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageCallSettings');
/* -------------------------------------------------------------------------------- */
/* Console */
insert into vm_testcases (name, platform) values ('SFConsole', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ISLinks');
/* -------------------------------------------------------------------------------- */
/* InboundCallSettings */
insert into vm_testcases (name, platform) values ('InboundCallSettings', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageACDs');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageIVRs');
/* -------------------------------------------------------------------------------- */
/* InsideSales */
insert into vm_testcases (name, platform) values ('InsideSales', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'BillingTests');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'DialerScript');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ELFTest');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Email');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'InboundLogin');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'VoiceMessageTests');
/* -------------------------------------------------------------------------------- */
/* Lists */
insert into vm_testcases (name, platform) values ('Lists', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Domino');
insert into vm_subtests (vm_testcase_id, name) values (@v1,'Seek');
/* -------------------------------------------------------------------------------- */
/* Support */
insert into vm_testcases (name, platform) values ('Support', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'SupportOps');
/* -------------------------------------------------------------------------------- */
/* UserManagement */
insert into vm_testcases (name, platform) values ('UserManagement', 'sf');
set @v1 := (select last_insert_id());
insert into vm_subtests (vm_testcase_id, name) values (@v1,'ManageUsers');
/* -------------------------------------------------------------------------------- */


update vm_subtests set created_date = now();
update vm_testcases set created_date= now();
