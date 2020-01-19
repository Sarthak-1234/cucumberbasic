$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/gmailhomepage.feature");
formatter.feature({
  "name": "Related to homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check components of gmail homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dataset"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch gmail url",
  "keyword": "Given "
});
formatter.match({
  "location": "gmailLoginTest.i_launch_gmail_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify below components of gmail homepage",
  "rows": [
    {
      "cells": [
        "GoogleLogo"
      ]
    },
    {
      "cells": [
        "SignIn Text"
      ]
    },
    {
      "cells": [
        "Continue to gmail text"
      ]
    },
    {
      "cells": [
        "email textbox"
      ]
    },
    {
      "cells": [
        "forget email"
      ]
    },
    {
      "cells": [
        "learn more"
      ]
    },
    {
      "cells": [
        "create account"
      ]
    },
    {
      "cells": [
        "next button"
      ]
    },
    {
      "cells": [
        "language"
      ]
    },
    {
      "cells": [
        "help"
      ]
    },
    {
      "cells": [
        "privacy"
      ]
    },
    {
      "cells": [
        "term"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "gmailhomepageTest.i_verify_below_components_of_gmail_homepage(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});