// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateInstancesRequestBuilderOps(val self: TerminateInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): TerminateInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

}

final class TerminateInstancesRequestOps(val self: TerminateInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateInstancesRequestOps {

  implicit def toTerminateInstancesRequestBuilderOps(
      v: TerminateInstancesRequest.Builder
  ): TerminateInstancesRequestBuilderOps = new TerminateInstancesRequestBuilderOps(v)

  implicit def toTerminateInstancesRequestOps(v: TerminateInstancesRequest): TerminateInstancesRequestOps =
    new TerminateInstancesRequestOps(v)

}
