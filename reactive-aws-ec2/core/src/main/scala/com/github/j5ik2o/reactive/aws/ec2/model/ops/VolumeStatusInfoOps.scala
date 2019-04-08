// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VolumeStatusInfoBuilderOps(val self: VolumeStatusInfo.Builder) extends AnyVal {

  final def detailsAsScala(value: Option[Seq[VolumeStatusDetails]]): VolumeStatusInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.details(v.asJava)
    }
  }

  final def statusAsScala(value: Option[VolumeStatusInfoStatus]): VolumeStatusInfo.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class VolumeStatusInfoOps(val self: VolumeStatusInfo) extends AnyVal {

  final def detailsAsScala: Option[Seq[VolumeStatusDetails]] = Option(self.details).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def statusAsScala: Option[VolumeStatusInfoStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVolumeStatusInfoOps {

  implicit def toVolumeStatusInfoBuilderOps(v: VolumeStatusInfo.Builder): VolumeStatusInfoBuilderOps =
    new VolumeStatusInfoBuilderOps(v)

  implicit def toVolumeStatusInfoOps(v: VolumeStatusInfo): VolumeStatusInfoOps = new VolumeStatusInfoOps(v)

}
