// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class SignalResourceRequestBuilderOps(val self: SignalResourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): SignalResourceRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): SignalResourceRequest.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uniqueIdAsScala(value: Option[String]): SignalResourceRequest.Builder = {
    value.fold(self) { v =>
      self.uniqueId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ResourceSignalStatus]): SignalResourceRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class SignalResourceRequestOps(val self: SignalResourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uniqueIdAsScala: Option[String] = Option(self.uniqueId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ResourceSignalStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSignalResourceRequestOps {

  implicit def toSignalResourceRequestBuilderOps(v: SignalResourceRequest.Builder): SignalResourceRequestBuilderOps =
    new SignalResourceRequestBuilderOps(v)

  implicit def toSignalResourceRequestOps(v: SignalResourceRequest): SignalResourceRequestOps =
    new SignalResourceRequestOps(v)

}
