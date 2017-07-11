$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/cucumber/junit/belly.feature");
formatter.feature({
  "line": 1,
  "name": "Belly",
  "description": "",
  "id": "belly",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "a few cukes",
  "description": "",
  "id": "belly;a-few-cukes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have 42 cukes in my belly",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I wait 1 hour",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "my belly should growl",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "42",
      "offset": 7
    }
  ],
  "location": "Stepdefs.I_have_cukes_in_my_belly(int)"
});
formatter.result({
  "duration": 405214366,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});