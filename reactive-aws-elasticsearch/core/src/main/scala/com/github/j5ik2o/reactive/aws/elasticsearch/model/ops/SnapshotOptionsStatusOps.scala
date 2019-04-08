// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class SnapshotOptionsStatusBuilderOps(val self: SnapshotOptionsStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[SnapshotOptions]): SnapshotOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // SnapshotOptions

  final def statusAsScala(value: Option[OptionStatus]): SnapshotOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class SnapshotOptionsStatusOps(val self: SnapshotOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[SnapshotOptions] = Option(self.options) // SnapshotOptions

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotOptionsStatusOps {

  implicit def toSnapshotOptionsStatusBuilderOps(v: SnapshotOptionsStatus.Builder): SnapshotOptionsStatusBuilderOps =
    new SnapshotOptionsStatusBuilderOps(v)

  implicit def toSnapshotOptionsStatusOps(v: SnapshotOptionsStatus): SnapshotOptionsStatusOps =
    new SnapshotOptionsStatusOps(v)

}
