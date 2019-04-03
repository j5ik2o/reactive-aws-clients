// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutRequestBuilderOps(val self: PutRequest.Builder) extends AnyVal {

  final def withItemAsScala(value: Option[Map[String, AttributeValue]]): PutRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.item(v.asJava)
    } // Map[String, AttributeValue]
  }

}

final class PutRequestOps(val self: PutRequest) extends AnyVal {

  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRequestOps {

  implicit def toPutRequestBuilderOps(v: PutRequest.Builder): PutRequestBuilderOps = new PutRequestBuilderOps(v)

  implicit def toPutRequestOps(v: PutRequest): PutRequestOps = new PutRequestOps(v)

}
