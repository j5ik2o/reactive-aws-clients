package com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.BatchGetItemResponse
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs.BatchGetItemIterable

import scala.collection.JavaConverters._

class BatchGetItemIterableImpl(self: software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemIterable)
    extends BatchGetItemIterable {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchGetItemResponseOps._
  override def iterator: Iterator[BatchGetItemResponse] = self.iterator().asScala.map(_.toScala)
}
