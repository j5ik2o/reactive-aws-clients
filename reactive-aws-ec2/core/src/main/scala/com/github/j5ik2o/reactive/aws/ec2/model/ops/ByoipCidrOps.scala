// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ByoipCidrBuilderOps(val self: ByoipCidr.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[ByoipCidrState]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class ByoipCidrOps(val self: ByoipCidr) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[ByoipCidrState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToByoipCidrOps {

  implicit def toByoipCidrBuilderOps(v: ByoipCidr.Builder): ByoipCidrBuilderOps = new ByoipCidrBuilderOps(v)

  implicit def toByoipCidrOps(v: ByoipCidr): ByoipCidrOps = new ByoipCidrOps(v)

}
