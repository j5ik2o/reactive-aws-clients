// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateImageRequestBuilderOps(val self: CreateImageRequest.Builder) extends AnyVal {

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): CreateImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): CreateImageRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def nameAsScala(value: Option[String]): CreateImageRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def noRebootAsScala(value: Option[Boolean]): CreateImageRequest.Builder = {
    value.fold(self) { v =>
      self.noReboot(v)
    }
  }

}

final class CreateImageRequestOps(val self: CreateImageRequest) extends AnyVal {

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def noRebootAsScala: Option[Boolean] = Option(self.noReboot)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateImageRequestOps {

  implicit def toCreateImageRequestBuilderOps(v: CreateImageRequest.Builder): CreateImageRequestBuilderOps =
    new CreateImageRequestBuilderOps(v)

  implicit def toCreateImageRequestOps(v: CreateImageRequest): CreateImageRequestOps = new CreateImageRequestOps(v)

}
