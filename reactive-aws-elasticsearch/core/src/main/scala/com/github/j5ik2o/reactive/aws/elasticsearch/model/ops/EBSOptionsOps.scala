// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EBSOptionsBuilderOps(val self: EBSOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEnabledAsScala(value: Option[Boolean]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.ebsEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeTypeAsScala(value: Option[VolumeType]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala(value: Option[Int]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala(value: Option[Int]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  }

}

final class EBSOptionsOps(val self: EBSOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsEnabledAsScala: Option[Boolean] = Option(self.ebsEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iopsAsScala: Option[Int] = Option(self.iops)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEBSOptionsOps {

  implicit def toEBSOptionsBuilderOps(v: EBSOptions.Builder): EBSOptionsBuilderOps = new EBSOptionsBuilderOps(v)

  implicit def toEBSOptionsOps(v: EBSOptions): EBSOptionsOps = new EBSOptionsOps(v)

}
