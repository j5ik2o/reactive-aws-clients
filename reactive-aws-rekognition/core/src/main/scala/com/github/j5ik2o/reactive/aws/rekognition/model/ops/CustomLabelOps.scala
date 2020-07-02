// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CustomLabelBuilderOps(val self: CustomLabel.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CustomLabel.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): CustomLabel.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def geometryAsScala(value: Option[Geometry]): CustomLabel.Builder = {
    value.fold(self) { v => self.geometry(v) }
  }

}

final class CustomLabelOps(val self: CustomLabel) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def geometryAsScala: Option[Geometry] = Option(self.geometry)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCustomLabelOps {

  implicit def toCustomLabelBuilderOps(v: CustomLabel.Builder): CustomLabelBuilderOps = new CustomLabelBuilderOps(v)

  implicit def toCustomLabelOps(v: CustomLabel): CustomLabelOps = new CustomLabelOps(v)

}
