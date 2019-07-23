// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceCreditSpecificationBuilderOps(val self: InstanceCreditSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): InstanceCreditSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuCreditsAsScala(value: Option[String]): InstanceCreditSpecification.Builder = {
    value.fold(self) { v =>
      self.cpuCredits(v)
    }
  }

}

final class InstanceCreditSpecificationOps(val self: InstanceCreditSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCreditSpecificationOps {

  implicit def toInstanceCreditSpecificationBuilderOps(
      v: InstanceCreditSpecification.Builder
  ): InstanceCreditSpecificationBuilderOps = new InstanceCreditSpecificationBuilderOps(v)

  implicit def toInstanceCreditSpecificationOps(v: InstanceCreditSpecification): InstanceCreditSpecificationOps =
    new InstanceCreditSpecificationOps(v)

}
