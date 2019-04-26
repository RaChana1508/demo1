$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/demoWebShop.feature");
formatter.feature({
  "name": "DemoWebShop Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "DemoWebShop registration",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.url_of_the_demowebshop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data for registration",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationStepDefs.user_enters_the_data_for_registration()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.user_is_registered_successfully()"
});
formatter.result({
  "status": "passed"
});
});