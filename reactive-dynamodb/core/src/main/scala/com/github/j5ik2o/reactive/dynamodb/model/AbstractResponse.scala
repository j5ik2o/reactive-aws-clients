package com.github.j5ik2o.reactive.dynamodb.model

abstract class AbstractResponse(val statusCode: Option[Int] = None,
                                val statusText: Option[String] = None,
                                val httpHeaders: Option[Map[String, Seq[String]]] = None) {
  type ThisType <: AbstractResponse
  private val OK            = 200
  def isSuccessful: Boolean = statusCode.contains(OK)
  def withStatusCode(value: Option[Int]): ThisType
  def withStatusText(value: Option[String]): ThisType
  def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ThisType
}
