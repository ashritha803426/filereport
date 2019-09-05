$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features99/bdc_dem0_02.feature");
formatter.feature({
  "name": "BDC validation on demowebshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registered user access track the ordered item in DemoWebshop",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user has already placed an order for his favorite item",
  "keyword": "Given "
});
formatter.match({
  "location": "bdc_dem0_02_definitions.user_has_already_placed_an_order_for_his_favorite_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to access the order tracking dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "bdc_dem0_02_definitions.user_tries_to_access_the_order_tracking_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "identifies the state of the order",
  "keyword": "Then "
});
formatter.match({
  "location": "bdc_dem0_02_definitions.identifies_the_state_of_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("features99/bdc_demo_01.feature");
formatter.feature({
  "name": "Guest user actions in Demo WebShop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Users chice to opt for an account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user access the signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "bdc_demo_01_definitions.user_access_the_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gets the credentials",
  "keyword": "And "
});
formatter.match({
  "location": "bdc_demo_01_definitions.gets_the_credentials()"
});
formatter.result({
  "status": "passed"
});
});