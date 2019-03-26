package com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, ScanResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs.ScanIterable

import scala.collection.JavaConverters._

class ScanIterableImpl(self: software.amazon.awssdk.services.dynamodb.paginators.ScanIterable) extends ScanIterable {
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ScanResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._
  override def iterator: Iterator[ScanResponse] = self.iterator().asScala.map(_.toScala)
  override def items: Iterable[Map[String, AttributeValue]] =
    self.items().asScala.map(_.asScala.toMap.mapValues(_.toScala))
}
