// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListenerBuilderOps(val self: Listener.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[String]): Listener.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portAsScala(value: Option[Int]): Listener.Builder = {
    value.fold(self) { v =>
      self.port(v)
    }
  }

}

final class ListenerOps(val self: Listener) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[String] = Option(self.protocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portAsScala: Option[Int] = Option(self.port)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListenerOps {

  implicit def toListenerBuilderOps(v: Listener.Builder): ListenerBuilderOps = new ListenerBuilderOps(v)

  implicit def toListenerOps(v: Listener): ListenerOps = new ListenerOps(v)

}
