package com.github.j5ik2o.reactive.aws.dynamodb.model.rs

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ AttributeValue, QueryResponse }
import scala.collection.JavaConverters._

private[dynamodb] class QueryIterableImpl(self: software.amazon.awssdk.services.dynamodb.paginators.QueryIterable)
    extends QueryIterable {

  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.QueryResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.ops.AttributeValueOps._

  override def iterator: Iterator[QueryResponse] = self.iterator().asScala.map(_.toScala)

  override def items: Iterable[Map[String, AttributeValue]] =
    self.items().asScala.map(_.asScala.toMap.mapValues(_.toScala))

}
