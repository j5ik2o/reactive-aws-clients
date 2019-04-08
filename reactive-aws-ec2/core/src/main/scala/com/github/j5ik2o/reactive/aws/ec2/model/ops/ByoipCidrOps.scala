// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ByoipCidrBuilderOps(val self: ByoipCidr.Builder) extends AnyVal {

  final def cidrAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def stateAsScala(value: Option[ByoipCidrState]): ByoipCidr.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class ByoipCidrOps(val self: ByoipCidr) extends AnyVal {

  final def cidrAsScala: Option[String] = Option(self.cidr)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def stateAsScala: Option[ByoipCidrState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToByoipCidrOps {

  implicit def toByoipCidrBuilderOps(v: ByoipCidr.Builder): ByoipCidrBuilderOps = new ByoipCidrBuilderOps(v)

  implicit def toByoipCidrOps(v: ByoipCidr): ByoipCidrOps = new ByoipCidrOps(v)

}
