# Sample of MicroProfile GraphQL on OpenLiberty

This is a simple demo of the MP GraphQL capabilities in OpenLiberty.

To run, clone this repository, and then run:
`mvn clean package liberty:run`

Then browse to:
http://localhost:9080/mpGraphQLSample/graphiql.html

Then try a query like:
```
{
    currentConditions(location: "Paris") {
        dayTime
        hasPrecipitation
        temperatureF
        weatherText
        precipitationType
    }
}
```

You should see results similar to (but with random values):
```
{
  "data": {
    "currentConditions": {
      "dayTime": true,
      "hasPrecipitation": true,
      "temperatureF": 8.796591509601903,
      "weatherText": "Overcast",
      "precipitationType": "SNOW"
    }
  }
}
```
