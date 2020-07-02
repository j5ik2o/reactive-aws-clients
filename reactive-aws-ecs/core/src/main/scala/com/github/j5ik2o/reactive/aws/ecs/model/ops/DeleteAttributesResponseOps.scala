// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteAttributesResponseBuilderOps(val self: DeleteAttributesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Seq[Attribute]]): DeleteAttributesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

}

final class DeleteAttributesResponseOps(val self: DeleteAttributesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Seq[Attribute]] =
    Option(self.attributes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAttributesResponseOps {

  implicit def toDeleteAttributesResponseBuilderOps(
      v: DeleteAttributesResponse.Builder
  ): DeleteAttributesResponseBuilderOps = new DeleteAttributesResponseBuilderOps(v)

  implicit def toDeleteAttributesResponseOps(v: DeleteAttributesResponse): DeleteAttributesResponseOps =
    new DeleteAttributesResponseOps(v)

}
