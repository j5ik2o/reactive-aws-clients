// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RunScheduledInstancesResponseBuilderOps(val self: RunScheduledInstancesResponse.Builder) extends AnyVal {

  final def instanceIdSetAsScala(value: Option[Seq[String]]): RunScheduledInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceIdSet(v.asJava)
    }
  }

}

final class RunScheduledInstancesResponseOps(val self: RunScheduledInstancesResponse) extends AnyVal {

  final def instanceIdSetAsScala: Option[Seq[String]] = Option(self.instanceIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunScheduledInstancesResponseOps {

  implicit def toRunScheduledInstancesResponseBuilderOps(
      v: RunScheduledInstancesResponse.Builder
  ): RunScheduledInstancesResponseBuilderOps = new RunScheduledInstancesResponseBuilderOps(v)

  implicit def toRunScheduledInstancesResponseOps(v: RunScheduledInstancesResponse): RunScheduledInstancesResponseOps =
    new RunScheduledInstancesResponseOps(v)

}
