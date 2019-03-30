package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, ScanResponse }
import scala.collection.JavaConverters._

private[dynamodb] class ScanIterableImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ScanIterable)
    extends ScanIterable {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.ScanResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.AttributeValueOps._

  override def iterator: Iterator[ScanResponse] = self.iterator().asScala.map(_.toScala)

  override def items: Iterable[Map[String, AttributeValue]] =
    self.items().asScala.map(_.asScala.toMap.mapValues(_.toScala))

}
