## Endpoints

Registration

`http://localhost:8080/api/auth/registration`

Login

`http://localhost:8080/api/auth/login`

Get statistics by all dates.

`http://localhost:8080/api/statistics/date`

Get statistics by selected date. Takes in parameter `date` in such format `2024-03-02`.

`http://localhost:8080/api/statistics/date/selected`

Get statistics by date between. Takes in two parameters, `dateStart` and `dateEnd`, format `2024-03-02`.

`http://localhost:8080/api/statistics/date/between`

Get statistics by all asin. 

`http://localhost:8080/api/statistics/asin`

Get statistics by selected asin. Takes in parameter `asin`, format `B07JWCZKSJ`.

`http://localhost:8080/api/statistics/asin/selected`

Get statistics by asin in. Takes in parameter `asin`, multiple asins may be specified like this `B07JWCZKSJ, B09ZDDDS1X`.

`http://localhost:8080/api/statistics/asin/in`


## Future updates

Next feature to add is populating database from local json file