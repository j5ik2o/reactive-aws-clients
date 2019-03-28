package com.github.j5ik2o.reactive.aws.dynamodb.v2.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.ListTablesResponse
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ListTablesIterable

import scala.collection.JavaConverters._

private[dynamodb] class ListTablesIterableImpl(
    self: software.amazon.awssdk.services.dynamodb.paginators.ListTablesIterable
) extends ListTablesIterable {

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.ListTablesResponseOps._

  override def iterator: Iterator[ListTablesResponse] = self.iterator().asScala.map(_.toScala)

  override def tableNames: Iterable[String] = self.tableNames().asScala

}
