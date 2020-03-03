// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class AutoDeploymentBuilderOps(val self: AutoDeployment.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): AutoDeployment.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainStacksOnAccountRemovalAsScala(value: Option[Boolean]): AutoDeployment.Builder = {
    value.fold(self) { v =>
      self.retainStacksOnAccountRemoval(v)
    }
  }

}

final class AutoDeploymentOps(val self: AutoDeployment) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainStacksOnAccountRemovalAsScala: Option[Boolean] = Option(self.retainStacksOnAccountRemoval)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoDeploymentOps {

  implicit def toAutoDeploymentBuilderOps(v: AutoDeployment.Builder): AutoDeploymentBuilderOps =
    new AutoDeploymentBuilderOps(v)

  implicit def toAutoDeploymentOps(v: AutoDeployment): AutoDeploymentOps = new AutoDeploymentOps(v)

}
