## _kt start_

#### _Requeriments_

`Java 8`
`Kotlin`
`Gradle 4.8 or higher`
`Docker`

#### _Tasks_

```
gradle clean
```
```
gradle build
```
```
gradle bootRun
```
```
java -jar build\libs\kt-start-{version}-SNAPSHOT.jar
```

#### _Docker_
```
gradle clean build
```
```
docker build -t kt-start .
```
```
docker run -p 8776:8776 -t kt-start
```