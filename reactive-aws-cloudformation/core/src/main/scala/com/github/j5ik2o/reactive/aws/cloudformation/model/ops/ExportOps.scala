// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ExportBuilderOps(val self: Export.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportingStackIdAsScala(value: Option[String]): Export.Builder = {
    value.fold(self) { v => self.exportingStackId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Export.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Export.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class ExportOps(val self: Export) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exportingStackIdAsScala: Option[String] = Option(self.exportingStackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToExportOps {

  implicit def toExportBuilderOps(v: Export.Builder): ExportBuilderOps = new ExportBuilderOps(v)

  implicit def toExportOps(v: Export): ExportOps = new ExportOps(v)

}
