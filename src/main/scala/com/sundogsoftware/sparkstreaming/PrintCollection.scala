package com.sundogsoftware.sparkstreaming

import org.apache.spark.sql.{DataFrame, SparkSession}

case class NumberMapped(val number: java.lang.Integer) {

  //Java friendly getter
  def getNumber() = number
}

object PrintCollection {

  import scala.collection.JavaConversions._

  private def readLocalData(implicit spark: SparkSession) : DataFrame = {
    val numbers = seqAsJavaList(Array(NumberMapped(1), NumberMapped(2)))
    spark.createDataFrame(numbers, classOf[NumberMapped])
  }

  def main(args: Array[String]): Unit = {

    implicit val spark = SparkSession
      .builder
      .appName("PrintCollection")
      .master("local[*]")
      //.config("spark.sql.warehouse.dir", "file:///C:/temp") // Necessary to work around a Windows bug in Spark 2.0.0; omit if you're not on Windows.
      .config("spark.sql.streaming.checkpointLocation", "./checkpoint")
      .getOrCreate()

    val numbersTable = readLocalData.createOrReplaceTempView("numbers")
    val df: DataFrame = spark.sql("SELECT * FROM numbers WHERE number == 1")

    df.show()
  }
}
