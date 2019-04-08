// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFlowLogsRequestBuilderOps(val self: DeleteFlowLogsRequest.Builder) extends AnyVal {

  final def flowLogIdsAsScala(value: Option[Seq[String]]): DeleteFlowLogsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.flowLogIds(v.asJava)
    }
  }

}

final class DeleteFlowLogsRequestOps(val self: DeleteFlowLogsRequest) extends AnyVal {

  final def flowLogIdsAsScala: Option[Seq[String]] = Option(self.flowLogIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFlowLogsRequestOps {

  implicit def toDeleteFlowLogsRequestBuilderOps(v: DeleteFlowLogsRequest.Builder): DeleteFlowLogsRequestBuilderOps =
    new DeleteFlowLogsRequestBuilderOps(v)

  implicit def toDeleteFlowLogsRequestOps(v: DeleteFlowLogsRequest): DeleteFlowLogsRequestOps =
    new DeleteFlowLogsRequestOps(v)

}
