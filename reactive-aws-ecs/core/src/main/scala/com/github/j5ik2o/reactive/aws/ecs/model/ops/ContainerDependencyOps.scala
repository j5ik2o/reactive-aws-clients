// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerDependencyBuilderOps(val self: ContainerDependency.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): ContainerDependency.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionAsScala(value: Option[ContainerCondition]): ContainerDependency.Builder = {
    value.fold(self) { v =>
      self.condition(v)
    }
  }

}

final class ContainerDependencyOps(val self: ContainerDependency) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def conditionAsScala: Option[ContainerCondition] = Option(self.condition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDependencyOps {

  implicit def toContainerDependencyBuilderOps(v: ContainerDependency.Builder): ContainerDependencyBuilderOps =
    new ContainerDependencyBuilderOps(v)

  implicit def toContainerDependencyOps(v: ContainerDependency): ContainerDependencyOps = new ContainerDependencyOps(v)

}
