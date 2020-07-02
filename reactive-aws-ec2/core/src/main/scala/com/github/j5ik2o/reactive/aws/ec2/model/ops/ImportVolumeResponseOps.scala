// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportVolumeResponseBuilderOps(val self: ImportVolumeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conversionTaskAsScala(value: Option[ConversionTask]): ImportVolumeResponse.Builder = {
    value.fold(self) { v => self.conversionTask(v) }
  }

}

final class ImportVolumeResponseOps(val self: ImportVolumeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conversionTaskAsScala: Option[ConversionTask] = Option(self.conversionTask)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportVolumeResponseOps {

  implicit def toImportVolumeResponseBuilderOps(v: ImportVolumeResponse.Builder): ImportVolumeResponseBuilderOps =
    new ImportVolumeResponseBuilderOps(v)

  implicit def toImportVolumeResponseOps(v: ImportVolumeResponse): ImportVolumeResponseOps =
    new ImportVolumeResponseOps(v)

}
