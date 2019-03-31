package com.github.j5ik2o.reactive.aws.kinesis.model.rs

import com.github.j5ik2o.reactive.aws.kinesis.model.ListStreamConsumersResponse

import scala.collection.JavaConverters._

private[kinesis] class ListStreamConsumersIterableImpl(
    self: software.amazon.awssdk.services.kinesis.paginators.ListStreamConsumersIterable
) extends ListStreamConsumersIterable {
  import com.github.j5ik2o.reactive.aws.kinesis.model.ops.ListStreamConsumersResponseOps._
  override def iterator: Iterator[ListStreamConsumersResponse] = self.iterator().asScala.map(_.toScala)
}
