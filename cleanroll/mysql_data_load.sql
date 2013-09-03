truncate vm_testcases;
truncate vm_subtests;
truncate log_queue;
truncate log_errors;
truncate log_failures;
truncate vm_batch;

truncate selenium_failures
truncate sel_fail2os
truncate sel_fail2browser


/* vm_testcases lmp */
insert into vm_testcases (name, platform) values ('Accounts', 'lmp');
insert into vm_testcases (name, platform) values ('Admin', 'lmp');
insert into vm_testcases (name, platform) values ('Billing', 'lmp');
insert into vm_testcases (name, platform) values ('Campaigns', 'lmp');
insert into vm_testcases (name, platform) values ('Cases', 'lmp');
insert into vm_testcases (name, platform) values ('Console', 'lmp');
insert into vm_testcases (name, platform) values ('Contacts', 'lmp');
insert into vm_testcases (name, platform) values ('Deals', 'lmp');
/*insert into vm_testcases (name, platform) values ('Elf', 'lmp');*/
insert into vm_testcases (name, platform) values ('Events', 'lmp');
insert into vm_testcases (name, platform) values ('Files', 'lmp');
insert into vm_testcases (name, platform) values ('Leads', 'lmp');
insert into vm_testcases (name, platform) values ('Tasks', 'lmp');
/* vm_testcases sf */
insert into vm_testcases (name, platform) values ('AdditionalSettings', 'sf');
insert into vm_testcases (name, platform) values ('CallMonitoring', 'sf');
insert into vm_testcases (name, platform) values ('SFConsole', 'sf');
insert into vm_testcases (name, platform) values ('InboundCallSettings', 'sf');
insert into vm_testcases (name, platform) values ('InsideSales', 'sf');
insert into vm_testcases (name, platform) values ('Lists', 'sf');
insert into vm_testcases (name, platform) values ('Support', 'sf');
insert into vm_testcases (name, platform) values ('UserManagement', 'sf');

/* Accounts */
insert into vm_subtests (vm_testcase_id, name) values ('1','Activities');
insert into vm_subtests (vm_testcase_id, name) values ('1','AllFields');
insert into vm_subtests (vm_testcase_id, name) values ('1','Associations');
insert into vm_subtests (vm_testcase_id, name) values ('1','CustomerAllFields');
insert into vm_subtests (vm_testcase_id, name) values ('1','MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values ('1','Modifications');
insert into vm_subtests (vm_testcase_id, name) values ('1','SubTasks');
/* Admin */
/*insert into vm_subtests (vm_testcase_id, name) values ('2','AutoIt');*/
/* ***** companySettings ***** */
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageEmployees');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageProducts');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageZones');
/* ***** personalSettings ***** */
insert into vm_subtests (vm_testcase_id, name) values ('2','Email');
insert into vm_subtests (vm_testcase_id, name) values ('2','SetEmployeeRequiredFields');
/* ***** sitesettings ***** */
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageCountries');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageCustomFields');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageDropdowns');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageScripts');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageSystemTimeout');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageTabs');
insert into vm_subtests (vm_testcase_id, name) values ('2','WebPostTemplates');
/* ***** tools ***** */
insert into vm_subtests (vm_testcase_id, name) values ('2','EmployeeQuota');
insert into vm_subtests (vm_testcase_id, name) values ('2','ImportAccounts');
insert into vm_subtests (vm_testcase_id, name) values ('2','Imports');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageACDs');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageC2CDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManageIVRs');
insert into vm_subtests (vm_testcase_id, name) values ('2','ManagePowerDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values ('2','RoutingRules');
/* Billing */
insert into vm_subtests (vm_testcase_id, name) values ('3','Billing');
/* Campaigns */
insert into vm_subtests (vm_testcase_id, name) values ('4','Campaigns');
/* Cases */
insert into vm_subtests (vm_testcase_id, name) values ('5','Associations');
insert into vm_subtests (vm_testcase_id, name) values ('5','Cases');
insert into vm_subtests (vm_testcase_id, name) values ('5','MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values ('5','SubTasks');
/* Console */
insert into vm_subtests (vm_testcase_id, name) values ('6','LMPAdminLinks');
insert into vm_subtests (vm_testcase_id, name) values ('6','LMPLogin');
insert into vm_subtests (vm_testcase_id, name) values ('6','LMPTabs');
/* Contacts */
insert into vm_subtests (vm_testcase_id, name) values ('7','Activities');
insert into vm_subtests (vm_testcase_id, name) values ('7','Associations');
insert into vm_subtests (vm_testcase_id, name) values ('7','ContactGroups');
insert into vm_subtests (vm_testcase_id, name) values ('7','FullContact');
insert into vm_subtests (vm_testcase_id, name) values ('7','MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values ('7','Modifications');
/* Deals */
insert into vm_subtests (vm_testcase_id, name) values ('8','Deals');
insert into vm_subtests (vm_testcase_id, name) values ('8','MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values ('8','SubTasks');
/* Elf 
insert into vm_subtests (vm_testcase_id, name) values ('9','CaseElfActions');
insert into vm_subtests (vm_testcase_id, name) values ('9','CaseElfBasics');
insert into vm_subtests (vm_testcase_id, name) values ('9','DealElfActions');
insert into vm_subtests (vm_testcase_id, name) values ('9','DealElfBasics');
insert into vm_subtests (vm_testcase_id, name) values ('9','LeadElfActions');
insert into vm_subtests (vm_testcase_id, name) values ('9','LeadElfBasics');
*/
/* Events */
insert into vm_subtests (vm_testcase_id, name) values ('9','BasicOperations');
insert into vm_subtests (vm_testcase_id, name) values ('9','CreatorViews');
insert into vm_subtests (vm_testcase_id, name) values ('9','EventViews');
insert into vm_subtests (vm_testcase_id, name) values ('9','ModifyComponents');
/* Files */
insert into vm_subtests (vm_testcase_id, name) values ('10','FileHandler');
insert into vm_subtests (vm_testcase_id, name) values ('10','FolderHandler');
/* Leads */
insert into vm_subtests (vm_testcase_id, name) values ('11','Activities');
insert into vm_subtests (vm_testcase_id, name) values ('11','Associations');
insert into vm_subtests (vm_testcase_id, name) values ('11','MassUpdates');
insert into vm_subtests (vm_testcase_id, name) values ('11','Modifications');
insert into vm_subtests (vm_testcase_id, name) values ('11','SubTasks');
/* Tasks */
insert into vm_subtests (vm_testcase_id, name) values ('12','BasicOperations');
insert into vm_subtests (vm_testcase_id, name) values ('12','CreatorViews');
insert into vm_subtests (vm_testcase_id, name) values ('12','TaskViews');
/* AdditionalSettings */ 
insert into vm_subtests (vm_testcase_id, name) values ('13','DialerPanelAllButtons');
insert into vm_subtests (vm_testcase_id, name) values ('13','ManageC2CDialerPanels');
insert into vm_subtests (vm_testcase_id, name) values ('13','ManageCompanySettings');
insert into vm_subtests (vm_testcase_id, name) values ('13','ManagePowerDialerPanels');
/* CallMonitoring */
insert into vm_subtests (vm_testcase_id, name) values ('14','FileHandler');
insert into vm_subtests (vm_testcase_id, name) values ('14','FolderHandler');
insert into vm_subtests (vm_testcase_id, name) values ('14','ManageCallSettings');
/* Console */
insert into vm_subtests (vm_testcase_id, name) values ('15','ISLinks');
/* InboundCallSettings */
insert into vm_subtests (vm_testcase_id, name) values ('16','ManageACDs');
insert into vm_subtests (vm_testcase_id, name) values ('16','ManageIVRs');
/* InsideSales */
insert into vm_subtests (vm_testcase_id, name) values ('17','BillingTests');
insert into vm_subtests (vm_testcase_id, name) values ('17','DialerScript');
/*insert into vm_subtests (vm_testcase_id, name) values ('17','ELFTest');*/
insert into vm_subtests (vm_testcase_id, name) values ('17','Email');
insert into vm_subtests (vm_testcase_id, name) values ('17','InboundLogin');
insert into vm_subtests (vm_testcase_id, name) values ('17','VoiceMessageTests');
/* Lists */
insert into vm_subtests (vm_testcase_id, name) values ('18','Domino');
insert into vm_subtests (vm_testcase_id, name) values ('18','Seek');
/* Support */
insert into vm_subtests (vm_testcase_id, name) values ('19','SupportOps');
/* UserManagement */
insert into vm_subtests (vm_testcase_id, name) values ('20','ManageUsers');

update vm_subtests set created_date = now();
update vm_testcases set created_date= now();
