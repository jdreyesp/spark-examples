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


### Using TCP examples for Apache logs

Apache log related examples expect some logs being sent to a TCP socket listening in a specific port.

Use `ncat` tool if you're using Windows or `nc` if you're using Linux or MacOS. A example of `nc` would be:

```
nc -l 9999 < access_log.txt
```

Have fun!!
