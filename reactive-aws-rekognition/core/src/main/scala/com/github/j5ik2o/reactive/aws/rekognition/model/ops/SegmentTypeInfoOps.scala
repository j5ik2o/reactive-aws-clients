// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SegmentTypeInfoBuilderOps(val self: SegmentTypeInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[SegmentType]): SegmentTypeInfo.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modelVersionAsScala(value: Option[String]): SegmentTypeInfo.Builder = {
    value.fold(self) { v => self.modelVersion(v) }
  }

}

final class SegmentTypeInfoOps(val self: SegmentTypeInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[SegmentType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modelVersionAsScala: Option[String] = Option(self.modelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSegmentTypeInfoOps {

  implicit def toSegmentTypeInfoBuilderOps(v: SegmentTypeInfo.Builder): SegmentTypeInfoBuilderOps =
    new SegmentTypeInfoBuilderOps(v)

  implicit def toSegmentTypeInfoOps(v: SegmentTypeInfo): SegmentTypeInfoOps = new SegmentTypeInfoOps(v)

}
