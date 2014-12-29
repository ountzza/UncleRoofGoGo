##UncleRoofGoGo
=============
###Setup Process

```
gi android >> .gitignore 
git submodule add git://nuuneoi.com/TheCheeseLibrary.git
git submodule update --init --recursive
```
fix setting.gradle
```
include ':app','TheCheeseLibrary'
```
add build.gradle
```
compile project(':TheCheeseLibrary') 
```

===============
###Links
- https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit
- https://developers.google.com/google-apps/calendar/v3/reference/events/list#examples
- https://developers.facebook.com/docs/android/login-with-facebook/v2.2?locale=en_PI
