package com.sundogsoftware.sparkstreaming

import org.apache.spark.{SparkConf, SparkContext}

object PrintCollection {


  def main(args: Array[String]): Unit = {

    val conf : SparkConf = new SparkConf().setAppName("printNumbers").setMaster("local[*]")
    val sc : SparkContext = new SparkContext(conf)

    val numbers = Array(1,2,3,4,5)

    val distNumbers = sc.parallelize(numbers)

    println(distNumbers.reduce(_+_))
  }
}
