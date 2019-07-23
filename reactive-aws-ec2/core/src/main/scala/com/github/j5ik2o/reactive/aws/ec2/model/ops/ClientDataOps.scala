// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientDataBuilderOps(val self: ClientData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commentAsScala(value: Option[String]): ClientData.Builder = {
    value.fold(self) { v =>
      self.comment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadEndAsScala(value: Option[java.time.Instant]): ClientData.Builder = {
    value.fold(self) { v =>
      self.uploadEnd(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadSizeAsScala(value: Option[Double]): ClientData.Builder = {
    value.fold(self) { v =>
      self.uploadSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadStartAsScala(value: Option[java.time.Instant]): ClientData.Builder = {
    value.fold(self) { v =>
      self.uploadStart(v)
    }
  }

}

final class ClientDataOps(val self: ClientData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commentAsScala: Option[String] = Option(self.comment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadEndAsScala: Option[java.time.Instant] = Option(self.uploadEnd)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadSizeAsScala: Option[Double] = Option(self.uploadSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadStartAsScala: Option[java.time.Instant] = Option(self.uploadStart)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientDataOps {

  implicit def toClientDataBuilderOps(v: ClientData.Builder): ClientDataBuilderOps = new ClientDataBuilderOps(v)

  implicit def toClientDataOps(v: ClientData): ClientDataOps = new ClientDataOps(v)

}
