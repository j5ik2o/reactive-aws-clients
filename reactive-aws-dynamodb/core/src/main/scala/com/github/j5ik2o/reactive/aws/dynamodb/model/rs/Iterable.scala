package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model._

trait BatchGetItemIterable extends Iterable[BatchGetItemResponse]

trait ListTablesIterable extends Iterable[ListTablesResponse] {
  def tableNames: Iterable[String]
}

trait QueryIterable extends Iterable[QueryResponse] {
  def items: Iterable[Map[String, AttributeValue]]
}

trait ScanIterable extends Iterable[ScanResponse] {
  def items: Iterable[Map[String, AttributeValue]]
}
