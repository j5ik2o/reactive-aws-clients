// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class SnapshotOptionsBuilderOps(val self: SnapshotOptions.Builder) extends AnyVal {

  final def automatedSnapshotStartHourAsScala(value: Option[Int]): SnapshotOptions.Builder = {
    value.fold(self) { v =>
      self.automatedSnapshotStartHour(v)
    }
  }

}

final class SnapshotOptionsOps(val self: SnapshotOptions) extends AnyVal {

  final def automatedSnapshotStartHourAsScala: Option[Int] = Option(self.automatedSnapshotStartHour)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotOptionsOps {

  implicit def toSnapshotOptionsBuilderOps(v: SnapshotOptions.Builder): SnapshotOptionsBuilderOps =
    new SnapshotOptionsBuilderOps(v)

  implicit def toSnapshotOptionsOps(v: SnapshotOptions): SnapshotOptionsOps = new SnapshotOptionsOps(v)

}
