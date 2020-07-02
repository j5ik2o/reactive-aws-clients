// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFlowLogsResponseBuilderOps(val self: DeleteFlowLogsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): DeleteFlowLogsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class DeleteFlowLogsResponseOps(val self: DeleteFlowLogsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] =
    Option(self.unsuccessful).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFlowLogsResponseOps {

  implicit def toDeleteFlowLogsResponseBuilderOps(v: DeleteFlowLogsResponse.Builder): DeleteFlowLogsResponseBuilderOps =
    new DeleteFlowLogsResponseBuilderOps(v)

  implicit def toDeleteFlowLogsResponseOps(v: DeleteFlowLogsResponse): DeleteFlowLogsResponseOps =
    new DeleteFlowLogsResponseOps(v)

}
