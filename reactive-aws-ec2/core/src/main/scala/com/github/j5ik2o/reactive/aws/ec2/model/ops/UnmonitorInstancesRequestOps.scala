// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnmonitorInstancesRequestBuilderOps(val self: UnmonitorInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): UnmonitorInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

}

final class UnmonitorInstancesRequestOps(val self: UnmonitorInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] =
    Option(self.instanceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnmonitorInstancesRequestOps {

  implicit def toUnmonitorInstancesRequestBuilderOps(
      v: UnmonitorInstancesRequest.Builder
  ): UnmonitorInstancesRequestBuilderOps = new UnmonitorInstancesRequestBuilderOps(v)

  implicit def toUnmonitorInstancesRequestOps(v: UnmonitorInstancesRequest): UnmonitorInstancesRequestOps =
    new UnmonitorInstancesRequestOps(v)

}
