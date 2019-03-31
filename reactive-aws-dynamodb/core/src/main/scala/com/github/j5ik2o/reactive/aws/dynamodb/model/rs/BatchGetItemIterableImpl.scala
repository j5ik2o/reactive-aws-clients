package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.BatchGetItemResponse
import scala.collection.JavaConverters._

private[dynamodb] class BatchGetItemIterableImpl(
    self: software.amazon.awssdk.services.dynamodb.paginators.BatchGetItemIterable
) extends BatchGetItemIterable {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.BatchGetItemResponseOps._

  override def iterator: Iterator[BatchGetItemResponse] = self.iterator().asScala.map(_.toScala)

}
