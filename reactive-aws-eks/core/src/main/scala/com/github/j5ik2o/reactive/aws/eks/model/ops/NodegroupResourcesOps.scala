// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class NodegroupResourcesBuilderOps(val self: NodegroupResources.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupsAsScala(value: Option[Seq[AutoScalingGroup]]): NodegroupResources.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.autoScalingGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessSecurityGroupAsScala(value: Option[String]): NodegroupResources.Builder = {
    value.fold(self) { v =>
      self.remoteAccessSecurityGroup(v)
    }
  }

}

final class NodegroupResourcesOps(val self: NodegroupResources) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupsAsScala: Option[Seq[AutoScalingGroup]] = Option(self.autoScalingGroups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessSecurityGroupAsScala: Option[String] = Option(self.remoteAccessSecurityGroup)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodegroupResourcesOps {

  implicit def toNodegroupResourcesBuilderOps(v: NodegroupResources.Builder): NodegroupResourcesBuilderOps =
    new NodegroupResourcesBuilderOps(v)

  implicit def toNodegroupResourcesOps(v: NodegroupResources): NodegroupResourcesOps = new NodegroupResourcesOps(v)

}
