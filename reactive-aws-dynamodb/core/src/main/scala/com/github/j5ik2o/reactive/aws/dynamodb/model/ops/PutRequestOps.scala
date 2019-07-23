// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class PutRequestBuilderOps(val self: PutRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala(value: Option[Map[String, AttributeValue]]): PutRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.item(v.asJava)
    }
  }

}

final class PutRequestOps(val self: PutRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def itemAsScala: Option[Map[String, AttributeValue]] = Option(self.item).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRequestOps {

  implicit def toPutRequestBuilderOps(v: PutRequest.Builder): PutRequestBuilderOps = new PutRequestBuilderOps(v)

  implicit def toPutRequestOps(v: PutRequest): PutRequestOps = new PutRequestOps(v)

}
