reveldigital-api
================

Java wrapper library for the RevelDigital HTTP/JSON API. Documentation for the REST API can be found at the
developers website [http://developer.reveldigital.com](http://developer.reveldigital.com).

Access to the API requires an API key which is generated per RevelDigital account.

----
# Get it!

## Maven

Functionality of this package is contained in
Java package `com.reveldigital`.

To use the package, you need to use following Maven dependency:

```xml
<dependency>
  <groupId>com.reveldigital</groupId>
  <artifactId>reveldigital-api</artifactId>
  <version>1.4.0</version>
</dependency>
```

or download jars from Maven repository.

## Non-Maven

For non-Maven use cases, you download jars from [Central Maven repository](http://repo1.maven.org/maven2/com/reveldigital/reveldigital-api/).

-----
# Use it!

## General

Usage requires an API key. To obtain a key you must have a RevelDigital account. API keys are generated by the user
on the _Account > Account Information_ page.

Please see [http://www.reveldigital.com](http://www.reveldigital.com) for more information on RevelDigital services.

Usage typically starts with creation of a service using a service specific `Builder` instance:

```java
DeviceService service = new DeviceService.Builder()
                .setApiKey("My API Key")
                .build();
List<Device> devices = service.getDevices();
```

# License

Copyright (c) 2014 Mike Tinnes

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0
