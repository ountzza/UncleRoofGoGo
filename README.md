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
