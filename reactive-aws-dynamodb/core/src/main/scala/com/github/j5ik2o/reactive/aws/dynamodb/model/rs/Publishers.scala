package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import org.reactivestreams.Publisher

trait BatchGetItemPublisher extends Publisher[BatchGetItemResponse]

trait ListTablesPublisher extends Publisher[ListTablesResponse] {
  def tableNames: Publisher[String]
}

trait QueryPublisher extends Publisher[QueryResponse] {
  def items: Publisher[Map[String, AttributeValue]]
}

trait ScanPublisher extends Publisher[ScanResponse] {
  def items: Publisher[Map[String, AttributeValue]]
}
