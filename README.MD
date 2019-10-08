SPARK EXAMPLES
==============

Spark working examples.

### Configuring the project

You need to have Spark 2.3.4 for Hadoop 2.7 installed in your system (https://spark.apache.org/downloads.html). 

Then you need to setup your installation directory in `build.sbt` file.

### Configuring Twitter examples

For twitter related examples, you need to set up a twitter developer account for analyzing data (https://developer.twitter.com/) and provide
a file `twitter.txt` next to the project root folder with this content:

```
consumerKey <YOUR CONSUMER KEY>
consumerSecret <YOUR CONSUMER SECRET>
accessToken <YOUR ACCESS TOKEN>
accessTokenSecret <YOUR ACCESS TOKEN SECRET>
```

This file will be read by the example and your credentials will be used to consume data from Twitter.



Have fun!!
