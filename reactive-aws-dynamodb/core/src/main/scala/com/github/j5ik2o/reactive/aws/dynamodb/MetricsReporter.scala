package com.github.j5ik2o.reactive.aws.dynamodb

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
trait MetricsReporter {

  def increment(name: String, times: Long): Unit
  def increment(name: String): Unit = increment(name, 1L)

  def record(name: String, value: Long, times: Long): Unit
  def record(name: String, value: Long): Unit = record(name, value, 1L)

}
