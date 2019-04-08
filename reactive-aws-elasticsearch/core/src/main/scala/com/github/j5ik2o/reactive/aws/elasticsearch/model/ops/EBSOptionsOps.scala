// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EBSOptionsBuilderOps(val self: EBSOptions.Builder) extends AnyVal {

  final def ebsEnabledAsScala(value: Option[Boolean]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.ebsEnabled(v)
    }
  } // Boolean

  final def volumeTypeAsScala(value: Option[VolumeType]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.volumeType(v)
    }
  } // String

  final def volumeSizeAsScala(value: Option[Int]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.volumeSize(v)
    }
  } // Int

  final def iopsAsScala(value: Option[Int]): EBSOptions.Builder = {
    value.fold(self) { v =>
      self.iops(v)
    }
  } // Int

}

final class EBSOptionsOps(val self: EBSOptions) extends AnyVal {

  final def ebsEnabledAsScala: Option[Boolean] = Option(self.ebsEnabled) // Boolean

  final def volumeTypeAsScala: Option[VolumeType] = Option(self.volumeType) // String

  final def volumeSizeAsScala: Option[Int] = Option(self.volumeSize) // Int

  final def iopsAsScala: Option[Int] = Option(self.iops) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEBSOptionsOps {

  implicit def toEBSOptionsBuilderOps(v: EBSOptions.Builder): EBSOptionsBuilderOps = new EBSOptionsBuilderOps(v)

  implicit def toEBSOptionsOps(v: EBSOptions): EBSOptionsOps = new EBSOptionsOps(v)

}
