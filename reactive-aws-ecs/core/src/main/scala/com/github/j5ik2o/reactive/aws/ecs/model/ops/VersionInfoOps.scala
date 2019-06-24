// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class VersionInfoBuilderOps(val self: VersionInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def agentVersionAsScala(value: Option[String]): VersionInfo.Builder = {
    value.fold(self) { v =>
      self.agentVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def agentHashAsScala(value: Option[String]): VersionInfo.Builder = {
    value.fold(self) { v =>
      self.agentHash(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerVersionAsScala(value: Option[String]): VersionInfo.Builder = {
    value.fold(self) { v =>
      self.dockerVersion(v)
    }
  }

}

final class VersionInfoOps(val self: VersionInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def agentVersionAsScala: Option[String] = Option(self.agentVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def agentHashAsScala: Option[String] = Option(self.agentHash)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerVersionAsScala: Option[String] = Option(self.dockerVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVersionInfoOps {

  implicit def toVersionInfoBuilderOps(v: VersionInfo.Builder): VersionInfoBuilderOps = new VersionInfoBuilderOps(v)

  implicit def toVersionInfoOps(v: VersionInfo): VersionInfoOps = new VersionInfoOps(v)

}
