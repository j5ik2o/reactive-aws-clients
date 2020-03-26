// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeploymentTargetsBuilderOps(val self: DeploymentTargets.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala(value: Option[Seq[String]]): DeploymentTargets.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accounts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def organizationalUnitIdsAsScala(value: Option[Seq[String]]): DeploymentTargets.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.organizationalUnitIds(v.asJava)
    }
  }

}

final class DeploymentTargetsOps(val self: DeploymentTargets) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def organizationalUnitIdsAsScala: Option[Seq[String]] = Option(self.organizationalUnitIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeploymentTargetsOps {

  implicit def toDeploymentTargetsBuilderOps(v: DeploymentTargets.Builder): DeploymentTargetsBuilderOps =
    new DeploymentTargetsBuilderOps(v)

  implicit def toDeploymentTargetsOps(v: DeploymentTargets): DeploymentTargetsOps = new DeploymentTargetsOps(v)

}
