// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StopInstancesResponseBuilderOps(val self: StopInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppingInstancesAsScala(value: Option[Seq[InstanceStateChange]]): StopInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.stoppingInstances(v.asJava)
    }
  }

}

final class StopInstancesResponseOps(val self: StopInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppingInstancesAsScala: Option[Seq[InstanceStateChange]] = Option(self.stoppingInstances).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopInstancesResponseOps {

  implicit def toStopInstancesResponseBuilderOps(v: StopInstancesResponse.Builder): StopInstancesResponseBuilderOps =
    new StopInstancesResponseBuilderOps(v)

  implicit def toStopInstancesResponseOps(v: StopInstancesResponse): StopInstancesResponseOps =
    new StopInstancesResponseOps(v)

}
