// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentResourceDescriptionBuilderOps(val self: EnvironmentResourceDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): EnvironmentResourceDescription.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupsAsScala(value: Option[Seq[AutoScalingGroup]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.autoScalingGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala(value: Option[Seq[Instance]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instances(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchConfigurationsAsScala(
      value: Option[Seq[LaunchConfiguration]]
  ): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchConfigurations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplatesAsScala(value: Option[Seq[LaunchTemplate]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplates(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala(value: Option[Seq[LoadBalancer]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.loadBalancers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def triggersAsScala(value: Option[Seq[Trigger]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.triggers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queuesAsScala(value: Option[Seq[Queue]]): EnvironmentResourceDescription.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queues(v.asJava)
    }
  }

}

final class EnvironmentResourceDescriptionOps(val self: EnvironmentResourceDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoScalingGroupsAsScala: Option[Seq[AutoScalingGroup]] = Option(self.autoScalingGroups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancesAsScala: Option[Seq[Instance]] = Option(self.instances).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchConfigurationsAsScala: Option[Seq[LaunchConfiguration]] = Option(self.launchConfigurations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplatesAsScala: Option[Seq[LaunchTemplate]] = Option(self.launchTemplates).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loadBalancersAsScala: Option[Seq[LoadBalancer]] = Option(self.loadBalancers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def triggersAsScala: Option[Seq[Trigger]] = Option(self.triggers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queuesAsScala: Option[Seq[Queue]] = Option(self.queues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

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
