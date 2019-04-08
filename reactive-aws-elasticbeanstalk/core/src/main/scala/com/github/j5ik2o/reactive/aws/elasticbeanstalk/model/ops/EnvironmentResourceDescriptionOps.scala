// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentResourceDescriptionBuilderOps(val self: EnvironmentResourceDescription.Builder) extends AnyVal {

  final def environmentNameAsScala(value: Option[String]): EnvironmentResourceDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  } // String

  final def autoScalingGroupsAsScala(value: Option[Seq[AutoScalingGroup]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.autoScalingGroups(v.asJava)
    } // Seq[AutoScalingGroup]
  }

  final def instancesAsScala(value: Option[Seq[Instance]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    } // Seq[Instance]
  }

  final def launchConfigurationsAsScala(
      value: Option[Seq[LaunchConfiguration]]
  ): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchConfigurations(v.asJava)
    } // Seq[LaunchConfiguration]
  }

  final def launchTemplatesAsScala(value: Option[Seq[LaunchTemplate]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.launchTemplates(v.asJava)
    } // Seq[LaunchTemplate]
  }

  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.loadBalancers(v.asJava)
    } // Seq[LoadBalancer]
  }

  final def triggersAsScala(value: Option[Seq[Trigger]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.triggers(v.asJava)
    } // Seq[Trigger]
  }

  final def queuesAsScala(value: Option[Seq[Queue]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.queues(v.asJava)
    } // Seq[Queue]
  }

}

final class EnvironmentResourceDescriptionOps(val self: EnvironmentResourceDescription) extends AnyVal {

  final def environmentNameAsScala: Option[String] = Option(self.environmentName) // String

  final def autoScalingGroupsAsScala: Option[Seq[AutoScalingGroup]] = Option(self.autoScalingGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AutoScalingGroup]

  final def instancesAsScala: Option[Seq[Instance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Instance]

  final def launchConfigurationsAsScala: Option[Seq[LaunchConfiguration]] = Option(self.launchConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[LaunchConfiguration]

  final def launchTemplatesAsScala: Option[Seq[LaunchTemplate]] = Option(self.launchTemplates).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[LaunchTemplate]

  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[LoadBalancer]

  final def triggersAsScala: Option[Seq[Trigger]] = Option(self.triggers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Trigger]

  final def queuesAsScala: Option[Seq[Queue]] = Option(self.queues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Queue]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentResourceDescriptionOps {

  implicit def toEnvironmentResourceDescriptionBuilderOps(
      v: EnvironmentResourceDescription.Builder
  ): EnvironmentResourceDescriptionBuilderOps = new EnvironmentResourceDescriptionBuilderOps(v)

  implicit def toEnvironmentResourceDescriptionOps(
      v: EnvironmentResourceDescription
  ): EnvironmentResourceDescriptionOps = new EnvironmentResourceDescriptionOps(v)

}
