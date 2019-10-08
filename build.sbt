name := "SparkStreamingExamples"

version := "0.1"

scalaVersion := "2.11.12"

/**
  * SET YOUR SPARK INSTALL FOLDER HERE
  */
val sparkInstallFolder = "/Users/tl39to/apps/spark-2.3.4-bin-hadoop2.7"

unmanagedJars in Compile ++=
  (file(s"${sparkInstallFolder}/jars/") * "*.jar").classpath

unmanagedJars in Compile ++=
  (file("/Users/tl39to/workspaces/spark/SparkStreamingExamples/") * "*.jar").classpath

import Versions._

lazy val sparkDependencies = Seq("org.apache.spark" %% "spark-streaming-flume" % sparkVersion,
                                 "org.apache.spark" %% "spark-streaming-kinesis-asl" % sparkVersion)

lazy val twitterDependencies = Seq("org.twitter4j" % "twitter4j-core" % Twitter.twitterDepsVersion,
                                   "org.twitter4j" % "twitter4j-stream" % Twitter.twitterDepsVersion)

lazy val connectors = Seq("com.datastax.spark" %% "spark-cassandra-connector" % Connectors.cassandraConnectorVersion)

libraryDependencies ++=
    sparkDependencies ++
    twitterDependencies ++
    connectors