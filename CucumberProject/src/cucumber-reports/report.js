$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/cucumbercasestudy/adminlogin.feature");
formatter.feature({
  "name": "TestMeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TestMeApp admin Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "adminLogStepsdefs.url_of_the_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for login",
  "keyword": "When "
});
formatter.match({
  "location": "adminLogStepsdefs.user_enters_the_data_for_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user  login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "adminLogStepsdefs.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});