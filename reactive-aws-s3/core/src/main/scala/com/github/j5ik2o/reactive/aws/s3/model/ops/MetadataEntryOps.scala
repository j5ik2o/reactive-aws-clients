// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetadataEntryBuilderOps(val self: MetadataEntry.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): MetadataEntry.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): MetadataEntry.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class MetadataEntryOps(val self: MetadataEntry) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetadataEntryOps {

  implicit def toMetadataEntryBuilderOps(v: MetadataEntry.Builder): MetadataEntryBuilderOps =
    new MetadataEntryBuilderOps(v)

  implicit def toMetadataEntryOps(v: MetadataEntry): MetadataEntryOps = new MetadataEntryOps(v)

}
