// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListAttributesResponseBuilderOps(val self: ListAttributesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Seq[Attribute]]): ListAttributesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListAttributesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListAttributesResponseOps(val self: ListAttributesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Seq[Attribute]] =
    Option(self.attributes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAttributesResponseOps {

  implicit def toListAttributesResponseBuilderOps(v: ListAttributesResponse.Builder): ListAttributesResponseBuilderOps =
    new ListAttributesResponseBuilderOps(v)

  implicit def toListAttributesResponseOps(v: ListAttributesResponse): ListAttributesResponseOps =
    new ListAttributesResponseOps(v)

}
