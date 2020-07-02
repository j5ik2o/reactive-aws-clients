// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTrafficMirrorFilterRequestBuilderOps(val self: CreateTrafficMirrorFilterRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateTrafficMirrorFilterRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateTrafficMirrorFilterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateTrafficMirrorFilterRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateTrafficMirrorFilterRequestOps(val self: CreateTrafficMirrorFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTrafficMirrorFilterRequestOps {

  implicit def toCreateTrafficMirrorFilterRequestBuilderOps(
      v: CreateTrafficMirrorFilterRequest.Builder
  ): CreateTrafficMirrorFilterRequestBuilderOps = new CreateTrafficMirrorFilterRequestBuilderOps(v)

  implicit def toCreateTrafficMirrorFilterRequestOps(
      v: CreateTrafficMirrorFilterRequest
  ): CreateTrafficMirrorFilterRequestOps = new CreateTrafficMirrorFilterRequestOps(v)

}
