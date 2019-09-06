# Possible Scenarios

Validating below quoted scenarios across test pyramids with E2E UI Tests, Integration Tests(including services and database layer validations) and Unit Tests.
.

## Scenarios to be tested for Rider:

- User should be able to login after successful registration with valid credentials
- Forgot Password functionality should work as expected in case if user forgets credentials
- Invalid credentials shouldn't let user login and prompt with an error message
- User should be able to search for a driver with valid search string
- Validate if location service is working as expected.
- Clicking on floating action button to narrow/pin down to current location should work as expected.
- Should be navigated to driver profile to view/contact driver info.
- Clicking on call button should navigate to launch dialler keypad.


## Scenarios to be tested for Driver:

```java
Assuming app provides access to drive to accept rides/bookings/validate earnings etc
```

- Should be able to login as a driver with Valid Credentials.
- Prompted with invalid credentials error message with wrong username/password.
- Should be able to contact user after he/she books a cab.
- Would be able to view current.


## Scenario to be tested for Platinum Rider/Corporate Profile Rider:
```java
Assuming premium service is available
```
- Would be validating all possible scenarios 1-8 mentioned in case of valid rider as quoted above.
- In addition to above scenarios benefits provided to the user could be validated such as reduced prices, faster booking etc.