// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceExportDetailsBuilderOps(val self: InstanceExportDetails.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): InstanceExportDetails.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def targetEnvironmentAsScala(value: Option[ExportEnvironment]): InstanceExportDetails.Builder = {
    value.fold(self) { v =>
      self.targetEnvironment(v)
    }
  }

}

final class InstanceExportDetailsOps(val self: InstanceExportDetails) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def targetEnvironmentAsScala: Option[ExportEnvironment] = Option(self.targetEnvironment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceExportDetailsOps {

  implicit def toInstanceExportDetailsBuilderOps(v: InstanceExportDetails.Builder): InstanceExportDetailsBuilderOps =
    new InstanceExportDetailsBuilderOps(v)

  implicit def toInstanceExportDetailsOps(v: InstanceExportDetails): InstanceExportDetailsOps =
    new InstanceExportDetailsOps(v)

}
