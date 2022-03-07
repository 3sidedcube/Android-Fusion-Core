# Android-Fusion-Core
## Fusion library for Android: Core module
Fusion: Flexible JSON driven UI rendering.

### What is Fusion?
Fusion is a library designed to take JSON data representing UI, and render that data into the described UI.
The JSON data must match the Fusion JSON schema in order to render correctly.
This is part of the Fusion library for Android - there also exists a [Fusion library for iOS](https://github.com/3sidedcube/Fusion), so that Fusion can be used to build cross-platform UI.

### What is the Core module for?
The Core module contains all of the basic models defined in the Fusion JSON schema, as well as some utility methods and constants.
It also contains interfaces that are used by inheriting modules to define the way in which they interact.
This allows a separation of concerns so that Fusion components can be swapped out when necessary.

The Core module repo also currently contains the legacy Display Populator implementation.
The Display Populator is responsible for transforming a link to a single page of Fusion data into a complete Java object representation of that page.
The legacy implementation utilises [Retrofit](https://square.github.io/retrofit/) and [Gson](https://github.com/google/gson) to fetch pages from an API.

## Installation
[JitPack](https://jitpack.io/) is used to provide the Fusion artifacts.
In order to utilise the core library in a project, update your `settings.gradle` (or root project `build.gradle` on older projects) to include the Jitpack maven repository:
```groovy
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
```
Then, add the following dependency to your `build.gradle` file:
```groovy
    implementation 'com.github.3sidedcube.Android-Fusion-Core:core:{versionCode}'
```
To utilise the legacy display populator, add the following dependency:
```groovy
    implementation 'com.github.3sidedcube.Android-Fusion-Core:populator-legacy:{versionCode}'
```
If you wish to utilise all modules in this repo, you can alternatively add the following dependency:
```groovy
    implementation 'com.github.3sidedcube:Android-Fusion-Core:{versionCode}'
```
As these builds are provided using Jitpack, `{versionCode}` can be replaced with:

- A specific commit, e.g `1a2b3c4d5e`
- A specific branch's latest build, e.g `feature~jitpack-setup-SNAPSHOT`
- A specific pre-release tag, e.g `1.0.0-rc1`
- A specific release tag, e.g `1.0.0`

It is recommended that you use this library at a specific release tag, to ensure that the library is in a stable state.

## Usage
Demo apps for the usage of Fusion can be found in the other relevant modules.
For example, the [Android UI Module](https://github.com/3sidedcube/Android-Fusion-AndroidUi) contains a demo application.

## Custom behaviour
Information on the creation of custom models, actions, and more can be found at the Wiki.

## FAQ
### What motivated the name "Fusion"?
Fusion here means to bring together two platforms, iOS and Android, powered by a single server-side API.
For web-server apps, the business logic should sit server-side as much as possible. Fusion aims to be as simple as "server tell me what to draw and I'll draw it".
