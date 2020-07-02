// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteRequestBuilderOps(val self: DeleteRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[Map[String, AttributeValue]]): DeleteRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava)
    }
  }

}

final class DeleteRequestOps(val self: DeleteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[Map[String, AttributeValue]] =
    Option(self.key).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRequestOps {

  implicit def toDeleteRequestBuilderOps(v: DeleteRequest.Builder): DeleteRequestBuilderOps =
    new DeleteRequestBuilderOps(v)

  implicit def toDeleteRequestOps(v: DeleteRequest): DeleteRequestOps = new DeleteRequestOps(v)

}
