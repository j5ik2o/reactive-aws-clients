// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ParentBuilderOps(val self: Parent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Parent.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class ParentOps(val self: Parent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParentOps {

  implicit def toParentBuilderOps(v: Parent.Builder): ParentBuilderOps = new ParentBuilderOps(v)

  implicit def toParentOps(v: Parent): ParentOps = new ParentOps(v)

}
