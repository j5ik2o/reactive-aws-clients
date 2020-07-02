// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAttributesResponseBuilderOps(val self: PutAttributesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Seq[Attribute]]): PutAttributesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

}

final class PutAttributesResponseOps(val self: PutAttributesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Seq[Attribute]] =
    Option(self.attributes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAttributesResponseOps {

  implicit def toPutAttributesResponseBuilderOps(v: PutAttributesResponse.Builder): PutAttributesResponseBuilderOps =
    new PutAttributesResponseBuilderOps(v)

  implicit def toPutAttributesResponseOps(v: PutAttributesResponse): PutAttributesResponseOps =
    new PutAttributesResponseOps(v)

}
