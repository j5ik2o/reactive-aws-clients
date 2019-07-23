// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ServiceRegistryBuilderOps(val self: ServiceRegistry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryArnAsScala(value: Option[String]): ServiceRegistry.Builder = {
    value.fold(self) { v =>
      self.registryArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portAsScala(value: Option[Int]): ServiceRegistry.Builder = {
    value.fold(self) { v =>
      self.port(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): ServiceRegistry.Builder = {
    value.fold(self) { v =>
      self.containerName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala(value: Option[Int]): ServiceRegistry.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

}

final class ServiceRegistryOps(val self: ServiceRegistry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryArnAsScala: Option[String] = Option(self.registryArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portAsScala: Option[Int] = Option(self.port)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceRegistryOps {

  implicit def toServiceRegistryBuilderOps(v: ServiceRegistry.Builder): ServiceRegistryBuilderOps =
    new ServiceRegistryBuilderOps(v)

  implicit def toServiceRegistryOps(v: ServiceRegistry): ServiceRegistryOps = new ServiceRegistryOps(v)

}
