UncleRoofGoGo
=============
Setup Process

```
gi android >> .gitignore 
git submodule add git://nuuneoi.com/TheCheeseLibrary.git
```
fix setting.gradle
```
include ':app','TheCheeseLibrary'
```
add build.gradle
```
compile project(':TheCheeseLibrary') 
```
