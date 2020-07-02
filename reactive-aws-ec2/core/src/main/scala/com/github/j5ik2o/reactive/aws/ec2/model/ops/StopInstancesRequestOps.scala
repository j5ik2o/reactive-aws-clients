// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StopInstancesRequestBuilderOps(val self: StopInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala(value: Option[Seq[String]]): StopInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernateAsScala(value: Option[Boolean]): StopInstancesRequest.Builder = {
    value.fold(self) { v => self.hibernate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala(value: Option[Boolean]): StopInstancesRequest.Builder = {
    value.fold(self) { v => self.force(v) }
  }

}

final class StopInstancesRequestOps(val self: StopInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdsAsScala: Option[Seq[String]] =
    Option(self.instanceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernateAsScala: Option[Boolean] = Option(self.hibernate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopInstancesRequestOps {

  implicit def toStopInstancesRequestBuilderOps(v: StopInstancesRequest.Builder): StopInstancesRequestBuilderOps =
    new StopInstancesRequestBuilderOps(v)

  implicit def toStopInstancesRequestOps(v: StopInstancesRequest): StopInstancesRequestOps =
    new StopInstancesRequestOps(v)

}
