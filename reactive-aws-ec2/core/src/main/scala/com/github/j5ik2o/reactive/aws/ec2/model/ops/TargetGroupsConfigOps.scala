// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetGroupsConfigBuilderOps(val self: TargetGroupsConfig.Builder) extends AnyVal {

  final def targetGroupsAsScala(value: Option[Seq[TargetGroup]]): TargetGroupsConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetGroups(v.asJava)
    }
  }

}

final class TargetGroupsConfigOps(val self: TargetGroupsConfig) extends AnyVal {

  final def targetGroupsAsScala: Option[Seq[TargetGroup]] = Option(self.targetGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetGroupsConfigOps {

  implicit def toTargetGroupsConfigBuilderOps(v: TargetGroupsConfig.Builder): TargetGroupsConfigBuilderOps =
    new TargetGroupsConfigBuilderOps(v)

  implicit def toTargetGroupsConfigOps(v: TargetGroupsConfig): TargetGroupsConfigOps = new TargetGroupsConfigOps(v)

}
