// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteAttributesResponseBuilderOps(val self: DeleteAttributesResponse.Builder) extends AnyVal {

  final def attributesAsScala(value: Option[Seq[Attribute]]): DeleteAttributesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

}

final class DeleteAttributesResponseOps(val self: DeleteAttributesResponse) extends AnyVal {

  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAttributesResponseOps {

  implicit def toDeleteAttributesResponseBuilderOps(
      v: DeleteAttributesResponse.Builder
  ): DeleteAttributesResponseBuilderOps = new DeleteAttributesResponseBuilderOps(v)

  implicit def toDeleteAttributesResponseOps(v: DeleteAttributesResponse): DeleteAttributesResponseOps =
    new DeleteAttributesResponseOps(v)

}
